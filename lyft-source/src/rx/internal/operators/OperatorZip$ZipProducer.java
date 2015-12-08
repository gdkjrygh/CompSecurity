// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Producer;

// Referenced classes of package rx.internal.operators:
//            BackpressureUtils

final class zipper extends AtomicLong
    implements Producer
{

    private static final long serialVersionUID = 0xef1d7f41cd754f54L;
    private zipper zipper;

    public void request(long l)
    {
        BackpressureUtils.getAndAddRequest(this, l);
        zipper.zipper();
    }

    public ( )
    {
        zipper = ;
    }
}
