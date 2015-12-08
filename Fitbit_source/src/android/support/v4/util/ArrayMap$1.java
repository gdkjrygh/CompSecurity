// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Map;

// Referenced classes of package android.support.v4.util:
//            MapCollections, ArrayMap

class ons extends MapCollections
{

    final ArrayMap this$0;

    protected void colClear()
    {
        clear();
    }

    protected Object colGetEntry(int i, int j)
    {
        return mArray[(i << 1) + j];
    }

    protected Map colGetMap()
    {
        return ArrayMap.this;
    }

    protected int colGetSize()
    {
        return mSize;
    }

    protected int colIndexOfKey(Object obj)
    {
        return indexOfKey(obj);
    }

    protected int colIndexOfValue(Object obj)
    {
        return indexOfValue(obj);
    }

    protected void colPut(Object obj, Object obj1)
    {
        put(obj, obj1);
    }

    protected void colRemoveAt(int i)
    {
        removeAt(i);
    }

    protected Object colSetValue(int i, Object obj)
    {
        return setValueAt(i, obj);
    }

    ons()
    {
        this$0 = ArrayMap.this;
        super();
    }
}
