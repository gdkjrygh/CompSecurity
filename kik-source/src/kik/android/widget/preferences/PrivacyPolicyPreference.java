// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.Preference;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.settings.d;
import kik.android.util.bg;

// Referenced classes of package kik.android.widget.preferences:
//            KikModalPreference

public class PrivacyPolicyPreference extends KikModalPreference
{

    public PrivacyPolicyPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.u);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = b();
        if (preference instanceof d)
        {
            ((d)preference).b();
        }
        Object obj = (new bg(b().getActivity())).a();
        obj = new Intent("android.intent.action.VIEW", Uri.parse(b().getResources().getString(0x7f090362, new Object[] {
            obj
        })));
        preference.getActivity().startActivity(((Intent) (obj)));
        return true;
    }
}
