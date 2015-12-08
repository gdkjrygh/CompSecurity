// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import android.app.Activity;
import android.os.PowerManager;
import com.nuance.b.b.a.p;
import com.nuance.b.b.a.q;
import com.nuance.b.b.a.r;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager

class this._cls1
    implements r
{

    final urrentNinaActivity this$1;

    public void onEnergyLevel(p p1)
    {
        PowerManager powermanager = (PowerManager)getCurrentNinaActivity().getSystemService("power");
        if (p1.b > 40F)
        {
            int i;
            if (q.a == p1.c)
            {
                i = 0x2000000a;
            } else
            {
                i = 0x20000006;
            }
            powermanager.newWakeLock(i, "NinaWake").acquire(1L);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
