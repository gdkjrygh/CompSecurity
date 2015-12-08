// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikModalPreference, am, al

public class LicensePreference extends KikModalPreference
{

    public LicensePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.t);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        kik.android.chat.fragment.KikDialogFragment.a a = new kik.android.chat.fragment.KikDialogFragment.a(b().getResources());
        a.b(b().getString(0x7f090144)).a(0x7f0902d0).b(true).a(0x7f090193, new am(this)).a(new al(this, preference));
        b().a(a.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "licences");
        return true;
    }
}
