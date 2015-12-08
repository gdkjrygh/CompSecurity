// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzbx, zzki, zzbw

public class zzby
{

    Collection zzqf;
    Collection zzqg;

    public zzby()
    {
        zzqf = new ArrayList();
        zzqg = new ArrayList();
    }

    public void zza(zzbw zzbw)
    {
        zzqf.add(zzbw);
    }

    public void zza(zzbx zzbx1)
    {
        zzqg.add(zzbx1);
    }

    public List zzca()
    {
        Object obj;
        long l;
        obj = new ArrayList();
        l = Binder.clearCallingIdentity();
        Iterator iterator = zzqg.iterator();
_L2:
        String s;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_74;
            }
            s = (String)((zzbx)iterator.next()).zzbZ().get();
        } while (s == null);
        ((List) (obj)).add(s);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        Binder.restoreCallingIdentity(l);
        throw obj;
        Binder.restoreCallingIdentity(l);
        return ((List) (obj));
    }

    public List zzcb()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzqg.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)((zzbx)iterator.next()).get();
            if (s != null)
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }
}
