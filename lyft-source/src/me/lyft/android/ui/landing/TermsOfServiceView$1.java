// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.widget.CompoundButton;
import me.lyft.android.application.landing.ILandingService;

// Referenced classes of package me.lyft.android.ui.landing:
//            TermsOfServiceView

class this._cls0
    implements android.widget.kedChangeListener
{

    final TermsOfServiceView this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            showTermsOfServiceError(false);
            landingService.agreedTermsOfService(true);
            return;
        } else
        {
            landingService.agreedTermsOfService(false);
            return;
        }
    }

    ice()
    {
        this$0 = TermsOfServiceView.this;
        super();
    }
}
