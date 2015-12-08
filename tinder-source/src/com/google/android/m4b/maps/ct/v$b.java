// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            v

final class <init>
    implements Comparable, java.util.Entry
{

    final Comparable a;
    private Object b;
    private v c;

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public final int compareTo(Object obj)
    {
        obj = (<init>)obj;
        return a.compareTo(((a) (obj)).a);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof java.util.Entry))
            {
                return false;
            }
            obj = (java.util.Entry)obj;
            if (!a(a, ((java.util.Entry) (obj)).getKey()) || !a(b, ((java.util.Entry) (obj)).getValue()))
            {
                return false;
            }
        }
        return true;
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
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i ^ j;
    }

    public final Object setValue(Object obj)
    {
        v.a(c);
        Object obj1 = b;
        b = obj;
        return obj1;
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("=").append(s1).toString();
    }

    (v v1, Comparable comparable, Object obj)
    {
        c = v1;
        super();
        a = comparable;
        b = obj;
    }

    b(v v1, java.util.Entry entry)
    {
        this(v1, (Comparable)entry.getKey(), entry.getValue());
    }
}
