// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;
import com.pinterest.ui.notify.PinterestDialog;

final class a
    implements android.view.er
{

    final PinterestDialog a;

    public final void onClick(View view)
    {
        Events.post(new Navigation(Location.PIN_PICKS, "pinpicks/us/breakfast/"));
        a.dismiss();
    }

    (PinterestDialog pinterestdialog)
    {
        a = pinterestdialog;
        super();
    }
}
