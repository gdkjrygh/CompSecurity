// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer, d, s, ContainerHolder, 
//            bg, w, ServiceManagerImpl, cu, 
//            PreviewManager

public class TagManager
{
    static class a
    {

        a()
        {
        }
    }


    private static TagManager aQl;
    private final s aMC;
    private final DataLayer aMx;
    private final a aQh;
    private final cu aQi;
    private final ConcurrentMap aQj;
    private final Context mContext;

    private TagManager(Context context, a a1, DataLayer datalayer, cu cu1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            aQi = cu1;
            aQh = a1;
            aQj = new ConcurrentHashMap();
            aMx = datalayer;
            aMx.a(new DataLayer.b() {

                final TagManager aQm;

                public final void E(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.a(aQm, map.toString());
                    }
                }

            
            {
                aQm = TagManager.this;
                super();
            }
            });
            aMx.a(new d(mContext));
            aMC = new s();
            tZ();
            return;
        }
    }

    static void a(TagManager tagmanager, String s1)
    {
        tagmanager.dV(s1);
    }

    private void dV(String s1)
    {
        for (Iterator iterator = aQj.keySet().iterator(); iterator.hasNext(); ((ContainerHolder)iterator.next()).ds(s1)) { }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (aQl != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        bg.e("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        aQl = new TagManager(context, new a(), new DataLayer(new w(context)), ServiceManagerImpl.getInstance());
        context = aQl;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    private void tZ()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mContext.registerComponentCallbacks(new ComponentCallbacks2() {

                final TagManager aQm;

                public final void onConfigurationChanged(Configuration configuration)
                {
                }

                public final void onLowMemory()
                {
                }

                public final void onTrimMemory(int i)
                {
                    if (i == 20)
                    {
                        aQm.dispatch();
                    }
                }

            
            {
                aQm = TagManager.this;
                super();
            }
            });
        }
    }

    final boolean b$7f9baf3(ContainerHolder containerholder)
    {
        return aQj.remove(containerholder) != null;
    }

    public final void dispatch()
    {
        aQi.dispatch();
    }

    final boolean k(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = PreviewManager.getInstance();
        if (!((PreviewManager) (obj)).k(uri)) goto _L2; else goto _L1
_L1:
        int i;
        uri = ((PreviewManager) (obj)).getContainerId();
        static final class _cls4
        {

            static final int aQn[];

            static 
            {
                aQn = new int[PreviewManager.a.values().length];
                try
                {
                    aQn[PreviewManager.a.aOG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    aQn[PreviewManager.a.aOH.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    aQn[PreviewManager.a.aOI.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        i = _cls4.aQn[((PreviewManager) (obj)).tm().ordinal()];
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
        obj = aQj.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ContainerHolder containerholder = (ContainerHolder)((Iterator) (obj)).next();
            if (containerholder.getContainerId().equals(uri))
            {
                containerholder.du(null);
                containerholder.refresh();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = aQj.keySet().iterator();
_L7:
        ContainerHolder containerholder1;
        while (iterator.hasNext()) 
        {
            containerholder1 = (ContainerHolder)iterator.next();
            if (!containerholder1.getContainerId().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            containerholder1.du(((PreviewManager) (obj)).tn());
            containerholder1.refresh();
        }
          goto _L3
        if (containerholder1.sx() == null) goto _L7; else goto _L6
_L6:
        containerholder1.du(null);
        containerholder1.refresh();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }
}
