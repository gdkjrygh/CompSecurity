// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.i.a.a;

import java.util.concurrent.Callable;
import rx.X;

public final class rx.i.a.a.a
{
    public static final class a
        implements rx.b.f
    {

        final Callable a;

        public final void call(Object obj)
        {
            obj = (X)obj;
            try
            {
                ((X) (obj)).onNext(a.call());
            }
            catch (Throwable throwable)
            {
                ((X) (obj)).onError(throwable);
                return;
            }
            ((X) (obj)).onCompleted();
        }

        public a(Callable callable)
        {
            if (callable == null)
            {
                throw new NullPointerException("function");
            } else
            {
                a = callable;
                return;
            }
        }
    }

}
