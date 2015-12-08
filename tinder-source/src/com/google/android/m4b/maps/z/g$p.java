// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;


// Referenced classes of package com.google.android.m4b.maps.z:
//            g

final class b
    implements java.util.Entry
{

    private Object a;
    private Object b;
    private g c;

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Entry)
        {
            obj = (java.util.Entry)obj;
            flag = flag1;
            if (a.equals(((java.util.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (b.equals(((java.util.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final Object getKey()
    {
        return a;
    }

    public final Object getValue()
    {
        return b;
    }

    public final int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public final Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
    }

    ption(g g1, Object obj, Object obj1)
    {
        c = g1;
        super();
        a = obj;
        b = obj1;
    }
}
