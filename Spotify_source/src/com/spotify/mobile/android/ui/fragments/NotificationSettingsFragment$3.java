// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import an;
import android.database.Cursor;
import android.os.Bundle;
import cu;
import da;
import dtw;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            NotificationSettingsFragment

final class b
    implements an
{

    private final String a[] = {
        "connected"
    };
    private NotificationSettingsFragment b;

    public final da a(Bundle bundle)
    {
        bundle = dtw.a;
        return new cu(b.k(), bundle, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        boolean flag = false;
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            NotificationSettingsFragment.e(b);
            NotificationSettingsFragment notificationsettingsfragment = b;
            if (((Cursor) (obj)).getInt(0) != 0)
            {
                flag = true;
            }
            NotificationSettingsFragment.a(notificationsettingsfragment, flag);
            NotificationSettingsFragment.f(b);
        }
    }

    (NotificationSettingsFragment notificationsettingsfragment)
    {
        b = notificationsettingsfragment;
        super();
    }
}
