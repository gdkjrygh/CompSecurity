// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;

// Referenced classes of package kik.android.widget.preferences:
//            CopyrightPreference, KikPreference

final class c extends kik.android.chat.fragment.KikDialogFragment.c
{

    final Preference a;
    final CopyrightPreference b;

    c(CopyrightPreference copyrightpreference, Preference preference)
    {
        b = copyrightpreference;
        a = preference;
        super();
    }

    public final void a()
    {
        KikPreference.a(b.c(), a);
    }
}
