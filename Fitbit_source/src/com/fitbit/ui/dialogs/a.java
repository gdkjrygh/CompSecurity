// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.dialogs;

import android.content.Context;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionInfo;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.util.ar;

public class a
{

    public a()
    {
    }

    public static String a(Context context)
    {
        return a(context, false);
    }

    private static String a(Context context, boolean flag)
    {
        com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason offlinereason = ServerGateway.a().b().a();
        RestrictionInfo restrictioninfo = ServerGateway.a().b().c();
        if (ar.c(context))
        {
            if (offlinereason != null && offlinereason == com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason.d && restrictioninfo != null)
            {
                return restrictioninfo.d();
            }
            if (flag && offlinereason == com.fitbit.serverinteraction.restrictions.RestrictionsController.PresenceListener.OfflineReason.e)
            {
                return offlinereason.a(context, ServerGateway.a().b());
            } else
            {
                return context.getString(0x7f08018f);
            }
        } else
        {
            return context.getString(0x7f08053d);
        }
    }

    public static String b(Context context)
    {
        return a(context, true);
    }
}
