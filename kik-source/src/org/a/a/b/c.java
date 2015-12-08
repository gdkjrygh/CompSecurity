// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b;

import java.io.Writer;
import org.a.a.b.b.a.a;
import org.a.a.b.b.a.b;
import org.a.a.b.b.a.d;
import org.a.a.b.b.a.e;
import org.a.a.b.b.a.f;
import org.a.a.b.b.a.g;
import org.a.a.b.b.a.h;
import org.a.a.b.b.a.i;

// Referenced classes of package org.a.a.b:
//            d

public final class c
{
    static final class a extends org.a.a.b.b.a.b
    {

        private static final String a = "\"";
        private static final char b[] = {
            ',', '"', '\r', '\n'
        };

        public final int a(CharSequence charsequence, int i1, Writer writer)
        {
            if (i1 != 0)
            {
                throw new IllegalStateException("CsvEscaper should never reach the [1] index");
            }
            if (org.a.a.b.d.b(charsequence.toString(), b))
            {
                writer.write(charsequence.toString());
            } else
            {
                writer.write(34);
                writer.write(org.a.a.b.d.a(charsequence.toString(), a, (new StringBuilder()).append(a).append(a).toString()));
                writer.write(34);
            }
            return charsequence.length();
        }


        a()
        {
        }
    }

    static final class b extends org.a.a.b.b.a.b
    {

        private static final String a = "\"";
        private static final char b[] = {
            ',', '"', '\r', '\n'
        };

        public final int a(CharSequence charsequence, int i1, Writer writer)
        {
            if (i1 != 0)
            {
                throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
            }
            if (charsequence.charAt(0) != '"' || charsequence.charAt(charsequence.length() - 1) != '"')
            {
                writer.write(charsequence.toString());
                return charsequence.length();
            }
            String s = charsequence.subSequence(1, charsequence.length() - 1).toString();
            if (org.a.a.b.d.a(s, b))
            {
                writer.write(org.a.a.b.d.a(s, (new StringBuilder()).append(a).append(a).toString(), a));
            } else
            {
                writer.write(charsequence.toString());
            }
            return charsequence.length();
        }


        b()
        {
        }
    }


    public static final org.a.a.b.b.a.b a;
    public static final org.a.a.b.b.a.b b = new org.a.a.b.b.a.a(new org.a.a.b.b.a.b[] {
        new e(new String[][] {
            new String[] {
                "'", "\\'"
            }, new String[] {
                "\"", "\\\""
            }, new String[] {
                "\\", "\\\\"
            }, new String[] {
                "/", "\\/"
            }
        }), new e(org.a.a.b.b.a.d.i()), org.a.a.b.b.a.h.a()
    });
    public static final org.a.a.b.b.a.b c = new org.a.a.b.b.a.a(new org.a.a.b.b.a.b[] {
        new e(org.a.a.b.b.a.d.e()), new e(org.a.a.b.b.a.d.g())
    });
    public static final org.a.a.b.b.a.b d = new org.a.a.b.b.a.a(new org.a.a.b.b.a.b[] {
        new e(org.a.a.b.b.a.d.e()), new e(org.a.a.b.b.a.d.a())
    });
    public static final org.a.a.b.b.a.b e = new org.a.a.b.b.a.a(new org.a.a.b.b.a.b[] {
        new e(org.a.a.b.b.a.d.e()), new e(org.a.a.b.b.a.d.a()), new e(org.a.a.b.b.a.d.c())
    });
    public static final org.a.a.b.b.a.b f = new a();
    public static final org.a.a.b.b.a.b g;
    public static final org.a.a.b.b.a.b h;
    public static final org.a.a.b.b.a.b i = new org.a.a.b.b.a.a(new org.a.a.b.b.a.b[] {
        new e(org.a.a.b.b.a.d.f()), new e(org.a.a.b.b.a.d.b()), new f()
    });
    public static final org.a.a.b.b.a.b j = new org.a.a.b.b.a.a(new org.a.a.b.b.a.b[] {
        new e(org.a.a.b.b.a.d.f()), new e(org.a.a.b.b.a.d.b()), new e(org.a.a.b.b.a.d.d()), new f()
    });
    public static final org.a.a.b.b.a.b k = new org.a.a.b.b.a.a(new org.a.a.b.b.a.b[] {
        new e(org.a.a.b.b.a.d.f()), new e(org.a.a.b.b.a.d.h()), new f()
    });
    public static final org.a.a.b.b.a.b l = new b();

    public static final String a(String s)
    {
        return b.a(s);
    }

    static 
    {
        String as[] = {
            "\\", "\\\\"
        };
        a = (new e(new String[][] {
            new String[] {
                "\"", "\\\""
            }, as
        })).a(new org.a.a.b.b.a.b[] {
            new e(org.a.a.b.b.a.d.i())
        }).a(new org.a.a.b.b.a.b[] {
            org.a.a.b.b.a.h.a()
        });
        Object obj = new g();
        i i1 = new i();
        e e1 = new e(org.a.a.b.b.a.d.j());
        String as1[] = {
            "\\", ""
        };
        obj = new org.a.a.b.b.a.a(new org.a.a.b.b.a.b[] {
            obj, i1, e1, new e(new String[][] {
                new String[] {
                    "\\\\", "\\"
                }, new String[] {
                    "\\\"", "\""
                }, new String[] {
                    "\\'", "'"
                }, as1
            })
        });
        g = ((org.a.a.b.b.a.b) (obj));
        h = ((org.a.a.b.b.a.b) (obj));
    }
}
