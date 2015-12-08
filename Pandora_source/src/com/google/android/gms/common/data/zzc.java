// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class zzc
{

    protected final DataHolder zzPy;
    protected int zzRw;
    private int zzRx;

    public zzc(DataHolder dataholder, int i)
    {
        zzPy = (DataHolder)zzv.zzr(dataholder);
        zzaB(i);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof zzc)
        {
            obj = (zzc)obj;
            flag = flag1;
            if (zzu.equal(Integer.valueOf(((zzc) (obj)).zzRw), Integer.valueOf(zzRw)))
            {
                flag = flag1;
                if (zzu.equal(Integer.valueOf(((zzc) (obj)).zzRx), Integer.valueOf(zzRx)))
                {
                    flag = flag1;
                    if (((zzc) (obj)).zzPy == zzPy)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected boolean getBoolean(String s)
    {
        return zzPy.zze(s, zzRw, zzRx);
    }

    protected byte[] getByteArray(String s)
    {
        return zzPy.zzg(s, zzRw, zzRx);
    }

    protected float getFloat(String s)
    {
        return zzPy.zzf(s, zzRw, zzRx);
    }

    protected int getInteger(String s)
    {
        return zzPy.zzc(s, zzRw, zzRx);
    }

    protected long getLong(String s)
    {
        return zzPy.zzb(s, zzRw, zzRx);
    }

    protected String getString(String s)
    {
        return zzPy.zzd(s, zzRw, zzRx);
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzRw), Integer.valueOf(zzRx), zzPy
        });
    }

    public boolean isDataValid()
    {
        return !zzPy.isClosed();
    }

    protected void zza(String s, CharArrayBuffer chararraybuffer)
    {
        zzPy.zza(s, zzRw, zzRx, chararraybuffer);
    }

    protected void zzaB(int i)
    {
        boolean flag;
        if (i >= 0 && i < zzPy.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzP(flag);
        zzRw = i;
        zzRx = zzPy.zzaD(zzRw);
    }

    public boolean zzbF(String s)
    {
        return zzPy.zzbF(s);
    }

    protected Uri zzbG(String s)
    {
        return zzPy.zzh(s, zzRw, zzRx);
    }

    protected boolean zzbH(String s)
    {
        return zzPy.zzi(s, zzRw, zzRx);
    }

    protected int zzlp()
    {
        return zzRw;
    }
}
