// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RadioButton;

// Referenced classes of package com.fitbit.settings.ui:
//            MixPanelSettingsActivity

class a
    implements android.view.ctivity._cls1
{

    final MixPanelSettingsActivity a;

    public void onFocusChange(View view, boolean flag)
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)a.getSystemService("input_method");
        if (flag)
        {
            a.e.setChecked(true);
            inputmethodmanager.toggleSoftInput(1, 0);
            return;
        } else
        {
            inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
    }

    (MixPanelSettingsActivity mixpanelsettingsactivity)
    {
        a = mixpanelsettingsactivity;
        super();
    }
}
