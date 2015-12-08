// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import android.widget.AdapterView;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.settings:
//            NavigationSettingsView

class this._cls0
    implements android.widget.stener
{

    final NavigationSettingsView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i == 1 && !navigator.isWazeInstalled())
        {
            navigator.startWazeInstall();
            return;
        } else
        {
            lyftPreferences.setSelectedNavigation(i);
            return;
        }
    }

    ()
    {
        this$0 = NavigationSettingsView.this;
        super();
    }
}
