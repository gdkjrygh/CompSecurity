// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            dd

interface cm
{

    public abstract long getExpirationTime();

    public abstract int getHash();

    public abstract Object getKey();

    public abstract cm getNext();

    public abstract cm getNextEvictable();

    public abstract cm getNextExpirable();

    public abstract cm getPreviousEvictable();

    public abstract cm getPreviousExpirable();

    public abstract dd getValueReference();

    public abstract void setExpirationTime(long l);

    public abstract void setNextEvictable(cm cm1);

    public abstract void setNextExpirable(cm cm1);

    public abstract void setPreviousEvictable(cm cm1);

    public abstract void setPreviousExpirable(cm cm1);

    public abstract void setValueReference(dd dd);
}
