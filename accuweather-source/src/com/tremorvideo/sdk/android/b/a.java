// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.b;

import android.net.Uri;
import com.tremorvideo.sdk.android.videoad.ct;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.tremorvideo.sdk.android.b:
//            b

public class a
{

    private ArrayList a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    public a(String s, String s1, String s2, String s3)
    {
        f = null;
        b = s2;
        c = s;
        d = s1;
        e = s3;
        f = null;
        a = new ArrayList();
    }

    public a(String s, String s1, String s2, String s3, String s4)
    {
        f = null;
        b = s3;
        c = s;
        d = s1;
        e = s4;
        f = s2;
        a = new ArrayList();
    }

    private static String a(long l)
    {
        return (new StringBuilder()).append(String.valueOf(l)).append(String.valueOf((new Random()).nextInt())).toString();
    }

    private static String a(InputStream inputstream)
    {
        char ac[];
        StringBuilder stringbuilder;
        ac = new char[0x10000];
        stringbuilder = new StringBuilder();
        inputstream = new InputStreamReader(inputstream, "UTF-8");
_L2:
        int i = inputstream.read(ac, 0, ac.length);
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            stringbuilder.append(ac, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return "";
        }
        if (i >= 0) goto _L2; else goto _L1
_L1:
        inputstream.close();
        inputstream = stringbuilder.toString();
        return inputstream;
    }

    private static String a(List list)
    {
        ArrayList arraylist = new ArrayList(list);
        Collections.sort(arraylist, new b());
        int i = 0;
        list = "";
        for (; i < arraylist.size(); i++)
        {
            String as[] = (String[])arraylist.get(i);
            list = (new StringBuilder()).append(list).append(as[0]).toString();
            list = (new StringBuilder()).append(list).append('=').toString();
            String s = (new StringBuilder()).append(list).append(as[1]).toString();
            list = s;
            if (i != arraylist.size() - 1)
            {
                list = (new StringBuilder()).append(s).append('&').toString();
            }
        }

        return list;
    }

    public static String a(byte abyte0[])
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        int k = (3 - abyte0.length % 3) % 3;
        byte abyte1[] = new byte[abyte0.length + k];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= abyte1.length)
            {
                break;
            }
            j = ((abyte1[i] & 0xff) << 16) + ((abyte1[i + 1] & 0xff) << 8) + (abyte1[i + 2] & 0xff);
            stringbuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(j >> 18 & 0x3f));
            stringbuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(j >> 12 & 0x3f));
            stringbuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(j >> 6 & 0x3f));
            stringbuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(j >> 0 & 0x3f));
            i += 3;
        } while (true);
        for (; j < k; j++)
        {
            stringbuilder.setCharAt((stringbuilder.length() - k) + j, '=');
        }

        return stringbuilder.toString();
    }

    public static String b(String s, String s1)
    {
        try
        {
            s1 = new SecretKeySpec(s1.getBytes("UTF-8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(s1);
            s = a(mac.doFinal(s.getBytes("UTF-8")));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    private String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < a.size(); i++)
        {
            String as[] = (String[])a.get(i);
            stringbuilder.append((new StringBuilder()).append(as[0]).append("=").append(as[1]).toString());
            if (i < a.size() - 1)
            {
                stringbuilder.append('&');
            }
        }

        return stringbuilder.toString();
    }

    private static String e()
    {
        return "HMAC-SHA1";
    }

    private static long f()
    {
        return System.currentTimeMillis() / 1000L;
    }

    public void a(String s, String s1)
    {
        try
        {
            s1 = URLEncoder.encode(s1, "UTF-8").replace("*", "%2A").replace("+", "%20").replace("%7E", "~");
            a.add(new String[] {
                s, s1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ct.a(s);
        }
    }

    public boolean a()
    {
        Object obj;
        Object obj1;
        long l;
        try
        {
            l = f();
            obj = a(l);
            obj1 = new ArrayList();
            ((ArrayList) (obj1)).add(new String[] {
                "oauth_consumer_key", c
            });
            ((ArrayList) (obj1)).add(new String[] {
                "oauth_signature_method", e()
            });
            ((ArrayList) (obj1)).add(new String[] {
                "oauth_timestamp", Long.toString(l)
            });
            ((ArrayList) (obj1)).add(new String[] {
                "oauth_nonce", obj
            });
            ((ArrayList) (obj1)).add(new String[] {
                "oauth_version", "1.0"
            });
            if (f != null)
            {
                ((ArrayList) (obj1)).add(new String[] {
                    "oauth_token", f
                });
            }
            for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ArrayList) (obj1)).add((String[])iterator.next())) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ct.a("Error sending OAuth request", ((Throwable) (obj)));
            g = "";
            return false;
        }
        obj1 = a(((List) (obj1)));
        String s = (new StringBuilder()).append("").append(b).append("&").toString();
        s = (new StringBuilder()).append(s).append(Uri.encode(e)).append("&").toString();
        obj1 = Uri.encode(b((new StringBuilder()).append(s).append(Uri.encode(((String) (obj1)))).toString(), d));
        obj = (new StringBuilder()).append("OAuth ").append("oauth_nonce=\"").append(Uri.encode(((String) (obj)))).append("\", ").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("oauth_signature_method=\"HMAC-SHA1\", ").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("oauth_timestamp=\"").append(l).append("\", ").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append("oauth_consumer_key=\"").append(c).append("\", ").toString();
        obj1 = (new StringBuilder()).append(((String) (obj))).append("oauth_signature=\"").append(((String) (obj1))).append("\", ").toString();
        obj = obj1;
        HttpURLConnection httpurlconnection;
        int i;
        if (f != null)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("oauth_token=\"").append(f).append("\", ").toString();
        }
        obj = (new StringBuilder()).append(((String) (obj))).append("oauth_version=\"1.0\"").toString();
        obj1 = d();
        httpurlconnection = (HttpURLConnection)(new URL(e)).openConnection();
        httpurlconnection.setDoInput(true);
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setRequestMethod(b);
        httpurlconnection.setReadTimeout(18000);
        httpurlconnection.setConnectTimeout(18000);
        httpurlconnection.setRequestProperty("Authorization", ((String) (obj)));
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpurlconnection.setRequestProperty("Content-Length", String.valueOf(((String) (obj1)).getBytes().length));
        httpurlconnection.getOutputStream().write(((String) (obj1)).getBytes());
        i = httpurlconnection.getResponseCode();
        if (i < 200 || i >= 300)
        {
            break MISSING_BLOCK_LABEL_645;
        }
        g = a(httpurlconnection.getInputStream());
        return true;
        g = a(httpurlconnection.getErrorStream());
        return false;
    }

    public HashMap b()
    {
        HashMap hashmap = new HashMap();
        String as[] = g.split("&");
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i].split("=");
            if (as1.length == 2)
            {
                hashmap.put(as1[0], as1[1]);
            }
        }

        return hashmap;
    }

    public String c()
    {
        return g;
    }
}
