// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import com.kik.e.a;
import kik.a.ab;
import kik.android.chat.fragment.KikScopedDialogFragment;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference, bi, bh, bg

public class ResetKikPreference extends KikPreference
{

    protected ab b;

    public ResetKikPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101008e);
    }

    public ResetKikPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, com.kik.d.b.a.c.l);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        kik.android.chat.fragment.KikDialogFragment.a a1 = new kik.android.chat.fragment.KikDialogFragment.a(b().getResources());
        a1.b(0x7f090041).a(0x7f0902ff).b(true).a(0x7f090326, new bi(this)).b(0x7f0902e0, new bh(this)).a(new bg(this, preference));
        b().a(a1.a(), kik.android.chat.fragment.KikScopedDialogFragment.a.b, "reset");
        return false;
    }
}
