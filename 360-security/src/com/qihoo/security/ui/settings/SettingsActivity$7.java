// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.os.RemoteException;
import android.widget.CompoundButton;
import com.qihoo.security.support.b;

// Referenced classes of package com.qihoo.security.ui.settings:
//            SettingsActivity

class a
    implements android.widget.eckedChangeListener
{

    final SettingsActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (com.qihoo.security.ui.settings.SettingsActivity.b(a) != flag)
        {
            SettingsActivity.a(a, flag);
            if (flag)
            {
                b.c(19001);
            }
            if (SettingsActivity.c(a) != null)
            {
                try
                {
                    SettingsActivity.c(a).a(flag);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (CompoundButton compoundbutton)
                {
                    return;
                }
            }
        }
    }

    ner(SettingsActivity settingsactivity)
    {
        a = settingsactivity;
        super();
    }
}
