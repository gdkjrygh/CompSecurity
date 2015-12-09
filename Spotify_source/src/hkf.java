// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;
import rx.internal.operators.NotificationLite;

public final class hkf extends hkh
{

    private final hki b;

    private hkf(hey hey, hki hki1)
    {
        super(hey);
        NotificationLite.a();
        b = hki1;
    }

    public static hkf e()
    {
        hki hki1 = new hki();
        hki1.d = new _cls1(hki1);
        hki1.e = hki1.d;
        return new hkf(hki1, hki1);
    }

    public final void onCompleted()
    {
        if (b.b == null || b.c)
        {
            Object obj = NotificationLite.b();
            hkk ahkk[] = b.b(obj);
            int j = ahkk.length;
            for (int i = 0; i < j; i++)
            {
                hkk hkk1 = ahkk[i];
                NotificationLite notificationlite = b.f;
                hkk1.a(obj);
            }

        }
    }

    public final void onError(Throwable throwable)
    {
        if (b.b == null || b.c)
        {
            Object obj1 = NotificationLite.a(throwable);
            hkk ahkk[] = b.b(obj1);
            int j = ahkk.length;
            int i = 0;
            throwable = null;
            do
            {
                if (i >= j)
                {
                    break;
                }
                hkk hkk1 = ahkk[i];
                try
                {
                    NotificationLite notificationlite = b.f;
                    hkk1.a(obj1);
                }
                catch (Throwable throwable1)
                {
                    Object obj = throwable;
                    if (throwable == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(throwable1);
                    throwable = ((Throwable) (obj));
                }
                i++;
            } while (true);
            hfp.a(throwable);
        }
    }

    public final void onNext(Object obj)
    {
        if (b.b == null || b.c)
        {
            obj = NotificationLite.a(obj);
            hki hki1 = b;
            hki1.b = obj;
            hkk ahkk[] = hki1.a.b;
            int j = ahkk.length;
            for (int i = 0; i < j; i++)
            {
                hkk hkk1 = ahkk[i];
                NotificationLite notificationlite = b.f;
                hkk1.a(obj);
            }

        }
    }

    /* member class not found */
    class _cls1 {}

}
