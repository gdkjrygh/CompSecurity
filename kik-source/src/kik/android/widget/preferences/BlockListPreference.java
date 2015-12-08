// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.settings.d;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class BlockListPreference extends KikPreference
{

    public BlockListPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.n);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = b();
        if (preference instanceof d)
        {
            ((d)preference).b();
        }
        preference.a(new kik.android.chat.fragment.KikBlockedContactsFragment.a());
        return false;
    }
}
