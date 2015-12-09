// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

static interface 
{

    public abstract long getAccessTime();

    public abstract int getHash();

    public abstract Object getKey();

    public abstract  getNext();

    public abstract  getNextInAccessQueue();

    public abstract  getNextInWriteQueue();

    public abstract  getPreviousInAccessQueue();

    public abstract  getPreviousInWriteQueue();

    public abstract  getValueReference();

    public abstract long getWriteTime();

    public abstract void setAccessTime(long l);

    public abstract void setNextInAccessQueue( );

    public abstract void setNextInWriteQueue( );

    public abstract void setPreviousInAccessQueue( );

    public abstract void setPreviousInWriteQueue( );

    public abstract void setValueReference( );

    public abstract void setWriteTime(long l);
}
