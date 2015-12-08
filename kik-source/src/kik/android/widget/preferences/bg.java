// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;

// Referenced classes of package kik.android.widget.preferences:
//            ResetKikPreference, KikPreference

final class bg extends kik.android.chat.fragment.KikDialogFragment.c
{

    final Preference a;
    final ResetKikPreference b;

    bg(ResetKikPreference resetkikpreference, Preference preference)
    {
        b = resetkikpreference;
        a = preference;
        super();
    }

    public final void a()
    {
        KikPreference.a(b.c(), a);
    }
}
