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

public final class GateFilter extends ahn
{

    private int mPassFrames;

    public GateFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        return (new ajw()).a("frame", 2, aif.a()).b("frame", 2, aif.a()).a();
    }

    public final void b(ajo ajo1)
    {
        ajo1.a(b("frame"));
    }

    protected final void d()
    {
        mPassFrames = 0;
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        ahs ahs = a("frame").a();
        if (mPassFrames > 0)
        {
            b("frame").a(ahs);
            mPassFrames = mPassFrames - 1;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
