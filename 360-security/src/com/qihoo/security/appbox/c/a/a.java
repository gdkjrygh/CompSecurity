// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.c.a;

import android.graphics.Bitmap;
import android.support.v4.c.f;

public class a extends f
    implements com.android.volley.toolbox.g.b
{

    public a(int i)
    {
        super(i);
    }

    public static int a(Bitmap bitmap)
    {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public Bitmap a(String s)
    {
        return (Bitmap)a(s);
    }

    public void a(String s, Bitmap bitmap)
    {
        a(s, bitmap);
    }

    protected volatile int b(Object obj, Object obj1)
    {
        return b((String)obj, (Bitmap)obj1);
    }

    protected int b(String s, Bitmap bitmap)
    {
        return a(bitmap);
    }
}
