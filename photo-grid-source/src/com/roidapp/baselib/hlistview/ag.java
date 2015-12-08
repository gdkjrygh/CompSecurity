// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.view.View;

public abstract class ag
{

    protected View a;

    protected ag(View view)
    {
        a = view;
    }

    public abstract void a(int i);

    public abstract void a(Runnable runnable);

    public abstract boolean a();
}
