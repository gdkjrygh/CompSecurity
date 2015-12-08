// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import com.nuance.b.e.a.e;
import com.nuance.b.e.aa;
import com.nuance.b.e.c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona

class this._cls0
    implements this._cls0
{

    final DominosNinaPersona this$0;

    public void cancelInterpretation()
    {
        DominosNinaPersona.access$100(DominosNinaPersona.this).u();
    }

    public void exit()
    {
        DominosNinaPersona.access$100(DominosNinaPersona.this).r();
    }

    public void interpret(String s)
    {
        DominosNinaPersona.access$100(DominosNinaPersona.this).c(s);
    }

    public void stopListening()
    {
        DominosNinaPersona.access$100(DominosNinaPersona.this).w();
    }

    public void stopPrompts()
    {
        DominosNinaPersona.access$1102(DominosNinaPersona.this, true);
        DominosNinaPersona.access$100(DominosNinaPersona.this).o();
    }

    public void wakeUp()
    {
        if (DominosNinaPersona.access$900(DominosNinaPersona.this).get() != e.a) goto _L2; else goto _L1
_L1:
        DominosNinaPersona.access$100(DominosNinaPersona.this).v();
_L4:
        if (DominosNinaPersona.access$1000(DominosNinaPersona.this) != null)
        {
            DominosNinaPersona.access$1000(DominosNinaPersona.this).countDown();
        }
        return;
_L2:
        if (DominosNinaPersona.access$900(DominosNinaPersona.this).get() == e.c)
        {
            ((c)DominosNinaPersona.access$100(DominosNinaPersona.this)).d();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    I()
    {
        this$0 = DominosNinaPersona.this;
        super();
    }
}
