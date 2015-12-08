// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RequestFuture
    implements Future, com.android.volley.Response.Listener, com.android.volley.Response.ErrorListener
{

    private VolleyError mException;
    private Request mRequest;
    private Object mResult;
    private boolean mResultReceived;

    private RequestFuture()
    {
        mResultReceived = false;
    }

    private Object doGet(Long long1)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        this;
        JVM INSTR monitorenter ;
        if (mException != null)
        {
            throw new ExecutionException(mException);
        }
        break MISSING_BLOCK_LABEL_26;
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
        if (!mResultReceived) goto _L2; else goto _L1
_L1:
        long1 = ((Long) (mResult));
_L7:
        this;
        JVM INSTR monitorexit ;
        return long1;
_L2:
        if (long1 != null) goto _L4; else goto _L3
_L3:
        wait(0L);
_L6:
        if (mException != null)
        {
            throw new ExecutionException(mException);
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (long1.longValue() > 0L)
        {
            wait(long1.longValue());
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!mResultReceived)
        {
            throw new TimeoutException();
        }
        long1 = ((Long) (mResult));
          goto _L7
    }

    public static RequestFuture newFuture()
    {
        return new RequestFuture();
    }

    public boolean cancel(boolean flag)
    {
        flag = false;
        this;
        JVM INSTR monitorenter ;
        Request request = mRequest;
        if (request != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (isDone())
        {
            continue; /* Loop/switch isn't completed */
        }
        mRequest.cancel();
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public Object get()
        throws InterruptedException, ExecutionException
    {
        Object obj;
        try
        {
            obj = doGet(null);
        }
        catch (TimeoutException timeoutexception)
        {
            throw new AssertionError(timeoutexception);
        }
        return obj;
    }

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return doGet(Long.valueOf(TimeUnit.MILLISECONDS.convert(l, timeunit)));
    }

    public boolean isCancelled()
    {
        if (mRequest == null)
        {
            return false;
        } else
        {
            return mRequest.isCanceled();
        }
    }

    public boolean isDone()
    {
        this;
        JVM INSTR monitorenter ;
        if (mResultReceived || mException != null) goto _L2; else goto _L1
_L1:
        boolean flag = isCancelled();
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void onErrorResponse(VolleyError volleyerror)
    {
        this;
        JVM INSTR monitorenter ;
        mException = volleyerror;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        volleyerror;
        throw volleyerror;
    }

    public void onResponse(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        mResultReceived = true;
        mResult = obj;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void setRequest(Request request)
    {
        mRequest = request;
    }
}
