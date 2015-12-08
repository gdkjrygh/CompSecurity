// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Fc;
import LA;
import android.content.Context;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class a extends Fc
{

    private String a;
    private a b;

    protected final void a(String s)
    {
        if (s.length() == 2)
        {
            s = s.toUpperCase();
            LA la = DeveloperSettingsFragment.b(b.b);
            String s1 = a;
            if (s1 != null && !s1.equals(""))
            {
                la.c(s1.replaceFirst("(?<=country=)[^&]+", s));
                return;
            }
        }
    }

    ( , Context context, String s, String s1, String s2)
    {
        b = ;
        a = s2;
        super(context, s, s1, 1);
    }

    // Unreferenced inner class com/snapchat/android/fragments/settings/DeveloperSettingsFragment$20

/* anonymous class */
    final class DeveloperSettingsFragment._cls20
        implements android.view.View.OnClickListener
    {

        final DeveloperSettingsFragment a;

        public final void onClick(View view)
        {
            view = DeveloperSettingsFragment.c(a);
            DeveloperSettingsFragment.b(a);
            String s = LA.b(view);
            (new DeveloperSettingsFragment._cls20._cls1(this, a.getActivity(), "Change Country", s, view)).show();
        }

            
            {
                a = developersettingsfragment;
                super();
            }
    }

}
