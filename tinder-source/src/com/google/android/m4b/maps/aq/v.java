// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bx.ah;
import com.google.android.m4b.maps.bx.ak;
import com.google.android.m4b.maps.bx.d;
import com.google.android.m4b.maps.bx.g;
import com.google.android.m4b.maps.bx.r;
import com.google.android.m4b.maps.bx.x;
import com.google.android.m4b.maps.cg.p;

public interface v
    extends p
{
    public static interface a
    {

        public abstract boolean f();
    }


    public abstract Bitmap a(Bitmap bitmap);

    public abstract ak a(com.google.android.m4b.maps.bx.r.a a1);

    public abstract void a(a a1);

    public abstract void a(g g);

    public abstract void a(r r);

    public abstract void a(com.google.android.m4b.maps.bx.v v1, x x);

    public abstract void a(boolean flag, boolean flag1);

    public abstract void b();

    public abstract void b(r r);

    public abstract ah c();

    public abstract Context getContext();

    public abstract int getHeight();

    public abstract Resources getResources();

    public abstract int getWidth();

    public abstract d n();

    public abstract void o();

    public abstract b p();
}
