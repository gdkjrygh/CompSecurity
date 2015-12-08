// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikCheckBoxPreference, f, e

public class DeveloperModePreference extends KikCheckBoxPreference
{

    public DeveloperModePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.v);
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        preference = (KikCheckBoxPreference)preference;
        if (!preference.isChecked())
        {
            obj = new kik.android.chat.fragment.KikDialogFragment.a(b().getResources());
            ((kik.android.chat.fragment.KikDialogFragment.a) (obj)).b(b().getString(0x7f0901c2)).a(b().getString(0x7f0901c3)).b(false).a(0x7f090326, new f(this, preference)).b(0x7f0902e0, new e(this));
            b().a(((kik.android.chat.fragment.KikDialogFragment.a) (obj)).a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "developmermode");
            return false;
        } else
        {
            preference.setChecked(false);
            return false;
        }
    }
}
