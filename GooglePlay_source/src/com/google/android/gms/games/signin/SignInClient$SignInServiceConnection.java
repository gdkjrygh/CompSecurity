// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.games.internal.GamesLog;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.signin:
//            SignInClient

final class mContext
    implements ServiceConnection
{

    final Context mContext;
    final SignInClient this$0;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (!"com.google.android.gms.games.internal.IGamesSignInService".equals(ibinder.getInterfaceDescriptor()))
        {
            break MISSING_BLOCK_LABEL_89;
        }
        mService = com.google.android.gms.games.internal.ontext(ibinder);
        this;
        JVM INSTR monitorenter ;
        int j = mConnectionListeners.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((e)mConnectionListeners.get(i)).nnected();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        componentname;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw componentname;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            GamesLog.e("SignInClient", "Unable to connect to sign-in service");
        }
        ConnectionTracker.getInstance().unbindService(mContext, this);
        mConnection = null;
        mConnectionFailedListener.onConnectionFailed();
        return;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        this;
        JVM INSTR monitorenter ;
        int j = mConnectionListeners.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        mConnectionListeners.get(i);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        componentname;
        this;
        JVM INSTR monitorexit ;
        throw componentname;
    }

    public er(Context context)
    {
        this$0 = SignInClient.this;
        super();
        mContext = context;
    }
}
