// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.telephony.PhoneStateListener;
import p.cw.b;
import p.df.a;

// Referenced classes of package p.dg:
//            f

class a extends PhoneStateListener
{

    int a;
    final f b;

    public void onCallStateChanged(int i, String s)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 58
    //                   1 34
    //                   2 46;
           goto _L1 _L2 _L3 _L4
_L1:
        a = i;
        return;
_L3:
        p.dg.f.a(b, "onCallStateChanged: Call Ringing");
        continue; /* Loop/switch isn't completed */
_L4:
        p.dg.f.a(b, "onCallStateChanged: Call Off Hook");
        continue; /* Loop/switch isn't completed */
_L2:
        p.dg.f.a(b, "onCallStateChanged: Call IDLE");
        if (a != 0)
        {
            try
            {
                s = p.dg.f.b(b);
                if (s.u() == p.cw.c && s.v() == p.cw.b && !b.a)
                {
                    p.dg.f.a(b, "onCallStateChanged: fallback broadcast FOCUS_GAINED");
                    p.dg.f.a(b);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                p.df.a.a("MusicPlayerFocusHelper", (new StringBuilder()).append("Handling non problematic exception for debugging purposes - ").append(s.toString()).toString());
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    .String(f f1)
    {
        b = f1;
        super();
        a = 0;
    }
}
