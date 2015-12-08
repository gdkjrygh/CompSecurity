// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.d;

import java.io.PrintStream;
import java.util.Arrays;
import rx.X;
import rx.e.d;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;

public final class c extends X
{

    boolean a;
    private final X b;

    public c(X x)
    {
        super(x);
        a = false;
        b = x;
    }

    private void a(Throwable throwable)
    {
        try
        {
            d.a().b();
        }
        catch (Throwable throwable1)
        {
            b(throwable1);
        }
        try
        {
            b.onError(throwable);
        }
        catch (Throwable throwable2)
        {
            if (throwable2 instanceof OnErrorNotImplementedException)
            {
                try
                {
                    unsubscribe();
                }
                // Misplaced declaration of an exception variable
                catch (Throwable throwable2)
                {
                    try
                    {
                        d.a().b();
                    }
                    catch (Throwable throwable4)
                    {
                        b(throwable4);
                    }
                    throw new RuntimeException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(new Throwable[] {
                        throwable, throwable2
                    })));
                }
                throw (OnErrorNotImplementedException)throwable2;
            }
            try
            {
                d.a().b();
            }
            catch (Throwable throwable5)
            {
                b(throwable5);
            }
            try
            {
                unsubscribe();
            }
            catch (Throwable throwable6)
            {
                try
                {
                    d.a().b();
                }
                catch (Throwable throwable7)
                {
                    b(throwable7);
                }
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(new Throwable[] {
                    throwable, throwable2, throwable6
                })));
            }
            throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(new Throwable[] {
                throwable, throwable2
            })));
        }
        try
        {
            unsubscribe();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        try
        {
            d.a().b();
        }
        catch (Throwable throwable3)
        {
            b(throwable3);
        }
        throw new OnErrorFailedException(throwable);
    }

    private static void b(Throwable throwable)
    {
        System.err.println((new StringBuilder("RxJavaErrorHandler threw an Exception. It shouldn't. => ")).append(throwable.getMessage()).toString());
        throwable.printStackTrace();
    }

    public final void onCompleted()
    {
        if (a)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        a = true;
        b.onCompleted();
        unsubscribe();
        return;
        Object obj;
        obj;
        Exceptions.throwIfFatal(((Throwable) (obj)));
        a(((Throwable) (obj)));
        unsubscribe();
        return;
        obj;
        unsubscribe();
        throw obj;
    }

    public final void onError(Throwable throwable)
    {
        Exceptions.throwIfFatal(throwable);
        if (!a)
        {
            a = true;
            a(throwable);
        }
    }

    public final void onNext(Object obj)
    {
        try
        {
            if (!a)
            {
                b.onNext(obj);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Exceptions.throwIfFatal(((Throwable) (obj)));
        }
        onError(((Throwable) (obj)));
    }
}
