// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.c;

import com.google.android.m4b.maps.m.c;
import com.google.android.m4b.maps.y.d;
import com.google.android.m4b.maps.y.j;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

public abstract class com.google.android.m4b.maps.c.a
{
    static final class a extends d
    {

        final char a[];
        final int b;
        final int c;
        final int d;
        final int e;
        private final String i;
        private final byte j[];
        private final boolean k[];

        public final boolean a(char c1)
        {
            return d.f.a(c1) && j[c1] != -1;
        }

        public final String toString()
        {
            return i;
        }

        a(String s, char ac[])
        {
            boolean flag = false;
            super();
            i = (String)com.google.android.m4b.maps.y.j.a(s);
            a = (char[])com.google.android.m4b.maps.y.j.a(ac);
            int l;
            try
            {
                c = com.google.android.m4b.maps.m.c.a(ac.length, RoundingMode.UNNECESSARY);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalArgumentException((new StringBuilder("Illegal alphabet length ")).append(ac.length).toString(), s);
            }
            l = Math.min(8, Integer.lowestOneBit(c));
            d = 8 / l;
            e = c / l;
            b = ac.length - 1;
            s = new byte[128];
            Arrays.fill(s, (byte)-1);
            l = 0;
            while (l < ac.length) 
            {
                char c1 = ac[l];
                com.google.android.m4b.maps.y.j.a(d.f.a(c1), "Non-ASCII character: %s", new Object[] {
                    Character.valueOf(c1)
                });
                boolean flag1;
                if (s[c1] == -1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                com.google.android.m4b.maps.y.j.a(flag1, "Duplicate character: %s", new Object[] {
                    Character.valueOf(c1)
                });
                s[c1] = (byte)l;
                l++;
            }
            j = s;
            s = new boolean[d];
            for (int i1 = ((flag) ? 1 : 0); i1 < e; i1++)
            {
                s[com.google.android.m4b.maps.m.c.a(i1 * 8, c, RoundingMode.CEILING)] = 1;
            }

            k = s;
        }
    }

    static final class b extends com.google.android.m4b.maps.c.a
    {

        private final a a;
        private final Character b;

        static a a(b b1)
        {
            return b1.a;
        }

        static Character b(b b1)
        {
            return b1.b;
        }

        final int a(int i)
        {
            return a.d * com.google.android.m4b.maps.m.c.a(i, a.e, RoundingMode.CEILING);
        }

        public final com.google.android.m4b.maps.c.a a()
        {
            if (b == null)
            {
                return this;
            } else
            {
                return new b(a, null);
            }
        }

        final c.a a(c.b b1)
        {
            j.a(b1);
            return new c.a(this, b1) {

                private int a;
                private int b;
                private int c;
                private c.b d;
                private b e;

                public final void a()
                {
                    if (b > 0)
                    {
                        int i = a;
                        int k = b.a(e).c;
                        int l = b;
                        int i1 = b.a(e).b;
                        d.a(b.a(e).a[i << k - l & i1]);
                        c = c + 1;
                        if (b.b(e) != null)
                        {
                            for (; c % b.a(e).d != 0; c = c + 1)
                            {
                                d.a(b.b(e).charValue());
                            }

                        }
                    }
                }

                public final void a(byte byte0)
                {
                    a = a << 8;
                    a = a | byte0 & 0xff;
                    for (b = b + 8; b >= b.a(e).c; b = b - b.a(e).c)
                    {
                        byte0 = a;
                        int i = b;
                        int k = b.a(e).c;
                        int l = b.a(e).b;
                        d.a(b.a(e).a[byte0 >> i - k & l]);
                        c = c + 1;
                    }

                }

            
            {
                e = b1;
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

        private b(a a1, Character character)
        {
            a = (a)j.a(a1);
            boolean flag;
            if (character == null || !a1.a(character.charValue()))
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
            this(new a(s, s1.toCharArray()), character);
        }
    }


    private static final com.google.android.m4b.maps.c.a a = new b("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    private static final com.google.android.m4b.maps.c.a b = new b("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
    private static final com.google.android.m4b.maps.c.a c = new b("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    private static final com.google.android.m4b.maps.c.a d = new b("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    private static final com.google.android.m4b.maps.c.a e = new b("base16()", "0123456789ABCDEF", null);

    com.google.android.m4b.maps.c.a()
    {
    }

    private String a(byte abyte0[], int i)
    {
        int k = 0;
        j.a(abyte0);
        j.a(0, i + 0, abyte0.length);
        c._cls1 _lcls1 = new c._cls1(new StringBuilder(a(i)));
        c.a a1 = a(((c.b) (_lcls1)));
        while (k < i) 
        {
            try
            {
                a1.a(abyte0[k + 0]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new AssertionError("impossible");
            }
            k++;
        }
        a1.a();
        return _lcls1.toString();
    }

    public static com.google.android.m4b.maps.c.a b()
    {
        return b;
    }

    abstract int a(int i);

    public abstract com.google.android.m4b.maps.c.a a();

    abstract c.a a(c.b b1);

    public final String a(byte abyte0[])
    {
        return a((byte[])j.a(abyte0), abyte0.length);
    }

}
