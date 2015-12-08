// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            ab, ac, z, m

public abstract class aa extends Enum
{

    public static final aa a;
    public static final aa b;
    private static final aa c[];

    private aa(String s, int i)
    {
        super(s, i);
    }

    aa(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static aa valueOf(String s)
    {
        return (aa)Enum.valueOf(com/b/a/aa, s);
    }

    public static aa[] values()
    {
        return (aa[])c.clone();
    }

    public abstract m a(byte byte0, z z, m m);

    public abstract m a(int i, z z, m m);

    public abstract m a(long l, z z, m m);

    public abstract m a(String s, z z, m m);

    public abstract m a(byte abyte0[], int i, z z, m m);

    static 
    {
        a = new ab("BUFFERED");
        b = new ac("STREAMED");
        c = (new aa[] {
            a, b
        });
    }
}
