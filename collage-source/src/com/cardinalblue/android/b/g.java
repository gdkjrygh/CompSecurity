// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.content.Context;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.model.k;
import java.io.File;
import java.util.Locale;

public class g
{

    public g()
    {
    }

    public static File a(Context context, File file)
    {
        file = file.toString().toLowerCase(Locale.getDefault());
        if (file.endsWith("png"))
        {
            return k.a(context, "png");
        }
        if (file.endsWith("mp4"))
        {
            return k.a(context, "mp4");
        }
        if (file.endsWith("gif"))
        {
            return k.a(context, "gif");
        } else
        {
            return k.a(context, "jpg");
        }
    }

    public static File a(File file)
    {
        file = file.toString().toLowerCase(Locale.getDefault());
        if (file.endsWith("gif"))
        {
            return k.a("Collage", "gif");
        }
        if (file.endsWith("mp4"))
        {
            return k.a("Collage", "mp4");
        }
        if (file.endsWith("png"))
        {
            return k.a("Collage", "png");
        } else
        {
            return k.a("Collage", "jpg");
        }
    }

    public static String a(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            return s;
        }
        if (s.endsWith("/") && s1.startsWith("/"))
        {
            return (new StringBuilder()).append(s).append(s1.substring(1)).toString();
        }
        if (!s.endsWith("/") && !s1.startsWith("/"))
        {
            return (new StringBuilder()).append(s).append("/").append(s1).toString();
        } else
        {
            return (new StringBuilder()).append(s).append(s1).toString();
        }
    }

    public static boolean a(String s)
    {
        while (TextUtils.isEmpty(s) || !s.endsWith(".gif") && !s.endsWith(".mp4")) 
        {
            return false;
        }
        return true;
    }

    public static boolean b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return s.endsWith(".gif");
        }
    }

    public static String c(String s)
    {
        if (s.endsWith(".gif"))
        {
            return "Gif";
        }
        if (s.endsWith(".mp4"))
        {
            return "Video";
        } else
        {
            return "Image";
        }
    }
}
