// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost;

import com.google.a.a.a.a.b;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import oauth.signpost.http.HttpParameters;

public class a
{

    public static final String a = "1.0";
    public static final String b = "UTF-8";
    public static final String c = "application/x-www-form-urlencoded";
    public static final String d = "Authorization";
    public static final String e = "oauth_consumer_key";
    public static final String f = "oauth_token";
    public static final String g = "oauth_token_secret";
    public static final String h = "oauth_signature_method";
    public static final String i = "oauth_signature";
    public static final String j = "oauth_timestamp";
    public static final String k = "oauth_nonce";
    public static final String l = "oauth_version";
    public static final String m = "oauth_callback";
    public static final String n = "oauth_callback_confirmed";
    public static final String o = "oauth_verifier";
    public static final String p = "oob";
    private static final b q = new b("-._~", false);

    public a()
    {
    }

    public static final String a(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            return obj.toString();
        }
    }

    public static String a(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return q.a(s);
        }
    }

    public static String a(String s, String s1)
    {
        String s2;
        if (s.contains("?"))
        {
            s2 = "&";
        } else
        {
            s2 = "?";
        }
        s = new StringBuilder((new StringBuilder()).append(s).append(s2).toString());
        s.append(s1);
        return s.toString();
    }

    public static String a(String s, Map map)
    {
        String as[] = new String[map.size() * 2];
        Iterator iterator = map.keySet().iterator();
        for (int i1 = 0; iterator.hasNext(); i1 += 2)
        {
            String s1 = (String)iterator.next();
            as[i1] = s1;
            as[i1 + 1] = (String)map.get(s1);
        }

        return a(s, as);
    }

    public static transient String a(String s, String as[])
    {
        String s1;
        if (s.contains("?"))
        {
            s1 = "&";
        } else
        {
            s1 = "?";
        }
        s = new StringBuilder((new StringBuilder()).append(s).append(s1).toString());
        for (int i1 = 0; i1 < as.length; i1 += 2)
        {
            if (i1 > 0)
            {
                s.append("&");
            }
            s.append((new StringBuilder()).append(a(as[i1])).append("=").append(a(as[i1 + 1])).toString());
        }

        return s.toString();
    }

    public static String a(Collection collection)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(collection, ((OutputStream) (bytearrayoutputstream)));
        return new String(bytearrayoutputstream.toByteArray());
    }

    public static transient String a(String as[])
    {
        StringBuilder stringbuilder = new StringBuilder("OAuth ");
        int i1 = 0;
        while (i1 < as.length) 
        {
            if (i1 > 0)
            {
                stringbuilder.append(", ");
            }
            String s;
            boolean flag;
            if (as[i1].startsWith("oauth_") || as[i1].startsWith("x_oauth_"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                s = a(as[i1 + 1]);
            } else
            {
                s = as[i1 + 1];
            }
            stringbuilder.append((new StringBuilder()).append(a(as[i1])).append("=\"").append(s).append("\"").toString());
            i1 += 2;
        }
        return stringbuilder.toString();
    }

    public static HttpParameters a(InputStream inputstream)
        throws IOException
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        StringBuilder stringbuilder = new StringBuilder();
        for (inputstream = bufferedreader.readLine(); inputstream != null; inputstream = bufferedreader.readLine())
        {
            stringbuilder.append(inputstream);
        }

        return c(stringbuilder.toString());
    }

    public static void a(Collection collection, OutputStream outputstream)
        throws IOException
    {
        if (collection != null)
        {
            collection = collection.iterator();
            boolean flag = true;
            while (collection.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)collection.next();
                if (flag)
                {
                    flag = false;
                } else
                {
                    outputstream.write(38);
                }
                outputstream.write(a(a(entry.getKey())).getBytes());
                outputstream.write(61);
                outputstream.write(a(a(entry.getValue())).getBytes());
            }
        }
    }

    public static String b(String s)
    {
        if (s == null)
        {
            return "";
        }
        try
        {
            s = URLDecoder.decode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s.getMessage(), s);
        }
        return s;
    }

    public static String b(String s, String s1)
    {
        return (new StringBuilder()).append(a(s)).append("=\"").append(a(s1)).append("\"").toString();
    }

    public static Map b(Collection collection)
    {
        HashMap hashmap = new HashMap();
        if (collection != null)
        {
            collection = collection.iterator();
            do
            {
                if (!collection.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)collection.next();
                String s = (String)entry.getKey();
                if (!hashmap.containsKey(s))
                {
                    hashmap.put(s, entry.getValue());
                }
            } while (true);
        }
        return hashmap;
    }

    public static HttpParameters c(String s)
    {
        HttpParameters httpparameters = new HttpParameters();
        if (d(s))
        {
            return httpparameters;
        }
        String as[] = s.split("\\&");
        int j1 = as.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            s = as[i1];
            int k1 = s.indexOf('=');
            String s1;
            if (k1 < 0)
            {
                s1 = b(s);
                s = null;
            } else
            {
                s1 = b(s.substring(0, k1));
                s = b(s.substring(k1 + 1));
            }
            httpparameters.a(s1, s);
            i1++;
        }
        return httpparameters;
    }

    public static void c(String s, String s1)
    {
        if (System.getProperty("debug") != null)
        {
            System.out.println((new StringBuilder()).append("[SIGNPOST] ").append(s).append(": ").append(s1).toString());
        }
    }

    public static boolean d(String s)
    {
        return s == null || s.length() == 0;
    }

    public static HttpParameters e(String s)
    {
        HttpParameters httpparameters = new HttpParameters();
        if (s != null && s.startsWith("OAuth "))
        {
            s = s.substring("OAuth ".length()).split(",");
            int j1 = s.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String as[] = s[i1].split("=");
                httpparameters.a(as[0].trim(), as[1].replace("\"", "").trim());
                i1++;
            }
        }
        return httpparameters;
    }

}
