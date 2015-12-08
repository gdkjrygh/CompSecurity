// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.AdListener;
import java.util.concurrent.Future;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            i, e, h, c

public class k extends i
{

    private final com.google.ads.formats.NativeContentAd.OnContentAdLoadedListener a;

    public k(Context context, h h, AdListener adlistener, com.google.ads.formats.NativeContentAd.OnContentAdLoadedListener oncontentadloadedlistener)
    {
        super(context, h, adlistener);
        a = oncontentadloadedlistener;
    }

    protected void a(e e1)
    {
        a.onContentAdLoaded(e1);
    }

    protected volatile void a(Object obj)
    {
        a((e)obj);
    }

    protected c b(JSONObject jsonobject)
    {
        return f(jsonobject);
    }

    protected e f(JSONObject jsonobject)
    {
        Future future = d(jsonobject);
        Future future1 = a(jsonobject, "image", true);
        Future future2 = a(jsonobject, "secondary_image", false);
        String s = e(jsonobject);
        a(s, future);
        return new e(jsonobject.getString("headline"), (Drawable)future1.get(), jsonobject.getString("body"), (Drawable)future2.get(), jsonobject.getString("call_to_action"), jsonobject.getString("advertiser"), (Drawable)future.get(), s);
    }
}
