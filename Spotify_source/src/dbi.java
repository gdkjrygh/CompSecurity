// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dbi
    implements AccountManagerFuture
{

    boolean a;
    private final Future b;

    public dbi(Future future)
    {
        a = false;
        b = future;
    }

    private Object a(Long long1, TimeUnit timeunit)
    {
        boolean flag = a;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        Object obj;
        Looper looper;
        long l;
        boolean flag1;
        try
        {
            obj = Looper.getMainLooper();
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            looper = Looper.myLooper();
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            flag1 = obj.equals(looper);
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        try
        {
            long1 = new IllegalStateException("calling this from your main thread can lead to blocking");
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            throw long1;
        }
        // Misplaced declaration of an exception variable
        catch (Long long1) { }
        // Misplaced declaration of an exception variable
        catch (Long long1) { }
        break MISSING_BLOCK_LABEL_250;
        long1;
        throw new OperationCanceledException();
        long1;
        cancel(true);
        throw long1;
        if (long1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            obj = b;
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            l = long1.longValue();
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            long1 = ((Long) (((Future) (obj)).get(l, timeunit)));
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        cancel(true);
        return long1;
_L2:
        try
        {
            long1 = b;
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            long1 = ((Long) (long1.get()));
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Long long1)
        {
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
        long1;
        long1 = long1.getCause();
        if (long1 instanceof CancellationException)
        {
            throw new OperationCanceledException();
        }
        if (long1 instanceof IOException)
        {
            throw (IOException)long1;
        }
        if (long1 instanceof UnsupportedOperationException)
        {
            throw new AuthenticatorException(long1);
        }
        if (long1 instanceof AuthenticatorException)
        {
            throw (AuthenticatorException)long1;
        }
        if (long1 instanceof Error)
        {
            throw (Error)long1;
        }
        if (long1 instanceof OperationCanceledException)
        {
            throw (OperationCanceledException)long1;
        }
        if (long1 instanceof IllegalArgumentException)
        {
            throw new OperationCanceledException(long1);
        }
        if (long1 instanceof IllegalStateException)
        {
            throw new OperationCanceledException(long1);
        }
        if (long1 instanceof RuntimeException)
        {
            throw (RuntimeException)long1;
        } else
        {
            throw new IllegalStateException(long1);
        }
        long1;
_L4:
        cancel(true);
        throw new OperationCanceledException();
        long1;
        continue; /* Loop/switch isn't completed */
        long1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean cancel(boolean flag)
    {
        return b.cancel(flag);
    }

    public final Object getResult()
    {
        return a(null, null);
    }

    public final Object getResult(long l, TimeUnit timeunit)
    {
        return a(Long.valueOf(l), timeunit);
    }

    public final boolean isCancelled()
    {
        return b.isCancelled();
    }

    public final boolean isDone()
    {
        return b.isDone();
    }
}
