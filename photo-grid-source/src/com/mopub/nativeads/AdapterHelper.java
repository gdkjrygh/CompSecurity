// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;

// Referenced classes of package com.mopub.nativeads:
//            ai, NativeResponse, ViewBinder

public final class AdapterHelper
{

    private final WeakReference a;
    private final Context b;
    private final int c;
    private final int d;

    public AdapterHelper(Context context, int i, int j)
    {
        boolean flag1 = true;
        super();
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkArgument(context instanceof Activity, "Context must be an Activity.");
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "start position must be non-negative");
        if (j >= 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "interval must be at least 2");
        a = new WeakReference((Activity)context);
        b = context.getApplicationContext();
        c = i;
        d = j;
    }

    public final View getAdView(View view, ViewGroup viewgroup, NativeResponse nativeresponse, ViewBinder viewbinder, MoPubNative.MoPubNativeListener mopubnativelistener)
    {
        mopubnativelistener = (Activity)a.get();
        if (mopubnativelistener == null)
        {
            MoPubLog.w("Weak reference to Activity Context in AdapterHelper became null. Returning empty view.");
            return new View(b);
        } else
        {
            return ai.a(view, viewgroup, mopubnativelistener, nativeresponse, viewbinder);
        }
    }

    public final boolean isAdPosition(int i)
    {
        while (i < c || (i - c) % d != 0) 
        {
            return false;
        }
        return true;
    }

    public final int shiftedCount(int i)
    {
        int j;
        if (i <= c)
        {
            j = 0;
        } else
        {
            j = d - 1;
            if ((i - c) % j == 0)
            {
                j = (i - c) / j;
            } else
            {
                j = (int)Math.floor((double)(i - c) / (double)j) + 1;
            }
        }
        return j + i;
    }

    public final int shiftedPosition(int i)
    {
        int j;
        if (i <= c)
        {
            j = 0;
        } else
        {
            j = (int)Math.floor((double)(i - c) / (double)d) + 1;
        }
        return i - j;
    }
}
