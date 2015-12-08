// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            aw, be

static final class y
    implements java.util.ntry
{

    private java.util.ntry a;

    public final aw a()
    {
        return (aw)a.getValue();
    }

    public final Object getKey()
    {
        return a.getKey();
    }

    public final Object getValue()
    {
        aw aw1 = (aw)a.getValue();
        if (aw1 == null)
        {
            return null;
        } else
        {
            return aw1.a();
        }
    }

    public final Object setValue(Object obj)
    {
        if (!(obj instanceof be))
        {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        } else
        {
            return ((aw)a.getValue()).b((be)obj);
        }
    }

    private y(java.util.ntry ntry)
    {
        a = ntry;
    }

    y(java.util.ntry ntry, byte byte0)
    {
        this(ntry);
    }
}
