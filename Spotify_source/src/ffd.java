// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.running.auto.MotionState;

public final class ffd
    implements ffc
{

    private int a;
    private feu b;

    public ffd(feu feu1)
    {
        b = feu1;
    }

    private void a(int i)
    {
        if (!ffi.b(i))
        {
            i = 160;
        }
        b.a(i);
    }

    public final void a(double d)
    {
        if (ffi.b(d))
        {
            a = (int)d;
            return;
        } else
        {
            a = 0;
            return;
        }
    }

    public final void a(MotionState motionstate)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[MotionState.values().length];
                try
                {
                    a[MotionState.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[MotionState.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[motionstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a(a);
            return;

        case 2: // '\002'
            a(160);
            break;
        }
    }
}
