// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.preference.Preference;

// Referenced classes of package kik.android.widget.preferences:
//            UsernamePreference, KikPreference

final class bq extends kik.android.chat.fragment.KikDialogFragment.c
{

    final Preference a;
    final UsernamePreference b;

    bq(UsernamePreference usernamepreference, Preference preference)
    {
        b = usernamepreference;
        a = preference;
        super();
    }

    public final void a()
    {
        KikPreference.a(b.c(), a);
    }
}
