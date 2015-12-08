// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            n, q

static final class <init>
    implements java.util.Entry
{

    private java.util.Entry a;

    public final Object getKey()
    {
        return a.getKey();
    }

    public final Object getValue()
    {
        n n1 = (n)a.getValue();
        if (n1 == null)
        {
            return null;
        } else
        {
            return n1.b();
        }
    }

    public final Object setValue(Object obj)
    {
        if (!(obj instanceof q))
        {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        } else
        {
            return ((n)a.getValue()).b((q)obj);
        }
    }

    private (java.util.Entry entry)
    {
        a = entry;
    }

    a(java.util.Entry entry, byte byte0)
    {
        this(entry);
    }
}
