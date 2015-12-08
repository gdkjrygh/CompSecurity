// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static interface 
{

    public abstract long getExpirationTime();

    public abstract int getHash();

    public abstract Object getKey();

    public abstract  getNext();

    public abstract  getNextEvictable();

    public abstract  getNextExpirable();

    public abstract  getPreviousEvictable();

    public abstract  getPreviousExpirable();

    public abstract  getValueReference();

    public abstract void setExpirationTime(long l);

    public abstract void setNextEvictable( );

    public abstract void setNextExpirable( );

    public abstract void setPreviousEvictable( );

    public abstract void setPreviousExpirable( );

    public abstract void setValueReference( );
}
