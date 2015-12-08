// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import java.io.PrintStream;
import java.util.Arrays;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

public class SafeSubscriber extends Subscriber
{

    private final Subscriber actual;
    boolean done;

    public SafeSubscriber(Subscriber subscriber)
    {
        super(subscriber);
        done = false;
        actual = subscriber;
    }

    private void handlePluginException(Throwable throwable)
    {
        System.err.println((new StringBuilder()).append("RxJavaErrorHandler threw an Exception. It shouldn't. => ").append(throwable.getMessage()).toString());
        throwable.printStackTrace();
    }

    protected void _onError(Throwable throwable)
    {
        try
        {
            RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
        }
        catch (Throwable throwable1)
        {
            handlePluginException(throwable1);
        }
        try
        {
            actual.onError(throwable);
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
                        RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable2);
                    }
                    catch (Throwable throwable4)
                    {
                        handlePluginException(throwable4);
                    }
                    throw new RuntimeException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(new Throwable[] {
                        throwable, throwable2
                    })));
                }
                throw (OnErrorNotImplementedException)throwable2;
            }
            try
            {
                RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable2);
            }
            catch (Throwable throwable5)
            {
                handlePluginException(throwable5);
            }
            try
            {
                unsubscribe();
            }
            catch (Throwable throwable6)
            {
                try
                {
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable6);
                }
                catch (Throwable throwable7)
                {
                    handlePluginException(throwable7);
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
            RxJavaPlugins.getInstance().getErrorHandler().handleError(throwable);
        }
        catch (Throwable throwable3)
        {
            handlePluginException(throwable3);
        }
        throw new OnErrorFailedException(throwable);
    }

    public Subscriber getActual()
    {
        return actual;
    }

    public void onCompleted()
    {
        if (done)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        done = true;
        actual.onCompleted();
        unsubscribe();
        return;
        Object obj;
        obj;
        Exceptions.throwIfFatal(((Throwable) (obj)));
        _onError(((Throwable) (obj)));
        unsubscribe();
        return;
        obj;
        unsubscribe();
        throw obj;
    }

    public void onError(Throwable throwable)
    {
        Exceptions.throwIfFatal(throwable);
        if (!done)
        {
            done = true;
            _onError(throwable);
        }
    }

    public void onNext(Object obj)
    {
        try
        {
            if (!done)
            {
                actual.onNext(obj);
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
