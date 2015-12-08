// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer, d, r, n, 
//            bh, v, cd, o

public class TagManager
{
    static interface a
    {

        public abstract o a(Context context, TagManager tagmanager, Looper looper, String s, int i, r r1);
    }


    private static TagManager aay;
    private final DataLayer WK;
    private final r Zg;
    private final a aaw;
    private final ConcurrentMap aax;
    private final Context mContext;

    TagManager(Context context, a a1, DataLayer datalayer)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            aaw = a1;
            aax = new ConcurrentHashMap();
            WK = datalayer;
            WK.a(new DataLayer.b() {

                final TagManager aaz;

                public void y(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.a(aaz, map.toString());
                    }
                }

            
            {
                aaz = TagManager.this;
                super();
            }
            });
            WK.a(new d(mContext));
            Zg = new r();
            return;
        }
    }

    static void a(TagManager tagmanager, String s)
    {
        tagmanager.bT(s);
    }

    private void bT(String s)
    {
        for (Iterator iterator = aax.keySet().iterator(); iterator.hasNext(); ((n)iterator.next()).bp(s)) { }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (aay != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        bh.w("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        aay = new TagManager(context, new a() {

            public o a(Context context1, TagManager tagmanager, Looper looper, String s, int i, r r1)
            {
                return new o(context1, tagmanager, looper, s, i, r1);
            }

        }, new DataLayer(new v(context)));
        context = aay;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    void a(n n1)
    {
        aax.put(n1, Boolean.valueOf(true));
    }

    boolean b(n n1)
    {
        return aax.remove(n1) != null;
    }

    boolean g(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = cd.kT();
        if (!((cd) (obj)).g(uri)) goto _L2; else goto _L1
_L1:
        int i;
        uri = ((cd) (obj)).getContainerId();
        static class _cls3
        {

            static final int aaA[];

            static 
            {
                aaA = new int[cd.a.values().length];
                try
                {
                    aaA[cd.a.YT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    aaA[cd.a.YU.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    aaA[cd.a.YV.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        i = _cls3.aaA[((cd) (obj)).kU().ordinal()];
        i;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 68
    //                   2 130
    //                   3 130;
           goto _L3 _L4 _L5 _L5
_L3:
        boolean flag = true;
_L9:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        obj = aax.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            n n1 = (n)((Iterator) (obj)).next();
            if (n1.getContainerId().equals(uri))
            {
                n1.br(null);
                n1.refresh();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = aax.keySet().iterator();
_L7:
        n n2;
        while (iterator.hasNext()) 
        {
            n2 = (n)iterator.next();
            if (!n2.getContainerId().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            n2.br(((cd) (obj)).kV());
            n2.refresh();
        }
          goto _L3
        if (n2.ke() == null) goto _L7; else goto _L6
_L6:
        n2.br(null);
        n2.refresh();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }

    public DataLayer getDataLayer()
    {
        return WK;
    }

    public PendingResult loadContainerDefaultOnly(String s, int i)
    {
        s = aaw.a(mContext, this, null, s, i, Zg);
        s.kh();
        return s;
    }

    public PendingResult loadContainerDefaultOnly(String s, int i, Handler handler)
    {
        s = aaw.a(mContext, this, handler.getLooper(), s, i, Zg);
        s.kh();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int i)
    {
        s = aaw.a(mContext, this, null, s, i, Zg);
        s.kj();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int i, Handler handler)
    {
        s = aaw.a(mContext, this, handler.getLooper(), s, i, Zg);
        s.kj();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int i)
    {
        s = aaw.a(mContext, this, null, s, i, Zg);
        s.ki();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int i, Handler handler)
    {
        s = aaw.a(mContext, this, handler.getLooper(), s, i, Zg);
        s.ki();
        return s;
    }

    public void setVerboseLoggingEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 5;
        }
        bh.setLogLevel(byte0);
    }
}
