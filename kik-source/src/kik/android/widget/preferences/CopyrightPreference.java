// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikModalPreference, d, c

public class CopyrightPreference extends KikModalPreference
{

    public CopyrightPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, null);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        kik.android.chat.fragment.KikDialogFragment.a a = new kik.android.chat.fragment.KikDialogFragment.a(b().getResources());
        View view = View.inflate(getContext(), 0x7f03003d, null);
        a.a(0x7f0902a7).b(true).a(view).a(0x7f090193, new d(this)).a(new c(this, preference));
        preference = a.a();
        b().a(preference, kik.android.chat.fragment.KikScopedDialogFragment.a.b, "copyright");
        return true;
    }
}
