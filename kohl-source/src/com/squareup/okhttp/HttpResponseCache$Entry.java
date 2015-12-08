// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Base64;
import com.squareup.okhttp.internal.StrictLineReader;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.http.HttpsEngine;
import com.squareup.okhttp.internal.http.HttpsURLConnectionImpl;
import com.squareup.okhttp.internal.http.RawHeaders;
import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp:
//            HttpResponseCache

private static final class localCertificates
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

    public void writeTo(com.squareup.okhttp.internal.ap ap)
        throws IOException
    {
        ap = new BufferedWriter(new OutputStreamWriter(ap.utputStream(0), Util.UTF_8));
        ap.write((new StringBuilder()).append(uri).append('\n').toString());
        ap.write((new StringBuilder()).append(requestMethod).append('\n').toString());
        ap.write((new StringBuilder()).append(Integer.toString(varyHeaders.length())).append('\n').toString());
        for (int i = 0; i < varyHeaders.length(); i++)
        {
            ap.write((new StringBuilder()).append(varyHeaders.getFieldName(i)).append(": ").append(varyHeaders.getValue(i)).append('\n').toString());
        }

        ap.write((new StringBuilder()).append(responseHeaders.getStatusLine()).append('\n').toString());
        ap.write((new StringBuilder()).append(Integer.toString(responseHeaders.length())).append('\n').toString());
        for (int j = 0; j < responseHeaders.length(); j++)
        {
            ap.write((new StringBuilder()).append(responseHeaders.getFieldName(j)).append(": ").append(responseHeaders.getValue(j)).append('\n').toString());
        }

        if (isHttps())
        {
            ap.write(10);
            ap.write((new StringBuilder()).append(cipherSuite).append('\n').toString());
            writeCertArray(ap, peerCertificates);
            writeCertArray(ap, localCertificates);
        }
        ap.close();
    }






    public r(InputStream inputstream)
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

    public (URI uri1, RawHeaders rawheaders, HttpURLConnection httpurlconnection)
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
