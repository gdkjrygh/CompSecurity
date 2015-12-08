// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class ence extends Enum
    implements ntry
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static ntry valueOf(String s)
    {
        return (ntry)Enum.valueOf(com/google/common/collect/MapMakerInternalMap$NullEntry, s);
    }

    public static ntry[] values()
    {
        return (ntry[])$VALUES.clone();
    }

    public final long getExpirationTime()
    {
        return 0L;
    }

    public final int getHash()
    {
        return 0;
    }

    public final Object getKey()
    {
        return null;
    }

    public final ntry getNext()
    {
        return null;
    }

    public final ntry getNextEvictable()
    {
        return this;
    }

    public final ntry getNextExpirable()
    {
        return this;
    }

    public final ntry getPreviousEvictable()
    {
        return this;
    }

    public final ntry getPreviousExpirable()
    {
        return this;
    }

    public final ence getValueReference()
    {
        return null;
    }

    public final void setExpirationTime(long l)
    {
    }

    public final void setNextEvictable(ntry ntry)
    {
    }

    public final void setNextExpirable(ntry ntry)
    {
    }

    public final void setPreviousEvictable(ntry ntry)
    {
    }

    public final void setPreviousExpirable(ntry ntry)
    {
    }

    public final void setValueReference(ence ence)
    {
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private ence(String s, int i)
    {
        super(s, i);
    }
}
