// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.zzbf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzvn, zzlx, zzvj, zzve, 
//            zzvi, zzlv, zzvv, zzvt, 
//            zzvk, zzvh, zzvm

public class zzvg
{
    public static interface zza
    {

        public abstract void zza(zzvk zzvk);
    }

    class zzb extends zzvt
    {

        final zzvg zzaBU;
        private final zza zzaBV;

        protected zzvt.zzb zza(zzve zzve1)
        {
            return null;
        }

        protected void zza(zzvk zzvk1)
        {
            zzvk.zza zza1 = zzvk1.zzuo();
            zzaBU.zza(zza1);
            if (zza1.getStatus() == Status.zzNo && zza1.zzup() == zzvk.zza.zza.zzaCf && zza1.zzuq() != null && zza1.zzuq().length > 0)
            {
                zzvg.zza(zzaBU).zzf(zza1.zzur().zzuj(), zza1.zzuq());
                zzbf.zzab("Resource successfully load from Network.");
                zzaBV.zza(zzvk1);
                return;
            }
            StringBuilder stringbuilder = new StringBuilder("Response status: ");
            if (zza1.getStatus().isSuccess())
            {
                zzvk1 = "SUCCESS";
            } else
            {
                zzvk1 = "FAILURE";
            }
            zzbf.zzab(stringbuilder.append(zzvk1).toString());
            if (zza1.getStatus().isSuccess())
            {
                zzbf.zzab((new StringBuilder("Response source: ")).append(zza1.zzup().toString()).toString());
                zzbf.zzab((new StringBuilder("Response size: ")).append(zza1.zzuq().length).toString());
            }
            zzaBU.zza(zza1.zzur(), zzaBV);
        }

        zzb(zzvj zzvj1, zzvh zzvh, zza zza1)
        {
            zzaBU = zzvg.this;
            super(zzvj1, zzvh);
            zzaBV = zza1;
        }
    }

    static class zzc
    {

        private Object mData;
        private Status zzHb;
        private long zzaBW;

        public void zzD(Object obj)
        {
            mData = obj;
        }

        public void zzJ(long l)
        {
            zzaBW = l;
        }

        public void zzaO(Status status)
        {
            zzHb = status;
        }

        public long zzum()
        {
            return zzaBW;
        }

        public zzc(Status status, Object obj, long l)
        {
            zzHb = status;
            mData = obj;
            zzaBW = l;
        }
    }


    private final Context mContext;
    private final zzvn zzaBP;
    Map zzaBQ;
    private final Map zzaBR;
    private String zzaya;
    private final zzlv zzmW;

    public zzvg(Context context)
    {
        this(context, ((Map) (new HashMap())), new zzvn(context), zzlx.zzkc());
    }

    zzvg(Context context, Map map, zzvn zzvn1, zzlv zzlv1)
    {
        zzaya = null;
        zzaBQ = new HashMap();
        mContext = context;
        zzmW = zzlv1;
        zzaBP = zzvn1;
        zzaBR = map;
    }

    static zzvn zza(zzvg zzvg1)
    {
        return zzvg1.zzaBP;
    }

    private void zza(zzvj zzvj1, zza zza1)
    {
        boolean flag = true;
        zzvj1 = zzvj1.zzun();
        if (zzvj1.size() != 1)
        {
            flag = false;
        }
        zzx.zzO(flag);
        zza((zzve)zzvj1.get(0), zza1);
    }

    void zza(zzve zzve1, zza zza1)
    {
        zzaBP.zza(zzve1.zzuj(), zzve1.zzuh(), zzvi.zzaBX, new zzvm(zzve1, zza1) {

            final zzve zzaBS;
            final zza zzaBT;
            final zzvg zzaBU;

            public void zza(Status status, Object obj, Integer integer, long l)
            {
                if (status.isSuccess())
                {
                    if (integer == zzvn.zzaCx)
                    {
                        status = zzvk.zza.zza.zzaCh;
                    } else
                    {
                        status = zzvk.zza.zza.zzaCg;
                    }
                    status = new zzvk.zza(Status.zzNo, zzaBS, null, (zzvl.zzc)obj, status, l);
                } else
                {
                    status = new zzvk.zza(new Status(16, (new StringBuilder("There is no valid resource for the container: ")).append(zzaBS.getContainerId()).toString()), null, zzvk.zza.zza.zzaCg);
                }
                zzaBT.zza(new zzvk(status));
            }

            
            {
                zzaBU = zzvg.this;
                zzaBS = zzve1;
                zzaBT = zza1;
                super();
            }
        });
    }

    void zza(zzvj zzvj1, zza zza1, zzvt zzvt)
    {
        Iterator iterator = zzvj1.zzun().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            zzve zzve1 = (zzve)iterator.next();
            zzc zzc1 = (zzc)zzaBQ.get(zzve1.getContainerId());
            long l;
            if (zzc1 != null)
            {
                l = zzc1.zzum();
            } else
            {
                l = zzaBP.zzdD(zzve1.getContainerId());
            }
            if (l + 0xdbba0L < zzmW.currentTimeMillis())
            {
                flag = true;
            }
        } while (true);
        if (flag)
        {
            zza1 = (zzvv)zzaBR.get(zzvj1.getId());
            if (zza1 == null)
            {
                if (zzaya == null)
                {
                    zza1 = new zzvv();
                } else
                {
                    zza1 = new zzvv(zzaya);
                }
                zzaBR.put(zzvj1.getId(), zza1);
            }
            zza1.zza(mContext, zzvj1, 0L, zzvt);
            return;
        } else
        {
            zza(zzvj1, zza1);
            return;
        }
    }

    void zza(zzvk.zza zza1)
    {
        Object obj = zza1.zzur().getContainerId();
        Status status = zza1.getStatus();
        zza1 = zza1.zzus();
        if (zzaBQ.containsKey(obj))
        {
            obj = (zzc)zzaBQ.get(obj);
            ((zzc) (obj)).zzJ(zzmW.currentTimeMillis());
            if (status == Status.zzNo)
            {
                ((zzc) (obj)).zzaO(status);
                ((zzc) (obj)).zzD(zza1);
            }
            return;
        } else
        {
            zzaBQ.put(obj, new zzc(status, zza1, zzmW.currentTimeMillis()));
            return;
        }
    }

    public void zza(String s, Integer integer, String s1, zza zza1)
    {
        s = (new zzvj()).zzb(new zzve(s, integer, s1, false));
        zza(((zzvj) (s)), zza1, ((zzvt) (new zzb(s, zzvi.zzaBX, zza1))));
    }

    public void zzdx(String s)
    {
        zzaya = s;
    }
}
