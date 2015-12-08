// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.g;

// Referenced classes of package com.google.android.gms.location.internal:
//            j

private static final class a extends Handler
{

    private final g a;

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
            return;

        case 1: // '\001'
            message = new Location((Location)message.obj);
            break;
        }
        a.a(message);
    }

    public (g g1)
    {
        a = g1;
    }
}
