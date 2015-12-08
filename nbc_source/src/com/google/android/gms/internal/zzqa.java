// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.zzbg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqh, zzld, zzqd, zzpy, 
//            zzqc, zzlb, zzqp, zzqn, 
//            zzqe, zzqb, zzqg

public class zzqa
{
    public static interface zza
    {

        public abstract void zza(zzqe zzqe);
    }

    class zzb extends zzqn
    {

        final zzqa zzaPj;
        private final zza zzaPk;

        protected zzqn.zzb zza(zzpy zzpy1)
        {
            return null;
        }

        protected void zza(zzqe zzqe1)
        {
            zzqe.zza zza1 = zzqe1.zzAg();
            zzaPj.zza(zza1);
            if (zza1.getStatus() == Status.zzXP && zza1.zzAh() == zzqe.zza.zza.zzaPu && zza1.zzAi() != null && zza1.zzAi().length > 0)
            {
                zzqa.zza(zzaPj).zze(zza1.zzAj().zzAb(), zza1.zzAi());
                zzbg.zzaB("Resource successfully load from Network.");
                zzaPk.zza(zzqe1);
                return;
            }
            StringBuilder stringbuilder = (new StringBuilder()).append("Response status: ");
            if (zza1.getStatus().isSuccess())
            {
                zzqe1 = "SUCCESS";
            } else
            {
                zzqe1 = "FAILURE";
            }
            zzbg.zzaB(stringbuilder.append(zzqe1).toString());
            if (zza1.getStatus().isSuccess())
            {
                zzbg.zzaB((new StringBuilder()).append("Response source: ").append(zza1.zzAh().toString()).toString());
                zzbg.zzaB((new StringBuilder()).append("Response size: ").append(zza1.zzAi().length).toString());
            }
            zzaPj.zza(zza1.zzAj(), zzaPk);
        }

        zzb(zzqd zzqd1, zzqb zzqb, zza zza1)
        {
            zzaPj = zzqa.this;
            super(zzqd1, zzqb);
            zzaPk = zza1;
        }
    }

    static class zzc
    {

        private Object mData;
        private Status zzOt;
        private long zzaPl;

        public long zzAe()
        {
            return zzaPl;
        }

        public void zzO(Object obj)
        {
            mData = obj;
        }

        public void zzU(long l)
        {
            zzaPl = l;
        }

        public void zzaV(Status status)
        {
            zzOt = status;
        }

        public zzc(Status status, Object obj, long l)
        {
            zzOt = status;
            mData = obj;
            zzaPl = l;
        }
    }


    private final Context mContext;
    private String zzaLc;
    private final zzqh zzaPe;
    Map zzaPf;
    private final Map zzaPg;
    private final zzlb zzpw;

    public zzqa(Context context)
    {
        this(context, ((Map) (new HashMap())), new zzqh(context), zzld.zzoQ());
    }

    zzqa(Context context, Map map, zzqh zzqh1, zzlb zzlb1)
    {
        zzaLc = null;
        zzaPf = new HashMap();
        mContext = context;
        zzpw = zzlb1;
        zzaPe = zzqh1;
        zzaPg = map;
    }

    static zzqh zza(zzqa zzqa1)
    {
        return zzqa1.zzaPe;
    }

    private void zza(zzqd zzqd1, zza zza1)
    {
        boolean flag = true;
        zzqd1 = zzqd1.zzAf();
        if (zzqd1.size() != 1)
        {
            flag = false;
        }
        zzu.zzV(flag);
        zza((zzpy)zzqd1.get(0), zza1);
    }

    void zza(zzpy zzpy1, zza zza1)
    {
        zzaPe.zza(zzpy1.zzAb(), zzpy1.zzzZ(), zzqc.zzaPm, new zzqg(zzpy1, zza1) {

            final zzpy zzaPh;
            final zza zzaPi;
            final zzqa zzaPj;

            public void zza(Status status, Object obj, Integer integer, long l)
            {
                if (status.isSuccess())
                {
                    if (integer == zzqh.zzaPM)
                    {
                        status = zzqe.zza.zza.zzaPw;
                    } else
                    {
                        status = zzqe.zza.zza.zzaPv;
                    }
                    status = new zzqe.zza(Status.zzXP, zzaPh, null, (zzqf.zzc)obj, status, l);
                } else
                {
                    status = new zzqe.zza(new Status(16, (new StringBuilder()).append("There is no valid resource for the container: ").append(zzaPh.getContainerId()).toString()), null, zzqe.zza.zza.zzaPv);
                }
                zzaPi.zza(new zzqe(status));
            }

            
            {
                zzaPj = zzqa.this;
                zzaPh = zzpy1;
                zzaPi = zza1;
                super();
            }
        });
    }

    void zza(zzqd zzqd1, zza zza1, zzqn zzqn)
    {
        Iterator iterator = zzqd1.zzAf().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            zzpy zzpy1 = (zzpy)iterator.next();
            zzc zzc1 = (zzc)zzaPf.get(zzpy1.getContainerId());
            long l;
            if (zzc1 != null)
            {
                l = zzc1.zzAe();
            } else
            {
                l = zzaPe.zzfa(zzpy1.getContainerId());
            }
            if (l + 0xdbba0L < zzpw.currentTimeMillis())
            {
                flag = true;
            }
        } while (true);
        if (flag)
        {
            zza1 = (zzqp)zzaPg.get(zzqd1.getId());
            if (zza1 == null)
            {
                if (zzaLc == null)
                {
                    zza1 = new zzqp();
                } else
                {
                    zza1 = new zzqp(zzaLc);
                }
                zzaPg.put(zzqd1.getId(), zza1);
            }
            zza1.zza(mContext, zzqd1, 0L, zzqn);
            return;
        } else
        {
            zza(zzqd1, zza1);
            return;
        }
    }

    void zza(zzqe.zza zza1)
    {
        Object obj = zza1.zzAj().getContainerId();
        Status status = zza1.getStatus();
        zza1 = zza1.zzAk();
        if (zzaPf.containsKey(obj))
        {
            obj = (zzc)zzaPf.get(obj);
            ((zzc) (obj)).zzU(zzpw.currentTimeMillis());
            if (status == Status.zzXP)
            {
                ((zzc) (obj)).zzaV(status);
                ((zzc) (obj)).zzO(zza1);
            }
            return;
        } else
        {
            zzaPf.put(obj, new zzc(status, zza1, zzpw.currentTimeMillis()));
            return;
        }
    }

    public void zza(String s, Integer integer, String s1, zza zza1)
    {
        s = (new zzqd()).zzb(new zzpy(s, integer, s1, false));
        zza(((zzqd) (s)), zza1, ((zzqn) (new zzb(s, zzqc.zzaPm, zza1))));
    }

    public void zzeU(String s)
    {
        zzaLc = s;
    }
}
