// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

public final class em
{

    private static final Object f = new Object();
    private static em g;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    private final Context c;
    private final ArrayList d = new ArrayList();
    private final Handler e;

    private em(Context context)
    {
        c = context;
        e = new en(this, context.getMainLooper());
    }

    public static em a(Context context)
    {
        synchronized (f)
        {
            if (g == null)
            {
                g = new em(context.getApplicationContext());
            }
            context = g;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(em em1)
    {
_L4:
        Object obj = em1.a;
        obj;
        JVM INSTR monitorenter ;
        int i = em1.d.size();
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        eo aeo[];
        aeo = new eo[i];
        em1.d.toArray(aeo);
        em1.d.clear();
        obj;
        JVM INSTR monitorexit ;
        i = 0;
_L2:
        if (i < aeo.length)
        {
            obj = aeo[i];
            for (int j = 0; j < ((eo) (obj)).b.size(); j++)
            {
                ((ep)((eo) (obj)).b.get(j)).b.onReceive(em1.c, ((eo) (obj)).a);
            }

            break MISSING_BLOCK_LABEL_112;
        }
        continue; /* Loop/switch isn't completed */
        em1;
        obj;
        JVM INSTR monitorexit ;
        throw em1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(BroadcastReceiver broadcastreceiver, IntentFilter intentfilter)
    {
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj;
        ep ep1;
        ep1 = new ep(intentfilter, broadcastreceiver);
        obj = (ArrayList)a.get(broadcastreceiver);
        ArrayList arraylist;
        arraylist = ((ArrayList) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        arraylist = new ArrayList(1);
        a.put(broadcastreceiver, arraylist);
        arraylist.add(intentfilter);
        int i = 0;
_L2:
        if (i >= intentfilter.countActions())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = intentfilter.getAction(i);
        arraylist = (ArrayList)b.get(obj);
        broadcastreceiver = arraylist;
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        broadcastreceiver = new ArrayList(1);
        b.put(obj, broadcastreceiver);
        broadcastreceiver.add(ep1);
        i++;
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

    public final boolean a(Intent intent)
    {
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        String s;
        String s1;
        android.net.Uri uri;
        String s2;
        java.util.Set set;
        s = intent.getAction();
        s1 = intent.resolveTypeIfNeeded(c.getContentResolver());
        uri = intent.getData();
        s2 = intent.getScheme();
        set = intent.getCategories();
        ArrayList arraylist;
        Object obj;
        int i;
        ArrayList arraylist1;
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
            break MISSING_BLOCK_LABEL_98;
        }
        (new StringBuilder("Resolving type ")).append(s1).append(" scheme ").append(s2).append(" of intent ").append(intent);
        arraylist1 = (ArrayList)b.get(intent.getAction());
        if (arraylist1 == null) goto _L2; else goto _L1
_L1:
        if (i == 0) goto _L4; else goto _L3
_L3:
        (new StringBuilder("Action list: ")).append(arraylist1);
          goto _L4
_L19:
        if (j >= arraylist1.size()) goto _L6; else goto _L5
_L5:
        obj = (ep)arraylist1.get(j);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        (new StringBuilder("Matching against filter ")).append(((ep) (obj)).a);
        if (!((ep) (obj)).c) goto _L8; else goto _L7
_L7:
        if (i == 0);
          goto _L9
_L8:
        k = ((ep) (obj)).a.match(s, s1, s2, uri, set, "LocalBroadcastManager");
        if (k < 0) goto _L11; else goto _L10
_L10:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        (new StringBuilder("  Filter matched!  match=0x")).append(Integer.toHexString(k));
        if (arraylist != null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        arraylist = new ArrayList();
        arraylist.add(obj);
        obj.c = true;
          goto _L9
        intent;
        hashmap;
        JVM INSTR monitorexit ;
        throw intent;
_L11:
        if (i == 0) goto _L9; else goto _L12
_L12:
        k;
        JVM INSTR tableswitch -4 -1: default 320
    //                   -4 453
    //                   -3 447
    //                   -2 459
    //                   -1 465;
           goto _L13 _L14 _L15 _L16 _L17
_L13:
        obj = "unknown reason";
_L20:
        (new StringBuilder("  Filter did not match: ")).append(((String) (obj)));
          goto _L9
_L18:
        if (i >= arraylist.size())
        {
            break MISSING_BLOCK_LABEL_371;
        }
        ((ep)arraylist.get(i)).c = false;
        i++;
          goto _L18
        d.add(new eo(intent, arraylist));
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
        j = 0;
          goto _L19
_L9:
        j++;
          goto _L19
_L15:
        obj = "action";
          goto _L20
_L14:
        obj = "category";
          goto _L20
_L16:
        obj = "data";
          goto _L20
_L17:
        obj = "type";
          goto _L20
_L6:
        if (arraylist == null) goto _L2; else goto _L21
_L21:
        i = 0;
          goto _L18
    }

}
