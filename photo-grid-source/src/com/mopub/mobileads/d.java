// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.text.TextUtils;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.mopub.mobileads:
//            c, AdViewController, MoPubView

final class d extends c
{

    private String b;
    private Map c;

    public d(AdViewController adviewcontroller, String s, Map map)
    {
        super(adviewcontroller);
        b = s;
        c = map;
    }

    final void a()
    {
        Object obj = (AdViewController)a.get();
        if (obj == null || ((AdViewController) (obj)).d() || TextUtils.isEmpty(b))
        {
            return;
        }
        ((AdViewController) (obj)).a();
        obj = ((AdViewController) (obj)).getMoPubView();
        if (obj == null)
        {
            MoPubLog.d("Can't load an ad in this ad view because it was destroyed.");
            return;
        } else
        {
            ((MoPubView) (obj)).a(b, c);
            return;
        }
    }
}
