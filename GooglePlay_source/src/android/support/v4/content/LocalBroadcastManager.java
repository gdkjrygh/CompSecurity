// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

public final class LocalBroadcastManager
{
    private class BroadcastRecord
    {

        final Intent intent;
        final ArrayList receivers;

        BroadcastRecord(Intent intent1, ArrayList arraylist)
        {
            intent = intent1;
            receivers = arraylist;
        }
    }

    private class ReceiverRecord
    {

        boolean broadcasting;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(128);
            stringbuilder.append("Receiver{");
            stringbuilder.append(receiver);
            stringbuilder.append(" filter=");
            stringbuilder.append(filter);
            stringbuilder.append("}");
            return stringbuilder.toString();
        }
    }


    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final HashMap mActions = new HashMap();
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList mPendingBroadcasts = new ArrayList();
    private final HashMap mReceivers = new HashMap();

    private LocalBroadcastManager(Context context)
    {
        mAppContext = context;
        mHandler = new Handler(context.getMainLooper()) ;
    }

    public static LocalBroadcastManager getInstance(Context context)
    {
        synchronized (mLock)
        {
            if (mInstance == null)
            {
                mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            context = mInstance;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public final boolean sendBroadcast(Intent intent)
    {
        HashMap hashmap = mReceivers;
        hashmap;
        JVM INSTR monitorenter ;
        String s;
        String s1;
        android.net.Uri uri;
        String s2;
        java.util.Set set;
        s = intent.getAction();
        s1 = intent.resolveTypeIfNeeded(mAppContext.getContentResolver());
        uri = intent.getData();
        s2 = intent.getScheme();
        set = intent.getCategories();
        Object obj;
        Object obj1;
        int i;
        ArrayList arraylist;
        ReceiverRecord receiverrecord;
        int j;
        int k;
        if ((intent.getFlags() & 8) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder("Resolving type ")).append(s1).append(" scheme ").append(s2).append(" of intent ").append(intent).toString());
        arraylist = (ArrayList)mActions.get(intent.getAction());
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        if (i == 0) goto _L4; else goto _L3
_L3:
        Log.v("LocalBroadcastManager", (new StringBuilder("Action list: ")).append(arraylist).toString());
          goto _L4
_L20:
        if (j >= arraylist.size()) goto _L6; else goto _L5
_L5:
        receiverrecord = (ReceiverRecord)arraylist.get(j);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder("Matching against filter ")).append(receiverrecord.filter).toString());
        if (!receiverrecord.broadcasting) goto _L8; else goto _L7
_L7:
        obj = obj1;
        if (i == 0) goto _L10; else goto _L9
_L9:
        Log.v("LocalBroadcastManager", "  Filter's target already added");
        obj = obj1;
          goto _L10
_L8:
        k = receiverrecord.filter.match(s, s1, s2, uri, set, "LocalBroadcastManager");
        if (k < 0) goto _L12; else goto _L11
_L11:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder("  Filter matched!  match=0x")).append(Integer.toHexString(k)).toString());
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        obj = new ArrayList();
        ((ArrayList) (obj)).add(receiverrecord);
        receiverrecord.broadcasting = true;
          goto _L10
        intent;
        hashmap;
        JVM INSTR monitorexit ;
        throw intent;
_L12:
        obj = obj1;
        if (i == 0) goto _L10; else goto _L13
_L13:
        k;
        JVM INSTR tableswitch -4 -1: default 372
    //                   -4 511
    //                   -3 505
    //                   -2 517
    //                   -1 523;
           goto _L14 _L15 _L16 _L17 _L18
_L14:
        obj = "unknown reason";
_L21:
        Log.v("LocalBroadcastManager", (new StringBuilder("  Filter did not match: ")).append(((String) (obj))).toString());
        obj = obj1;
          goto _L10
_L19:
        if (i >= ((ArrayList) (obj1)).size())
        {
            break MISSING_BLOCK_LABEL_433;
        }
        ((ReceiverRecord)((ArrayList) (obj1)).get(i)).broadcasting = false;
        i++;
          goto _L19
        mPendingBroadcasts.add(new BroadcastRecord(intent, ((ArrayList) (obj1))));
        if (!mHandler.hasMessages(1))
        {
            mHandler.sendEmptyMessage(1);
        }
        hashmap;
        JVM INSTR monitorexit ;
        return true;
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return false;
_L4:
        obj1 = null;
        j = 0;
          goto _L20
_L10:
        j++;
        obj1 = obj;
          goto _L20
_L16:
        obj = "action";
          goto _L21
_L15:
        obj = "category";
          goto _L21
_L17:
        obj = "data";
          goto _L21
_L18:
        obj = "type";
          goto _L21
_L6:
        if (obj1 == null) goto _L2; else goto _L22
_L22:
        i = 0;
          goto _L19
    }



/*
    static void access$000(LocalBroadcastManager localbroadcastmanager)
    {
_L4:
        Object obj = localbroadcastmanager.mReceivers;
        obj;
        JVM INSTR monitorenter ;
        int i = localbroadcastmanager.mPendingBroadcasts.size();
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        BroadcastRecord abroadcastrecord[];
        abroadcastrecord = new BroadcastRecord[i];
        localbroadcastmanager.mPendingBroadcasts.toArray(abroadcastrecord);
        localbroadcastmanager.mPendingBroadcasts.clear();
        obj;
        JVM INSTR monitorexit ;
        i = 0;
_L2:
        if (i < abroadcastrecord.length)
        {
            obj = abroadcastrecord[i];
            for (int j = 0; j < ((BroadcastRecord) (obj)).receivers.size(); j++)
            {
                ((ReceiverRecord)((BroadcastRecord) (obj)).receivers.get(j)).receiver.onReceive(localbroadcastmanager.mAppContext, ((BroadcastRecord) (obj)).intent);
            }

            break MISSING_BLOCK_LABEL_112;
        }
        continue; /* Loop/switch isn't completed */
        localbroadcastmanager;
        obj;
        JVM INSTR monitorexit ;
        throw localbroadcastmanager;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        if (true) goto _L4; else goto _L3
_L3:
        return;
    }

*/
}
