// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SimplifiedSetupProfileActivity

static final class mainView
{

    public View logoSpot;
    public View mainView;

    public (int i, Activity activity)
    {
        mainView = Views.findViewById(activity, i);
        logoSpot = Views.findViewById(mainView, com.google.android.apps.walletnfcrel.een.mainView);
    }
}
