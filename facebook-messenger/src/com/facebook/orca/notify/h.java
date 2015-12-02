// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.graphics.Bitmap;

// Referenced classes of package com.facebook.orca.notify:
//            g

class h
{

    private final String a;
    private final String b;
    private final Bitmap c;

    private h(String s, String s1, Bitmap bitmap)
    {
        a = s;
        b = s1;
        c = bitmap;
    }

    h(String s, String s1, Bitmap bitmap, g g)
    {
        this(s, s1, bitmap);
    }

    static Bitmap a(h h1)
    {
        return h1.c;
    }

    static String b(h h1)
    {
        return h1.a;
    }

    static String c(h h1)
    {
        return h1.b;
    }
}
