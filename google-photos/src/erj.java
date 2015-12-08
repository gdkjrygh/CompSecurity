// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

public class erj
{

    private final noz a;
    private ContentResolver b;

    erj(Context context)
    {
        b = context.getContentResolver();
        a = noz.a(context, 2, "AllMediaMonitor", new String[] {
            "sync", "perf"
        });
    }

    public static Uri a(int i)
    {
        return eto.a(i);
    }

    public static Uri a(int i, String s)
    {
        return eto.a(i, s);
    }

    public final void a(int i, String s, String s1)
    {
        if (a.a())
        {
            String s2 = "";
            if (s1 != null)
            {
                s2 = String.valueOf(s1);
                if (s2.length() != 0)
                {
                    s2 = ", collection ".concat(s2);
                } else
                {
                    s2 = new String(", collection ");
                }
            }
            (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s2).length())).append("Notify all media changed for ").append(s).append(s2);
            noy.a(i);
        }
        if (s1 == null)
        {
            b.notifyChange(eto.a(i), null);
            return;
        } else
        {
            b.notifyChange(eto.a(i, s1), null);
            return;
        }
    }
}
