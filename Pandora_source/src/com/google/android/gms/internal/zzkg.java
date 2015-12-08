// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzki, zzkk, zzht, zzkj

public final class zzkg
{

    private final zzkj zzavX;
    private boolean zzavY;
    private long zzavZ;
    private long zzawa;
    private long zzawb;
    private long zzawc;
    private long zzawd;
    private boolean zzawe;
    private final Map zzawf;
    private final List zzawg;
    private final zzht zznR;

    zzkg(zzkg zzkg1)
    {
        zzavX = zzkg1.zzavX;
        zznR = zzkg1.zznR;
        zzavZ = zzkg1.zzavZ;
        zzawa = zzkg1.zzawa;
        zzawb = zzkg1.zzawb;
        zzawc = zzkg1.zzawc;
        zzawd = zzkg1.zzawd;
        zzawg = new ArrayList(zzkg1.zzawg);
        zzawf = new HashMap(zzkg1.zzawf.size());
        java.util.Map.Entry entry;
        zzki zzki1;
        for (zzkg1 = zzkg1.zzawf.entrySet().iterator(); zzkg1.hasNext(); zzawf.put(entry.getKey(), zzki1))
        {
            entry = (java.util.Map.Entry)zzkg1.next();
            zzki1 = zzf((Class)entry.getKey());
            ((zzki)entry.getValue()).zza(zzki1);
        }

    }

    zzkg(zzkj zzkj1, zzht zzht1)
    {
        zzv.zzr(zzkj1);
        zzv.zzr(zzht1);
        zzavX = zzkj1;
        zznR = zzht1;
        zzawc = 0x1b7740L;
        zzawd = 0xb43e9400L;
        zzawf = new HashMap();
        zzawg = new ArrayList();
    }

    private static zzki zzf(Class class1)
    {
        try
        {
            class1 = (zzki)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException("dataType doesn't have default constructor", class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException("dataType default constructor is not accessible", class1);
        }
        return class1;
    }

    public void zzK(long l)
    {
        zzawa = l;
    }

    public void zzb(zzki zzki1)
    {
        zzv.zzr(zzki1);
        Class class1 = zzki1.getClass();
        if (class1.getSuperclass() != com/google/android/gms/internal/zzki)
        {
            throw new IllegalArgumentException();
        } else
        {
            zzki1.zza(zze(class1));
            return;
        }
    }

    public zzki zzd(Class class1)
    {
        return (zzki)zzawf.get(class1);
    }

    public zzki zze(Class class1)
    {
        zzki zzki2 = (zzki)zzawf.get(class1);
        zzki zzki1 = zzki2;
        if (zzki2 == null)
        {
            zzki1 = zzf(class1);
            zzawf.put(class1, zzki1);
        }
        return zzki1;
    }

    public zzkg zztZ()
    {
        return new zzkg(this);
    }

    public Collection zzua()
    {
        return zzawf.values();
    }

    public List zzub()
    {
        return zzawg;
    }

    public long zzuc()
    {
        return zzavZ;
    }

    public void zzud()
    {
        zzuh().zze(this);
    }

    public boolean zzue()
    {
        return zzavY;
    }

    void zzuf()
    {
        zzawb = zznR.elapsedRealtime();
        if (zzawa != 0L)
        {
            zzavZ = zzawa;
        } else
        {
            zzavZ = zznR.currentTimeMillis();
        }
        zzavY = true;
    }

    zzkj zzug()
    {
        return zzavX;
    }

    zzkk zzuh()
    {
        return zzavX.zzuh();
    }

    boolean zzui()
    {
        return zzawe;
    }

    void zzuj()
    {
        zzawe = true;
    }
}
