// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ak.c;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah, q, bj, 
//            aj, br

public static abstract class <init> extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/bo/bd$a, s);
    }

    public static <init>[] values()
    {
        return (<init>[])h.clone();
    }

    public ah a()
    {
        return null;
    }

    public abstract bd a(a a1);

    static 
    {
        a = new bd.a("SPOTLIGHT") {

            public final bd a(a a1)
            {
                if (com.google.android.m4b.maps.bo.ah.a(a1.d(1)) == ah.r && a1.i(10))
                {
                    r.a a2 = new r.a();
                    a2.a = a1.g(10);
                    return a2.a();
                } else
                {
                    return null;
                }
            }

        };
        b = new bd.a("SPOTLIGHT_DIFFTILE") {

            public final ah a()
            {
                return ah.v;
            }

            public final bd a(a a1)
            {
                if (com.google.android.m4b.maps.bo.ah.a(a1.d(1)) == ah.v && a1.i(27))
                {
                    return new q(a1.f(27));
                } else
                {
                    return null;
                }
            }

        };
        c = new bd.a("HIGHLIGHT") {

            public final bd a(a a1)
            {
                if (com.google.android.m4b.maps.bo.ah.a(a1.d(1)) == ah.s && a1.i(9))
                {
                    be.a a2 = new be.a();
                    a2.a = a1.g(9);
                    return a2.a();
                } else
                {
                    return null;
                }
            }

        };
        d = new bd.a("INDOOR") {

            public final bd a(a a1)
            {
                if (com.google.android.m4b.maps.bo.ah.a(a1.d(1)) == ah.n && a1.i(6))
                {
                    return com.google.android.m4b.maps.bo.bj.a(new c(com.google.android.m4b.maps.ak.a.c.b(a1.g(6)), 0x80000000));
                } else
                {
                    return null;
                }
            }

        };
        e = new bd.a("TRANSIT") {

            public final bd a(a a1)
            {
                if (com.google.android.m4b.maps.bo.ah.a(a1.d(1)) == ah.m)
                {
                    aj.a a2 = new aj.a();
                    if (a1.i(9))
                    {
                        a2.a = com.google.android.m4b.maps.ak.a.a(a1.g(9));
                    }
                    int j = a1.j(12);
                    for (int i = 0; i < j; i++)
                    {
                        int k = a1.b(12, i);
                        a2.b.add(Integer.valueOf(k));
                    }

                    a1 = a2.a();
                    if (a1.a(ah.m))
                    {
                        return a1;
                    } else
                    {
                        return null;
                    }
                } else
                {
                    return null;
                }
            }

        };
        f = new bd.a("MAPS_ENGINE") {

            public final bd a(a a1)
            {
                a a2;
label0:
                {
                    Object obj = null;
                    ah ah1 = com.google.android.m4b.maps.bo.ah.a(a1.d(1));
                    if (ah1 != ah.x)
                    {
                        a2 = obj;
                        if (ah1 != ah.w)
                        {
                            break label0;
                        }
                    }
                    a1 = new br(a1.f(29));
                    a2 = obj;
                    if (a1.a(ah1))
                    {
                        a2 = a1;
                    }
                }
                return a2;
            }

        };
        g = new bd.a("ALTERNATE_PAINTFE") {

            public final bd a(a a1)
            {
                com.google.android.m4b.maps.bo.ah.a(a1.d(1));
                if (a1.i(13))
                {
                    at.a a2 = new at.a();
                    a2.a = a1.g(13);
                    return a2.a();
                } else
                {
                    return null;
                }
            }

        };
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private _cls7(String s, int i)
    {
        super(s, i);
    }

    _cls7(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
