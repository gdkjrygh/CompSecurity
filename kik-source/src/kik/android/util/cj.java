// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashMap;

// Referenced classes of package kik.android.util:
//            bk

public final class cj
{

    private static cj b;
    HashMap a;
    private bk c;
    private String d[];

    private cj(Context context)
    {
        d = context.getResources().getStringArray(0x7f0a0005);
        a = b();
        c = new bk();
    }

    public static cj a()
    {
        return b;
    }

    public static void a(Context context)
    {
        b = new cj(context);
    }

    private HashMap b()
    {
        HashMap hashmap = new HashMap(d.length);
        for (int i = 0; i < d.length; i++)
        {
            hashmap.put(d[i], Integer.valueOf(i));
        }

        return hashmap;
    }

    public final int a(CharSequence charsequence)
    {
        return c.a(charsequence).length;
    }

    public final bk.a[] b(CharSequence charsequence)
    {
        return c.a(charsequence);
    }
}
