// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
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
//            bh, v, cy, cx, 
//            ce, o

public class TagManager
{
    static interface a
    {

        public abstract o a(Context context, TagManager tagmanager, Looper looper, String s, int j, r r1);
    }


    private static TagManager atW;
    private final DataLayer aqn;
    private final r asD;
    private final a atT;
    private final cx atU;
    private final ConcurrentMap atV;
    private final Context mContext;

    TagManager(Context context, a a1, DataLayer datalayer, cx cx1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            atU = cx1;
            atT = a1;
            atV = new ConcurrentHashMap();
            aqn = datalayer;
            aqn.a(new DataLayer.b() {

                final TagManager atX;

                public void C(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.a(atX, map.toString());
                    }
                }

            
            {
                atX = TagManager.this;
                super();
            }
            });
            aqn.a(new d(mContext));
            asD = new r();
            qP();
            return;
        }
    }

    static void a(TagManager tagmanager, String s)
    {
        tagmanager.cV(s);
    }

    private void cV(String s)
    {
        for (Iterator iterator = atV.keySet().iterator(); iterator.hasNext(); ((n)iterator.next()).cr(s)) { }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (atW != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        bh.T("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        atW = new TagManager(context, new a() {

            public o a(Context context1, TagManager tagmanager, Looper looper, String s, int j, r r1)
            {
                return new o(context1, tagmanager, looper, s, j, r1);
            }

        }, new DataLayer(new v(context)), cy.qN());
        context = atW;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    private void qP()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mContext.registerComponentCallbacks(new ComponentCallbacks2() {

                final TagManager atX;

                public void onConfigurationChanged(Configuration configuration)
                {
                }

                public void onLowMemory()
                {
                }

                public void onTrimMemory(int j)
                {
                    if (j == 20)
                    {
                        atX.dispatch();
                    }
                }

            
            {
                atX = TagManager.this;
                super();
            }
            });
        }
    }

    void a(n n1)
    {
        atV.put(n1, Boolean.valueOf(true));
    }

    boolean b(n n1)
    {
        return atV.remove(n1) != null;
    }

    public void dispatch()
    {
        atU.dispatch();
    }

    public DataLayer getDataLayer()
    {
        return aqn;
    }

    boolean i(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = ce.qa();
        if (!((ce) (obj)).i(uri)) goto _L2; else goto _L1
_L1:
        int j;
        uri = ((ce) (obj)).getContainerId();
        static class _cls4
        {

            static final int atY[];

            static 
            {
                atY = new int[ce.a.values().length];
                try
                {
                    atY[ce.a.asq.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    atY[ce.a.asr.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    atY[ce.a.ass.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        j = _cls4.atY[((ce) (obj)).qb().ordinal()];
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
        obj = atV.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            n n1 = (n)((Iterator) (obj)).next();
            if (n1.getContainerId().equals(uri))
            {
                n1.ct(null);
                n1.refresh();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = atV.keySet().iterator();
_L7:
        n n2;
        while (iterator.hasNext()) 
        {
            n2 = (n)iterator.next();
            if (!n2.getContainerId().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            n2.ct(((ce) (obj)).qc());
            n2.refresh();
        }
          goto _L3
        if (n2.pl() == null) goto _L7; else goto _L6
_L6:
        n2.ct(null);
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
        s = atT.a(mContext, this, null, s, j, asD);
        s.po();
        return s;
    }

    public PendingResult loadContainerDefaultOnly(String s, int j, Handler handler)
    {
        s = atT.a(mContext, this, handler.getLooper(), s, j, asD);
        s.po();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int j)
    {
        s = atT.a(mContext, this, null, s, j, asD);
        s.pq();
        return s;
    }

    public PendingResult loadContainerPreferFresh(String s, int j, Handler handler)
    {
        s = atT.a(mContext, this, handler.getLooper(), s, j, asD);
        s.pq();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int j)
    {
        s = atT.a(mContext, this, null, s, j, asD);
        s.pp();
        return s;
    }

    public PendingResult loadContainerPreferNonDefault(String s, int j, Handler handler)
    {
        s = atT.a(mContext, this, handler.getLooper(), s, j, asD);
        s.pp();
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
