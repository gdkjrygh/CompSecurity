// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            OperatorWindowWithSize

class this._cls1
    implements Producer
{

    final questMore this$1;

    public void request(long l)
    {
        if (l > 0L)
        {
            long l2 = l * (long)size;
            long l1 = l2;
            if (l2 >>> 31 != 0L)
            {
                l1 = l2;
                if (l2 / l != (long)size)
                {
                    l1 = 0x7fffffffffffffffL;
                }
            }
            questMore(l1);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
