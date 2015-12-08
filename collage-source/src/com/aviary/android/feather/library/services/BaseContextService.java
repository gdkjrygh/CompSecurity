// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.content.Context;
import android.os.Handler;
import com.aviary.android.feather.common.a.a;

// Referenced classes of package com.aviary.android.feather.library.services:
//            IAviaryController

public abstract class BaseContextService
{

    protected com.aviary.android.feather.common.a.a.c a;
    protected boolean b;
    protected Handler c;
    private IAviaryController d;

    protected BaseContextService(IAviaryController iaviarycontroller)
    {
        d = iaviarycontroller;
        c = new Handler(iaviarycontroller.a().getMainLooper());
        a = com.aviary.android.feather.common.a.a.a(getClass().getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
    }

    public abstract void b();

    public IAviaryController d()
    {
        return d;
    }

    public boolean e()
    {
        return !b;
    }

    public void f()
    {
        a.b("internalDispose");
        b();
        b = true;
        c = null;
        d = null;
    }
}
