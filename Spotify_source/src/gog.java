// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy.NetworkOperatorConnectivityChecker;

public final class gog extends BroadcastReceiver
{

    private NetworkOperatorConnectivityChecker a;

    public gog(NetworkOperatorConnectivityChecker networkoperatorconnectivitychecker)
    {
        a = networkoperatorconnectivitychecker;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        switch (com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy.NetworkOperatorConnectivityChecker._cls2.a[NetworkOperatorConnectivityChecker.b(a).ordinal()])
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
            NetworkOperatorConnectivityChecker.a(a);
            return;

        case 3: // '\003'
            NetworkOperatorConnectivityChecker.a(a);
            break;
        }
    }
}
