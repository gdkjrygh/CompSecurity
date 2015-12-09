// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClient

private abstract class resolution extends resolution
{

    public final Bundle resolution;
    public final int statusCode;
    final GmsClient this$0;

    protected final volatile void deliverCallback(Object obj)
    {
        Object obj1 = null;
        if ((Boolean)obj != null) goto _L2; else goto _L1
_L1:
        GmsClient.access$200$53d09639(GmsClient.this, 1);
_L4:
        return;
_L2:
        switch (statusCode)
        {
        default:
            GmsClient.access$200$53d09639(GmsClient.this, 1);
            obj = obj1;
            if (resolution != null)
            {
                obj = (PendingIntent)resolution.getParcelable("pendingIntent");
            }
            handleServiceFailure(new ConnectionResult(statusCode, ((PendingIntent) (obj))));
            return;

        case 0: // '\0'
            if (!handleServiceSuccess())
            {
                GmsClient.access$200$53d09639(GmsClient.this, 1);
                handleServiceFailure(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            GmsClient.access$200$53d09639(GmsClient.this, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract void handleServiceFailure(ConnectionResult connectionresult);

    protected abstract boolean handleServiceSuccess();

    protected final void onDeliverCallbackFailed()
    {
    }

    protected I(int i, Bundle bundle)
    {
        this$0 = GmsClient.this;
        super(GmsClient.this, Boolean.valueOf(true));
        statusCode = i;
        resolution = bundle;
    }
}
