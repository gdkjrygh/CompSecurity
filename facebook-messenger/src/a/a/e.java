// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


public abstract class e
{

    public final int a;
    public final int b;
    public final e c;

    public e(int i, int j, e e1)
    {
        a = i;
        b = j;
        c = e1;
    }

    public abstract boolean a();

    public boolean b()
    {
        return a < 0 || b < 0;
    }

    public final e c()
    {
        e e1;
        if (b())
        {
            e1 = null;
        } else
        {
            e1 = this;
            if (!a())
            {
                e1 = this;
                if (c != null)
                {
                    return c.c();
                }
            }
        }
        return e1;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("[");
        for (e e1 = this; e1 != null; e1 = e1.c)
        {
            stringbuffer.append("(");
            stringbuffer.append(Integer.toString(e1.a));
            stringbuffer.append(",");
            stringbuffer.append(Integer.toString(e1.b));
            stringbuffer.append(")");
        }

        stringbuffer.append("]");
        return stringbuffer.toString();
    }
}
