// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import aif;
import ajo;
import ajr;
import aju;
import ajw;

public final class CountLimitFilter extends ahn
{

    private int mCount;
    private int mMaxCount;

    public CountLimitFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mCount = 0;
        mMaxCount = 1;
    }

    public final ajw b()
    {
        return (new ajw()).a("frame", 2, aif.a()).a("maxCount", 1, aif.a(Integer.TYPE)).b("frame", 2, aif.a()).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("maxCount"))
        {
            ajo1.a("mMaxCount");
            ajo1.g = true;
            return;
        } else
        {
            ajo1.a(b("frame"));
            return;
        }
    }

    protected final void d()
    {
        mCount = 0;
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (mCount < mMaxCount)
        {
            ahs ahs = a("frame").a();
            b("frame").a(ahs);
        }
        mCount = mCount + 1;
        if (mCount == mMaxCount)
        {
            o();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void f()
    {
        mCount = 0;
    }
}
