// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import an;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import cu;
import da;
import dtx;
import fyb;
import java.util.LinkedHashMap;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            NotificationSettingsFragment

final class b
    implements an
{

    private final String a[] = {
        "send_email"
    };
    private NotificationSettingsFragment b;

    public final da a(Bundle bundle)
    {
        bundle = dtx.a;
        return new cu(b.k(), bundle, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            u u = b.k();
            int i = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("send_email"));
            obj = new tification("send_email", u.getString(0x7f080371), i, tification.Type.b, (byte)0);
            NotificationSettingsFragment.c(b).put(((tification) (obj)).a, obj);
            if (NotificationSettingsFragment.a(b) != null)
            {
                NotificationSettingsFragment.a(b).a(NotificationSettingsFragment.c(b).values());
            }
            NotificationSettingsFragment.g(b);
            NotificationSettingsFragment.f(b);
        }
    }

    tification.Type(NotificationSettingsFragment notificationsettingsfragment)
    {
        b = notificationsettingsfragment;
        super();
    }
}
