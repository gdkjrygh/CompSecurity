// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zze, zzae, zzx, zzq, 
//            zzb, zzu, zzah, zzm, 
//            zza, zzj, zzt, zzam

public class zzc
{

    private final zze zzFD;

    protected zzc(zze zze1)
    {
        zzv.zzr(zze1);
        zzFD = zze1;
    }

    private void zza(int i, String s, Object obj, Object obj1, Object obj2)
    {
        zzae zzae1 = null;
        if (zzFD != null)
        {
            zzae1 = zzFD.zzgU();
        }
        if (zzae1 != null)
        {
            zzae1.zza(i, s, obj, obj1, obj2);
        } else
        {
            String s1 = (String)zzx.zzHf.get();
            if (Log.isLoggable(s1, i))
            {
                Log.println(i, s1, zzc(s, obj, obj1, obj2));
                return;
            }
        }
    }

    protected static String zzc(String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        String s2 = zzf(obj);
        obj1 = zzf(obj1);
        obj2 = zzf(obj2);
        StringBuilder stringbuilder = new StringBuilder();
        s = "";
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s1);
            s = ": ";
        }
        obj = s;
        if (!TextUtils.isEmpty(s2))
        {
            stringbuilder.append(s);
            stringbuilder.append(s2);
            obj = ", ";
        }
        s = ((String) (obj));
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(((String) (obj1)));
            s = ", ";
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            stringbuilder.append(s);
            stringbuilder.append(((String) (obj2)));
        }
        return stringbuilder.toString();
    }

    private static String zzf(Object obj)
    {
        if (obj == null)
        {
            return "";
        }
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof Boolean)
        {
            if (obj == Boolean.TRUE)
            {
                obj = "true";
            } else
            {
                obj = "false";
            }
            return ((String) (obj));
        }
        if (obj instanceof Throwable)
        {
            return ((Throwable)obj).toString();
        } else
        {
            return obj.toString();
        }
    }

    protected Context getContext()
    {
        return zzFD.getContext();
    }

    public void zza(String s, Object obj)
    {
        zza(2, s, obj, null, null);
    }

    public void zza(String s, Object obj, Object obj1)
    {
        zza(2, s, obj, obj1, null);
    }

    public void zza(String s, Object obj, Object obj1, Object obj2)
    {
        zza(3, s, obj, obj1, obj2);
    }

    public void zzaF(String s)
    {
        zza(2, s, null, null, null);
    }

    public void zzaG(String s)
    {
        zza(3, s, null, null, null);
    }

    public void zzaH(String s)
    {
        zza(4, s, null, null, null);
    }

    public void zzaI(String s)
    {
        zza(5, s, null, null, null);
    }

    public void zzaJ(String s)
    {
        zza(6, s, null, null, null);
    }

    public void zzb(String s, Object obj)
    {
        zza(3, s, obj, null, null);
    }

    public void zzb(String s, Object obj, Object obj1)
    {
        zza(3, s, obj, obj1, null);
    }

    public void zzb(String s, Object obj, Object obj1, Object obj2)
    {
        zza(5, s, obj, obj1, obj2);
    }

    public void zzc(String s, Object obj)
    {
        zza(4, s, obj, null, null);
    }

    public void zzc(String s, Object obj, Object obj1)
    {
        zza(5, s, obj, obj1, null);
    }

    public void zzd(String s, Object obj)
    {
        zza(5, s, obj, null, null);
    }

    public void zzd(String s, Object obj, Object obj1)
    {
        zza(6, s, obj, obj1, null);
    }

    public void zze(String s, Object obj)
    {
        zza(6, s, obj, null, null);
    }

    public GoogleAnalytics zzfT()
    {
        return zzFD.zzgV();
    }

    protected zzb zzfZ()
    {
        return zzFD.zzfZ();
    }

    public zze zzgD()
    {
        return zzFD;
    }

    protected void zzgE()
    {
        if (zzgI().zzhP())
        {
            throw new IllegalStateException("Call only supported on the client side");
        } else
        {
            return;
        }
    }

    protected void zzgF()
    {
        zzFD.zzgF();
    }

    protected zzht zzgG()
    {
        return zzFD.zzgG();
    }

    protected zzae zzgH()
    {
        return zzFD.zzgH();
    }

    protected zzq zzgI()
    {
        return zzFD.zzgI();
    }

    protected zzkk zzgJ()
    {
        return zzFD.zzgJ();
    }

    protected zzu zzgK()
    {
        return zzFD.zzgK();
    }

    protected zzah zzgL()
    {
        return zzFD.zzgL();
    }

    protected zzm zzgM()
    {
        return zzFD.zzgY();
    }

    protected zza zzgN()
    {
        return zzFD.zzgX();
    }

    protected zzj zzgO()
    {
        return zzFD.zzgO();
    }

    protected zzt zzgP()
    {
        return zzFD.zzgP();
    }

    public boolean zzgQ()
    {
        return Log.isLoggable((String)zzx.zzHf.get(), 2);
    }

    protected zzam zzga()
    {
        return zzFD.zzga();
    }
}
