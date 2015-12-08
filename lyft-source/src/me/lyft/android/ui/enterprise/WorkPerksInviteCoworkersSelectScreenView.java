// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.SlideMenuController;

public class WorkPerksInviteCoworkersSelectScreenView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    SlideMenuController slideMenuController;
    Toolbar toolbar;

    public WorkPerksInviteCoworkersSelectScreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        slideMenuController.enableMenu();
    }

    public boolean onBack()
    {
        appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
        return true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        slideMenuController.disableMenu();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.showTitle().setTitle(getContext().getString(0x7f0702d4));
    }
}
