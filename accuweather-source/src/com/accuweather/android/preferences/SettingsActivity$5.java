// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.widget.ListView;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.preferences:
//            SettingsActivity

class this._cls0 extends TimerTask
{

    final SettingsActivity this$0;

    public void run()
    {
        for (int i = 0; i < getListView().getChildCount(); i++)
        {
            ListView listview = getListView();
            SettingsActivity.access$200(SettingsActivity.this, listview);
        }

    }

    ()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
