// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.snapchat.android.analytics.framework.EasyMetric;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            NotificationSettingsFragment

final class l
    implements android.widget.istener
{

    private CheckBox a;
    private CheckBox b;
    private CheckBox c;
    private CheckBox d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private NotificationSettingsFragment m;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        NotificationSettingsFragment.a(m);
        Bt.H(flag);
        a.setEnabled(flag);
        b.setEnabled(flag);
        c.setEnabled(flag);
        d.setEnabled(flag);
        e.setEnabled(flag);
        f.setEnabled(flag);
        g.setEnabled(flag);
        h.setEnabled(flag);
        i.setEnabled(flag);
        j.setEnabled(flag);
        k.setEnabled(flag);
        l.setEnabled(flag);
        StringBuilder stringbuilder = new StringBuilder("NOTIFICATIONS_");
        if (flag)
        {
            compoundbutton = "ENABLED";
        } else
        {
            compoundbutton = "DISABLED";
        }
        (new EasyMetric(stringbuilder.append(compoundbutton).toString())).e();
    }

    (NotificationSettingsFragment notificationsettingsfragment, CheckBox checkbox, CheckBox checkbox1, CheckBox checkbox2, CheckBox checkbox3, View view, View view1, 
            View view2, View view3, View view4, View view5, View view6, View view7)
    {
        m = notificationsettingsfragment;
        a = checkbox;
        b = checkbox1;
        c = checkbox2;
        d = checkbox3;
        e = view;
        f = view1;
        g = view2;
        h = view3;
        i = view4;
        j = view5;
        k = view6;
        l = view7;
        super();
    }
}
