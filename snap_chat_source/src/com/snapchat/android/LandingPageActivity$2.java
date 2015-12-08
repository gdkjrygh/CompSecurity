// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import Bt;
import android.content.DialogInterface;
import com.snapchat.android.analytics.PhoneVerificationAnalytics;

// Referenced classes of package com.snapchat.android:
//            LandingPageActivity

final class ationAnalytics
    implements android.content.kListener
{

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PhoneVerificationAnalytics.a(true, Bt.e());
        dialoginterface.cancel();
    }

    ationAnalytics()
    {
    }
}
