// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Base64;
import com.squareup.okhttp.internal.DiskLruCache;
import com.squareup.okhttp.internal.StrictLineReader;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.http.HttpsEngine;
import com.squareup.okhttp.internal.http.HttpsURLConnectionImpl;
import com.squareup.okhttp.internal.http.RawHeaders;
import com.squareup.okhttp.internal.http.RequestHeaders;
import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.ResponseCache;
import java.net.SecureCacheResponse;
import java.net.URI;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp:
//            ResponseSource, OkResponseCache

public final class HttpResponseCache extends ResponseCache
{
    private static final class Entry
    {

        private final String cipherSuite;
        private final Certificate localCertificates[];
        private final Certificate peerCertificates[];
        private final String requestMethod;
        private final RawHeaders responseHeaders;
        private final String uri;
        private final RawHeaders varyHeaders;

        private SSLSocket getSslSocket(HttpURLConnection httpurlconnection)
        {
            if (httpurlconnection instanceof HttpsURLConnectionImpl)
            {
                httpurlconnection = ((HttpsURLConnectionImpl)httpurlconnection).getHttpEngine();
            } else
            {
                httpurlconnection = ((HttpURLConnectionImpl)httpurlconnection).getHttpEngine();
            }
            if (httpurlconnection instanceof HttpsEngine)
            {
                return ((HttpsEngine)httpurlconnection).getSslSocket();
            } else
            {
                return null;
            }
        }

        private boolean isHttps()
        {
            return uri.startsWith("https://");
        }

        private Certificate[] readCertArray(StrictLineReader strictlinereader)
            throws IOException
        {
            int i = strictlinereader.readInt();
            if (i != -1) goto _L2; else goto _L1
_L1:
            Certificate acertificate[] = null;
_L4:
            return acertificate;
_L2:
            Certificate acertificate1[];
            CertificateFactory certificatefactory;
            try
            {
                certificatefactory = CertificateFactory.getInstance("X.509");
                acertificate1 = new Certificate[i];
            }
            // Misplaced declaration of an exception variable
            catch (StrictLineReader strictlinereader)
            {
                throw new IOException(strictlinereader.getMessage());
            }
            i = 0;
            acertificate = acertificate1;
            if (i >= acertificate1.length) goto _L4; else goto _L3
_L3:
            acertificate1[i] = certificatefactory.generateCertificate(new ByteArrayInputStream(Base64.decode(strictlinereader.readLine().getBytes("US-ASCII"))));
            i++;
            break MISSING_BLOCK_LABEL_32;
        }

        private void writeCertArray(Writer writer, Certificate acertificate[])
            throws IOException
        {
            if (acertificate != null) goto _L2; else goto _L1
_L1:
            writer.write("-1\n");
_L6:
            return;
_L2:
            String s;
            int i;
            int j;
            try
            {
                writer.write((new StringBuilder()).append(Integer.toString(acertificate.length)).append('\n').toString());
                j = acertificate.length;
            }
            // Misplaced declaration of an exception variable
            catch (Writer writer)
            {
                throw new IOException(writer.getMessage());
            }
            i = 0;
            if (i >= j)
            {
                continue; /* Loop/switch isn't completed */
            }
            s = Base64.encode(acertificate[i].getEncoded());
            writer.write((new StringBuilder()).append(s).append('\n').toString());
            i++;
            if (true) goto _L4; else goto _L3
_L3:
            break MISSING_BLOCK_LABEL_91;
_L4:
            break MISSING_BLOCK_LABEL_45;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public boolean matches(URI uri1, String s, Map map)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (uri.equals(uri1.toString()))
            {
                flag = flag1;
                if (requestMethod.equals(s))
                {
                    flag = flag1;
                    if ((new ResponseHeaders(uri1, responseHeaders)).varyMatches(varyHeaders.toMultimap(false), map))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public void writeTo(com.squareup.okhttp.internal.DiskLruCache.Editor editor)
            throws IOException
        {
            editor = new BufferedWriter(new OutputStreamWriter(editor.newOutputStream(0), Util.UTF_8));
            editor.write((new StringBuilder()).append(uri).append('\n').toString());
            editor.write((new StringBuilder()).append(requestMethod).append('\n').toString());
            editor.write((new StringBuilder()).append(Integer.toString(varyHeaders.length())).append('\n').toString());
            for (int i = 0; i < varyHeaders.length(); i++)
            {
                editor.write((new StringBuilder()).append(varyHeaders.getFieldName(i)).append(": ").append(varyHeaders.getValue(i)).append('\n').toString());
            }

            editor.write((new StringBuilder()).append(responseHeaders.getStatusLine()).append('\n').toString());
            editor.write((new StringBuilder()).append(Integer.toString(responseHeaders.length())).append('\n').toString());
            for (int j = 0; j < responseHeaders.length(); j++)
            {
                editor.write((new StringBuilder()).append(responseHeaders.getFieldName(j)).append(": ").append(responseHeaders.getValue(j)).append('\n').toString());
            }

            if (isHttps())
            {
                editor.write(10);
                editor.write((new StringBuilder()).append(cipherSuite).append('\n').toString());
                writeCertArray(editor, peerCertificates);
                writeCertArray(editor, localCertificates);
            }
            editor.close();
        }






        public Entry(InputStream inputstream)
            throws IOException
        {
            Object obj;
            int j;
            obj = new StrictLineReader(inputstream, Util.US_ASCII);
            uri = ((StrictLineReader) (obj)).readLine();
            requestMethod = ((StrictLineReader) (obj)).readLine();
            varyHeaders = new RawHeaders();
            j = ((StrictLineReader) (obj)).readInt();
            int i = 0;
_L2:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            varyHeaders.addLine(((StrictLineReader) (obj)).readLine());
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            responseHeaders = new RawHeaders();
            responseHeaders.setStatusLine(((StrictLineReader) (obj)).readLine());
            j = ((StrictLineReader) (obj)).readInt();
            i = 0;
_L4:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            responseHeaders.addLine(((StrictLineReader) (obj)).readLine());
            i++;
            if (true) goto _L4; else goto _L3
_L3:
            if (!isHttps())
            {
                break MISSING_BLOCK_LABEL_226;
            }
            String s = ((StrictLineReader) (obj)).readLine();
            if (s.length() > 0)
            {
                throw new IOException((new StringBuilder()).append("expected \"\" but was \"").append(s).append("\"").toString());
            }
            break MISSING_BLOCK_LABEL_195;
            obj;
            inputstream.close();
            throw obj;
            cipherSuite = ((StrictLineReader) (obj)).readLine();
            peerCertificates = readCertArray(((StrictLineReader) (obj)));
            localCertificates = readCertArray(((StrictLineReader) (obj)));
_L5:
            inputstream.close();
            return;
            cipherSuite = null;
            peerCertificates = null;
            localCertificates = null;
              goto _L5
        }

        public Entry(URI uri1, RawHeaders rawheaders, HttpURLConnection httpurlconnection)
            throws IOException
        {
            uri = uri1.toString();
            varyHeaders = rawheaders;
            requestMethod = httpurlconnection.getRequestMethod();
            responseHeaders = RawHeaders.fromMultimap(httpurlconnection.getHeaderFields(), true);
            httpurlconnection = getSslSocket(httpurlconnection);
            if (httpurlconnection == null) goto _L2; else goto _L1
_L1:
            cipherSuite = httpurlconnection.getSession().getCipherSuite();
            uri1 = null;
            rawheaders = httpurlconnection.getSession().getPeerCertificates();
            uri1 = rawheaders;
_L4:
            peerCertificates = uri1;
            localCertificates = httpurlconnection.getSession().getLocalCertificates();
            return;
_L2:
            cipherSuite = null;
            peerCertificates = null;
            localCertificates = null;
            return;
            rawheaders;
            if (true) goto _L4; else goto _L3
_L3:
        }
    }

    static class EntryCacheResponse extends CacheResponse
    {

        private final Entry entry;
        private final InputStream in;
        private final com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot;

        public InputStream getBody()
        {
            return in;
        }

        public Map getHeaders()
        {
            return entry.responseHeaders.toMultimap(true);
        }


        public EntryCacheResponse(Entry entry1, com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot1)
        {
            entry = entry1;
            snapshot = snapshot1;
            in = HttpResponseCache.newBodyInputStream(snapshot1);
        }
    }

    static class EntrySecureCacheResponse extends SecureCacheResponse
    {

        private final Entry entry;
        private final InputStream in;
        private final com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot;

        public InputStream getBody()
        {
            return in;
        }

        public String getCipherSuite()
        {
            return entry.cipherSuite;
        }

        public Map getHeaders()
        {
            return entry.responseHeaders.toMultimap(true);
        }

        public List getLocalCertificateChain()
        {
            if (entry.localCertificates == null || entry.localCertificates.length == 0)
            {
                return null;
            } else
            {
                return Arrays.asList((Object[])entry.localCertificates.clone());
            }
        }

        public Principal getLocalPrincipal()
        {
            if (entry.localCertificates == null || entry.localCertificates.length == 0)
            {
                return null;
            } else
            {
                return ((X509Certificate)entry.localCertificates[0]).getSubjectX500Principal();
            }
        }

        public Principal getPeerPrincipal()
            throws SSLPeerUnverifiedException
        {
            if (entry.peerCertificates == null || entry.peerCertificates.length == 0)
            {
                throw new SSLPeerUnverifiedException(null);
            } else
            {
                return ((X509Certificate)entry.peerCertificates[0]).getSubjectX500Principal();
            }
        }

        public List getServerCertificateChain()
            throws SSLPeerUnverifiedException
        {
            if (entry.peerCertificates == null || entry.peerCertificates.length == 0)
            {
                throw new SSLPeerUnverifiedException(null);
            } else
            {
                return Arrays.asList((Object[])entry.peerCertificates.clone());
            }
        }


        public EntrySecureCacheResponse(Entry entry1, com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot1)
        {
            entry = entry1;
            snapshot = snapshot1;
            in = HttpResponseCache.newBodyInputStream(snapshot1);
        }
    }


    private static final char DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 0x31191;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    final OkResponseCache okResponseCache = new OkResponseCache() {

        final HttpResponseCache this$0;

        public CacheResponse get(URI uri, String s, Map map)
            throws IOException
        {
            return HttpResponseCache.this.get(uri, s, map);
        }

        public void maybeRemove(String s, URI uri)
            throws IOException
        {
            HttpResponseCache.this.maybeRemove(s, uri);
        }

        public CacheRequest put(URI uri, URLConnection urlconnection)
            throws IOException
        {
            return HttpResponseCache.this.put(uri, urlconnection);
        }

        public void trackConditionalCacheHit()
        {
            HttpResponseCache.this.trackConditionalCacheHit();
        }

        public void trackResponse(ResponseSource responsesource)
        {
            HttpResponseCache.this.trackResponse(responsesource);
        }

        public void update(CacheResponse cacheresponse, HttpURLConnection httpurlconnection)
            throws IOException
        {
            HttpResponseCache.this.update(cacheresponse, httpurlconnection);
        }

            
            {
                this$0 = HttpResponseCache.this;
                super();
            }
    };
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public HttpResponseCache(File file, long l)
        throws IOException
    {
        cache = DiskLruCache.open(file, 0x31191, 2, l);
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

    private static String bytesToHexString(byte abyte0[])
    {
        char ac[] = DIGITS;
        char ac1[] = new char[abyte0.length * 2];
        int k = abyte0.length;
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            byte byte0 = abyte0[i];
            int l = j + 1;
            ac1[j] = ac[byte0 >> 4 & 0xf];
            j = l + 1;
            ac1[l] = ac[byte0 & 0xf];
        }

        return new String(ac1);
    }

    private HttpEngine getHttpEngine(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnectionImpl)
        {
            return ((HttpURLConnectionImpl)urlconnection).getHttpEngine();
        }
        if (urlconnection instanceof HttpsURLConnectionImpl)
        {
            return ((HttpsURLConnectionImpl)urlconnection).getHttpEngine();
        } else
        {
            return null;
        }
    }

    private boolean maybeRemove(String s, URI uri)
    {
        if (s.equals("POST") || s.equals("PUT") || s.equals("DELETE"))
        {
            try
            {
                cache.remove(uriToKey(uri));
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            return true;
        } else
        {
            return false;
        }
    }

    private static InputStream newBodyInputStream(com.squareup.okhttp.internal.DiskLruCache.Snapshot snapshot)
    {
        return new FilterInputStream(snapshot.getInputStream(1), snapshot) {

            final com.squareup.okhttp.internal.DiskLruCache.Snapshot val$snapshot;

            public void close()
                throws IOException
            {
                snapshot.close();
                close();
            }

            
            {
                snapshot = snapshot1;
                super(inputstream);
            }
        };
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

    private void trackResponse(ResponseSource responsesource)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        requestCount = requestCount + 1;
        static class _cls3
        {

            static final int $SwitchMap$com$squareup$okhttp$ResponseSource[];

            static 
            {
                $SwitchMap$com$squareup$okhttp$ResponseSource = new int[ResponseSource.values().length];
                try
                {
                    $SwitchMap$com$squareup$okhttp$ResponseSource[ResponseSource.CACHE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$squareup$okhttp$ResponseSource[ResponseSource.CONDITIONAL_CACHE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$squareup$okhttp$ResponseSource[ResponseSource.NETWORK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        i = _cls3..SwitchMap.com.squareup.okhttp.ResponseSource[responsesource.ordinal()];
        i;
        JVM INSTR tableswitch 1 3: default 48
    //                   1 51
    //                   2 69
    //                   3 69;
           goto _L1 _L2 _L3 _L3
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        hitCount = hitCount + 1;
          goto _L1
        responsesource;
        throw responsesource;
_L3:
        networkCount = networkCount + 1;
          goto _L1
    }

    private void update(CacheResponse cacheresponse, HttpURLConnection httpurlconnection)
        throws IOException
    {
        Object obj = getHttpEngine(httpurlconnection);
        URI uri = ((HttpEngine) (obj)).getUri();
        ResponseHeaders responseheaders = ((HttpEngine) (obj)).getResponseHeaders();
        obj = new Entry(uri, ((HttpEngine) (obj)).getRequestHeaders().getHeaders().getAll(responseheaders.getVaryFields()), httpurlconnection);
        if (cacheresponse instanceof EntryCacheResponse)
        {
            httpurlconnection = ((EntryCacheResponse)cacheresponse).snapshot;
        } else
        {
            httpurlconnection = ((EntrySecureCacheResponse)cacheresponse).snapshot;
        }
        cacheresponse = null;
        try
        {
            httpurlconnection = httpurlconnection.edit();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            abortQuietly(cacheresponse);
            return;
        }
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        cacheresponse = httpurlconnection;
        ((Entry) (obj)).writeTo(httpurlconnection);
        cacheresponse = httpurlconnection;
        httpurlconnection.commit();
    }

    private String uriToKey(URI uri)
    {
        try
        {
            uri = bytesToHexString(MessageDigest.getInstance("MD5").digest(uri.toString().getBytes("UTF-8")));
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            throw new AssertionError(uri);
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            throw new AssertionError(uri);
        }
        return uri;
    }

    public void close()
        throws IOException
    {
        cache.close();
    }

    public void delete()
        throws IOException
    {
        cache.delete();
    }

    public void flush()
        throws IOException
    {
        cache.flush();
    }

    public CacheResponse get(URI uri, String s, Map map)
    {
        Object obj;
        Entry entry;
        obj = uriToKey(uri);
        try
        {
            obj = cache.get(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        entry = new Entry(((com.squareup.okhttp.internal.DiskLruCache.Snapshot) (obj)).getInputStream(0));
        if (!entry.matches(uri, s, map))
        {
            ((com.squareup.okhttp.internal.DiskLruCache.Snapshot) (obj)).close();
            return null;
        }
        if (entry.isHttps())
        {
            return new EntrySecureCacheResponse(entry, ((com.squareup.okhttp.internal.DiskLruCache.Snapshot) (obj)));
        } else
        {
            return new EntryCacheResponse(entry, ((com.squareup.okhttp.internal.DiskLruCache.Snapshot) (obj)));
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

    public boolean isClosed()
    {
        return cache.isClosed();
    }

    public CacheRequest put(URI uri, URLConnection urlconnection)
        throws IOException
    {
        if (urlconnection instanceof HttpURLConnection) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        urlconnection = (HttpURLConnection)urlconnection;
        obj = urlconnection.getRequestMethod();
        if (maybeRemove(((String) (obj)), uri) || !((String) (obj)).equals("GET")) goto _L1; else goto _L3
_L3:
        obj = getHttpEngine(urlconnection);
        if (obj == null) goto _L1; else goto _L4
_L4:
        ResponseHeaders responseheaders = ((HttpEngine) (obj)).getResponseHeaders();
        if (responseheaders.hasVaryAll()) goto _L1; else goto _L5
_L5:
        obj = new Entry(uri, ((HttpEngine) (obj)).getRequestHeaders().getHeaders().getAll(responseheaders.getVaryFields()), urlconnection);
        urlconnection = null;
        try
        {
            uri = cache.edit(uriToKey(uri));
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            abortQuietly(urlconnection);
            return null;
        }
        if (uri == null) goto _L1; else goto _L6
_L6:
        urlconnection = uri;
        ((Entry) (obj)).writeTo(uri);
        urlconnection = uri;
        uri = new CacheRequestImpl(uri);
        return uri;
    }








/*
    static int access$808(HttpResponseCache httpresponsecache)
    {
        int i = httpresponsecache.writeSuccessCount;
        httpresponsecache.writeSuccessCount = i + 1;
        return i;
    }

*/


/*
    static int access$908(HttpResponseCache httpresponsecache)
    {
        int i = httpresponsecache.writeAbortCount;
        httpresponsecache.writeAbortCount = i + 1;
        return i;
    }

*/

    // Unreferenced inner class com/squareup/okhttp/HttpResponseCache$CacheRequestImpl$1

/* anonymous class */
}
