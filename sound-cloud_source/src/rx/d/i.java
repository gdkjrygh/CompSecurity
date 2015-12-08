// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.d;

import java.util.ArrayList;
import rx.P;
import rx.a;

// Referenced classes of package rx.d:
//            j

public final class i
    implements P
{

    private static P e = new j();
    public final ArrayList a = new ArrayList();
    private final P b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();

    public i()
    {
        b = e;
    }

    public final void onCompleted()
    {
        d.add(rx.a.a());
        b.onCompleted();
    }

    public final void onError(Throwable throwable)
    {
        c.add(throwable);
        b.onError(throwable);
    }

    public final void onNext(Object obj)
    {
        a.add(obj);
        b.onNext(obj);
    }

}
