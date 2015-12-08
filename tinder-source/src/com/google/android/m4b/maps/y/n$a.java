// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


// Referenced classes of package com.google.android.m4b.maps.y:
//            b, n, d

static abstract class b extends b
{

    final CharSequence b;
    private d c;
    private boolean d;
    private int e;
    private int f;

    abstract int a(int i);

    protected final Object a()
    {
        int j = e;
        do
        {
            if (e == -1)
            {
                break;
            }
            int i = a(e);
            if (i == -1)
            {
                i = b.length();
                e = -1;
            } else
            {
                e = b(i);
            }
            if (e == j)
            {
                e = e + 1;
                if (e >= b.length())
                {
                    e = -1;
                }
            } else
            {
                for (; j < i && c.a(b.charAt(j)); j++) { }
                for (; i > j && c.a(b.charAt(i - 1)); i--) { }
                if (d && j == i)
                {
                    j = e;
                } else
                {
                    int k;
                    if (f == 1)
                    {
                        i = b.length();
                        e = -1;
                        do
                        {
                            k = i;
                            if (i <= j)
                            {
                                break;
                            }
                            k = i;
                            if (!c.a(b.charAt(i - 1)))
                            {
                                break;
                            }
                            i--;
                        } while (true);
                    } else
                    {
                        f = f - 1;
                        k = i;
                    }
                    return b.subSequence(j, k).toString();
                }
            }
        } while (true);
        super.a = c;
        return null;
    }

    abstract int b(int i);

    protected (n n1, CharSequence charsequence)
    {
        e = 0;
        c = n1.a;
        d = n1.b;
        f = n1.d;
        b = charsequence;
    }
}
