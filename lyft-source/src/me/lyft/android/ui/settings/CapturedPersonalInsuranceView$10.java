// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedPersonalInsuranceView

class this._cls0
    implements android.view.suranceView._cls10
{

    final CapturedPersonalInsuranceView this$0;

    public void onClick(View view)
    {
        WebBrowser.open(getContext(), (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/help/contact/driver/3/0?m=1").toString());
    }

    ()
    {
        this$0 = CapturedPersonalInsuranceView.this;
        super();
    }
}
