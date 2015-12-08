// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer, zzd, zzs, zzbg, 
//            zzw, zzcu, zzo, zzct, 
//            zzp

public class TagManager
{
    public static interface zza
    {

        public abstract zzp zza(Context context, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1);
    }


    private static TagManager zzaOb;
    private final Context mContext;
    private final DataLayer zzaKz;
    private final zzs zzaMV;
    private final zza zzaNY;
    private final zzct zzaNZ;
    private final ConcurrentMap zzaOa;

    TagManager(Context context, zza zza1, DataLayer datalayer, zzct zzct1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            mContext = context.getApplicationContext();
            zzaNZ = zzct1;
            zzaNY = zza1;
            zzaOa = new ConcurrentHashMap();
            zzaKz = datalayer;
            zzaKz.zza(new DataLayer.zzb() {

                final TagManager zzaOc;

                public void zzF(Map map)
                {
                    map = ((Map) (map.get("event")));
                    if (map != null)
                    {
                        TagManager.zza(zzaOc, map.toString());
                    }
                }

            
            {
                zzaOc = TagManager.this;
                super();
            }
            });
            zzaKz.zza(new zzd(mContext));
            zzaMV = new zzs();
            zzzE();
            return;
        }
    }

    public static TagManager getInstance(Context context)
    {
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorenter ;
        if (zzaOb != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        zzbg.zzaz("TagManager.getInstance requires non-null context.");
        throw new NullPointerException();
        context;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        throw context;
        zzaOb = new TagManager(context, new zza() {

            public zzp zza(Context context1, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
            {
                return new zzp(context1, tagmanager, looper, s, i, zzs1);
            }

        }, new DataLayer(new zzw(context)), zzcu.zzzz());
        context = zzaOb;
        com/google/android/gms/tagmanager/TagManager;
        JVM INSTR monitorexit ;
        return context;
    }

    static void zza(TagManager tagmanager, String s)
    {
        tagmanager.zzeF(s);
    }

    private void zzeF(String s)
    {
        for (Iterator iterator = zzaOa.keySet().iterator(); iterator.hasNext(); ((zzo)iterator.next()).zzeh(s)) { }
    }

    private void zzzE()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            mContext.registerComponentCallbacks(new ComponentCallbacks2() {

                final TagManager zzaOc;

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
                        zzaOc.dispatch();
                    }
                }

            
            {
                zzaOc = TagManager.this;
                super();
            }
            });
        }
    }

    public void dispatch()
    {
        zzaNZ.dispatch();
    }

    public DataLayer getDataLayer()
    {
        return zzaKz;
    }

    void zza(zzo zzo1)
    {
        zzaOa.put(zzo1, Boolean.valueOf(true));
    }

    boolean zzb(zzo zzo1)
    {
        return zzaOa.remove(zzo1) != null;
    }

    public PendingResult zzc(String s, int i, String s1)
    {
        s = zzaNY.zza(mContext, this, null, s, i, zzaMV);
        s.load(s1);
        return s;
    }
}
