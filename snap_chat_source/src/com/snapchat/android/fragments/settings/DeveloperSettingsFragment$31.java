// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Bt;
import Lz;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.snapchat.android.util.AlertDialogUtils;
import rZ;
import sc;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class b
    implements android.widget.eListener
{

    final SharedPreferences a;
    final TextView b;
    final DeveloperSettingsFragment c;

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (compoundbutton.getTag() != null)
        {
            compoundbutton.setTag(null);
            return;
        }
        if (flag)
        {
            AlertDialogUtils.a(c.getActivity(), null, "This will also change the Snapchat endpoint to https://cash-dot-feelinsonice-hrd.appspot.com. Proceed?", new com.snapchat.android.util.AlertDialogUtils.a(compoundbutton) {

                private CompoundButton a;
                private DeveloperSettingsFragment._cls31 b;

                public final void a(com.snapchat.android.util.AlertDialogUtils.YesNoOption yesnooption)
                {
                    if (yesnooption == com.snapchat.android.util.AlertDialogUtils.YesNoOption.YES)
                    {
                        Lz.a(true);
                        Lz.a(b.a, "https://cash-dot-feelinsonice-hrd.appspot.com");
                        b.b.setText("https://cash-dot-feelinsonice-hrd.appspot.com");
                        Bt.av();
                        b.c.a.a(null);
                        b.c.b.b();
                        return;
                    } else
                    {
                        a.setTag(Boolean.valueOf(true));
                        a.setChecked(false);
                        return;
                    }
                }

            
            {
                b = DeveloperSettingsFragment._cls31.this;
                a = compoundbutton;
                super();
            }
            });
            return;
        } else
        {
            Lz.a(false);
            Lz.a(a, null);
            b.setText("https://app.snapchat.com");
            Bt.av();
            c.a.a(null);
            c.b.b();
            AlertDialogUtils.a(c.getActivity(), "The Snapchat endpoint has also been reset to default.");
            return;
        }
    }

    _cls1.a(DeveloperSettingsFragment developersettingsfragment, SharedPreferences sharedpreferences, TextView textview)
    {
        c = developersettingsfragment;
        a = sharedpreferences;
        b = textview;
        super();
    }
}
