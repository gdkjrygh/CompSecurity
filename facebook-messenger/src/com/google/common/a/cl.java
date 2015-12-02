// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            cm, dd

final class cl extends Enum
    implements cm
{

    private static final cl $VALUES[];
    public static final cl INSTANCE;

    private cl(String s, int i)
    {
        super(s, i);
    }

    public static cl valueOf(String s)
    {
        return (cl)Enum.valueOf(com/google/common/a/cl, s);
    }

    public static cl[] values()
    {
        return (cl[])$VALUES.clone();
    }

    public long getExpirationTime()
    {
        return 0L;
    }

    public int getHash()
    {
        return 0;
    }

    public Object getKey()
    {
        return null;
    }

    public cm getNext()
    {
        return null;
    }

    public cm getNextEvictable()
    {
        return this;
    }

    public cm getNextExpirable()
    {
        return this;
    }

    public cm getPreviousEvictable()
    {
        return this;
    }

    public cm getPreviousExpirable()
    {
        return this;
    }

    public dd getValueReference()
    {
        return null;
    }

    public void setExpirationTime(long l)
    {
    }

    public void setNextEvictable(cm cm1)
    {
    }

    public void setNextExpirable(cm cm1)
    {
    }

    public void setPreviousEvictable(cm cm1)
    {
    }

    public void setPreviousExpirable(cm cm1)
    {
    }

    public void setValueReference(dd dd)
    {
    }

    static 
    {
        INSTANCE = new cl("INSTANCE", 0);
        $VALUES = (new cl[] {
            INSTANCE
        });
    }
}
