// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class ence extends Enum
    implements ntry
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static ntry valueOf(String s)
    {
        return (ntry)Enum.valueOf(com/google/common/cache/LocalCache$NullEntry, s);
    }

    public static ntry[] values()
    {
        return (ntry[])$VALUES.clone();
    }

    public final long getAccessTime()
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

    public final ntry getNextInAccessQueue()
    {
        return this;
    }

    public final ntry getNextInWriteQueue()
    {
        return this;
    }

    public final ntry getPreviousInAccessQueue()
    {
        return this;
    }

    public final ntry getPreviousInWriteQueue()
    {
        return this;
    }

    public final ence getValueReference()
    {
        return null;
    }

    public final long getWriteTime()
    {
        return 0L;
    }

    public final void setAccessTime(long l)
    {
    }

    public final void setNextInAccessQueue(ntry ntry)
    {
    }

    public final void setNextInWriteQueue(ntry ntry)
    {
    }

    public final void setPreviousInAccessQueue(ntry ntry)
    {
    }

    public final void setPreviousInWriteQueue(ntry ntry)
    {
    }

    public final void setValueReference(ence ence)
    {
    }

    public final void setWriteTime(long l)
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
