// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.kik.view.adapters.h;
import java.util.ArrayList;
import kik.a.d.a.a;
import kik.android.chat.KikApplication;

public final class ae
{

    public static String a(a a1)
    {
        if (a1 == null)
        {
            return null;
        }
        if ("com.kik.ext.camera".equals(a1.u()))
        {
            return KikApplication.f(0x7f09005f);
        }
        if ("com.kik.ext.gallery".equals(a1.u()))
        {
            return KikApplication.f(0x7f09010d);
        }
        if ("com.kik.ext.video-camera".equals(a1.u()))
        {
            return KikApplication.f(0x7f090359);
        }
        if ("com.kik.ext.video-gallery".equals(a1.u()))
        {
            return KikApplication.f(0x7f09010d);
        } else
        {
            return a1.g("app-name");
        }
    }

    public static boolean b(a a1)
    {
        if (a1 == null)
        {
            return false;
        }
        if (a1.t() == kik.a.d.a.a.b.c)
        {
            return h.c(a1);
        } else
        {
            return "overlay".equalsIgnoreCase(a1.g("attribution"));
        }
    }

    public static String c(a a1)
    {
        String s;
        if (a1 == null)
        {
            s = null;
        } else
        {
            String s1 = a1.u();
            if ("com.kik.ext.camera".equals(s1))
            {
                return "Camera";
            }
            if ("com.kik.ext.gallery".equals(s1))
            {
                return "Gallery";
            }
            if ("com.kik.ext.video-camera".equals(s1))
            {
                return "Video Camera";
            }
            if ("com.kik.ext.video-gallery".equals(s1))
            {
                return "Video Gallery";
            }
            if ("com.kik.ext.gif".equals(s1))
            {
                return "GIF";
            }
            s = s1;
            if ("com.kik.cards".equals(s1))
            {
                a1 = a1.m();
                if (a1.isEmpty())
                {
                    return "Web";
                }
                if (((String)a1.get(0)).equals("https://stickers.kik.com/"))
                {
                    return "Sticker";
                } else
                {
                    return "Card";
                }
            }
        }
        return s;
    }

    public static String d(a a1)
    {
        if (a1 != null && "com.kik.cards".equals(a1.u()))
        {
            a1 = a1.m();
            if (!a1.isEmpty())
            {
                return (String)a1.get(0);
            }
        }
        return null;
    }
}
