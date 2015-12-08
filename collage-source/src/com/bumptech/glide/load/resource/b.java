// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.f;
import java.io.OutputStream;

public class b
    implements f
{

    private static final b a = new b();

    public b()
    {
    }

    public static b b()
    {
        return a;
    }

    public String a()
    {
        return "";
    }

    public boolean a(j j1, OutputStream outputstream)
    {
        return false;
    }

    public volatile boolean a(Object obj, OutputStream outputstream)
    {
        return a((j)obj, outputstream);
    }

}
