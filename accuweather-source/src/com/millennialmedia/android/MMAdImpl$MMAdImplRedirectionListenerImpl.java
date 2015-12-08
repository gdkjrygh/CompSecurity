// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.net.Uri;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            MMAdImpl, HandShake

static class creatorAdImplInternalId extends creatorAdImplInternalId
{

    WeakReference adImplRef;

    public boolean isActivityStartable(Uri uri)
    {
        uri = (MMAdImpl)adImplRef.get();
        if (uri != null)
        {
            uri = uri.getContext();
            if (uri != null && (uri instanceof Activity) && ((Activity)uri).isFinishing())
            {
                return false;
            }
        }
        return true;
    }

    public void startingActivity(Uri uri)
    {
        super.tartingActivity(uri);
        if (uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https"))
        {
            uri = (MMAdImpl)adImplRef.get();
            if (uri != null)
            {
                adImplRef(uri);
            }
        }
    }

    public void updateLastVideoViewedTime()
    {
        MMAdImpl mmadimpl = (MMAdImpl)adImplRef.get();
        if (mmadimpl != null && mmadimpl.adType != null)
        {
            HandShake.sharedHandShake(mmadimpl.getContext()).updateLastVideoViewedTime(mmadimpl.getContext(), mmadimpl.adType);
        }
    }

    public (MMAdImpl mmadimpl)
    {
        if (mmadimpl != null)
        {
            adImplRef = new WeakReference(mmadimpl);
            creatorAdImplInternalId = mmadimpl.internalId;
        }
    }
}
