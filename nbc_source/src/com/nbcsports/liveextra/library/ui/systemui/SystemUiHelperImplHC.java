// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui.systemui;

import android.app.ActionBar;
import android.app.Activity;
import android.view.View;
import android.view.Window;

class SystemUiHelperImplHC extends SystemUiHelper.SystemUiHelperImpl
    implements android.view.View.OnSystemUiVisibilityChangeListener
{

    final View mDecorView;

    SystemUiHelperImplHC(Activity activity, int i, int j, SystemUiHelper.OnVisibilityChangeListener onvisibilitychangelistener)
    {
        super(activity, i, j, onvisibilitychangelistener);
        mDecorView = activity.getWindow().getDecorView();
        mDecorView.setOnSystemUiVisibilityChangeListener(this);
    }

    protected int createHideFlags()
    {
        return 1;
    }

    protected int createShowFlags()
    {
        return 0;
    }

    protected int createTestFlags()
    {
        return 1;
    }

    void hide()
    {
        mDecorView.setSystemUiVisibility(createHideFlags());
    }

    protected void onSystemUiHidden()
    {
        ActionBar actionbar = mActivity.getActionBar();
        if (actionbar != null)
        {
            actionbar.hide();
        }
        mActivity.getWindow().addFlags(1024);
        setIsShowing(false);
    }

    protected void onSystemUiShown()
    {
        ActionBar actionbar = mActivity.getActionBar();
        if (actionbar != null)
        {
            actionbar.show();
        }
        mActivity.getWindow().clearFlags(1024);
        setIsShowing(true);
    }

    public final void onSystemUiVisibilityChange(int i)
    {
        if ((createTestFlags() & i) != 0)
        {
            onSystemUiHidden();
            return;
        } else
        {
            onSystemUiShown();
            return;
        }
    }

    void show()
    {
        mDecorView.setSystemUiVisibility(createShowFlags());
    }
}
