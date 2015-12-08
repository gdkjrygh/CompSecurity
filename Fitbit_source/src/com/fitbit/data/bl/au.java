// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.service.b;
import com.fitbit.util.z;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, an

public class au extends b
{

    static final String a = "com.fitbit.data.bl.SendInviteByEmail.ACTION";
    private static final String b = "com.fitbit.data.bl.SendInviteByEmail.EXTRA_EMAIL";

    public au()
    {
    }

    public static Intent a(Context context, String s)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SendInviteByEmail.ACTION");
        context.putExtra("com.fitbit.data.bl.SendInviteByEmail.EXTRA_EMAIL", s);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        MixPanelTrackingHelper.a(com.fitbit.mixpanel.MixPanelTrackingHelper.FriendRequestProperties.d);
        (new PublicAPI(ServerGateway.a())).a(intent.getStringExtra("com.fitbit.data.bl.SendInviteByEmail.EXTRA_EMAIL"), null, EnumSet.of(com.fitbit.serverinteraction.PublicAPI.InviteSource.d));
_L1:
        return;
        syncservice;
        int i = syncservice.e();
        if (i == 400 || i == 401 || i == 403 || i == 404 || i == 500 || i == 502 || i == 503)
        {
            z.a(new Intent("com.fitbit.controllers.ServerGatewayController.ACTION_SERVER_ERROR"));
            return;
        }
        if (syncservice.f() != com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a)
        {
            throw syncservice;
        }
          goto _L1
    }

    public boolean b()
    {
        return an.a().j();
    }
}
