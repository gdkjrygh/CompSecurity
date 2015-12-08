// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.scan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.arist.model.scan:
//            b

public final class a
{

    public static String a;
    private static HashMap b;
    private static HashMap c = new HashMap();

    private static void a(String s, int i, String s1)
    {
        b.put(s, new b(i, s1));
        c.put(s1, new Integer(i));
    }

    public static boolean a(String s)
    {
        int i = s.lastIndexOf(".");
        if (i < 0)
        {
            s = null;
        } else
        {
            s = (b)b.get(s.substring(i + 1).toUpperCase());
        }
        if (s != null)
        {
            i = ((b) (s)).a;
            return i > 0 && i <= 7 || i >= 11 && i <= 13;
        } else
        {
            return false;
        }
    }

    static 
    {
        b = new HashMap();
        a("MP3", 1, "audio/mpeg");
        a("M4A", 2, "audio/mp4");
        a("WAV", 3, "audio/x-wav");
        a("AMR", 4, "audio/amr");
        a("AWB", 5, "audio/amr-wb");
        a("WMA", 6, "audio/x-ms-wma");
        a("OGG", 7, "application/ogg");
        a("MID", 11, "audio/midi");
        a("XMF", 11, "audio/midi");
        a("RTTTL", 11, "audio/midi");
        a("SMF", 12, "audio/sp-midi");
        a("IMY", 13, "audio/imelody");
        a("MP4", 21, "video/mp4");
        a("M4V", 22, "video/mp4");
        a("3GP", 23, "video/3gpp");
        a("3GPP", 23, "video/3gpp");
        a("3G2", 24, "video/3gpp2");
        a("3GPP2", 24, "video/3gpp2");
        a("WMV", 25, "video/x-ms-wmv");
        a("JPG", 31, "image/jpeg");
        a("JPEG", 31, "image/jpeg");
        a("GIF", 32, "image/gif");
        a("PNG", 33, "image/png");
        a("BMP", 34, "image/x-ms-bmp");
        a("WBMP", 35, "image/vnd.wap.wbmp");
        a("M3U", 41, "audio/x-mpegurl");
        a("PLS", 42, "audio/x-scpls");
        a("WPL", 43, "application/vnd.ms-wpl");
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                a = stringbuilder.toString();
                return;
            }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append((String)iterator.next());
        } while (true);
    }
}
