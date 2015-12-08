// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.app.NotificationManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Notification;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ao, aq, 
//            ah, EntityMerger

public class dk extends e
{

    private static final String a = "SyncNotificationsOperation";
    private boolean b;

    public dk(bs bs1, boolean flag, boolean flag1)
    {
        super(bs1, flag);
        b = flag1;
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        com.fitbit.data.repo.ai ai;
        a1 = e().b().z(e().a().n());
        ai = aq.a().B();
        if (!b)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        NotificationManager notificationmanager = (NotificationManager)FitBitApplication.a().getSystemService("notification");
        notificationmanager.cancel(com.fitbit.FitbitMobile.GCMNotification.Type.c.ordinal());
        notificationmanager.cancel(com.fitbit.FitbitMobile.GCMNotification.Type.d.ordinal());
        notificationmanager.cancel(com.fitbit.FitbitMobile.GCMNotification.Type.e.ordinal());
        notificationmanager.cancel(com.fitbit.FitbitMobile.GCMNotification.Type.f.ordinal());
        notificationmanager.cancel(com.fitbit.FitbitMobile.GCMNotification.Type.g.ordinal());
        notificationmanager = (NotificationManager)FitBitApplication.a().getSystemService("notification");
        for (Iterator iterator1 = com.fitbit.FitbitMobile.GCMNotification.Type.a().iterator(); iterator1.hasNext(); notificationmanager.cancel(((com.fitbit.FitbitMobile.GCMNotification.Type)iterator1.next()).ordinal())) { }
        break MISSING_BLOCK_LABEL_168;
        a1;
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.b, com.fitbit.savedstate.LoadSavedState.Status.c, com.fitbit.savedstate.LoadSavedState.Status.a);
        throw a1;
        Iterator iterator = a1.iterator();
        long l = 0L;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Notification notification = (Notification)iterator.next();
            notification.a(true);
            if (notification.h() > l)
            {
                l = notification.h();
            }
        } while (true);
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        e().a().a(l);
        ah.a().a(0);
        ah.a().f();
        a1 = new EntityMerger(a1, ai, new _cls1());
        a1.a(new _cls2());
        a1.a(new _cls3());
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.b, com.fitbit.savedstate.LoadSavedState.Status.b);
        return;
    }

    public String c()
    {
        return "SyncNotificationsOperation";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
