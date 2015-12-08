// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bu

public static abstract class <init> extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static e e;
    private static final e f[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/aa/bu$b, s);
    }

    public static <init>[] values()
    {
        return (<init>[])f.clone();
    }

    abstract int a(Comparator comparator, Object obj, List list, int i);

    static 
    {
        a = new bu.b("ANY_PRESENT") {

            final int a(Comparator comparator, Object obj, List list, int i)
            {
                return i;
            }

        };
        b = new bu.b("LAST_PRESENT") {

            final int a(Comparator comparator, Object obj, List list, int i)
            {
                for (int j = list.size() - 1; i < j;)
                {
                    int k = i + j + 1 >>> 1;
                    if (comparator.compare(list.get(k), obj) > 0)
                    {
                        j = k - 1;
                    } else
                    {
                        i = k;
                    }
                }

                return i;
            }

        };
        c = new bu.b("FIRST_PRESENT") {

            final int a(Comparator comparator, Object obj, List list, int i)
            {
                int j;
                for (j = 0; j < i;)
                {
                    int k = j + i >>> 1;
                    if (comparator.compare(list.get(k), obj) < 0)
                    {
                        j = k + 1;
                    } else
                    {
                        i = k;
                    }
                }

                return j;
            }

        };
        d = new bu.b("FIRST_AFTER") {

            public final int a(Comparator comparator, Object obj, List list, int i)
            {
                return b.a(comparator, obj, list, i) + 1;
            }

        };
        e = new bu.b("LAST_BEFORE") {

            public final int a(Comparator comparator, Object obj, List list, int i)
            {
                return c.a(comparator, obj, list, i) - 1;
            }

        };
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
