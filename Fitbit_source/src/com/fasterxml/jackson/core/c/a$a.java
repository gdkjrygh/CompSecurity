// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.c;


// Referenced classes of package com.fasterxml.jackson.core.c:
//            a, c

static final class c
{

    protected final c a;
    protected final b b;
    private final int c;

    public int a()
    {
        return c;
    }

    public c a(int i, int j, int k)
    {
        if (a.hashCode() != i || !a.a(j, k)) goto _L2; else goto _L1
_L1:
        c c1 = a;
_L6:
        return c1;
_L2:
        c c2 = b;
_L7:
        if (c2 == null) goto _L4; else goto _L3
_L3:
        c c3;
        c3 = c2.a;
        if (c3.hashCode() != i)
        {
            continue; /* Loop/switch isn't completed */
        }
        c1 = c3;
        if (c3.a(j, k)) goto _L6; else goto _L5
_L5:
        c2 = c2.b;
          goto _L7
_L4:
        return null;
    }

    public c a(int i, int ai[], int j)
    {
        if (a.hashCode() != i || !a.a(ai, j)) goto _L2; else goto _L1
_L1:
        c c1 = a;
_L6:
        return c1;
_L2:
        b b1 = b;
_L7:
        if (b1 == null) goto _L4; else goto _L3
_L3:
        c c2;
        c2 = b1.a;
        if (c2.hashCode() != i)
        {
            continue; /* Loop/switch isn't completed */
        }
        c1 = c2;
        if (c2.a(ai, j)) goto _L6; else goto _L5
_L5:
        b1 = b1.b;
          goto _L7
_L4:
        return null;
    }

    (c c1,  )
    {
        a = c1;
        b = ;
        int i;
        if ( == null)
        {
            i = 1;
        } else
        {
            i = .c + 1;
        }
        c = i;
    }
}
