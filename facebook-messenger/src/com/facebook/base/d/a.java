// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.d;

import android.app.IntentService;
import com.facebook.base.h;
import com.facebook.base.i;
import com.facebook.inject.t;

public abstract class a extends IntentService
    implements h
{

    private final i a = new i();

    public a(String s)
    {
        super(s);
    }

    public t a()
    {
        return t.a(this);
    }

    public Object a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        obj = a.a(obj);
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        throw obj;
    }

    public void a(Object obj, Object obj1)
    {
        a.a(obj, obj1);
    }
}
