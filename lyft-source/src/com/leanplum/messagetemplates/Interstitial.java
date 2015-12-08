// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.app.Activity;
import android.content.Context;
import com.leanplum.Leanplum;

// Referenced classes of package com.leanplum.messagetemplates:
//            BaseMessageDialog, InterstitialOptions, r

public class Interstitial extends BaseMessageDialog
{

    public Interstitial(Activity activity, InterstitialOptions interstitialoptions)
    {
        super(activity, true, interstitialoptions, null);
        options = interstitialoptions;
    }

    public static void register(Context context)
    {
        Leanplum.defineAction("Interstitial", Leanplum.ACTION_KIND_MESSAGE | Leanplum.ACTION_KIND_ACTION, InterstitialOptions.toArgs(context), new r());
    }
}
