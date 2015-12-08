// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr, 
//            zznq, zzny

public static final class zzj extends zzns
{

    private static volatile zzaNT zzgs[];
    public int key;
    public int value;

    public static zzj[] zzi()
    {
        if (zzgs == null)
        {
            synchronized (zznw.zzaNS)
            {
                if (zzgs == null)
                {
                    zzgs = new zzgs[0];
                }
            }
        }
        return zzgs;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof zzgs)
            {
                obj = (zzgs)obj;
                flag = flag1;
                if (key == ((key) (obj)).key)
                {
                    flag = flag1;
                    if (value == ((value) (obj)).value)
                    {
                        return zza(((zzns) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((key + 527) * 31 + value) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        zznr1.zzx(1, key);
        zznr1.zzx(2, value);
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzf(zznq1);
    }

    protected int zzc()
    {
        return super.zzc() + zznr.zzz(1, key) + zznr.zzz(2, value);
    }

    public value zzf(zznq zznq1)
        throws IOException
    {
        do
        {
            int i = zznq1.zzzy();
            switch (i)
            {
            default:
                if (zza(zznq1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                key = zznq1.zzzB();
                break;

            case 16: // '\020'
                value = zznq1.zzzB();
                break;
            }
        } while (true);
    }

    public B zzj()
    {
        key = 0;
        value = 0;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzj();
    }
}
