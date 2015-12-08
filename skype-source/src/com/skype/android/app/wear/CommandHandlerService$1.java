// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.skype.android.app.wear:
//            CommandHandlerService

final class this._cls0
    implements com.google.android.gms.common.api.
{

    final CommandHandlerService this$0;

    public final void onConnected(Bundle bundle)
    {
        Log.i("CommandHandlerService", "Successfully connect to Google API Client");
    }

    public final void onConnectionSuspended(int i)
    {
        Log.i("CommandHandlerService", "Google API Client connection has been suspended.");
    }

    ()
    {
        this$0 = CommandHandlerService.this;
        super();
    }
}
