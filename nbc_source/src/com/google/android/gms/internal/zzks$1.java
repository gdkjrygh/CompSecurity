// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzkv, zzks

class nit> extends zzkv
{

    final zzks zzabm;

    protected void colClear()
    {
        zzabm.clear();
    }

    protected Object colGetEntry(int i, int j)
    {
        return zzabm.mArray[(i << 1) + j];
    }

    protected Map colGetMap()
    {
        return zzabm;
    }

    protected int colGetSize()
    {
        return zzabm.mSize;
    }

    protected int colIndexOfKey(Object obj)
    {
        if (obj == null)
        {
            return zzabm.indexOfNull();
        } else
        {
            return zzabm.indexOf(obj, obj.hashCode());
        }
    }

    protected int colIndexOfValue(Object obj)
    {
        return zzabm.indexOfValue(obj);
    }

    protected void colPut(Object obj, Object obj1)
    {
        zzabm.put(obj, obj1);
    }

    protected void colRemoveAt(int i)
    {
        zzabm.removeAt(i);
    }

    protected Object colSetValue(int i, Object obj)
    {
        return zzabm.setValueAt(i, obj);
    }

    (zzks zzks1)
    {
        zzabm = zzks1;
        super();
    }
}
