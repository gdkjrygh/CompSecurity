// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.ui.MainActivity;

public class DevelopmentView extends LinearLayout
{

    public static final String TAG = "DevelopmentActivity";
    ActivityController activityController;
    AppFlow appFlow;
    Toolbar toolbar;

    public DevelopmentView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.setTitle(getContext().getString(0x7f070116));
    }

    public void onMenuClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131558796: 
            appFlow.goTo(new DevelopmentScreens.DevelopmentInappNotificationScreen());
            return;

        case 2131558797: 
            appFlow.goTo(new DevelopmentScreens.ProxySettingsScreen());
            return;

        case 2131558795: 
            appFlow.goTo(new DevelopmentScreens.FeaturesScreen());
            return;

        case 2131558798: 
            appFlow.goTo(new DevelopmentScreens.TestViewsScreen());
            return;

        case 2131558799: 
            appFlow.goTo(new DevelopmentScreens.DeepLinksScreen());
            return;

        case 2131558800: 
            activityController.finish();
            break;
        }
        MainActivity.startActivity(getContext());
    }
}
