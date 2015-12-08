// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.google.android.gms.common.ConnectionResult;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.calling:
//            CallAgent

final class this._cls0
    implements com.google.android.gms.common.api.._cls0
{

    final CallAgent this$0;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        CallAgent.access$400().info("Failed to connect to Google Play Services.");
    }

    sult()
    {
        this$0 = CallAgent.this;
        super();
    }
}
