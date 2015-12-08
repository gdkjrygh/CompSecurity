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
//            KikPreference, ap, ao, an

public class MatchingPreference extends KikPreference
{

    protected b b;

    public MatchingPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.m);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        kik.android.chat.fragment.KikDialogFragment.a a1 = new kik.android.chat.fragment.KikDialogFragment.a(b().getResources());
        a1.b(0x7f0901c5).a(0x7f0901c7).a(0x7f090326, new ap(this)).b(0x7f0901c6, new ao(this)).a(new an(this, preference));
        b().a(a1.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "matching");
        return false;
    }
}
