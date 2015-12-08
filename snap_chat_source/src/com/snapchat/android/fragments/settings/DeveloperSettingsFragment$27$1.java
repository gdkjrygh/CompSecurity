// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import II;
import PG;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class a
    implements Runnable
{

    private int a;
    private a b;

    public final void run()
    {
        II.a(b.b, a);
    }

    ( , int i)
    {
        b = ;
        a = i;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/settings/DeveloperSettingsFragment$27

/* anonymous class */
    final class DeveloperSettingsFragment._cls27
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final String a;

        public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            PG.b(new DeveloperSettingsFragment._cls27._cls1(this, i));
        }

        public final void onNothingSelected(AdapterView adapterview)
        {
        }

            
            {
                a = s;
                super();
            }
    }

}
