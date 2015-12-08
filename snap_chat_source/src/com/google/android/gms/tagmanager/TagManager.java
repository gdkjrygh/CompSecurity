// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer, zzd, zzr, zzbf, 
//            zzv, zzct, zzn, zzcs, 
//            zzo, zzca

public class TagManager
{
    public static interface zza
    {

        public abstract zzo zza(Context context, TagManager tagmanager, Looper looper, String s, int i, zzr zzr1);
    }


    private static TagManager zzaAS;
    private final Context mContext;
    private final zza zzaAP;
    private final zzcs zzaAQ;
    private final ConcurrentMap zzaAR;
    private final DataLayer zzaxx;
    private final zzr zzazO;

    TagManager(Context context, zza zza1, DataLayer datalayer, zzcs zzcs1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            zzaAQ = zzcs1;
            zzaAP = zza1;
            zzaAR = new ConcurrentHashMap();
            zzaxx = datalayer;
            zzaxx.zza(new DataLayer.zzb() {

                final TagManager zzaAT;

                public void zzI(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.zza(zzaAT, map.toString());
                    }
                }

            
            {
                zzaAT = TagManager.this;
                super();
            }
            });
            zzaxx.zza(new zzd(mContext));
            zzazO = new zzr();
            zztT();
            return;
        }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (zzaAS != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzbf.zzZ("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        zzaAS = new TagManager(context, new zza() {

            public final zzo zza(Context context1, TagManager tagmanager, Looper looper, String s, int i, zzr zzr1)
            {
                return new zzo(context1, tagmanager, looper, s, i, zzr1);
            }

        }, new DataLayer(new zzv(context)), zzct.zztR());
        context = zzaAS;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    static void zza(TagManager tagmanager, String s)
    {
        tagmanager.zzdk(s);
    }

    private void zzdk(String s)
    {
        for (Iterator iterator = zzaAR.keySet().iterator(); iterator.hasNext(); ((zzn)iterator.next()).zzcO(s)) { }
    }

    private void zztT()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mContext.registerComponentCallbacks(new ComponentCallbacks2() {

                final TagManager zzaAT;

                public void onConfigurationChanged(Configuration configuration)
                {
                }

                public void onLowMemory()
                {
                }

                public void onTrimMemory(int i)
                {
                    if (i == 20)
                    {
                        zzaAT.dispatch();
                    }
                }

            
            {
                zzaAT = TagManager.this;
                super();
            }
            });
        }
    }

    public void dispatch()
    {
        zzaAQ.dispatch();
    }

    public DataLayer getDataLayer()
    {
        return zzaxx;
    }

    void zza(zzn zzn1)
    {
        zzaAR.put(zzn1, Boolean.valueOf(true));
    }

    boolean zzb(zzn zzn1)
    {
        return zzaAR.remove(zzn1) != null;
    }

    public PendingResult zzc(String s, int i, String s1)
    {
        s = zzaAP.zza(mContext, this, null, s, i, zzazO);
        s.load(s1);
        return s;
    }

    boolean zzl(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = zzca.zztx();
        if (!((zzca) (obj)).zzl(uri)) goto _L2; else goto _L1
_L1:
        int i;
        uri = ((zzca) (obj)).getContainerId();
        static class _cls4
        {

            static final int zzaAU[];

            static 
            {
                zzaAU = new int[zzca.zza.values().length];
                try
                {
                    zzaAU[zzca.zza.zzazB.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    zzaAU[zzca.zza.zzazC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    zzaAU[zzca.zza.zzazD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        i = _cls4.zzaAU[((zzca) (obj)).zzty().ordinal()];
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
        obj = zzaAR.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            zzn zzn1 = (zzn)((Iterator) (obj)).next();
            if (zzn1.getContainerId().equals(uri))
            {
                zzn1.zzcQ(null);
                zzn1.refresh();
            }
        }
          goto _L3
        uri;
        throw uri;
_L5:
        Iterator iterator = zzaAR.keySet().iterator();
_L7:
        zzn zzn2;
        while (iterator.hasNext()) 
        {
            zzn2 = (zzn)iterator.next();
            if (!zzn2.getContainerId().equals(uri))
            {
                continue; /* Loop/switch isn't completed */
            }
            zzn2.zzcQ(((zzca) (obj)).zztz());
            zzn2.refresh();
        }
          goto _L3
        if (zzn2.zzsK() == null) goto _L7; else goto _L6
_L6:
        zzn2.zzcQ(null);
        zzn2.refresh();
        if (true) goto _L7; else goto _L8
_L8:
          goto _L3
_L2:
        flag = false;
          goto _L9
    }
}
