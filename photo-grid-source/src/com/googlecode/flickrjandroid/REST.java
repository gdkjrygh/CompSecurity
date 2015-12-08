// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import com.googlecode.flickrjandroid.uploader.ImageParameter;
import com.googlecode.flickrjandroid.uploader.UploaderResponse;
import com.googlecode.flickrjandroid.util.Base64;
import com.googlecode.flickrjandroid.util.IOUtilities;
import com.googlecode.flickrjandroid.util.StringUtilities;
import com.googlecode.flickrjandroid.util.UrlUtilities;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

// Referenced classes of package com.googlecode.flickrjandroid:
//            Transport, RESTResponse, Parameter, Response

public class REST extends Transport
{

    public static final String PATH = "/services/rest/";
    private static final String UTF8 = "UTF-8";
    private DocumentBuilder builder;
    private boolean proxyAuth;
    private String proxyPassword;
    private String proxyUser;

    public REST()
    {
        proxyAuth = false;
        proxyUser = "";
        proxyPassword = "";
        setTransportType("REST");
        setHost("api.flickr.com");
        setPath("/services/rest/");
        setResponseClass(com/googlecode/flickrjandroid/RESTResponse);
        builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    }

    public REST(String s)
    {
        this();
        setHost(s);
    }

    public REST(String s, int i)
    {
        this();
        setHost(s);
        setPort(i);
    }

    public static String encodeParameters(List list)
    {
        if (list == null || list.isEmpty())
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        do
        {
            if (i >= list.size())
            {
                return stringbuffer.toString();
            }
            if (i != 0)
            {
                stringbuffer.append("&");
            }
            Parameter parameter = (Parameter)list.get(i);
            stringbuffer.append(UrlUtilities.encode(parameter.getName())).append("=").append(UrlUtilities.encode(String.valueOf(parameter.getValue())));
            i++;
        } while (true);
    }

    private InputStream getInputStream(String s, List list)
    {
        s = (HttpURLConnection)UrlUtilities.buildUrl(getHost(), getPort(), s, list).openConnection();
        s.addRequestProperty("Cache-Control", "no-cache,max-age=0");
        s.addRequestProperty("Pragma", "no-cache");
        s.setRequestMethod("GET");
        if (proxyAuth)
        {
            s.setRequestProperty("Proxy-Authorization", (new StringBuilder("Basic ")).append(getProxyCredentials()).toString());
        }
        s.connect();
        return s.getInputStream();
    }

    private String readFromStream(InputStream inputstream)
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        Object obj = new StringBuffer();
_L1:
        String s = bufferedreader.readLine();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = ((StringBuffer) (obj)).toString();
        IOUtilities.close(inputstream);
        IOUtilities.close(bufferedreader);
        return ((String) (obj));
        ((StringBuffer) (obj)).append(s);
          goto _L1
        Exception exception;
        exception;
_L3:
        IOUtilities.close(inputstream);
        IOUtilities.close(bufferedreader);
        throw exception;
        exception;
        bufferedreader = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void writeParam(Parameter parameter, DataOutputStream dataoutputstream, String s)
    {
        String s1;
        s1 = parameter.getName();
        dataoutputstream.writeBytes("\r\n");
        if (!(parameter instanceof ImageParameter))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        ImageParameter imageparameter = (ImageParameter)parameter;
        parameter = ((Parameter) (parameter.getValue()));
        dataoutputstream.writeBytes(String.format(Locale.US, "Content-Disposition: form-data; name=\"%s\"; filename=\"%s\";\r\n", new Object[] {
            s1, imageparameter.getImageName()
        }));
        dataoutputstream.writeBytes(String.format(Locale.US, "Content-Type: image/%s\r\n\r\n", new Object[] {
            imageparameter.getImageType()
        }));
        if (!(parameter instanceof InputStream)) goto _L2; else goto _L1
_L1:
        parameter = (InputStream)parameter;
        s1 = new byte[512];
_L5:
        int i = parameter.read(s1);
        if (i != -1) goto _L4; else goto _L3
_L3:
        dataoutputstream.writeBytes("\r\n");
        dataoutputstream.writeBytes(s);
        return;
_L4:
        dataoutputstream.write(s1, 0, i);
          goto _L5
_L2:
        if (parameter instanceof byte[])
        {
            dataoutputstream.write((byte[])parameter);
        }
          goto _L3
        dataoutputstream.writeBytes((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s1).append("\"\r\n").toString());
        dataoutputstream.writeBytes("Content-Type: text/plain; charset=UTF-8\r\n\r\n");
        dataoutputstream.write(((String)parameter.getValue()).getBytes("UTF-8"));
          goto _L3
    }

    public Response get(String s, List list)
    {
        list.add(new Parameter("nojsoncallback", "1"));
        list.add(new Parameter("format", "json"));
        return new RESTResponse(getLine(s, list));
    }

    public Map getDataAsMap(String s)
    {
        HashMap hashmap = new HashMap();
        if (s == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        s = StringUtilities.split(s, "&");
        j = s.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return hashmap;
_L3:
        String as[] = StringUtilities.split(s[i], "=");
        if (as.length == 2)
        {
            hashmap.put(as[0], as[1]);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String getLine(String s, List list)
    {
        Object obj = null;
        s = getInputStream(s, list);
        list = new BufferedReader(new InputStreamReader(s, "UTF-8"));
        obj = new StringBuffer();
_L1:
        String s1 = list.readLine();
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj = ((StringBuffer) (obj)).toString();
        IOUtilities.close(s);
        IOUtilities.close(list);
        return ((String) (obj));
        ((StringBuffer) (obj)).append(s1);
          goto _L1
        Exception exception;
        exception;
        obj = s;
        s = exception;
_L3:
        IOUtilities.close(((InputStream) (obj)));
        IOUtilities.close(list);
        throw s;
        s;
        list = null;
        continue; /* Loop/switch isn't completed */
        exception;
        list = null;
        obj = s;
        s = exception;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public Map getMapData(boolean flag, String s, List list)
    {
        if (flag)
        {
            s = getLine(s, list);
        } else
        {
            s = sendPost(s, list);
        }
        return getDataAsMap(URLDecoder.decode(s, "UTF-8"));
    }

    public String getProxyCredentials()
    {
        return new String(Base64.encode((new StringBuilder(String.valueOf(proxyUser))).append(":").append(proxyPassword).toString().getBytes()));
    }

    public boolean isProxyAuth()
    {
        return proxyAuth;
    }

    public Response post(String s, List list)
    {
        return new RESTResponse(sendPost(s, list));
    }

    public String sendPost(String s, List list)
    {
        Object obj = null;
        s = (HttpURLConnection)UrlUtilities.buildPostUrl(getHost(), getPort(), s).openConnection();
        s.setRequestMethod("POST");
        obj = encodeParameters(list).getBytes("UTF-8");
        s.setRequestProperty("Content-Length", Integer.toString(obj.length));
        s.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        s.addRequestProperty("Cache-Control", "no-cache,max-age=0");
        s.addRequestProperty("Pragma", "no-cache");
        s.setUseCaches(false);
        s.setDoOutput(true);
        s.setDoInput(true);
        s.connect();
        list = new DataOutputStream(s.getOutputStream());
        list.write(((byte []) (obj)));
        list.flush();
        list.close();
        int i = s.getResponseCode();
_L6:
        if (i == 200) goto _L2; else goto _L1
_L1:
        obj = readFromStream(s.getErrorStream());
        throw new IOException((new StringBuilder("Connection Failed. Response Code: ")).append(i).append(", Response Message: ").append(s.getResponseMessage()).append(", Error: ").append(((String) (obj))).toString());
        Exception exception;
        exception;
        obj = s;
        s = exception;
_L4:
        IOUtilities.close(list);
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw s;
        obj;
        if (s.getErrorStream() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        i = s.getResponseCode();
        continue; /* Loop/switch isn't completed */
_L2:
        obj = readFromStream(s.getInputStream()).trim();
        IOUtilities.close(list);
        if (s != null)
        {
            s.disconnect();
        }
        return ((String) (obj));
        s;
        list = null;
        continue; /* Loop/switch isn't completed */
        exception;
        list = null;
        obj = s;
        s = exception;
        if (true) goto _L4; else goto _L3
_L3:
        i = 200;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected Response sendUpload(String s, List list)
    {
        String s1 = null;
        s = (HttpURLConnection)UrlUtilities.buildPostUrl(getHost(), getPort(), s).openConnection();
        DataOutputStream dataoutputstream;
        s.setRequestMethod("POST");
        s.setRequestProperty("Content-Type", (new StringBuilder("multipart/form-data; boundary=")).append("---------------------------7d273f7a0d3").toString());
        s.setRequestProperty("Host", "api.flickr.com");
        s.setDoInput(true);
        s.setDoOutput(true);
        s.connect();
        dataoutputstream = new DataOutputStream(s.getOutputStream());
        s1 = (new StringBuilder("--")).append("---------------------------7d273f7a0d3").toString();
        dataoutputstream.writeBytes(s1);
        list = list.iterator();
_L5:
        if (list.hasNext()) goto _L2; else goto _L1
_L1:
        dataoutputstream.writeBytes("--\r\n\r\n");
        dataoutputstream.flush();
        dataoutputstream.close();
        int i = s.getResponseCode();
_L6:
        if (i == 200) goto _L4; else goto _L3
_L3:
        list = readFromStream(s.getErrorStream());
        throw new IOException((new StringBuilder("Connection Failed. Response Code: ")).append(i).append(", Response Message: ").append(s.getResponseMessage()).append(", Error: ").append(list).toString());
        list;
        s1 = s;
        s = list;
        list = dataoutputstream;
_L7:
        IOUtilities.close(list);
        if (s1 != null)
        {
            s1.disconnect();
        }
        throw s;
_L2:
        writeParam((Parameter)list.next(), dataoutputstream, s1);
          goto _L5
        list;
        if (s.getErrorStream() == null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        i = s.getResponseCode();
          goto _L6
_L4:
        list = new UploaderResponse();
        list.parse(builder.parse(s.getInputStream()));
        IOUtilities.close(dataoutputstream);
        if (s != null)
        {
            s.disconnect();
        }
        return list;
        s;
        list = null;
          goto _L7
        Exception exception;
        exception;
        list = null;
        s1 = s;
        s = exception;
          goto _L7
        i = 200;
          goto _L6
    }

    public void setProxy(String s, int i)
    {
        System.setProperty("http.proxySet", "true");
        System.setProperty("http.proxyHost", s);
        System.setProperty("http.proxyPort", String.valueOf(i));
    }

    public void setProxy(String s, int i, String s1, String s2)
    {
        setProxy(s, i);
        proxyAuth = true;
        proxyUser = s1;
        proxyPassword = s2;
    }
}
