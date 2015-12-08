// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class fl
{

    private short a[];
    private int b;

    public fl()
    {
        b = -1;
        a = new short[15];
    }

    public final short a()
    {
        short aword0[] = a;
        int i = b;
        b = i - 1;
        return aword0[i];
    }

    public final void a(short word0)
    {
        if (a.length == b + 1)
        {
            short aword0[] = new short[a.length * 2];
            System.arraycopy(a, 0, aword0, 0, a.length);
            a = aword0;
        }
        short aword1[] = a;
        int i = b + 1;
        b = i;
        aword1[i] = word0;
    }

    public final void b()
    {
        b = -1;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<ShortStack vector:[");
        for (int i = 0; i < a.length; i++)
        {
            if (i != 0)
            {
                stringbuilder.append(" ");
            }
            if (i == b)
            {
                stringbuilder.append(">>");
            }
            stringbuilder.append(a[i]);
            if (i == b)
            {
                stringbuilder.append("<<");
            }
        }

        stringbuilder.append("]>");
        return stringbuilder.toString();
    }
}
