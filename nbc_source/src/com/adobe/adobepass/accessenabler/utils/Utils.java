// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;

import android.util.Base64;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Referenced classes of package com.adobe.adobepass.accessenabler.utils:
//            Log

public class Utils
{

    private static final String LOG_TAG = "Utils";

    public Utils()
    {
    }

    public static byte[] base64Decode(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = Base64.decode(s.getBytes(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("Utils", s.getMessage());
            return null;
        }
        return s;
    }

    public static String base64Encode(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte0 = new String(Base64.encode(abyte0, 0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e("Utils", abyte0.getMessage());
            return null;
        }
        return abyte0;
    }

    public static String buildUrl(String s, List list, boolean flag)
    {
        String s1 = "";
        if (list != null)
        {
            s1 = (new StringBuilder()).append("").append("?").toString();
            ArrayList arraylist = new ArrayList();
            for (list = list.iterator(); list.hasNext(); arraylist.add(((NameValuePair)list.next()).toString())) { }
            s1 = (new StringBuilder()).append(s1).append(joinStrings(arraylist, "&")).toString();
        }
        if (flag)
        {
            list = "https://";
        } else
        {
            list = "http://";
        }
        s = (new StringBuilder()).append(list).append(s).toString();
        return (new StringBuilder()).append(s).append(s1).toString();
    }

    public static Node getChildNodeTagByName(Node node, String s)
    {
        if (node != null)
        {
            node = node.getChildNodes();
            for (int i = 0; i < node.getLength(); i++)
            {
                Node node1 = node.item(i);
                if (s.equals(node1.getNodeName()))
                {
                    return node1;
                }
            }

        }
        return null;
    }

    public static String hash(String s, String s1)
    {
        if (s == null)
        {
            return null;
        }
        byte abyte0[];
        MessageDigest messagedigest = MessageDigest.getInstance(s1);
        messagedigest.update(s.getBytes("iso-8859-1"), 0, s.length());
        abyte0 = messagedigest.digest();
        s = abyte0;
_L3:
        int i;
        s1 = new StringBuffer();
        i = 0;
_L2:
        int j;
        int k;
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        k = s[i] >>> 4 & 0xf;
        j = 0;
_L4:
        Exception exception;
        if (k >= 0 && k <= 9)
        {
            s1.append((char)(k + 48));
        } else
        {
            s1.append((char)((k - 10) + 97));
        }
        k = s[i] & 0xf;
        if (j < 1)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        i++;
        if (true) goto _L2; else goto _L1
        exception;
        Log.e("Utils", (new StringBuilder()).append("Cannot calculate ").append(s1).append(" hash:").append(exception.toString()).toString());
        s = s.getBytes();
          goto _L3
_L1:
        return s1.toString();
        j++;
          goto _L4
    }

    public static String joinStrings(List list, String s)
    {
        int i = 0;
        int j = s.length();
        Object obj = list.iterator();
        if (((Iterator) (obj)).hasNext())
        {
            i = 0 + (((CharSequence)((Iterator) (obj)).next()).length() + j);
        }
        obj = new StringBuilder(i);
        list = list.iterator();
        if (list.hasNext())
        {
            ((StringBuilder) (obj)).append((CharSequence)list.next());
            for (; list.hasNext(); ((StringBuilder) (obj)).append((CharSequence)list.next()))
            {
                ((StringBuilder) (obj)).append(s);
            }

        }
        return ((StringBuilder) (obj)).toString();
    }

    public static String now()
    {
        Calendar calendar = Calendar.getInstance();
        return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(calendar.getTime());
    }
}
