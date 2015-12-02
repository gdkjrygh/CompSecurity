// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;


// Referenced classes of package com.facebook.orca.d:
//            m, e

class o
    implements android.media.AudioManager.OnAudioFocusChangeListener
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public void onAudioFocusChange(int i)
    {
        i;
        JVM INSTR tableswitch -3 1: default 36
    //                   -3 37
    //                   -2 37
    //                   -1 92
    //                   0 36
    //                   1 58;
           goto _L1 _L2 _L2 _L3 _L1 _L4
_L1:
        return;
_L2:
        if (m.b(a) != null)
        {
            m.b(a).d();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (m.b(a) != null && m.b(a).f())
        {
            m.b(a).e();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (m.b(a) != null)
        {
            m.b(a).c();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
