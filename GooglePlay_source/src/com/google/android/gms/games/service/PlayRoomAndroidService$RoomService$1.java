// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.games.realtime.network.DataConnectionCallbacks;
import com.google.android.gms.games.realtime.network.DataConnectionManager;
import com.google.android.gms.games.realtime.network.DcmFactory;
import com.google.android.gms.games.realtime.network.LibJingleDataConnectionManager;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayRoomAndroidService

final class this._cls0
    implements DcmFactory
{

    final er this$0;

    public final DataConnectionManager build(Context context, DataConnectionCallbacks dataconnectioncallbacks, int i)
    {
        return new LibJingleDataConnectionManager(context, dataconnectioncallbacks, i);
    }

    er()
    {
        this$0 = this._cls0.this;
        super();
    }
}
