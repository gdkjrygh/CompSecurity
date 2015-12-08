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

        public abstract o a(Context context, TagManager tagmanager, Looper looper, String s, int j, r r1);
    }


    private static TagManager aig;
    private final DataLayer aeu;
    private final r agO;
    private final a aie;
    private final ConcurrentMap aif;
    private final Context mContext;

    TagManager(Context context, a a1, DataLayer datalayer)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            aie = a1;
            aif = new ConcurrentHashMap();
            aeu = datalayer;
            aeu.a(new DataLayer.b() {

                final TagManager aih;

                public void x(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.a(aih, map.toString());
                    }
                }

            
            {
                aih = TagManager.this;
                super();
            }
            });
            aeu.a(new d(mContext));
            agO = new r();
            return;
        }
    }

    static void a(TagManager tagmanager, String s)
    {
        tagmanager.cl(s);
    }

    private void cl(String s)
    {
        for (Iterator iterator = aif.keySet().iterator(); iterator.hasNext(); ((n)iterator.next()).bH(s)) { }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (aig != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        bh.A("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        aig = new TagManager(context, new a() {

            public o a(Context context1, TagManager tagmanager, Looper looper, String s, int j, r r1)
            {
                return new o(context1, tagmanager, looper, s, j, r1);
            }

        }, new DataLayer(new v(context)));
        context = aig;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    void a(n n1)
    {
        aif.put(n1, Boolean.valueOf(true));
    }

    boolean b(n n1)
    {
        return aif.remove(n1) != null;
    }

    public DataLayer getDataLayer()
    {
        return aeu;
    }

    boolean i(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = cd.md();
        if (!((cd) (obj)).i(uri)) goto _L2; else goto _L1
_L1:
        int j;
        uri = ((cd) (obj)).getContainerId();
        static class _cls3
        {

            static final int aii[];

            static 
            {
                aii = new int[cd.a.values().length];
                try
                {
                    aii[cd.a.agB.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    aii[cd.a.agC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    aii[cd.a.agD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        j = _cls3.aii[((cd) (obj)).me().ordinal()];
        j;
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
        obj = aif.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            n n1 = (n)((Iterator) (obj)).next();
            if (n1.getContainerId().equals(uri))
            {
                n1.bJ(null);
                n1.refresh();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = aif.keySet().iterator();
_L7:
        n n2;
        while (iterator.hasNext()) 
        {
            n2 = (n)iterator.next();
            if (!n2.getContainerId().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            n2.bJ(((cd) (obj)).mf());
            n2.refresh();
        }
          goto _L3
        if (n2.lo() == null) goto _L7; else goto _L6
_L6:
        n2.bJ(null);
        n2.refresh();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }

    public PendingResult loadContainerDefaultOnly(String s, int j)
    {
        s = aie.a(mContext, this, null, s, j, agO);
        s.lr();
        return s;
    }

    public PendingResult loadContainerDefaultOnly(String s, int j, Handler handler)
    {
        s = aie.a(mContext, this, handler.getLooper(), s, j, agO);
        s.lr();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int j)
    {
        s = aie.a(mContext, this, null, s, j, agO);
        s.lt();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int j, Handler handler)
    {
        s = aie.a(mContext, this, handler.getLooper(), s, j, agO);
        s.lt();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int j)
    {
        s = aie.a(mContext, this, null, s, j, agO);
        s.ls();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int j, Handler handler)
    {
        s = aie.a(mContext, this, handler.getLooper(), s, j, agO);
        s.ls();
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
