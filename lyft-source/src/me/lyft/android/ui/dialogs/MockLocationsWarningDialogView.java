// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DialogContainerView

public class MockLocationsWarningDialogView extends DialogContainerView
{

    public static final String ACTION_DEVELOPMENT_SETTINGS_1 = "com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS";
    public static final String ACTION_DEVELOPMENT_SETTINGS_2 = "android.settings.APPLICATION_DEVELOPMENT_SETTINGS";
    ActivityController activityController;
    DialogFlow dialogFlow;

    public MockLocationsWarningDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    public boolean onBack()
    {
        activityController.finish();
        return true;
    }

    public void onClick_goToDevelopmentSettings(View view)
    {
        try
        {
            getContext().startActivity(new Intent("com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            try
            {
                getContext().startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                activityController.finish();
            }
        }
        dialogFlow.dismiss();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
