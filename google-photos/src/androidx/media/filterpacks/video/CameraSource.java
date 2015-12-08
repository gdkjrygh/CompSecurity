// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.video;

import ahb;
import ahj;
import ahn;
import ahs;
import ahv;
import aif;
import ajo;
import ajr;
import aju;
import ajw;
import aka;
import akb;

public class CameraSource extends ahn
    implements aka
{

    private boolean mNewFrameAvailable;
    private aif mOutputType;
    private boolean mUseWallClock;

    public CameraSource(ajr ajr1, String s)
    {
        super(ajr1, s);
        mNewFrameAvailable = false;
        mUseWallClock = false;
        mOutputType = aif.a(301, 16);
    }

    private boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mNewFrameAvailable;
        if (!flag) goto _L2; else goto _L1
_L1:
        mNewFrameAvailable = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        p();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(akb akb, long l)
    {
        this;
        JVM INSTR monitorenter ;
        mNewFrameAvailable = true;
        this;
        JVM INSTR monitorexit ;
        q();
        return;
        akb;
        this;
        JVM INSTR monitorexit ;
        throw akb;
    }

    public final void a(Exception exception)
    {
        throw new RuntimeException("Camera encountered an error. Aborting.", exception);
    }

    public final ajw b()
    {
        return (new ajw()).a("useWallClock", 1, aif.a(Boolean.TYPE)).b("video", 2, mOutputType).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("useWallClock"))
        {
            ajo1.a("mUseWallClock");
            ajo1.g = true;
        }
    }

    protected final void d()
    {
        super.mContext.a().a(this);
    }

    protected final void e()
    {
        if (a())
        {
            ahb ahb1 = super.mContext.a();
            aju aju1 = b("video");
            ahv ahv1 = ahs.a(mOutputType, new int[] {
                1, 1
            }).h();
            if (ahb1.b.a(ahv1, 0x7fffffff))
            {
                if (mUseWallClock)
                {
                    ahv1.a(System.currentTimeMillis() * 0xf4240L);
                }
                aju1.a(ahv1);
            }
            ahv1.i();
        }
    }

    protected final void f()
    {
        super.mContext.a().b(this);
        mNewFrameAvailable = false;
    }

    public final void i()
    {
    }

    public final void o_()
    {
    }
}
