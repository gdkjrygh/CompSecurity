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
    implements android.widget.tener
{

    final String a;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        PG.b(new Runnable(i) {

            private int a;
            private DeveloperSettingsFragment._cls27 b;

            public final void run()
            {
                II.a(b.a, a);
            }

            
            {
                b = DeveloperSettingsFragment._cls27.this;
                a = i;
                super();
            }
        });
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    _cls1.a(String s)
    {
        a = s;
        super();
    }
}
