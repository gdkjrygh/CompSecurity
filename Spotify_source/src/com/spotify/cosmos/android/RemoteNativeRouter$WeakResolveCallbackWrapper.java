// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;

class mRef
    implements ResolveCallback
{

    private final WeakReference mRef;

    public void onError(Throwable throwable)
    {
        ResolveCallback resolvecallback = (ResolveCallback)mRef.get();
        if (resolvecallback != null)
        {
            resolvecallback.onError(throwable);
        }
    }

    public boolean onResolved(Response response)
    {
        ResolveCallback resolvecallback = (ResolveCallback)mRef.get();
        if (resolvecallback != null)
        {
            boolean flag;
            try
            {
                flag = resolvecallback.onResolved(response);
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                Assertion.a("Caught an Exception in ResolveCallback.onResolved", response);
                return false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public (ResolveCallback resolvecallback)
    {
        mRef = new WeakReference(resolvecallback);
    }
}
