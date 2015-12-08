// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            zzap, zzhx

public class zzak
{

    private final int zznW;
    private final int zznX;
    private final int zznY;
    private final zzap zznZ;
    private final Object zznh = new Object();
    private ArrayList zzoa;
    private int zzob;
    private int zzoc;
    private int zzod;
    private int zzoe;
    private String zzof;

    public zzak(int i, int j, int k, int l)
    {
        zzoa = new ArrayList();
        zzob = 0;
        zzoc = 0;
        zzod = 0;
        zzof = "";
        zznW = i;
        zznX = j;
        zznY = k;
        zznZ = new zzap(l);
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

    private void zzj(String s)
    {
        if (s == null || s.length() < zznY)
        {
            return;
        }
        synchronized (zznh)
        {
            zzoa.add(s);
            zzob = zzob + s.length();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zzak)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (zzak)obj;
            if (((zzak) (obj)).zzbm() != null && ((zzak) (obj)).zzbm().equals(zzbm()))
            {
                return true;
            }
        }
        return false;
    }

    public int getScore()
    {
        return zzoe;
    }

    public int hashCode()
    {
        return zzbm().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("ActivityContent fetchId: ")).append(zzoc).append(" score:").append(zzoe).append(" total_length:").append(zzob).append("\n text: ").append(zza(zzoa, 200)).append("\n signture: ").append(zzof).toString();
    }

    int zza(int i, int j)
    {
        return zznW * i + zznX * j;
    }

    public boolean zzbl()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzod == 0)
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

    public String zzbm()
    {
        return zzof;
    }

    public void zzbn()
    {
        synchronized (zznh)
        {
            zzoe = zzoe - 100;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbo()
    {
        synchronized (zznh)
        {
            zzod = zzod - 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbp()
    {
        synchronized (zznh)
        {
            zzod = zzod + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbq()
    {
        synchronized (zznh)
        {
            int i = zza(zzob, zzoc);
            if (i > zzoe)
            {
                zzoe = i;
                zzof = zznZ.zza(zzoa);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    int zzbr()
    {
        return zzob;
    }

    public void zzc(int i)
    {
        zzoc = i;
    }

    public void zzh(String s)
    {
        zzj(s);
        synchronized (zznh)
        {
            if (zzod < 0)
            {
                zzhx.zzY("ActivityContent: negative number of WebViews.");
            }
            zzbq();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzi(String s)
    {
        zzj(s);
    }
}
