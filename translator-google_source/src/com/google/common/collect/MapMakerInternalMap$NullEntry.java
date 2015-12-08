// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            cj, cr

final class  extends Enum
    implements cj
{

    public static final INSTANCE INSTANCE;
    private static final INSTANCE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/collect/MapMakerInternalMap$NullEntry, s);
    }

    public static [] values()
    {
        return ([])a.clone();
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

    public final cj getNext()
    {
        return null;
    }

    public final cj getNextEvictable()
    {
        return this;
    }

    public final cj getNextExpirable()
    {
        return this;
    }

    public final cj getPreviousEvictable()
    {
        return this;
    }

    public final cj getPreviousExpirable()
    {
        return this;
    }

    public final cr getValueReference()
    {
        return null;
    }

    public final void setExpirationTime(long l)
    {
    }

    public final void setNextEvictable(cj cj1)
    {
    }

    public final void setNextExpirable(cj cj1)
    {
    }

    public final void setPreviousEvictable(cj cj1)
    {
    }

    public final void setPreviousExpirable(cj cj1)
    {
    }

    public final void setValueReference(cr cr)
    {
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE");
        a = (new a[] {
            INSTANCE
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
