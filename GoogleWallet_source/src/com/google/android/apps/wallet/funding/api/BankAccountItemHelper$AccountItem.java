// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding.api;

import android.content.Intent;

// Referenced classes of package com.google.android.apps.wallet.funding.api:
//            BankAccountItemHelper

public static final class intentWhenClicked
{

    private final Intent intentWhenClicked;
    private final String mainText;
    private final String subText;

    public final Intent getIntentWhenClicked()
    {
        return intentWhenClicked;
    }

    public final String getMainText()
    {
        return mainText;
    }

    public final String getSubText()
    {
        return subText;
    }

    public (String s, String s1, Intent intent)
    {
        mainText = s;
        subText = s1;
        intentWhenClicked = intent;
    }
}
