// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import com.kik.e.a;
import kik.a.e.b;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference, bb, ba

public class OptOutPreference extends KikPreference
{

    b b;

    public OptOutPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, com.kik.d.b.a.c.m);
        b().V().a(this);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = new kik.android.chat.fragment.KikDialogFragment.a(b().getResources());
        preference.b(0x7f0901c5).a(0x7f0901c7).a(0x7f090326, new bb(this)).b(0x7f0901c6, new ba(this));
        b().a(preference.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "matching");
        return false;
    }
}
