// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class nit> extends hff
{

    private ebg a;

    public final void onCompleted()
    {
        unsubscribe();
    }

    public final void onError(Throwable throwable)
    {
        a.a(throwable);
        unsubscribe();
    }

    public final void onNext(Object obj)
    {
        obj = (List)obj;
        a.a(((List) (obj)));
        unsubscribe();
    }

    (ebg ebg1)
    {
        a = ebg1;
        super();
    }
}
