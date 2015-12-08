// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.common.Objects;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.ui.WebBrowserView;

public class PaymentHelpView extends LinearLayout
{

    ILyftPreferences lyftPreferences;
    Toolbar toolbar;
    IUserSession userSession;
    WebBrowserView webBrowserView;

    public PaymentHelpView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        Object obj = userSession.getRide();
        StringBuilder stringbuilder = (new StringBuilder()).append(lyftPreferences.getLyftWebRoot());
        if (obj != null)
        {
            obj = ((RideDTO) (obj)).getRegion();
        } else
        {
            obj = null;
        }
        obj = stringbuilder.append(String.format("/pricing/%s", new Object[] {
            Objects.firstNonNull(obj, "")
        })).toString();
        webBrowserView.setProgressIndicatorBackgroundColor(-1);
        webBrowserView.setOverviewMode(true);
        webBrowserView.setTargetUrl(((String) (obj)));
        toolbar.setTitle(getContext().getString(0x7f070272));
    }
}
