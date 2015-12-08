// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.zzbg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzms, zzhv, zzmo, zzmj, 
//            zzmn, zzht, zzna, zzmy, 
//            zzmp, zzmm, zzmr

public class zzml
{
    class a extends zzmy
    {

        final zzml a;
        private final zza b;

        protected zzmy.zzb zza(zzmj zzmj1)
        {
            return null;
        }

        protected void zza(zzmp zzmp1)
        {
            zzmp.zza zza1 = zzmp1.zzym();
            a.zza(zza1);
            if (zza1.getStatus() == Status.zzQU && zza1.zzyn() == zzmp.zza.zza.zzaHg && zza1.zzyo() != null && zza1.zzyo().length > 0)
            {
                zzml.zza(a).zze(zza1.zzyp().zzyh(), zza1.zzyo());
                zzbg.zzam("Resource successfully load from Network.");
                b.zza(zzmp1);
                return;
            }
            StringBuilder stringbuilder = (new StringBuilder()).append("Response status: ");
            if (zza1.getStatus().isSuccess())
            {
                zzmp1 = "SUCCESS";
            } else
            {
                zzmp1 = "FAILURE";
            }
            zzbg.zzam(stringbuilder.append(zzmp1).toString());
            if (zza1.getStatus().isSuccess())
            {
                zzbg.zzam((new StringBuilder()).append("Response source: ").append(zza1.zzyn().toString()).toString());
                zzbg.zzam((new StringBuilder()).append("Response size: ").append(zza1.zzyo().length).toString());
            }
            a.zza(zza1.zzyp(), b);
        }

        a(zzmo zzmo1, zzmm zzmm, zza zza1)
        {
            a = zzml.this;
            super(zzmo1, zzmm);
            b = zza1;
        }
    }

    static class b
    {

        private Status a;
        private Object b;
        private long c;

        public long a()
        {
            return c;
        }

        public void a(long l)
        {
            c = l;
        }

        public void a(Status status)
        {
            a = status;
        }

        public void a(Object obj)
        {
            b = obj;
        }

        public b(Status status, Object obj, long l)
        {
            a = status;
            b = obj;
            c = l;
        }
    }

    public static interface zza
    {

        public abstract void zza(zzmp zzmp);
    }


    private final Context mContext;
    private String zzaCO;
    private final zzms zzaGQ;
    Map zzaGR;
    private final Map zzaGS;
    private final zzht zznR;

    public zzml(Context context)
    {
        this(context, ((Map) (new HashMap())), new zzms(context), zzhv.zznd());
    }

    zzml(Context context, Map map, zzms zzms1, zzht zzht1)
    {
        zzaCO = null;
        zzaGR = new HashMap();
        mContext = context;
        zznR = zzht1;
        zzaGQ = zzms1;
        zzaGS = map;
    }

    static zzms zza(zzml zzml1)
    {
        return zzml1.zzaGQ;
    }

    private void zza(zzmo zzmo1, zza zza1)
    {
        boolean flag = true;
        zzmo1 = zzmo1.zzyl();
        if (zzmo1.size() != 1)
        {
            flag = false;
        }
        zzv.zzQ(flag);
        zza((zzmj)zzmo1.get(0), zza1);
    }

    void zza(zzmj zzmj1, zza zza1)
    {
        zzaGQ.zza(zzmj1.zzyh(), zzmj1.zzyf(), zzmn.zzaGY, new zzmr(zzmj1, zza1) {

            final zzmj a;
            final zza b;
            final zzml c;

            public void zza(Status status, Object obj, Integer integer, long l)
            {
                if (status.isSuccess())
                {
                    if (integer == zzms.zzaHy)
                    {
                        status = zzmp.zza.zza.zzaHi;
                    } else
                    {
                        status = zzmp.zza.zza.zzaHh;
                    }
                    status = new zzmp.zza(Status.zzQU, a, null, (zzmq.zzc)obj, status, l);
                } else
                {
                    status = new zzmp.zza(new Status(16, (new StringBuilder()).append("There is no valid resource for the container: ").append(a.getContainerId()).toString()), null, zzmp.zza.zza.zzaHh);
                }
                b.zza(new zzmp(status));
            }

            
            {
                c = zzml.this;
                a = zzmj1;
                b = zza1;
                super();
            }
        });
    }

    void zza(zzmo zzmo1, zza zza1, zzmy zzmy)
    {
        Iterator iterator = zzmo1.zzyl().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            zzmj zzmj1 = (zzmj)iterator.next();
            b b1 = (b)zzaGR.get(zzmj1.getContainerId());
            long l;
            if (b1 != null)
            {
                l = b1.a();
            } else
            {
                l = zzaGQ.zzes(zzmj1.getContainerId());
            }
            if (l + 0xdbba0L < zznR.currentTimeMillis())
            {
                flag = true;
            }
        } while (true);
        if (flag)
        {
            zza1 = (zzna)zzaGS.get(zzmo1.getId());
            if (zza1 == null)
            {
                if (zzaCO == null)
                {
                    zza1 = new zzna();
                } else
                {
                    zza1 = new zzna(zzaCO);
                }
                zzaGS.put(zzmo1.getId(), zza1);
            }
            zza1.zza(mContext, zzmo1, 0L, zzmy);
            return;
        } else
        {
            zza(zzmo1, zza1);
            return;
        }
    }

    void zza(zzmp.zza zza1)
    {
        Object obj = zza1.zzyp().getContainerId();
        Status status = zza1.getStatus();
        zza1 = zza1.zzyq();
        if (zzaGR.containsKey(obj))
        {
            obj = (b)zzaGR.get(obj);
            ((b) (obj)).a(zznR.currentTimeMillis());
            if (status == Status.zzQU)
            {
                ((b) (obj)).a(status);
                ((b) (obj)).a(zza1);
            }
            return;
        } else
        {
            zzaGR.put(obj, new b(status, zza1, zznR.currentTimeMillis()));
            return;
        }
    }

    public void zza(String s, Integer integer, String s1, zza zza1)
    {
        s = (new zzmo()).zzb(new zzmj(s, integer, s1, false));
        zza(((zzmo) (s)), zza1, ((zzmy) (new a(s, zzmn.zzaGY, zza1))));
    }

    public void zzem(String s)
    {
        zzaCO = s;
    }
}
