// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.running.auto.MotionState;
import com.spotify.mobile.android.util.Assertion;

public final class ffl
    implements ffc
{

    public final ffk a;
    public int b;
    private boolean c;
    private boolean d;

    public ffl(ffk ffk1)
    {
        a = ffk1;
    }

    public final void a()
    {
        if (b <= 0) goto _L2; else goto _L1
_L1:
        b;
        JVM INSTR lookupswitch 11: default 108
    //                   140: 141
    //                   145: 147
    //                   150: 153
    //                   155: 159
    //                   160: 165
    //                   165: 171
    //                   170: 177
    //                   175: 183
    //                   180: 189
    //                   185: 195
    //                   190: 201;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
        int i;
        Assertion.b((new StringBuilder("Unsupported tempo: ")).append(b).toString());
        i = 0;
_L16:
        a.a(i);
_L2:
        return;
_L4:
        i = 0x7f070004;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f070005;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f070006;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f070007;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 0x7f070008;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 0x7f070009;
        continue; /* Loop/switch isn't completed */
_L10:
        i = 0x7f07000a;
        continue; /* Loop/switch isn't completed */
_L11:
        i = 0x7f07000b;
        continue; /* Loop/switch isn't completed */
_L12:
        i = 0x7f07000c;
        continue; /* Loop/switch isn't completed */
_L13:
        i = 0x7f07000d;
        continue; /* Loop/switch isn't completed */
_L14:
        i = 0x7f07000e;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final void a(double d1)
    {
        if (ffi.b(d1))
        {
            b = (int)d1;
            return;
        } else
        {
            b = 0;
            return;
        }
    }

    public final void a(MotionState motionstate)
    {
        boolean flag = c;
        if (c)
        {
            return;
        }
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[MotionState.values().length];
                try
                {
                    a[MotionState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[MotionState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[MotionState.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[MotionState.d.ordinal()] = 4;
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
            Assertion.b((new StringBuilder("Unsupported state: ")).append(motionstate).toString());
            return;

        case 1: // '\001'
            if (!d)
            {
                a.a(0x7f070011);
            }
            d = true;
            return;

        case 2: // '\002'
            a.a(0x7f07000f);
            return;

        case 3: // '\003'
            c = true;
            a.a(0x7f070012);
            a();
            return;

        case 4: // '\004'
            c = true;
            a.a(0x7f070013);
            return;
        }
    }
}
