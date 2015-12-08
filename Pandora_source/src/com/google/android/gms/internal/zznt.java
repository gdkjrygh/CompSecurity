// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            r, zznq, zzny, zzob, 
//            zznr

public class zznt
{

    public final int tag;
    protected final int type;
    protected final Class zzaNJ;
    protected final boolean zzaNK;

    private zznt(int i, Class class1, int j, boolean flag)
    {
        type = i;
        zzaNJ = class1;
        tag = j;
        zzaNK = flag;
    }

    private Object zzA(List list)
    {
        if (list.isEmpty())
        {
            return null;
        } else
        {
            list = (r)list.get(list.size() - 1);
            return zzaNJ.cast(zzA(zznq.zzv(((r) (list)).b)));
        }
    }

    public static zznt zza(int i, Class class1, int j)
    {
        return new zznt(i, class1, j, false);
    }

    private Object zzz(List list)
    {
        ArrayList arraylist;
        boolean flag;
        int k;
        flag = false;
        arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            r r1 = (r)list.get(i);
            if (r1.b.length != 0)
            {
                zza(r1, arraylist);
            }
        }

        k = arraylist.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        Object obj = zzaNJ.cast(Array.newInstance(zzaNJ.getComponentType(), k));
        int j = ((flag) ? 1 : 0);
        do
        {
            list = ((List) (obj));
            if (j >= k)
            {
                continue;
            }
            Array.set(obj, j, arraylist.get(j));
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Object zzA(zznq zznq1)
    {
        Class class1;
        if (zzaNK)
        {
            class1 = zzaNJ.getComponentType();
        } else
        {
            class1 = zzaNJ;
        }
        type;
        JVM INSTR tableswitch 10 11: default 185
    //                   10 107
    //                   11 129;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        zzny zzny1;
        try
        {
            zzny1 = (zzny)class1.newInstance();
            zznq1.zza(zzny1, zzob.zzjG(tag));
        }
        // Misplaced declaration of an exception variable
        catch (zznq zznq1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), zznq1);
        }
        // Misplaced declaration of an exception variable
        catch (zznq zznq1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), zznq1);
        }
        // Misplaced declaration of an exception variable
        catch (zznq zznq1)
        {
            throw new IllegalArgumentException("Error reading extension field", zznq1);
        }
        return zzny1;
_L3:
        zzny1 = (zzny)class1.newInstance();
        zznq1.zza(zzny1);
        return zzny1;
    }

    int zzM(Object obj)
    {
        if (zzaNK)
        {
            return zzN(obj);
        } else
        {
            return zzO(obj);
        }
    }

    protected int zzN(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + zzO(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected int zzO(Object obj)
    {
        int i = zzob.zzjG(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());

        case 10: // '\n'
            return zznr.zzb(i, (zzny)obj);

        case 11: // '\013'
            return zznr.zzc(i, (zzny)obj);
        }
    }

    protected void zza(r r1, List list)
    {
        list.add(zzA(zznq.zzv(r1.b)));
    }

    void zza(Object obj, zznr zznr1)
        throws IOException
    {
        if (zzaNK)
        {
            zzc(obj, zznr1);
            return;
        } else
        {
            zzb(obj, zznr1);
            return;
        }
    }

    protected void zzb(Object obj, zznr zznr1)
    {
        zznr1.zzjy(tag);
        type;
        JVM INSTR tableswitch 10 11: default 110
    //                   10 76
    //                   11 101;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        try
        {
            obj = (zzny)obj;
            int i = zzob.zzjG(tag);
            zznr1.zzb(((zzny) (obj)));
            zznr1.zzB(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        zznr1.zzc((zzny)obj);
        return;
    }

    protected void zzc(Object obj, zznr zznr1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                zzb(obj1, zznr1);
            }
        }

    }

    final Object zzy(List list)
    {
        if (list == null)
        {
            return null;
        }
        if (zzaNK)
        {
            return zzz(list);
        } else
        {
            return zzA(list);
        }
    }
}
