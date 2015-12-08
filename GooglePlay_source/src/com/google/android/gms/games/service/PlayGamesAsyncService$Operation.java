// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.games.broker.DataBroker;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesAsyncService

public static interface 
{

    public abstract void execute(Context context, DataBroker databroker);

    public abstract void postExecute();
}
