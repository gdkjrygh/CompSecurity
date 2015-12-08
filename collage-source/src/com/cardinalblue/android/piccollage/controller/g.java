// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.graphics.Bitmap;
import java.io.File;

public class g
{
    public static interface a
    {

        public abstract Bitmap a(int i1, int j1);

        public abstract void a(long l1);

        public abstract void d();

        public abstract void e();

        public abstract void f();
    }


    public File a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public a h;
    public boolean i;
    public int j;
    public com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a k;
    public CollageController.b l;

    public g()
    {
        f = 5F;
        g = 3F;
        j = 1;
        k = com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a.c;
    }

    public g a(float f1)
    {
        g = f1;
        return this;
    }

    public g a(int i1)
    {
        f = i1;
        return this;
    }

    public g a(int i1, int j1)
    {
        b = i1;
        c = j1;
        return this;
    }

    public g a(CollageController.b b1)
    {
        l = b1;
        return this;
    }

    public g a(a a1)
    {
        h = a1;
        return this;
    }

    public g a(com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.a a1)
    {
        k = a1;
        return this;
    }

    public g a(File file)
    {
        a = file;
        return this;
    }

    public g a(boolean flag)
    {
        i = flag;
        return this;
    }

    public g b(int i1)
    {
        j = i1;
        return this;
    }

    public g b(int i1, int j1)
    {
        d = i1;
        e = j1;
        return this;
    }
}
