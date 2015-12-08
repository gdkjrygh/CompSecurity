// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import android.content.Context;
import android.widget.ListAdapter;
import fsz;
import fyb;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            NotificationSettingsFragment

final class b extends fsz
{

    private NotificationSettingsFragment b;

    public final int a(int i)
    {
        return NotificationSettingsFragment.a(b).getItemViewType(i);
    }

    (NotificationSettingsFragment notificationsettingsfragment, Context context, ListAdapter listadapter)
    {
        b = notificationsettingsfragment;
        super(context, listadapter);
    }
}
