// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;


// Referenced classes of package org.c.c:
//            l

public final class m extends Enum
{

    public static final m CLIENT_ERROR;
    public static final m INFORMATIONAL;
    public static final m REDIRECTION;
    public static final m SERVER_ERROR;
    public static final m SUCCESSFUL;
    private static final m b[];
    private final int a;

    private m(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    static m a(l l1)
    {
        int j = l1.value() / 100;
        m am[] = values();
        int k = am.length;
        for (int i = 0; i < k; i++)
        {
            m m1 = am[i];
            if (m1.a == j)
            {
                return m1;
            }
        }

        throw new IllegalArgumentException((new StringBuilder("No matching constant for [")).append(l1).append("]").toString());
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(org/c/c/m, s);
    }

    public static m[] values()
    {
        return (m[])b.clone();
    }

    public final int value()
    {
        return a;
    }

    static 
    {
        INFORMATIONAL = new m("INFORMATIONAL", 0, 1);
        SUCCESSFUL = new m("SUCCESSFUL", 1, 2);
        REDIRECTION = new m("REDIRECTION", 2, 3);
        CLIENT_ERROR = new m("CLIENT_ERROR", 3, 4);
        SERVER_ERROR = new m("SERVER_ERROR", 4, 5);
        b = (new m[] {
            INFORMATIONAL, SUCCESSFUL, REDIRECTION, CLIENT_ERROR, SERVER_ERROR
        });
    }
}
