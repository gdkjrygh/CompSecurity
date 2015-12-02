// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class btk
    implements brd
{

    private btj a;

    public btk(btj btj1)
    {
        a = btj1;
    }

    public final void a(buj buj1)
    {
        if (buj1 instanceof bwm)
        {
            if (buj1.r())
            {
                a.a((bwm)buj1);
                return;
            } else
            {
                a.b((bwm)buj1);
                return;
            }
        }
        if (buj1 instanceof bwh)
        {
            if (buj1.r())
            {
                a.a((bwh)buj1);
                return;
            } else
            {
                a.b((bwh)buj1);
                return;
            }
        }
        if (buj1 instanceof bwc)
        {
            if (buj1.r())
            {
                a.a((bwc)buj1);
                return;
            } else
            {
                a.b((bwc)buj1);
                return;
            }
        }
        if (buj1 instanceof bwo)
        {
            if (buj1.r())
            {
                a.a((bwo)buj1);
                return;
            } else
            {
                a.b((bwo)buj1);
                return;
            }
        }
        if (buj1 instanceof bwd)
        {
            if (buj1.r())
            {
                a.a();
                return;
            } else
            {
                a.a((bwd)buj1);
                return;
            }
        }
        if (buj1 instanceof bwa)
        {
            if (buj1.r())
            {
                a.a((bwa)buj1);
                return;
            } else
            {
                a.b((bwa)buj1);
                return;
            }
        }
        if (buj1 instanceof bwb)
        {
            if (buj1.r())
            {
                a.a((bwb)buj1);
                return;
            } else
            {
                a.b((bwb)buj1);
                return;
            }
        }
        if (buj1 instanceof bvy)
        {
            if (buj1.r())
            {
                a.a((bvy)buj1);
                return;
            } else
            {
                a.b((bvy)buj1);
                return;
            }
        }
        if (buj1 instanceof bwf)
        {
            if (buj1.r())
            {
                a.a((bwf)buj1);
                return;
            } else
            {
                a.b((bwf)buj1);
                return;
            }
        }
        if (buj1 instanceof bwg)
        {
            if (buj1.r())
            {
                a.a((bwg)buj1);
                return;
            } else
            {
                a.b((bwg)buj1);
                return;
            }
        } else
        {
            throw new RuntimeException("not handled");
        }
    }
}
