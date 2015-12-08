// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.atomic.AtomicReference;
import rx.b.a;

final class cd
    implements a
{

    final bT.e a;

    cd(bT.e e)
    {
        a = e;
        super();
    }

    public final void call()
    {
        a.f.getAndSet(bT.e.e);
    }
}
