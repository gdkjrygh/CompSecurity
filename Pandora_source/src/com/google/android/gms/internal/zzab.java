// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            zzag

public class zzab
{

    private final int zzoT;
    private final int zzoU;
    private final int zzoV;
    private final zzag zzoW;
    private ArrayList zzoX;
    private int zzoY;
    private int zzoZ;
    private final Object zzoe = new Object();
    private int zzpa;
    private int zzpb;
    private String zzpc;

    public zzab(int i, int j, int k, int l)
    {
        zzoX = new ArrayList();
        zzoY = 0;
        zzoZ = 0;
        zzpa = 0;
        zzpc = "";
        zzoT = i;
        zzoU = j;
        zzoV = k;
        zzoW = new zzag(l);
    }

    private String zza(ArrayList arraylist, int i)
    {
        if (arraylist.isEmpty())
        {
            arraylist = "";
        } else
        {
            Object obj = new StringBuffer();
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                ((StringBuffer) (obj)).append((String)arraylist.next());
                ((StringBuffer) (obj)).append(' ');
            } while (((StringBuffer) (obj)).length() <= i);
            ((StringBuffer) (obj)).deleteCharAt(((StringBuffer) (obj)).length() - 1);
            obj = ((StringBuffer) (obj)).toString();
            arraylist = ((ArrayList) (obj));
            if (((String) (obj)).length() >= i)
            {
                return ((String) (obj)).substring(0, i);
            }
        }
        return arraylist;
    }

    private void zzl(String s)
    {
        if (s == null || s.length() < zzoV)
        {
            return;
        }
        synchronized (zzoe)
        {
            zzoX.add(s);
            zzoY = zzoY + s.length();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zzab)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (zzab)obj;
            if (((zzab) (obj)).zzbs() != null && ((zzab) (obj)).zzbs().equals(zzbs()))
            {
                return true;
            }
        }
        return false;
    }

    public int getScore()
    {
        return zzpb;
    }

    public int hashCode()
    {
        return zzbs().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityContent fetchId: ").append(zzoZ).append(" score:").append(zzpb).append(" total_length:").append(zzoY).append("\n text: ").append(zza(zzoX, 200)).append("\n signture: ").append(zzpc).toString();
    }

    int zza(int i, int j)
    {
        return zzoT * i + zzoU * j;
    }

    public boolean zzbr()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzpa == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzbs()
    {
        return zzpc;
    }

    public void zzbt()
    {
        synchronized (zzoe)
        {
            zzpb = zzpb - 100;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbu()
    {
        synchronized (zzoe)
        {
            zzpa = zzpa - 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbv()
    {
        synchronized (zzoe)
        {
            zzpa = zzpa + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbw()
    {
        synchronized (zzoe)
        {
            int i = zza(zzoY, zzoZ);
            if (i > zzpb)
            {
                zzpb = i;
                zzpc = zzoW.zza(zzoX);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    int zzbx()
    {
        return zzoY;
    }

    public void zzc(int i)
    {
        zzoZ = i;
    }

    public void zzj(String s)
    {
        zzl(s);
        synchronized (zzoe)
        {
            if (zzpa < 0)
            {
                zzb.zzaj("ActivityContent: negative number of WebViews.");
            }
            zzbw();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzk(String s)
    {
        zzl(s);
    }
}
