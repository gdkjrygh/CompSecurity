// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.j;
import com.squareup.okhttp.internal.DiskLruCache;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.CacheRequest;
import com.squareup.okhttp.internal.http.CacheStrategy;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.io.FileSystem;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.squareup.okhttp:
//            Response, Request

public final class Cache
{

    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 0x31191;
    private final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public Cache(File file, long l)
    {
        this(file, l, FileSystem.SYSTEM);
    }

    Cache(File file, long l, FileSystem filesystem)
    {
        internalCache = new _cls1();
        cache = DiskLruCache.create(filesystem, file, 0x31191, 2, l);
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
    {
label0:
        {
            {
                Object obj = response.request().method();
                if (!HttpMethod.invalidatesCache(response.request().method()))
                {
                    break label0;
                }
                IOException ioexception;
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
        obj = new Entry(response);
        response = cache.edit(urlToKey(response.request()));
        if (response == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        ((Entry) (obj)).writeTo(response);
        obj = new CacheRequestImpl(response);
        return ((CacheRequest) (obj));
        response;
        response = null;
_L2:
        abortQuietly(response);
        return null;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int readInt(j j1)
    {
        long l;
        try
        {
            l = j1.n();
            j1 = j1.r();
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new IOException(j1.getMessage());
        }
        if (l < 0L || l > 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (j1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        throw new IOException((new StringBuilder()).append("expected an int but was \"").append(l).append(j1).append("\"").toString());
        return (int)l;
    }

    private void remove(Request request)
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

    public void close()
    {
        cache.close();
    }

    public void delete()
    {
        cache.delete();
    }

    public void evictAll()
    {
        cache.evictAll();
    }

    public void flush()
    {
        cache.flush();
    }

    Response get(Request request)
    {
        Object obj = urlToKey(request);
        Entry entry;
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
            return null;
        }
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
        obj = entry.response(request, ((com.squareup.okhttp.internal.DiskLruCache.Snapshot) (obj)));
        if (!entry.matches(request, ((Response) (obj))))
        {
            Util.closeQuietly(((Response) (obj)).body());
            return null;
        } else
        {
            return ((Response) (obj));
        }
    }

    public File getDirectory()
    {
        return cache.getDirectory();
    }

    public int getHitCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = hitCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public long getMaxSize()
    {
        return cache.getMaxSize();
    }

    public int getNetworkCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = networkCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int getRequestCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = requestCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public long getSize()
    {
        return cache.size();
    }

    public int getWriteAbortCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = writeAbortCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int getWriteSuccessCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = writeSuccessCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public void initialize()
    {
        cache.initialize();
    }

    public boolean isClosed()
    {
        return cache.isClosed();
    }

    public Iterator urls()
    {
        return new _cls2();
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

    private class _cls1
        implements InternalCache
    {

        final Cache this$0;

        public Response get(Request request)
        {
            return Cache.this.get(request);
        }

        public CacheRequest put(Response response)
        {
            return Cache.this.put(response);
        }

        public void remove(Request request)
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
        {
            Cache.this.update(response, response1);
        }

        _cls1()
        {
            this$0 = Cache.this;
            super();
        }
    }


    private class Entry
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

        private List readCertificateList(j j1)
        {
            int i1 = Cache.readInt(j1);
            if (i1 != -1) goto _L2; else goto _L1
_L1:
            Object obj = Collections.emptyList();
_L4:
            return ((List) (obj));
_L2:
            ArrayList arraylist;
            CertificateFactory certificatefactory;
            f f1;
            int l;
            try
            {
                certificatefactory = CertificateFactory.getInstance("X.509");
                arraylist = new ArrayList(i1);
            }
            // Misplaced declaration of an exception variable
            catch (j j1)
            {
                throw new IOException(j1.getMessage());
            }
            l = 0;
            obj = arraylist;
            if (l >= i1) goto _L4; else goto _L3
_L3:
            obj = j1.r();
            f1 = new f();
            f1.a(k.b(((String) (obj))));
            arraylist.add(certificatefactory.generateCertificate(f1.g()));
            l++;
            break MISSING_BLOCK_LABEL_38;
        }

        private void writeCertList(i l, List list)
        {
            int i1;
            int j1;
            try
            {
                l.k(list.size());
                l.i(10);
                j1 = list.size();
            }
            // Misplaced declaration of an exception variable
            catch (i l)
            {
                throw new IOException(l.getMessage());
            }
            i1 = 0;
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            l.b(k.a(((Certificate)list.get(i1)).getEncoded()).b());
            l.i(10);
            i1++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_33;
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
        {
            boolean flag = false;
            editor = r.a(editor.newSink(0));
            editor.b(url);
            editor.i(10);
            editor.b(requestMethod);
            editor.i(10);
            editor.k(varyHeaders.size());
            editor.i(10);
            int j1 = varyHeaders.size();
            for (int l = 0; l < j1; l++)
            {
                editor.b(varyHeaders.name(l));
                editor.b(": ");
                editor.b(varyHeaders.value(l));
                editor.i(10);
            }

            editor.b((new StatusLine(protocol, code, message)).toString());
            editor.i(10);
            editor.k(responseHeaders.size());
            editor.i(10);
            j1 = responseHeaders.size();
            for (int i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
            {
                editor.b(responseHeaders.name(i1));
                editor.b(": ");
                editor.b(responseHeaders.value(i1));
                editor.i(10);
            }

            if (isHttps())
            {
                editor.i(10);
                editor.b(handshake.cipherSuite());
                editor.i(10);
                writeCertList(editor, handshake.peerCertificates());
                writeCertList(editor, handshake.localCertificates());
            }
            editor.close();
        }

        public Entry(ad ad1)
        {
            boolean flag;
            flag = false;
            super();
            Object obj;
            Object obj1;
            int i1;
            obj = r.a(ad1);
            url = ((j) (obj)).r();
            requestMethod = ((j) (obj)).r();
            obj1 = new Headers.Builder();
            i1 = Cache.readInt(((j) (obj)));
            int l = 0;
_L2:
            if (l >= i1)
            {
                break; /* Loop/switch isn't completed */
            }
            ((Headers.Builder) (obj1)).addLenient(((j) (obj)).r());
            l++;
            if (true) goto _L2; else goto _L1
_L1:
            varyHeaders = ((Headers.Builder) (obj1)).build();
            obj1 = StatusLine.parse(((j) (obj)).r());
            protocol = ((StatusLine) (obj1)).protocol;
            code = ((StatusLine) (obj1)).code;
            message = ((StatusLine) (obj1)).message;
            obj1 = new Headers.Builder();
            i1 = Cache.readInt(((j) (obj)));
            l = ((flag) ? 1 : 0);
_L4:
            if (l >= i1)
            {
                break; /* Loop/switch isn't completed */
            }
            ((Headers.Builder) (obj1)).addLenient(((j) (obj)).r());
            l++;
            if (true) goto _L4; else goto _L3
_L3:
            responseHeaders = ((Headers.Builder) (obj1)).build();
            if (!isHttps())
            {
                break MISSING_BLOCK_LABEL_263;
            }
            obj1 = ((j) (obj)).r();
            if (((String) (obj1)).length() > 0)
            {
                throw new IOException((new StringBuilder()).append("expected \"\" but was \"").append(((String) (obj1))).append("\"").toString());
            }
            break MISSING_BLOCK_LABEL_233;
            obj;
            ad1.close();
            throw obj;
            handshake = Handshake.get(((j) (obj)).r(), readCertificateList(((j) (obj))), readCertificateList(((j) (obj))));
_L5:
            ad1.close();
            return;
            handshake = null;
              goto _L5
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
    }



    private class CacheResponseBody extends ResponseBody
    {

        private final j bodySource;
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

        public j source()
        {
            return bodySource;
        }


        public CacheResponseBody(com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot1, String s, String s1)
        {
            snapshot = snapshot1;
            contentType = s;
            contentLength = s1;
            class _cls1 extends n
            {

                final CacheResponseBody this$0;
                final com.squareup.okhttp.internal.DiskLruCache.Snapshot val$snapshot;

                public void close()
                {
                    snapshot.close();
                    close();
                }

                _cls1(com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot1)
                {
                    this$0 = CacheResponseBody.this;
                    snapshot = snapshot1;
                    n(final_ad);
                }
            }

            bodySource = r.a(new _cls1(snapshot1));
        }
    }


    private class _cls2
        implements Iterator
    {

        boolean canRemove;
        final Iterator _flddelegate;
        String nextUrl;
        final Cache this$0;

        public boolean hasNext()
        {
            if (nextUrl != null)
            {
                return true;
            }
            canRemove = false;
_L2:
            com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot;
            if (!_flddelegate.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            snapshot = (com.squareup.okhttp.internal.DiskLruCache.Snapshot)_flddelegate.next();
            nextUrl = r.a(snapshot.getSource(0)).r();
            snapshot.close();
            return true;
            Object obj;
            obj;
            snapshot.close();
            if (true) goto _L2; else goto _L1
            obj;
            snapshot.close();
            throw obj;
_L1:
            return false;
        }

        public volatile Object next()
        {
            return next();
        }

        public String next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            } else
            {
                String s = nextUrl;
                nextUrl = null;
                canRemove = true;
                return s;
            }
        }

        public void remove()
        {
            if (!canRemove)
            {
                throw new IllegalStateException("remove() before next()");
            } else
            {
                _flddelegate.remove();
                return;
            }
        }

        _cls2()
        {
            this$0 = Cache.this;
            Object();
            _flddelegate = cache.snapshots();
        }
    }

}
