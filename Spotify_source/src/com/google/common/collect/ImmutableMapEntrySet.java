// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableMap

abstract class ImmutableMapEntrySet extends ImmutableSet
{

    ImmutableMapEntrySet()
    {
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = d().get(((java.util.Map.Entry) (obj)).getKey());
            flag = flag1;
            if (obj1 != null)
            {
                flag = flag1;
                if (obj1.equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    abstract ImmutableMap d();

    final boolean e()
    {
        return d().e();
    }

    public int size()
    {
        return d().size();
    }

    Object writeReplace()
    {
        return new EntrySetSerializedForm(d());
    }

    private class EntrySetSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMap map;

        Object readResolve()
        {
            return map.b();
        }

        EntrySetSerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }

}
