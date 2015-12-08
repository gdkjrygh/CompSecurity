// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.res.Resources;
import android.widget.CompoundButton;
import android.widget.TextView;

// Referenced classes of package com.hmobile.biblekjv:
//            SettingsActivity

class this._cls0
    implements android.widget.eckedChangeListener
{

    final SettingsActivity this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        editor.putBoolean("navigation_fade", flag);
        editor.commit();
        if (flag)
        {
            SettingsActivity.access$2(SettingsActivity.this).setText(getResources().getString(0x7f070070));
            return;
        } else
        {
            SettingsActivity.access$2(SettingsActivity.this).setText(getResources().getString(0x7f070071));
            return;
        }
    }

    ()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
