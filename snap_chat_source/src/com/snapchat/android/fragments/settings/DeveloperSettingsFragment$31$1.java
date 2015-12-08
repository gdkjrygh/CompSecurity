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

final class a
    implements com.snapchat.android.util.Fragment._cls31._cls1
{

    private CompoundButton a;
    private a b;

    public final void a(com.snapchat.android.util.Fragment._cls31._cls1 _pcls1)
    {
        if (_pcls1 == com.snapchat.android.util.S)
        {
            Lz.a(true);
            Lz.a(b.b, "https://cash-dot-feelinsonice-hrd.appspot.com");
            b.b.setText("https://cash-dot-feelinsonice-hrd.appspot.com");
            Bt.av();
            b.b.a.a(null);
            b.b.b.b();
            return;
        } else
        {
            a.setTag(Boolean.valueOf(true));
            a.setChecked(false);
            return;
        }
    }

    ( , CompoundButton compoundbutton)
    {
        b = ;
        a = compoundbutton;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/settings/DeveloperSettingsFragment$31

/* anonymous class */
    final class DeveloperSettingsFragment._cls31
        implements android.widget.CompoundButton.OnCheckedChangeListener
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
                AlertDialogUtils.a(c.getActivity(), null, "This will also change the Snapchat endpoint to https://cash-dot-feelinsonice-hrd.appspot.com. Proceed?", new DeveloperSettingsFragment._cls31._cls1(this, compoundbutton));
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

            
            {
                c = developersettingsfragment;
                a = sharedpreferences;
                b = textview;
                super();
            }
    }

}
