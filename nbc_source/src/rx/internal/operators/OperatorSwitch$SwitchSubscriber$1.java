// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            OperatorSwitch

class this._cls0
    implements Producer
{

    final rrentSubscriber this$0;

    public void request(long l)
    {
        if (!finite) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (l == 0x7fffffffffffffffL)
        {
            finite = true;
        }
        Object obj = ard;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = rrentSubscriber;
        if (rrentSubscriber != null) goto _L4; else goto _L3
_L3:
        long l1 = itialRequested + l;
        if (l1 >= 0L) goto _L6; else goto _L5
_L5:
        finite = true;
_L8:
        obj;
        JVM INSTR monitorexit ;
        if (obj1 == null) goto _L1; else goto _L7
_L7:
        if (finite)
        {
            ((nerSubscriber) (obj1)).requestMore(0x7fffffffffffffffL);
            return;
        } else
        {
            ((nerSubscriber) (obj1)).requestMore(l);
            return;
        }
_L6:
        itialRequested = l1;
          goto _L8
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L4:
        l1 = nerSubscriber.access._mth100(rrentSubscriber) + l;
        if (l1 >= 0L)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        finite = true;
          goto _L8
        nerSubscriber.access._mth102(rrentSubscriber, l1);
          goto _L8
    }

    nerSubscriber()
    {
        this$0 = this._cls0.this;
        super();
    }
}
