// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.widget.TextView;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class a
    implements Runnable
{

    private final TextView a;
    private int b;
    private DeveloperSettingsFragment c;

    public final void run()
    {
        if (!c.isResumed())
        {
            Timber.c("DeveloperSettingsFragment", "Stop flipping because it has been backgrounded.", new Object[0]);
            return;
        }
        StringBuilder stringbuilder = new StringBuilder(a.getText());
        b = b % stringbuilder.length();
        char c1 = stringbuilder.charAt(b);
        if (Character.isUpperCase(c1))
        {
            stringbuilder.setCharAt(b, Character.toLowerCase(c1));
        } else
        {
            stringbuilder.setCharAt(b, Character.toUpperCase(c1));
        }
        a.setText(stringbuilder.toString());
        b = b + 1;
        a.postDelayed(this, 200L);
    }

    public I(DeveloperSettingsFragment developersettingsfragment, TextView textview)
    {
        c = developersettingsfragment;
        super();
        b = 0;
        a = textview;
    }
}
