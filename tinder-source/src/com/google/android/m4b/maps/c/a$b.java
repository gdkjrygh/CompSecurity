// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.c;

import com.google.android.m4b.maps.m.c;
import com.google.android.m4b.maps.y.j;
import java.math.RoundingMode;

// Referenced classes of package com.google.android.m4b.maps.c:
//            a

static final class <init> extends a
{

    private final b a;
    private final Character b;

    static <init> a(<init> <init>1)
    {
        return <init>1.a;
    }

    static Character b(a a1)
    {
        return a1.b;
    }

    final int a(int i)
    {
        return a.d * c.a(i, a.e, RoundingMode.CEILING);
    }

    public final a a()
    {
        if (b == null)
        {
            return this;
        } else
        {
            return new <init>(a, null);
        }
    }

    final a a(a a1)
    {
        j.a(a1);
        return new c.a(a1) {

            private int a;
            private int b;
            private int c;
            private c.b d;
            private a.b e;

            public final void a()
            {
                if (b > 0)
                {
                    int i = a;
                    int k = a.b.a(e).c;
                    int l = b;
                    int i1 = a.b.a(e).b;
                    d.a(a.b.a(e).a[i << k - l & i1]);
                    c = c + 1;
                    if (a.b.b(e) != null)
                    {
                        for (; c % a.b.a(e).d != 0; c = c + 1)
                        {
                            d.a(a.b.b(e).charValue());
                        }

                    }
                }
            }

            public final void a(byte byte0)
            {
                a = a << 8;
                a = a | byte0 & 0xff;
                for (b = b + 8; b >= a.b.a(e).c; b = b - a.b.a(e).c)
                {
                    byte0 = a;
                    int i = b;
                    int k = a.b.a(e).c;
                    int l = a.b.a(e).b;
                    d.a(a.b.a(e).a[byte0 >> i - k & l]);
                    c = c + 1;
                }

            }

            
            {
                e = a.b.this;
                d = b2;
                super();
                a = 0;
                b = 0;
                c = 0;
            }
        };
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("BaseEncoding.");
        stringbuilder.append(a.toString());
        if (8 % a.c != 0)
        {
            if (b == null)
            {
                stringbuilder.append(".omitPadding()");
            } else
            {
                stringbuilder.append(".withPadChar(").append(b).append(')');
            }
        }
        return stringbuilder.toString();
    }

    private _cls1.c(_cls1.c c1, Character character)
    {
        a = (a)j.a(c1);
        boolean flag;
        if (character == null || !c1.a(character.charValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "Padding character %s was already in alphabet", new Object[] {
            character
        });
        b = character;
    }

    b(String s, String s1, Character character)
    {
        this(new <init>(s, s1.toCharArray()), character);
    }
}
