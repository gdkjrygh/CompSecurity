// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            cr

interface cj
{

    public abstract long getExpirationTime();

    public abstract int getHash();

    public abstract Object getKey();

    public abstract cj getNext();

    public abstract cj getNextEvictable();

    public abstract cj getNextExpirable();

    public abstract cj getPreviousEvictable();

    public abstract cj getPreviousExpirable();

    public abstract cr getValueReference();

    public abstract void setExpirationTime(long l);

    public abstract void setNextEvictable(cj cj1);

    public abstract void setNextExpirable(cj cj1);

    public abstract void setPreviousEvictable(cj cj1);

    public abstract void setPreviousExpirable(cj cj1);

    public abstract void setValueReference(cr cr);
}
