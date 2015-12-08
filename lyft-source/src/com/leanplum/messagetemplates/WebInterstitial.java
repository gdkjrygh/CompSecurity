// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.app.Activity;
import android.content.Context;
import com.leanplum.Leanplum;

// Referenced classes of package com.leanplum.messagetemplates:
//            BaseMessageDialog, WebInterstitialOptions, v

public class WebInterstitial extends BaseMessageDialog
{

    public WebInterstitial(Activity activity, WebInterstitialOptions webinterstitialoptions)
    {
        super(activity, true, null, webinterstitialoptions);
        webOptions = webinterstitialoptions;
    }

    public static void register(Context context)
    {
        Leanplum.defineAction("Web Interstitial", Leanplum.ACTION_KIND_MESSAGE | Leanplum.ACTION_KIND_ACTION, WebInterstitialOptions.toArgs(context), new v());
    }
}
