// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.content.Context;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DataConnectionCallbacks, DataConnectionManager

public interface DcmFactory
{

    public abstract DataConnectionManager build(Context context, DataConnectionCallbacks dataconnectioncallbacks, int i);
}
