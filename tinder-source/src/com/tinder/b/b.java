// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;


// Referenced classes of package com.tinder.b:
//            l, c

public abstract class b
{

    public b()
    {
    }

    protected abstract c[] a();

    protected abstract String b();

    public final boolean c()
    {
        return l.a().a(b());
    }

    public final String d()
    {
        (new StringBuilder("mTableName=")).append(b());
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("CREATE TABLE IF NOT EXISTS ");
        stringbuffer.append(b());
        stringbuffer.append('(');
        for (int i = 0; i < a().length; i++)
        {
            c c1 = a()[i];
            stringbuffer.append(c1.a);
            stringbuffer.append(' ');
            stringbuffer.append(c1.b);
            if (c1.c)
            {
                stringbuffer.append(" PRIMARY KEY");
            }
            if (i < a().length - 1)
            {
                stringbuffer.append(", ");
            }
        }

        stringbuffer.append(')');
        return stringbuffer.toString();
    }
}
