// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;

import com.google.b.b.b;
import com.google.b.h;

// Referenced classes of package com.google.b.g.a:
//            u, t, p, o

public final class s
{

    private static final int a[] = {
        31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 0x10b78, 
        0x1145d, 0x12a17, 0x13532, 0x149a6, 0x15683, 0x168c9, 0x177ec, 0x18ec4, 0x191e1, 0x1afab, 
        0x1b08e, 0x1cc1a, 0x1d33f, 0x1ed75, 0x1f250, 0x209d5, 0x216f0, 0x228ba, 0x2379f, 0x24b0b, 
        0x2542e, 0x26a64, 0x27541, 0x28c69
    };
    private static final s b[] = f();
    private final int c;
    private final int d[];
    private final u e[];
    private final int f;

    private transient s(int i, int ai[], u au[])
    {
        boolean flag = false;
        super();
        c = i;
        d = ai;
        e = au;
        int l = au[0].a();
        ai = au[0].d();
        int i1 = ai.length;
        int j = 0;
        for (i = ((flag) ? 1 : 0); i < i1; i++)
        {
            au = ai[i];
            int k = au.a();
            j += (au.b() + l) * k;
        }

        f = j;
    }

    public static s a(int i)
    {
        if (i % 4 != 1)
        {
            throw h.a();
        }
        s s1;
        try
        {
            s1 = b((i - 17) / 4);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw h.a();
        }
        return s1;
    }

    public static s b(int i)
    {
        if (i < 1 || i > 40)
        {
            throw new IllegalArgumentException();
        } else
        {
            return b[i - 1];
        }
    }

    static s c(int i)
    {
        int j = 0;
        int k = 0x7fffffff;
        int i1 = 0;
        while (j < a.length) 
        {
            int l = a[j];
            if (l == i)
            {
                return b(j + 7);
            }
            int j1 = p.a(i, l);
            l = k;
            if (j1 < k)
            {
                i1 = j + 7;
                l = j1;
            }
            j++;
            k = l;
        }
        if (k <= 3)
        {
            return b(i1);
        } else
        {
            return null;
        }
    }

    private static s[] f()
    {
        Object obj = new u(7, new t[] {
            new t(1, 19)
        });
        Object obj1 = new u(10, new t[] {
            new t(1, 16)
        });
        Object obj2 = new u(13, new t[] {
            new t(1, 13)
        });
        Object obj3 = new u(17, new t[] {
            new t(1, 9)
        });
        obj = new s(1, new int[0], new u[] {
            obj, obj1, obj2, obj3
        });
        obj1 = new u(10, new t[] {
            new t(1, 34)
        });
        obj2 = new u(16, new t[] {
            new t(1, 28)
        });
        obj3 = new u(22, new t[] {
            new t(1, 22)
        });
        Object obj4 = new u(28, new t[] {
            new t(1, 16)
        });
        obj1 = new s(2, new int[] {
            6, 18
        }, new u[] {
            obj1, obj2, obj3, obj4
        });
        obj2 = new u(15, new t[] {
            new t(1, 55)
        });
        obj3 = new u(26, new t[] {
            new t(1, 44)
        });
        obj4 = new u(18, new t[] {
            new t(2, 17)
        });
        Object obj5 = new u(22, new t[] {
            new t(2, 13)
        });
        obj2 = new s(3, new int[] {
            6, 22
        }, new u[] {
            obj2, obj3, obj4, obj5
        });
        obj3 = new u(20, new t[] {
            new t(1, 80)
        });
        obj4 = new u(18, new t[] {
            new t(2, 32)
        });
        obj5 = new u(26, new t[] {
            new t(2, 24)
        });
        Object obj6 = new u(16, new t[] {
            new t(4, 9)
        });
        obj3 = new s(4, new int[] {
            6, 26
        }, new u[] {
            obj3, obj4, obj5, obj6
        });
        obj4 = new u(26, new t[] {
            new t(1, 108)
        });
        obj5 = new u(24, new t[] {
            new t(2, 43)
        });
        obj6 = new u(18, new t[] {
            new t(2, 15), new t(2, 16)
        });
        Object obj7 = new u(22, new t[] {
            new t(2, 11), new t(2, 12)
        });
        obj4 = new s(5, new int[] {
            6, 30
        }, new u[] {
            obj4, obj5, obj6, obj7
        });
        obj5 = new u(18, new t[] {
            new t(2, 68)
        });
        obj6 = new u(16, new t[] {
            new t(4, 27)
        });
        obj7 = new u(24, new t[] {
            new t(4, 19)
        });
        Object obj8 = new u(28, new t[] {
            new t(4, 15)
        });
        obj5 = new s(6, new int[] {
            6, 34
        }, new u[] {
            obj5, obj6, obj7, obj8
        });
        obj6 = new u(20, new t[] {
            new t(2, 78)
        });
        obj7 = new u(18, new t[] {
            new t(4, 31)
        });
        obj8 = new u(18, new t[] {
            new t(2, 14), new t(4, 15)
        });
        Object obj9 = new u(26, new t[] {
            new t(4, 13), new t(1, 14)
        });
        obj6 = new s(7, new int[] {
            6, 22, 38
        }, new u[] {
            obj6, obj7, obj8, obj9
        });
        obj7 = new u(24, new t[] {
            new t(2, 97)
        });
        obj8 = new u(22, new t[] {
            new t(2, 38), new t(2, 39)
        });
        obj9 = new u(22, new t[] {
            new t(4, 18), new t(2, 19)
        });
        Object obj10 = new u(26, new t[] {
            new t(4, 14), new t(2, 15)
        });
        obj7 = new s(8, new int[] {
            6, 24, 42
        }, new u[] {
            obj7, obj8, obj9, obj10
        });
        obj8 = new u(30, new t[] {
            new t(2, 116)
        });
        obj9 = new u(22, new t[] {
            new t(3, 36), new t(2, 37)
        });
        obj10 = new u(20, new t[] {
            new t(4, 16), new t(4, 17)
        });
        Object obj11 = new u(24, new t[] {
            new t(4, 12), new t(4, 13)
        });
        obj8 = new s(9, new int[] {
            6, 26, 46
        }, new u[] {
            obj8, obj9, obj10, obj11
        });
        obj9 = new u(18, new t[] {
            new t(2, 68), new t(2, 69)
        });
        obj10 = new u(26, new t[] {
            new t(4, 43), new t(1, 44)
        });
        obj11 = new u(24, new t[] {
            new t(6, 19), new t(2, 20)
        });
        Object obj12 = new u(28, new t[] {
            new t(6, 15), new t(2, 16)
        });
        obj9 = new s(10, new int[] {
            6, 28, 50
        }, new u[] {
            obj9, obj10, obj11, obj12
        });
        obj10 = new u(20, new t[] {
            new t(4, 81)
        });
        obj11 = new u(30, new t[] {
            new t(1, 50), new t(4, 51)
        });
        obj12 = new u(28, new t[] {
            new t(4, 22), new t(4, 23)
        });
        Object obj13 = new u(24, new t[] {
            new t(3, 12), new t(8, 13)
        });
        obj10 = new s(11, new int[] {
            6, 30, 54
        }, new u[] {
            obj10, obj11, obj12, obj13
        });
        obj11 = new u(24, new t[] {
            new t(2, 92), new t(2, 93)
        });
        obj12 = new u(22, new t[] {
            new t(6, 36), new t(2, 37)
        });
        obj13 = new u(26, new t[] {
            new t(4, 20), new t(6, 21)
        });
        Object obj14 = new u(28, new t[] {
            new t(7, 14), new t(4, 15)
        });
        obj11 = new s(12, new int[] {
            6, 32, 58
        }, new u[] {
            obj11, obj12, obj13, obj14
        });
        obj12 = new u(26, new t[] {
            new t(4, 107)
        });
        obj13 = new u(22, new t[] {
            new t(8, 37), new t(1, 38)
        });
        obj14 = new u(24, new t[] {
            new t(8, 20), new t(4, 21)
        });
        Object obj15 = new u(22, new t[] {
            new t(12, 11), new t(4, 12)
        });
        obj12 = new s(13, new int[] {
            6, 34, 62
        }, new u[] {
            obj12, obj13, obj14, obj15
        });
        obj13 = new u(30, new t[] {
            new t(3, 115), new t(1, 116)
        });
        obj14 = new u(24, new t[] {
            new t(4, 40), new t(5, 41)
        });
        obj15 = new u(20, new t[] {
            new t(11, 16), new t(5, 17)
        });
        Object obj16 = new u(24, new t[] {
            new t(11, 12), new t(5, 13)
        });
        obj13 = new s(14, new int[] {
            6, 26, 46, 66
        }, new u[] {
            obj13, obj14, obj15, obj16
        });
        obj14 = new u(22, new t[] {
            new t(5, 87), new t(1, 88)
        });
        obj15 = new u(24, new t[] {
            new t(5, 41), new t(5, 42)
        });
        obj16 = new u(30, new t[] {
            new t(5, 24), new t(7, 25)
        });
        Object obj17 = new u(24, new t[] {
            new t(11, 12), new t(7, 13)
        });
        obj14 = new s(15, new int[] {
            6, 26, 48, 70
        }, new u[] {
            obj14, obj15, obj16, obj17
        });
        obj15 = new u(24, new t[] {
            new t(5, 98), new t(1, 99)
        });
        obj16 = new u(28, new t[] {
            new t(7, 45), new t(3, 46)
        });
        obj17 = new u(24, new t[] {
            new t(15, 19), new t(2, 20)
        });
        Object obj18 = new u(30, new t[] {
            new t(3, 15), new t(13, 16)
        });
        obj15 = new s(16, new int[] {
            6, 26, 50, 74
        }, new u[] {
            obj15, obj16, obj17, obj18
        });
        obj16 = new u(28, new t[] {
            new t(1, 107), new t(5, 108)
        });
        obj17 = new u(28, new t[] {
            new t(10, 46), new t(1, 47)
        });
        obj18 = new u(28, new t[] {
            new t(1, 22), new t(15, 23)
        });
        Object obj19 = new u(28, new t[] {
            new t(2, 14), new t(17, 15)
        });
        obj16 = new s(17, new int[] {
            6, 30, 54, 78
        }, new u[] {
            obj16, obj17, obj18, obj19
        });
        obj17 = new u(30, new t[] {
            new t(5, 120), new t(1, 121)
        });
        obj18 = new u(26, new t[] {
            new t(9, 43), new t(4, 44)
        });
        obj19 = new u(28, new t[] {
            new t(17, 22), new t(1, 23)
        });
        Object obj20 = new u(28, new t[] {
            new t(2, 14), new t(19, 15)
        });
        obj17 = new s(18, new int[] {
            6, 30, 56, 82
        }, new u[] {
            obj17, obj18, obj19, obj20
        });
        obj18 = new u(28, new t[] {
            new t(3, 113), new t(4, 114)
        });
        obj19 = new u(26, new t[] {
            new t(3, 44), new t(11, 45)
        });
        obj20 = new u(26, new t[] {
            new t(17, 21), new t(4, 22)
        });
        Object obj21 = new u(26, new t[] {
            new t(9, 13), new t(16, 14)
        });
        obj18 = new s(19, new int[] {
            6, 30, 58, 86
        }, new u[] {
            obj18, obj19, obj20, obj21
        });
        obj19 = new u(28, new t[] {
            new t(3, 107), new t(5, 108)
        });
        obj20 = new u(26, new t[] {
            new t(3, 41), new t(13, 42)
        });
        obj21 = new u(30, new t[] {
            new t(15, 24), new t(5, 25)
        });
        Object obj22 = new u(28, new t[] {
            new t(15, 15), new t(10, 16)
        });
        obj19 = new s(20, new int[] {
            6, 34, 62, 90
        }, new u[] {
            obj19, obj20, obj21, obj22
        });
        obj20 = new u(28, new t[] {
            new t(4, 116), new t(4, 117)
        });
        obj21 = new u(26, new t[] {
            new t(17, 42)
        });
        obj22 = new u(28, new t[] {
            new t(17, 22), new t(6, 23)
        });
        Object obj23 = new u(30, new t[] {
            new t(19, 16), new t(6, 17)
        });
        obj20 = new s(21, new int[] {
            6, 28, 50, 72, 94
        }, new u[] {
            obj20, obj21, obj22, obj23
        });
        obj21 = new u(28, new t[] {
            new t(2, 111), new t(7, 112)
        });
        obj22 = new u(28, new t[] {
            new t(17, 46)
        });
        obj23 = new u(30, new t[] {
            new t(7, 24), new t(16, 25)
        });
        Object obj24 = new u(24, new t[] {
            new t(34, 13)
        });
        obj21 = new s(22, new int[] {
            6, 26, 50, 74, 98
        }, new u[] {
            obj21, obj22, obj23, obj24
        });
        obj22 = new u(30, new t[] {
            new t(4, 121), new t(5, 122)
        });
        obj23 = new u(28, new t[] {
            new t(4, 47), new t(14, 48)
        });
        obj24 = new u(30, new t[] {
            new t(11, 24), new t(14, 25)
        });
        Object obj25 = new u(30, new t[] {
            new t(16, 15), new t(14, 16)
        });
        obj22 = new s(23, new int[] {
            6, 30, 54, 78, 102
        }, new u[] {
            obj22, obj23, obj24, obj25
        });
        obj23 = new u(30, new t[] {
            new t(6, 117), new t(4, 118)
        });
        obj24 = new u(28, new t[] {
            new t(6, 45), new t(14, 46)
        });
        obj25 = new u(30, new t[] {
            new t(11, 24), new t(16, 25)
        });
        Object obj26 = new u(30, new t[] {
            new t(30, 16), new t(2, 17)
        });
        obj23 = new s(24, new int[] {
            6, 28, 54, 80, 106
        }, new u[] {
            obj23, obj24, obj25, obj26
        });
        obj24 = new u(26, new t[] {
            new t(8, 106), new t(4, 107)
        });
        obj25 = new u(28, new t[] {
            new t(8, 47), new t(13, 48)
        });
        obj26 = new u(30, new t[] {
            new t(7, 24), new t(22, 25)
        });
        Object obj27 = new u(30, new t[] {
            new t(22, 15), new t(13, 16)
        });
        obj24 = new s(25, new int[] {
            6, 32, 58, 84, 110
        }, new u[] {
            obj24, obj25, obj26, obj27
        });
        obj25 = new u(28, new t[] {
            new t(10, 114), new t(2, 115)
        });
        obj26 = new u(28, new t[] {
            new t(19, 46), new t(4, 47)
        });
        obj27 = new u(28, new t[] {
            new t(28, 22), new t(6, 23)
        });
        Object obj28 = new u(30, new t[] {
            new t(33, 16), new t(4, 17)
        });
        obj25 = new s(26, new int[] {
            6, 30, 58, 86, 114
        }, new u[] {
            obj25, obj26, obj27, obj28
        });
        obj26 = new u(30, new t[] {
            new t(8, 122), new t(4, 123)
        });
        obj27 = new u(28, new t[] {
            new t(22, 45), new t(3, 46)
        });
        obj28 = new u(30, new t[] {
            new t(8, 23), new t(26, 24)
        });
        Object obj29 = new u(30, new t[] {
            new t(12, 15), new t(28, 16)
        });
        obj26 = new s(27, new int[] {
            6, 34, 62, 90, 118
        }, new u[] {
            obj26, obj27, obj28, obj29
        });
        obj27 = new u(30, new t[] {
            new t(3, 117), new t(10, 118)
        });
        obj28 = new u(28, new t[] {
            new t(3, 45), new t(23, 46)
        });
        obj29 = new u(30, new t[] {
            new t(4, 24), new t(31, 25)
        });
        Object obj30 = new u(30, new t[] {
            new t(11, 15), new t(31, 16)
        });
        obj27 = new s(28, new int[] {
            6, 26, 50, 74, 98, 122
        }, new u[] {
            obj27, obj28, obj29, obj30
        });
        obj28 = new u(30, new t[] {
            new t(7, 116), new t(7, 117)
        });
        obj29 = new u(28, new t[] {
            new t(21, 45), new t(7, 46)
        });
        obj30 = new u(30, new t[] {
            new t(1, 23), new t(37, 24)
        });
        Object obj31 = new u(30, new t[] {
            new t(19, 15), new t(26, 16)
        });
        obj28 = new s(29, new int[] {
            6, 30, 54, 78, 102, 126
        }, new u[] {
            obj28, obj29, obj30, obj31
        });
        obj29 = new u(30, new t[] {
            new t(5, 115), new t(10, 116)
        });
        obj30 = new u(28, new t[] {
            new t(19, 47), new t(10, 48)
        });
        obj31 = new u(30, new t[] {
            new t(15, 24), new t(25, 25)
        });
        Object obj32 = new u(30, new t[] {
            new t(23, 15), new t(25, 16)
        });
        obj29 = new s(30, new int[] {
            6, 26, 52, 78, 104, 130
        }, new u[] {
            obj29, obj30, obj31, obj32
        });
        obj30 = new u(30, new t[] {
            new t(13, 115), new t(3, 116)
        });
        obj31 = new u(28, new t[] {
            new t(2, 46), new t(29, 47)
        });
        obj32 = new u(30, new t[] {
            new t(42, 24), new t(1, 25)
        });
        Object obj33 = new u(30, new t[] {
            new t(23, 15), new t(28, 16)
        });
        obj30 = new s(31, new int[] {
            6, 30, 56, 82, 108, 134
        }, new u[] {
            obj30, obj31, obj32, obj33
        });
        obj31 = new u(30, new t[] {
            new t(17, 115)
        });
        obj32 = new u(28, new t[] {
            new t(10, 46), new t(23, 47)
        });
        obj33 = new u(30, new t[] {
            new t(10, 24), new t(35, 25)
        });
        Object obj34 = new u(30, new t[] {
            new t(19, 15), new t(35, 16)
        });
        obj31 = new s(32, new int[] {
            6, 34, 60, 86, 112, 138
        }, new u[] {
            obj31, obj32, obj33, obj34
        });
        obj32 = new u(30, new t[] {
            new t(17, 115), new t(1, 116)
        });
        obj33 = new u(28, new t[] {
            new t(14, 46), new t(21, 47)
        });
        obj34 = new u(30, new t[] {
            new t(29, 24), new t(19, 25)
        });
        Object obj35 = new u(30, new t[] {
            new t(11, 15), new t(46, 16)
        });
        obj32 = new s(33, new int[] {
            6, 30, 58, 86, 114, 142
        }, new u[] {
            obj32, obj33, obj34, obj35
        });
        obj33 = new u(30, new t[] {
            new t(13, 115), new t(6, 116)
        });
        obj34 = new u(28, new t[] {
            new t(14, 46), new t(23, 47)
        });
        obj35 = new u(30, new t[] {
            new t(44, 24), new t(7, 25)
        });
        Object obj36 = new u(30, new t[] {
            new t(59, 16), new t(1, 17)
        });
        obj33 = new s(34, new int[] {
            6, 34, 62, 90, 118, 146
        }, new u[] {
            obj33, obj34, obj35, obj36
        });
        obj34 = new u(30, new t[] {
            new t(12, 121), new t(7, 122)
        });
        obj35 = new u(28, new t[] {
            new t(12, 47), new t(26, 48)
        });
        obj36 = new u(30, new t[] {
            new t(39, 24), new t(14, 25)
        });
        Object obj37 = new u(30, new t[] {
            new t(22, 15), new t(41, 16)
        });
        obj34 = new s(35, new int[] {
            6, 30, 54, 78, 102, 126, 150
        }, new u[] {
            obj34, obj35, obj36, obj37
        });
        obj35 = new u(30, new t[] {
            new t(6, 121), new t(14, 122)
        });
        obj36 = new u(28, new t[] {
            new t(6, 47), new t(34, 48)
        });
        obj37 = new u(30, new t[] {
            new t(46, 24), new t(10, 25)
        });
        Object obj38 = new u(30, new t[] {
            new t(2, 15), new t(64, 16)
        });
        obj35 = new s(36, new int[] {
            6, 24, 50, 76, 102, 128, 154
        }, new u[] {
            obj35, obj36, obj37, obj38
        });
        obj36 = new u(30, new t[] {
            new t(17, 122), new t(4, 123)
        });
        obj37 = new u(28, new t[] {
            new t(29, 46), new t(14, 47)
        });
        obj38 = new u(30, new t[] {
            new t(49, 24), new t(10, 25)
        });
        u u1 = new u(30, new t[] {
            new t(24, 15), new t(46, 16)
        });
        obj36 = new s(37, new int[] {
            6, 28, 54, 80, 106, 132, 158
        }, new u[] {
            obj36, obj37, obj38, u1
        });
        obj37 = new u(30, new t[] {
            new t(4, 122), new t(18, 123)
        });
        obj38 = new u(28, new t[] {
            new t(13, 46), new t(32, 47)
        });
        u1 = new u(30, new t[] {
            new t(48, 24), new t(14, 25)
        });
        u u2 = new u(30, new t[] {
            new t(42, 15), new t(32, 16)
        });
        obj37 = new s(38, new int[] {
            6, 32, 58, 84, 110, 136, 162
        }, new u[] {
            obj37, obj38, u1, u2
        });
        obj38 = new u(30, new t[] {
            new t(20, 117), new t(4, 118)
        });
        u1 = new u(28, new t[] {
            new t(40, 47), new t(7, 48)
        });
        u2 = new u(30, new t[] {
            new t(43, 24), new t(22, 25)
        });
        u u3 = new u(30, new t[] {
            new t(10, 15), new t(67, 16)
        });
        obj38 = new s(39, new int[] {
            6, 26, 54, 82, 110, 138, 166
        }, new u[] {
            obj38, u1, u2, u3
        });
        u1 = new u(30, new t[] {
            new t(19, 118), new t(6, 119)
        });
        u2 = new u(28, new t[] {
            new t(18, 47), new t(31, 48)
        });
        u3 = new u(30, new t[] {
            new t(34, 24), new t(34, 25)
        });
        u u4 = new u(30, new t[] {
            new t(20, 15), new t(61, 16)
        });
        return (new s[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
            obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
            obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, 
            obj30, obj31, obj32, obj33, obj34, obj35, obj36, obj37, obj38, new s(40, new int[] {
                6, 30, 58, 86, 114, 142, 170
            }, new u[] {
                u1, u2, u3, u4
            })
        });
    }

    public int a()
    {
        return c;
    }

    public u a(o o1)
    {
        return e[o1.ordinal()];
    }

    public int[] b()
    {
        return d;
    }

    public int c()
    {
        return f;
    }

    public int d()
    {
        return c * 4 + 17;
    }

    b e()
    {
        int k = d();
        b b1 = new b(k);
        b1.a(0, 0, 9, 9);
        b1.a(k - 8, 0, 8, 9);
        b1.a(0, k - 8, 9, 8);
        int l = d.length;
        for (int i = 0; i < l; i++)
        {
            int i1 = d[i];
            int j = 0;
            while (j < l) 
            {
                if ((i != 0 || j != 0 && j != l - 1) && (i != l - 1 || j != 0))
                {
                    b1.a(d[j] - 2, i1 - 2, 5, 5);
                }
                j++;
            }
        }

        b1.a(6, 9, 1, k - 17);
        b1.a(9, 6, k - 17, 1);
        if (c > 6)
        {
            b1.a(k - 11, 0, 3, 6);
            b1.a(0, k - 11, 6, 3);
        }
        return b1;
    }

    public String toString()
    {
        return String.valueOf(c);
    }

}
