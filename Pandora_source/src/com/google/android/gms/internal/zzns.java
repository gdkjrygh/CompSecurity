// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzny, zznt, zzob, p, 
//            q, zznq, r, zznw, 
//            zznr

public abstract class zzns extends zzny
{

    protected p zzaNI;

    public zzns()
    {
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzQ();
    }

    public final Object zza(zznt zznt1)
    {
        q q1;
        if (zzaNI != null)
        {
            if ((q1 = zzaNI.a(zzob.zzjG(zznt1.tag))) != null)
            {
                return q1.a(zznt1);
            }
        }
        return null;
    }

    public void zza(zznr zznr)
        throws IOException
    {
        if (zzaNI != null)
        {
            int i = 0;
            while (i < zzaNI.a()) 
            {
                zzaNI.b(i).a(zznr);
                i++;
            }
        }
    }

    protected final boolean zza(zznq zznq1, int i)
        throws IOException
    {
        int j = zznq1.getPosition();
        if (!zznq1.zzjl(i))
        {
            return false;
        }
        int k = zzob.zzjG(i);
        r r1 = new r(i, zznq1.zzw(j, zznq1.getPosition() - j));
        zznq1 = null;
        Object obj;
        if (zzaNI == null)
        {
            zzaNI = new p();
        } else
        {
            zznq1 = zzaNI.a(k);
        }
        obj = zznq1;
        if (zznq1 == null)
        {
            obj = new q();
            zzaNI.a(k, ((q) (obj)));
        }
        ((q) (obj)).a(r1);
        return true;
    }

    protected final boolean zza(zzns zzns1)
    {
        if (zzaNI == null || zzaNI.b())
        {
            return zzns1.zzaNI == null || zzns1.zzaNI.b();
        } else
        {
            return zzaNI.equals(zzns1.zzaNI);
        }
    }

    protected int zzc()
    {
        int j = 0;
        int k;
        if (zzaNI != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= zzaNI.a())
                {
                    break;
                }
                i += zzaNI.b(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    protected final int zzzP()
    {
        if (zzaNI == null || zzaNI.b())
        {
            return 0;
        } else
        {
            return zzaNI.hashCode();
        }
    }

    public zzns zzzQ()
        throws CloneNotSupportedException
    {
        zzns zzns1 = (zzns)super.zzzR();
        zznw.zza(this, zzns1);
        return zzns1;
    }

    public zzny zzzR()
        throws CloneNotSupportedException
    {
        return zzzQ();
    }
}
