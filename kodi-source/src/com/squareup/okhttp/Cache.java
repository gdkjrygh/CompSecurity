// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.DiskLruCache;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.CacheRequest;
import com.squareup.okhttp.internal.http.CacheStrategy;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.StatusLine;
import com.squareup.okhttp.internal.io.FileSystem;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

// Referenced classes of package com.squareup.okhttp:
//            Response, Request, ResponseBody, MediaType, 
//            Handshake, Headers, Protocol

public final class Cache
{
    private static class CacheResponseBody extends ResponseBody
    {

        private final BufferedSource bodySource;
        private final String contentLength;
        private final String contentType;
        private final com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot;

        public long contentLength()
        {
            long l = -1L;
            try
            {
                if (contentLength != null)
                {
                    l = Long.parseLong(contentLength);
                }
            }
            catch (NumberFormatException numberformatexception)
            {
                return -1L;
            }
            return l;
        }

        public MediaType contentType()
        {
            if (contentType != null)
            {
                return MediaType.parse(contentType);
            } else
            {
                return null;
            }
        }

        public BufferedSource source()
        {
            return bodySource;
        }


        public CacheResponseBody(com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot1, String s, String s1)
        {
            snapshot = snapshot1;
            contentType = s;
            contentLength = s1;
            bodySource = Okio.buffer(snapshot1.getSource(1). new _cls1(snapshot1));
        }
    }

    private static final class Entry
    {

        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final String url;
        private final Headers varyHeaders;

        private boolean isHttps()
        {
            return url.startsWith("https://");
        }

        private List readCertificateList(BufferedSource bufferedsource)
            throws IOException
        {
            int j = Cache.readInt(bufferedsource);
            if (j != -1) goto _L2; else goto _L1
_L1:
            Object obj = Collections.emptyList();
_L4:
            return ((List) (obj));
_L2:
            ArrayList arraylist;
            CertificateFactory certificatefactory;
            Buffer buffer;
            int i;
            try
            {
                certificatefactory = CertificateFactory.getInstance("X.509");
                arraylist = new ArrayList(j);
            }
            // Misplaced declaration of an exception variable
            catch (BufferedSource bufferedsource)
            {
                throw new IOException(bufferedsource.getMessage());
            }
            i = 0;
            obj = arraylist;
            if (i >= j) goto _L4; else goto _L3
_L3:
            obj = bufferedsource.readUtf8LineStrict();
            buffer = new Buffer();
            buffer.write(ByteString.decodeBase64(((String) (obj))));
            arraylist.add(certificatefactory.generateCertificate(buffer.inputStream()));
            i++;
            break MISSING_BLOCK_LABEL_38;
        }

        private void writeCertList(BufferedSink bufferedsink, List list)
            throws IOException
        {
            int i;
            int j;
            try
            {
                bufferedsink.writeDecimalLong(list.size());
                bufferedsink.writeByte(10);
            }
            // Misplaced declaration of an exception variable
            catch (BufferedSink bufferedsink)
            {
                throw new IOException(bufferedsink.getMessage());
            }
            i = 0;
            j = list.size();
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            bufferedsink.writeUtf8(ByteString.of(((Certificate)list.get(i)).getEncoded()).base64());
            bufferedsink.writeByte(10);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public boolean matches(Request request, Response response1)
        {
            return url.equals(request.urlString()) && requestMethod.equals(request.method()) && OkHeaders.varyMatches(response1, varyHeaders, request);
        }

        public Response response(Request request, com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot)
        {
            request = responseHeaders.get("Content-Type");
            String s = responseHeaders.get("Content-Length");
            Request request1 = (new Request.Builder()).url(url).method(requestMethod, null).headers(varyHeaders).build();
            return (new Response.Builder()).request(request1).protocol(protocol).code(code).message(message).headers(responseHeaders).body(new CacheResponseBody(snapshot, request, s)).handshake(handshake).build();
        }

        public void writeTo(com.squareup.okhttp.internal.DiskLruCache.Editor editor)
            throws IOException
        {
            editor = Okio.buffer(editor.newSink(0));
            editor.writeUtf8(url);
            editor.writeByte(10);
            editor.writeUtf8(requestMethod);
            editor.writeByte(10);
            editor.writeDecimalLong(varyHeaders.size());
            editor.writeByte(10);
            int i = 0;
            for (int j = varyHeaders.size(); i < j; i++)
            {
                editor.writeUtf8(varyHeaders.name(i));
                editor.writeUtf8(": ");
                editor.writeUtf8(varyHeaders.value(i));
                editor.writeByte(10);
            }

            editor.writeUtf8((new StatusLine(protocol, code, message)).toString());
            editor.writeByte(10);
            editor.writeDecimalLong(responseHeaders.size());
            editor.writeByte(10);
            i = 0;
            for (int k = responseHeaders.size(); i < k; i++)
            {
                editor.writeUtf8(responseHeaders.name(i));
                editor.writeUtf8(": ");
                editor.writeUtf8(responseHeaders.value(i));
                editor.writeByte(10);
            }

            if (isHttps())
            {
                editor.writeByte(10);
                editor.writeUtf8(handshake.cipherSuite());
                editor.writeByte(10);
                writeCertList(editor, handshake.peerCertificates());
                writeCertList(editor, handshake.localCertificates());
            }
            editor.close();
        }

        public Entry(Response response1)
        {
            url = response1.request().urlString();
            varyHeaders = OkHeaders.varyHeaders(response1);
            requestMethod = response1.request().method();
            protocol = response1.protocol();
            code = response1.code();
            message = response1.message();
            responseHeaders = response1.headers();
            handshake = response1.handshake();
        }

        public Entry(Source source)
            throws IOException
        {
            Object obj;
            Object obj1;
            int j;
            obj = Okio.buffer(source);
            url = ((BufferedSource) (obj)).readUtf8LineStrict();
            requestMethod = ((BufferedSource) (obj)).readUtf8LineStrict();
            obj1 = new Headers.Builder();
            j = Cache.readInt(((BufferedSource) (obj)));
            int i = 0;
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            ((Headers.Builder) (obj1)).addLenient(((BufferedSource) (obj)).readUtf8LineStrict());
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            varyHeaders = ((Headers.Builder) (obj1)).build();
            obj1 = StatusLine.parse(((BufferedSource) (obj)).readUtf8LineStrict());
            protocol = ((StatusLine) (obj1)).protocol;
            code = ((StatusLine) (obj1)).code;
            message = ((StatusLine) (obj1)).message;
            obj1 = new Headers.Builder();
            j = Cache.readInt(((BufferedSource) (obj)));
            i = 0;
_L4:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            ((Headers.Builder) (obj1)).addLenient(((BufferedSource) (obj)).readUtf8LineStrict());
            i++;
            if (true) goto _L4; else goto _L3
_L3:
            responseHeaders = ((Headers.Builder) (obj1)).build();
            if (!isHttps())
            {
                break MISSING_BLOCK_LABEL_259;
            }
            obj1 = ((BufferedSource) (obj)).readUtf8LineStrict();
            if (((String) (obj1)).length() > 0)
            {
                throw new IOException((new StringBuilder()).append("expected \"\" but was \"").append(((String) (obj1))).append("\"").toString());
            }
            break MISSING_BLOCK_LABEL_229;
            obj;
            source.close();
            throw obj;
            handshake = Handshake.get(((BufferedSource) (obj)).readUtf8LineStrict(), readCertificateList(((BufferedSource) (obj))), readCertificateList(((BufferedSource) (obj))));
_L5:
            source.close();
            return;
            handshake = null;
              goto _L5
        }
    }


    private final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache = new InternalCache() {

        final Cache this$0;

        public Response get(Request request)
            throws IOException
        {
            return Cache.this.get(request);
        }

        public CacheRequest put(Response response)
            throws IOException
        {
            return Cache.this.put(response);
        }

        public void remove(Request request)
            throws IOException
        {
            Cache.this.remove(request);
        }

        public void trackConditionalCacheHit()
        {
            Cache.this.trackConditionalCacheHit();
        }

        public void trackResponse(CacheStrategy cachestrategy)
        {
            Cache.this.trackResponse(cachestrategy);
        }

        public void update(Response response, Response response1)
            throws IOException
        {
            Cache.this.update(response, response1);
        }

            
            {
                this$0 = Cache.this;
                super();
            }
    };
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public Cache(File file, long l)
    {
        cache = DiskLruCache.create(FileSystem.SYSTEM, file, 0x31191, 2, l);
    }

    private void abortQuietly(com.squareup.okhttp.internal.DiskLruCache.Editor editor)
    {
        if (editor == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        editor.abort();
        return;
        editor;
    }

    private CacheRequest put(Response response)
        throws IOException
    {
label0:
        {
            {
                Object obj = response.request().method();
                if (!HttpMethod.invalidatesCache(response.request().method()))
                {
                    break label0;
                }
                Entry entry;
                try
                {
                    remove(response.request());
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    return null;
                }
            }
            return null;
        }
        if (!((String) (obj)).equals("GET") || OkHeaders.hasVaryAll(response))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        entry = new Entry(response);
        obj = null;
        try
        {
            response = cache.edit(urlToKey(response.request()));
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            abortQuietly(((com.squareup.okhttp.internal.DiskLruCache.Editor) (obj)));
            return null;
        }
        if (response == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj = response;
        entry.writeTo(response);
        obj = response;
        response = new CacheRequestImpl(response);
        return response;
    }

    private static int readInt(BufferedSource bufferedsource)
        throws IOException
    {
        long l;
        try
        {
            l = bufferedsource.readDecimalLong();
            bufferedsource = bufferedsource.readUtf8LineStrict();
        }
        // Misplaced declaration of an exception variable
        catch (BufferedSource bufferedsource)
        {
            throw new IOException(bufferedsource.getMessage());
        }
        if (l < 0L || l > 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (bufferedsource.isEmpty())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        throw new IOException((new StringBuilder()).append("expected an int but was \"").append(l).append(bufferedsource).append("\"").toString());
        return (int)l;
    }

    private void remove(Request request)
        throws IOException
    {
        cache.remove(urlToKey(request));
    }

    private void trackConditionalCacheHit()
    {
        this;
        JVM INSTR monitorenter ;
        hitCount = hitCount + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void trackResponse(CacheStrategy cachestrategy)
    {
        this;
        JVM INSTR monitorenter ;
        requestCount = requestCount + 1;
        if (cachestrategy.networkRequest == null) goto _L2; else goto _L1
_L1:
        networkCount = networkCount + 1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (cachestrategy.cacheResponse != null)
        {
            hitCount = hitCount + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        cachestrategy;
        throw cachestrategy;
    }

    private void update(Response response, Response response1)
    {
        Entry entry = new Entry(response1);
        response1 = ((CacheResponseBody)response.body()).snapshot;
        response = null;
        try
        {
            response1 = response1.edit();
        }
        // Misplaced declaration of an exception variable
        catch (Response response1)
        {
            abortQuietly(response);
            return;
        }
        if (response1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        response = response1;
        entry.writeTo(response1);
        response = response1;
        response1.commit();
    }

    private static String urlToKey(Request request)
    {
        return Util.md5Hex(request.urlString());
    }

    Response get(Request request)
    {
        Object obj = urlToKey(request);
        try
        {
            obj = cache.get(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Request request)
        {
            return null;
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            Response response;
            Entry entry;
            try
            {
                entry = new Entry(((com.squareup.okhttp.internal.DiskLruCache.Snapshot) (obj)).getSource(0));
            }
            // Misplaced declaration of an exception variable
            catch (Request request)
            {
                Util.closeQuietly(((java.io.Closeable) (obj)));
                return null;
            }
            response = entry.response(request, ((com.squareup.okhttp.internal.DiskLruCache.Snapshot) (obj)));
            obj = response;
            if (!entry.matches(request, response))
            {
                Util.closeQuietly(response.body());
                return null;
            }
        }
        return ((Response) (obj));
    }








/*
    static int access$808(Cache cache1)
    {
        int i = cache1.writeSuccessCount;
        cache1.writeSuccessCount = i + 1;
        return i;
    }

*/


/*
    static int access$908(Cache cache1)
    {
        int i = cache1.writeAbortCount;
        cache1.writeAbortCount = i + 1;
        return i;
    }

*/

    // Unreferenced inner class com/squareup/okhttp/Cache$CacheRequestImpl$1

/* anonymous class */

    // Unreferenced inner class com/squareup/okhttp/Cache$CacheResponseBody$1

/* anonymous class */
    class CacheResponseBody._cls1 extends ForwardingSource
    {

        final CacheResponseBody this$0;
        final com.squareup.okhttp.internal.DiskLruCache.Snapshot val$snapshot;

        public void close()
            throws IOException
        {
            snapshot.close();
            close();
        }

            
            {
                this$0 = final_cacheresponsebody;
                snapshot = snapshot1;
                super(Source.this);
            }
    }

}
