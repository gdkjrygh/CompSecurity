// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import rx.X;
import rx.a;

// Referenced classes of package rx.internal.a:
//            aG

final class aH extends X
{

    boolean a;
    final X b;
    final aG c;

    aH(aG ag, X x, X x1)
    {
        c = ag;
        b = x1;
        super(x);
    }

    public final void onCompleted()
    {
        if (!a)
        {
            a = true;
            b.onCompleted();
        }
    }

    public final void onError(Throwable throwable)
    {
        if (!a)
        {
            a = true;
            b.onError(throwable);
        }
    }

    public final void onNext(Object obj)
    {
        obj = (a)obj;
        rx.internal.a.aG._cls1.a[((a) (obj)).a.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 45
    //                   2 64
    //                   3 73;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (!a)
        {
            b.onNext(((a) (obj)).c);
            return;
        }
          goto _L1
_L3:
        onError(((a) (obj)).b);
        return;
_L4:
        onCompleted();
        return;
    }
}
