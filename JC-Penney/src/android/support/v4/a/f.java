// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package android.support.v4.a:
//            g, h, i

public class f
{

    private static final Object f = new Object();
    private static f g;
    private final Context a;
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();
    private final ArrayList d = new ArrayList();
    private final Handler e;

    private f(Context context)
    {
        a = context;
        e = new g(this, context.getMainLooper());
    }

    public static f a(Context context)
    {
        synchronized (f)
        {
            if (g == null)
            {
                g = new f(context.getApplicationContext());
            }
            context = g;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void a()
    {
_L4:
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int j = d.size();
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        h ah[];
        ah = new h[j];
        d.toArray(ah);
        d.clear();
        obj;
        JVM INSTR monitorexit ;
        j = 0;
_L2:
        if (j < ah.length)
        {
            obj = ah[j];
            for (int k = 0; k < ((h) (obj)).b.size(); k++)
            {
                ((i)((h) (obj)).b.get(k)).b.onReceive(a, ((h) (obj)).a);
            }

            break MISSING_BLOCK_LABEL_112;
        }
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(f f1)
    {
        f1.a();
    }

    public void a(BroadcastReceiver broadcastreceiver)
    {
        HashMap hashmap = b;
        hashmap;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)b.remove(broadcastreceiver);
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        hashmap;
        JVM INSTR monitorexit ;
        return;
_L15:
        int k;
        if (k >= arraylist.size()) goto _L4; else goto _L3
_L3:
        IntentFilter intentfilter = (IntentFilter)arraylist.get(k);
        int l = 0;
_L13:
        String s;
        ArrayList arraylist1;
        if (l >= intentfilter.countActions())
        {
            break; /* Loop/switch isn't completed */
        }
        s = intentfilter.getAction(l);
        arraylist1 = (ArrayList)c.get(s);
        if (arraylist1 == null) goto _L6; else goto _L5
_L5:
        int j = 0;
_L11:
        if (j >= arraylist1.size()) goto _L8; else goto _L7
_L7:
        if (((i)arraylist1.get(j)).b != broadcastreceiver) goto _L10; else goto _L9
_L9:
        arraylist1.remove(j);
        j--;
          goto _L10
_L8:
        if (arraylist1.size() <= 0)
        {
            c.remove(s);
        }
        break; /* Loop/switch isn't completed */
_L4:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        broadcastreceiver;
        hashmap;
        JVM INSTR monitorexit ;
        throw broadcastreceiver;
_L2:
        k = 0;
        continue; /* Loop/switch isn't completed */
_L10:
        j++;
        if (true) goto _L11; else goto _L6
_L6:
        l++;
        if (true) goto _L13; else goto _L12
_L12:
        k++;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public void a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        HashMap hashmap = b;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj;
        i j;
        j = new i(intentfilter, broadcastreceiver);
        obj = (ArrayList)b.get(broadcastreceiver);
        ArrayList arraylist;
        arraylist = ((ArrayList) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        arraylist = new ArrayList(1);
        b.put(broadcastreceiver, arraylist);
        arraylist.add(intentfilter);
        int k = 0;
_L2:
        if (k >= intentfilter.countActions())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = intentfilter.getAction(k);
        arraylist = (ArrayList)c.get(obj);
        broadcastreceiver = arraylist;
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        broadcastreceiver = new ArrayList(1);
        c.put(obj, broadcastreceiver);
        broadcastreceiver.add(j);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        hashmap;
        JVM INSTR monitorexit ;
        return;
        broadcastreceiver;
        hashmap;
        JVM INSTR monitorexit ;
        throw broadcastreceiver;
    }

    public boolean a(Intent intent)
    {
        HashMap hashmap = b;
        hashmap;
        JVM INSTR monitorenter ;
        String s;
        String s1;
        android.net.Uri uri;
        String s2;
        java.util.Set set;
        s = intent.getAction();
        s1 = intent.resolveTypeIfNeeded(a.getContentResolver());
        uri = intent.getData();
        s2 = intent.getScheme();
        set = intent.getCategories();
        ArrayList arraylist;
        Object obj;
        int j;
        ArrayList arraylist1;
        int k;
        int l;
        if ((intent.getFlags() & 8) != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder()).append("Resolving type ").append(s1).append(" scheme ").append(s2).append(" of intent ").append(intent).toString());
        arraylist1 = (ArrayList)c.get(intent.getAction());
        if (arraylist1 == null) goto _L2; else goto _L1
_L1:
        if (j == 0) goto _L4; else goto _L3
_L3:
        Log.v("LocalBroadcastManager", (new StringBuilder()).append("Action list: ").append(arraylist1).toString());
          goto _L4
_L20:
        if (k >= arraylist1.size()) goto _L6; else goto _L5
_L5:
        obj = (i)arraylist1.get(k);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder()).append("Matching against filter ").append(((i) (obj)).a).toString());
        if (!((i) (obj)).c) goto _L8; else goto _L7
_L7:
        if (j == 0) goto _L10; else goto _L9
_L9:
        Log.v("LocalBroadcastManager", "  Filter's target already added");
          goto _L10
_L8:
        l = ((i) (obj)).a.match(s, s1, s2, uri, set, "LocalBroadcastManager");
        if (l < 0) goto _L12; else goto _L11
_L11:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        Log.v("LocalBroadcastManager", (new StringBuilder()).append("  Filter matched!  match=0x").append(Integer.toHexString(l)).toString());
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        arraylist = new ArrayList();
        arraylist.add(obj);
        obj.c = true;
          goto _L10
        intent;
        hashmap;
        JVM INSTR monitorexit ;
        throw intent;
_L12:
        if (j == 0) goto _L10; else goto _L13
_L13:
        l;
        JVM INSTR tableswitch -4 -1: default 372
    //                   -4 516
    //                   -3 510
    //                   -2 522
    //                   -1 528;
           goto _L14 _L15 _L16 _L17 _L18
_L14:
        obj = "unknown reason";
_L21:
        Log.v("LocalBroadcastManager", (new StringBuilder()).append("  Filter did not match: ").append(((String) (obj))).toString());
          goto _L10
_L19:
        if (j >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_434;
        }
        ((i)arraylist.get(j)).c = false;
        j++;
          goto _L19
        d.add(new h(intent, arraylist));
        if (!e.hasMessages(1))
        {
            e.sendEmptyMessage(1);
        }
        hashmap;
        JVM INSTR monitorexit ;
        return true;
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return false;
_L4:
        arraylist = null;
        k = 0;
          goto _L20
_L10:
        k++;
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
        if (arraylist == null) goto _L2; else goto _L22
_L22:
        j = 0;
          goto _L19
    }

}
