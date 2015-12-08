// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Fc;
import Je;
import LA;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            DeveloperSettingsFragment

final class a extends Fc
{

    private String a;
    private a b;

    protected final void a(String s)
    {
        try
        {
            int i = Integer.parseInt(s);
            DeveloperSettingsFragment.b(b.b).a(i);
            b.b.setText(Integer.toString(i));
            if (!TextUtils.equals(a, s))
            {
                Je.a().b();
            }
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            Timber.d("DeveloperSettingsFragment", (new StringBuilder("Invalid number: ")).append(s).toString(), new Object[0]);
        }
    }

    ( , Context context, String s, String s1, String s2)
    {
        b = ;
        a = s2;
        super(context, s, s1, 2);
    }

    // Unreferenced inner class com/snapchat/android/fragments/settings/DeveloperSettingsFragment$21

/* anonymous class */
    final class DeveloperSettingsFragment._cls21
        implements android.view.View.OnClickListener
    {

        final TextView a;
        final DeveloperSettingsFragment b;

        public final void onClick(View view)
        {
            view = a.getText().toString();
            (new DeveloperSettingsFragment._cls21._cls1(this, b.getActivity(), "Thumbnail Story Count", view, view)).show();
        }

            
            {
                b = developersettingsfragment;
                a = textview;
                super();
            }
    }

}
