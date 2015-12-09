// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog;

import android.app.PendingIntent;

// Referenced classes of package com.google.android.gms.playlog:
//            PlayLogger

public static interface 
{

    public abstract void onLoggerConnected();

    public abstract void onLoggerFailedConnection();

    public abstract void onLoggerFailedConnectionWithResolution(PendingIntent pendingintent);
}
