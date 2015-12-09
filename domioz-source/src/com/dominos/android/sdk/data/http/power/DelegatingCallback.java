// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;


// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestCallback, PowerCallback

public abstract class DelegatingCallback extends PowerRestCallback
{

    private final PowerCallback _flddelegate;

    public DelegatingCallback(PowerCallback powercallback)
    {
        _flddelegate = powercallback;
    }

    public void onBegin()
    {
        if (_flddelegate instanceof PowerCallback.OnBegin)
        {
            ((PowerCallback.OnBegin)_flddelegate).onBegin();
            return;
        } else
        {
            super.onBegin();
            return;
        }
    }

    public void onError(Exception exception, String s)
    {
        if (_flddelegate instanceof PowerCallback.OnError)
        {
            ((PowerCallback.OnError)_flddelegate).onError(exception, s);
            return;
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public void onFinish()
    {
        if (_flddelegate instanceof PowerCallback.OnFinish)
        {
            ((PowerCallback.OnFinish)_flddelegate).onFinish();
            return;
        } else
        {
            super.onFinish();
            return;
        }
    }

    public void onSuccess(Object obj)
    {
        if (_flddelegate instanceof PowerCallback.OnSuccess)
        {
            ((PowerCallback.OnSuccess)_flddelegate).onSuccess(obj);
            return;
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
