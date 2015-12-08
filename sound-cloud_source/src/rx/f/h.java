// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.f;

import rx.R;
import rx.internal.c.b;
import rx.internal.util.j;

public final class h extends R
{

    private static final j a = new j("RxNewThreadScheduler-");
    private static final h b = new h();

    private h()
    {
    }

    static h b()
    {
        return b;
    }

    public final rx.R.a a()
    {
        return new b(a);
    }

}
