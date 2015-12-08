// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckedTextView;
import com.pinterest.api.remote.SettingsApi;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class this._cls0
    implements android.widget.ttingsFragment._cls5
{

    final UpdatedAccountSettingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (view != null)
        {
            if ((adapterview = (CheckedTextView)view.findViewById(0x7f0f033a)) != null)
            {
                boolean flag;
                if (!adapterview.isChecked())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adapterview.setChecked(flag);
                if (UpdatedAccountSettingsFragment.access$1000() != null)
                {
                    view = (String)UpdatedAccountSettingsFragment.access$1000().get(i);
                    if (adapterview.isChecked())
                    {
                        adapterview = "anyone";
                    } else
                    {
                        adapterview = "none";
                    }
                    SettingsApi.d(view, adapterview, UpdatedAccountSettingsFragment.access$1100(UpdatedAccountSettingsFragment.this), getApiTag());
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super();
    }
}
