// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GameEventListenerRegistry;
import com.google.android.gms.games.internal.GamesLog;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesServiceBroker, RoomServiceClient, PlayGames1pServiceBroker

public final class PlayGamesAndroidService extends Service
{

    private static final ArrayList sBoundIntents = new ArrayList();

    public PlayGamesAndroidService()
    {
    }

    private static void addBoundIntent(Intent intent)
    {
        GamesLog.d("PlayGamesService", (new StringBuilder("Binding to games service: ")).append(intent).toString());
        ArrayList arraylist = sBoundIntents;
        arraylist;
        JVM INSTR monitorenter ;
        int i = 0;
        int j = sBoundIntents.size();
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (!((Intent)sBoundIntents.get(i)).filterEquals(intent))
        {
            break MISSING_BLOCK_LABEL_98;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        GamesLog.d("PlayGamesService", (new StringBuilder("Adding intent: ")).append(intent).toString());
        sBoundIntents.add(intent);
        arraylist;
        JVM INSTR monitorexit ;
        return;
        intent;
        arraylist;
        JVM INSTR monitorexit ;
        throw intent;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean removeBoundIntent(Intent intent)
    {
        GamesLog.d("PlayGamesService", (new StringBuilder("Unbinding from games service: ")).append(intent).toString());
        ArrayList arraylist = sBoundIntents;
        arraylist;
        JVM INSTR monitorenter ;
        int i = 0;
        int j = sBoundIntents.size();
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        Intent intent1 = (Intent)sBoundIntents.get(i);
        if (!intent1.filterEquals(intent))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        GamesLog.d("PlayGamesService", (new StringBuilder("Removing intent: ")).append(intent1).toString());
        sBoundIntents.remove(i);
        boolean flag;
        if (sBoundIntents.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return flag;
        intent;
        arraylist;
        JVM INSTR monitorexit ;
        throw intent;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.println("Dumping PlayGames service cache");
        printwriter.println("PlayGames module version: 34120000");
        filedescriptor = sBoundIntents;
        filedescriptor;
        JVM INSTR monitorenter ;
        int i = 0;
        int j = sBoundIntents.size();
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        printwriter.println((new StringBuilder("Bound intent: ")).append(sBoundIntents.get(i)).toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        filedescriptor;
        JVM INSTR monitorexit ;
        PlayGamesServiceBroker.dumpCachedServiceInstances(printwriter);
        RoomServiceClient.Holder.access$100().dump(printwriter);
        GameEventListenerRegistry.getInstance().dump(printwriter);
        filedescriptor = DataBroker.acquireBroker(this);
        filedescriptor.dump(printwriter);
        filedescriptor.release();
        return;
        printwriter;
        filedescriptor;
        JVM INSTR monitorexit ;
        throw printwriter;
        printwriter;
        filedescriptor.release();
        throw printwriter;
    }

    public final IBinder onBind(Intent intent)
    {
        String s = intent.getAction();
        if ("com.google.android.gms.games.service.START".equals(s))
        {
            addBoundIntent(intent);
            return (new PlayGamesServiceBroker(this)).asBinder();
        }
        if ("com.google.android.play.games.service.START_1P".equals(s))
        {
            addBoundIntent(intent);
            return (new PlayGames1pServiceBroker(this)).asBinder();
        } else
        {
            return null;
        }
    }

    public final void onRebind(Intent intent)
    {
        String s = intent.getAction();
        if ("com.google.android.gms.games.service.START".equals(s) || "com.google.android.play.games.service.START_1P".equals(s))
        {
            addBoundIntent(intent);
        }
    }

    public final boolean onUnbind(Intent intent)
    {
        if (removeBoundIntent(intent))
        {
            GamesLog.d("PlayGamesService", "Unbound from all clients. Cleaning up.");
            PlayGamesServiceBroker.unbindCachedServiceInstances();
        }
        return true;
    }

}
