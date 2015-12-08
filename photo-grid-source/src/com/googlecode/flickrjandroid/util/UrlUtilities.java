// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.util;

import com.googlecode.flickrjandroid.Parameter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

public class UrlUtilities
{

    public static final String UTF8 = "UTF-8";

    public UrlUtilities()
    {
    }

    public static URL buildPostUrl(String s, int i, String s1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("https://");
        stringbuffer.append(s);
        if (i > 0)
        {
            stringbuffer.append(":");
            stringbuffer.append(i);
        }
        s = s1;
        if (s1 == null)
        {
            s = "/";
        }
        stringbuffer.append(s);
        return new URL(stringbuffer.toString());
    }

    public static URL buildUrl(String s, int i, String s1, List list)
    {
        boolean flag1 = true;
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("https://");
        stringbuffer.append(s);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 80)
        {
            flag1 = false;
        }
        if (flag1 & flag)
        {
            stringbuffer.append(":");
            stringbuffer.append(i);
        }
        s = s1;
        if (s1 == null)
        {
            s = "/";
        }
        stringbuffer.append(s);
        s = list.iterator();
        if (s.hasNext())
        {
            stringbuffer.append("?");
        }
        do
        {
            do
            {
                if (!s.hasNext())
                {
                    return new URL(stringbuffer.toString());
                }
                s1 = (Parameter)s.next();
                stringbuffer.append(s1.getName());
                stringbuffer.append("=");
                s1 = ((String) (s1.getValue()));
                if (s1 != null)
                {
                    stringbuffer.append(encode(s1.toString()));
                }
            } while (!s.hasNext());
            stringbuffer.append("&");
        } while (true);
    }

    public static String createBuddyIconUrl(int i, int j, String s)
    {
        String s1 = "https://www.flickr.com/images/buddyicon.jpg";
        if (j > 0)
        {
            s1 = (new StringBuilder("https://farm")).append(i).append(".static.flickr.com/").append(j).append("/buddyicons/").append(s).append(".jpg").toString();
        }
        return s1;
    }

    public static String encode(String s)
    {
        StringBuffer stringbuffer = null;
        char c;
        int i;
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = stringbuffer;
        }
        stringbuffer = new StringBuffer(s.length());
        i = 0;
        if (i >= s.length())
        {
            return stringbuffer.toString();
        }
        c = s.charAt(i);
        if (c != '*')
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuffer.append("%2A");
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_23;
_L1:
        if (c == '+')
        {
            stringbuffer.append("%20");
        } else
        if (c == '%' && i + 1 < s.length() && s.charAt(i + 1) == '7' && s.charAt(i + 2) == 'E')
        {
            stringbuffer.append('~');
            i += 2;
        } else
        {
            stringbuffer.append(c);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (false)
        {
            break MISSING_BLOCK_LABEL_138;
        } else
        {
            break MISSING_BLOCK_LABEL_23;
        }
    }

    private static String getMethod(List list)
    {
        list = list.iterator();
        Parameter parameter;
        do
        {
            if (!list.hasNext())
            {
                return null;
            }
            parameter = (Parameter)list.next();
        } while (!"method".equals(parameter.getName()));
        return String.valueOf(parameter.getValue());
    }

    private static boolean ignoreMethod(String s)
    {
        return s != null && "flickr.auth.checkToken".equals(s);
    }
}
