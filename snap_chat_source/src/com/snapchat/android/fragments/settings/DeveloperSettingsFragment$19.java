// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import LA;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class a
    implements android.widget.tener
{

    private ArrayAdapter a;
    private DeveloperSettingsFragment b;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = DeveloperSettingsFragment.c(b);
        Object obj = (CharSequence)a.getItem(i);
        if (!obj.equals(""))
        {
            view = DeveloperSettingsFragment.b(b);
            obj = (String)obj;
            if (adapterview != null && !adapterview.equals(""))
            {
                view.c(adapterview.replaceFirst("(?<=region=)[^&]+", ((String) (obj))));
                return;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    (DeveloperSettingsFragment developersettingsfragment, ArrayAdapter arrayadapter)
    {
        b = developersettingsfragment;
        a = arrayadapter;
        super();
    }
}
