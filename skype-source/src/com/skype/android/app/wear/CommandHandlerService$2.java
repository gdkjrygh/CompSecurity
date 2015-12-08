// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.skype.android.app.wear:
//            CommandHandlerService

final class this._cls0
    implements com.google.android.gms.common.api.
{

    final CommandHandlerService this$0;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        Log.i("CommandHandlerService", "Unable to connect to Google API Client.");
    }

    ()
    {
        this$0 = CommandHandlerService.this;
        super();
    }
}
