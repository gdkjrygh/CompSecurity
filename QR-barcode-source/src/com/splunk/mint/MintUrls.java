// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;


// Referenced classes of package com.splunk.mint:
//            Properties

class MintUrls
{

    private static volatile StringBuilder URL;

    public MintUrls(String s, String s1)
    {
        URL = new StringBuilder();
        if (s == null)
        {
            URL.append("https://");
            URL.append(s1);
            URL.append(".api.splkmobile.com/");
            URL.append("1.0");
            URL.append("/");
            URL.append(s1);
            URL.append("/");
            URL.append(Properties.UID);
            URL.append("/");
        } else
        if (s != null && s.length() > 0 && s.startsWith("http"))
        {
            s = removeLastSlashFromEnd(s);
            URL.append(s);
            URL.append("/");
            URL.append("1.0");
            URL.append("/");
            URL.append(s1);
            URL.append("/");
            URL.append(Properties.UID);
            URL.append("/");
            return;
        }
    }

    public static String getURL()
    {
        if (URL != null)
        {
            return URL.toString();
        } else
        {
            return "";
        }
    }

    public static String getURL(int i, int j)
    {
        if (URL != null)
        {
            return (new StringBuilder()).append(URL.toString()).append(String.valueOf(i)).append("/").append(String.valueOf(j)).toString();
        } else
        {
            return "";
        }
    }

    private static final String removeLastSlashFromEnd(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = s;
            if (s.endsWith("/"))
            {
                return s.substring(0, s.lastIndexOf("/"));
            }
        }
        return s1;
    }
}
