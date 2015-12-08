// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;

public final class aa
{

    private static final aa a = new aa();
    private IGroupInfo b;
    private b c;
    private IFilterInfo d;
    private int e;

    private aa()
    {
        e = 100;
        c = new b();
    }

    public static aa a()
    {
        return a;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        e = i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        c = b1;
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a(IGroupInfo igroupinfo)
    {
        this;
        JVM INSTR monitorenter ;
        b = igroupinfo;
        this;
        JVM INSTR monitorexit ;
        return;
        igroupinfo;
        this;
        JVM INSTR monitorexit ;
        throw igroupinfo;
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = e;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final IFilterInfo c()
    {
        this;
        JVM INSTR monitorenter ;
        IFilterInfo ifilterinfo = d;
        this;
        JVM INSTR monitorexit ;
        return ifilterinfo;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final IGroupInfo d()
    {
        this;
        JVM INSTR monitorenter ;
        IGroupInfo igroupinfo = b;
        this;
        JVM INSTR monitorexit ;
        return igroupinfo;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final b e()
    {
        this;
        JVM INSTR monitorenter ;
        b b1 = c;
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void f()
    {
        this;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        b = null;
        d = null;
        c = new b();
        this;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c.a())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        if (com.roidapp.imagelib.filter.groupinfo.b.a(b) && b.a().a() != 0 || d != null && d.a() != 0)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_71;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
        return false;
    }

}
