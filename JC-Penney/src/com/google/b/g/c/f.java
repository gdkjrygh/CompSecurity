// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.c;

import com.google.b.b.a;
import com.google.b.g.a.o;
import com.google.b.g.a.s;
import com.google.b.v;

// Referenced classes of package com.google.b.g.c:
//            b, e, g

final class f
{

    private static final int a[][];
    private static final int b[][];
    private static final int c[][];
    private static final int d[][] = {
        {
            8, 0
        }, {
            8, 1
        }, {
            8, 2
        }, {
            8, 3
        }, {
            8, 4
        }, {
            8, 5
        }, {
            8, 7
        }, {
            8, 8
        }, {
            7, 8
        }, {
            5, 8
        }, {
            4, 8
        }, {
            3, 8
        }, {
            2, 8
        }, {
            1, 8
        }, {
            0, 8
        }
    };

    static int a(int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); j != 0; i++)
        {
            j >>>= 1;
        }

        return i;
    }

    static int a(int i, int j)
    {
        if (j == 0)
        {
            throw new IllegalArgumentException("0 polynomial");
        }
        int k = a(j);
        for (i <<= k - 1; a(i) >= k; i ^= j << a(i) - k) { }
        return i;
    }

    private static void a(int i, int j, b b1)
    {
        for (int k = 0; k < 8; k++)
        {
            if (!b(b1.a(i + k, j)))
            {
                throw new v();
            }
            b1.a(i + k, j, 0);
        }

    }

    static void a(a a1, int i, b b1)
    {
        int l = b1.b() - 1;
        int k = b1.a() - 1;
        int i1 = -1;
        int j = 0;
        while (l > 0) 
        {
            if (l == 6)
            {
                l--;
            }
            for (; k >= 0 && k < b1.a(); k += i1)
            {
                int j1 = 0;
                while (j1 < 2) 
                {
                    int k1 = l - j1;
                    if (b(b1.a(k1, k)))
                    {
                        boolean flag;
                        boolean flag1;
                        if (j < a1.a())
                        {
                            flag = a1.a(j);
                            j++;
                        } else
                        {
                            flag = false;
                        }
                        flag1 = flag;
                        if (i != -1)
                        {
                            flag1 = flag;
                            if (com.google.b.g.c.e.a(i, k1, k))
                            {
                                if (!flag)
                                {
                                    flag1 = true;
                                } else
                                {
                                    flag1 = false;
                                }
                            }
                        }
                        b1.a(k1, k, flag1);
                    }
                    j1++;
                }
            }

            i1 = -i1;
            l -= 2;
            k += i1;
        }
        if (j != a1.a())
        {
            throw new v((new StringBuilder()).append("Not all bits consumed: ").append(j).append('/').append(a1.a()).toString());
        } else
        {
            return;
        }
    }

    static void a(a a1, o o1, s s1, int i, b b1)
    {
        a(b1);
        a(s1, b1);
        a(o1, i, b1);
        b(s1, b1);
        a(a1, i, b1);
    }

    static void a(o o1, int i, a a1)
    {
        if (!g.b(i))
        {
            throw new v("Invalid mask pattern");
        }
        i = o1.a() << 3 | i;
        a1.b(i, 5);
        a1.b(a(i, 1335), 10);
        o1 = new a();
        o1.b(21522, 15);
        a1.b(o1);
        if (a1.a() != 15)
        {
            throw new v((new StringBuilder()).append("should not happen but we got: ").append(a1.a()).toString());
        } else
        {
            return;
        }
    }

    static void a(o o1, int i, b b1)
    {
        a a1 = new a();
        a(o1, i, a1);
        i = 0;
        while (i < a1.a()) 
        {
            boolean flag = a1.a(a1.a() - 1 - i);
            b1.a(d[i][0], d[i][1], flag);
            if (i < 8)
            {
                b1.a(b1.b() - i - 1, 8, flag);
            } else
            {
                b1.a(8, (b1.a() - 7) + (i - 8), flag);
            }
            i++;
        }
    }

    static void a(s s1, a a1)
    {
        a1.b(s1.a(), 6);
        a1.b(a(s1.a(), 7973), 12);
        if (a1.a() != 18)
        {
            throw new v((new StringBuilder()).append("should not happen but we got: ").append(a1.a()).toString());
        } else
        {
            return;
        }
    }

    static void a(s s1, b b1)
    {
        d(b1);
        c(b1);
        c(s1, b1);
        b(b1);
    }

    static void a(b b1)
    {
        b1.a((byte)-1);
    }

    private static void b(int i, int j, b b1)
    {
        for (int k = 0; k < 7; k++)
        {
            if (!b(b1.a(i, j + k)))
            {
                throw new v();
            }
            b1.a(i, j + k, 0);
        }

    }

    static void b(s s1, b b1)
    {
        if (s1.a() >= 7)
        {
            a a1 = new a();
            a(s1, a1);
            int i = 17;
            int j = 0;
            while (j < 6) 
            {
                for (int k = 0; k < 3; k++)
                {
                    boolean flag = a1.a(i);
                    i--;
                    b1.a(j, (b1.a() - 11) + k, flag);
                    b1.a((b1.a() - 11) + k, j, flag);
                }

                j++;
            }
        }
    }

    private static void b(b b1)
    {
        for (int i = 8; i < b1.b() - 8; i++)
        {
            int j = (i + 1) % 2;
            if (b(b1.a(i, 6)))
            {
                b1.a(i, 6, j);
            }
            if (b(b1.a(6, i)))
            {
                b1.a(6, i, j);
            }
        }

    }

    private static boolean b(int i)
    {
        return i == -1;
    }

    private static void c(int i, int j, b b1)
    {
        for (int k = 0; k < 5; k++)
        {
            for (int l = 0; l < 5; l++)
            {
                b1.a(i + l, j + k, b[k][l]);
            }

        }

    }

    private static void c(s s1, b b1)
    {
        if (s1.a() >= 2) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = s1.a() - 1;
        s1 = c[i];
        int k = c[i].length;
        i = 0;
        do
        {
            if (i >= k)
            {
                continue;
            }
            int j = 0;
            do
            {
                if (j >= k)
                {
                    break;
                }
                int l = s1[i];
                int i1 = s1[j];
                if (i1 != -1 && l != -1 && b(b1.a(i1, l)))
                {
                    c(i1 - 2, l - 2, b1);
                }
                j++;
            } while (true);
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void c(b b1)
    {
        if (b1.a(8, b1.a() - 8) == 0)
        {
            throw new v();
        } else
        {
            b1.a(8, b1.a() - 8, 1);
            return;
        }
    }

    private static void d(int i, int j, b b1)
    {
        for (int k = 0; k < 7; k++)
        {
            for (int l = 0; l < 7; l++)
            {
                b1.a(i + l, j + k, a[k][l]);
            }

        }

    }

    private static void d(b b1)
    {
        int i = a[0].length;
        d(0, 0, b1);
        d(b1.b() - i, 0, b1);
        d(0, b1.b() - i, b1);
        a(0, 7, b1);
        a(b1.b() - 8, 7, b1);
        a(0, b1.b() - 8, b1);
        b(7, 0, b1);
        b(b1.a() - 7 - 1, 0, b1);
        b(7, b1.a() - 7, b1);
    }

    static 
    {
        int ai[] = {
            1, 1, 1, 1, 1, 1, 1
        };
        int ai1[] = {
            1, 0, 0, 0, 0, 0, 1
        };
        int ai2[] = {
            1, 0, 1, 1, 1, 0, 1
        };
        int ai3[] = {
            1, 0, 1, 1, 1, 0, 1
        };
        int ai4[] = {
            1, 0, 0, 0, 0, 0, 1
        };
        a = (new int[][] {
            ai, ai1, ai2, new int[] {
                1, 0, 1, 1, 1, 0, 1
            }, ai3, ai4, new int[] {
                1, 1, 1, 1, 1, 1, 1
            }
        });
        ai = (new int[] {
            1, 1, 1, 1, 1
        });
        ai1 = (new int[] {
            1, 0, 0, 0, 1
        });
        ai2 = (new int[] {
            1, 0, 0, 0, 1
        });
        b = (new int[][] {
            ai, ai1, new int[] {
                1, 0, 1, 0, 1
            }, ai2, new int[] {
                1, 1, 1, 1, 1
            }
        });
        ai = (new int[] {
            -1, -1, -1, -1, -1, -1, -1
        });
        ai1 = (new int[] {
            6, 18, -1, -1, -1, -1, -1
        });
        ai2 = (new int[] {
            6, 22, -1, -1, -1, -1, -1
        });
        ai3 = (new int[] {
            6, 26, -1, -1, -1, -1, -1
        });
        ai4 = (new int[] {
            6, 34, -1, -1, -1, -1, -1
        });
        int ai5[] = {
            6, 22, 38, -1, -1, -1, -1
        };
        int ai6[] = {
            6, 24, 42, -1, -1, -1, -1
        };
        int ai7[] = {
            6, 26, 46, -1, -1, -1, -1
        };
        int ai8[] = {
            6, 30, 54, -1, -1, -1, -1
        };
        int ai9[] = {
            6, 32, 58, -1, -1, -1, -1
        };
        int ai10[] = {
            6, 34, 62, -1, -1, -1, -1
        };
        int ai11[] = {
            6, 26, 46, 66, -1, -1, -1
        };
        int ai12[] = {
            6, 26, 48, 70, -1, -1, -1
        };
        int ai13[] = {
            6, 26, 50, 74, -1, -1, -1
        };
        int ai14[] = {
            6, 30, 54, 78, -1, -1, -1
        };
        int ai15[] = {
            6, 30, 56, 82, -1, -1, -1
        };
        int ai16[] = {
            6, 30, 58, 86, -1, -1, -1
        };
        int ai17[] = {
            6, 30, 54, 78, 102, -1, -1
        };
        int ai18[] = {
            6, 32, 58, 84, 110, -1, -1
        };
        int ai19[] = {
            6, 30, 58, 86, 114, -1, -1
        };
        int ai20[] = {
            6, 34, 62, 90, 118, -1, -1
        };
        int ai21[] = {
            6, 26, 50, 74, 98, 122, -1
        };
        int ai22[] = {
            6, 30, 56, 82, 108, 134, -1
        };
        int ai23[] = {
            6, 30, 58, 86, 114, 142, 170
        };
        c = (new int[][] {
            ai, ai1, ai2, ai3, new int[] {
                6, 30, -1, -1, -1, -1, -1
            }, ai4, ai5, ai6, ai7, new int[] {
                6, 28, 50, -1, -1, -1, -1
            }, 
            ai8, ai9, ai10, ai11, ai12, ai13, ai14, ai15, ai16, new int[] {
                6, 34, 62, 90, -1, -1, -1
            }, 
            new int[] {
                6, 28, 50, 72, 94, -1, -1
            }, new int[] {
                6, 26, 50, 74, 98, -1, -1
            }, ai17, new int[] {
                6, 28, 54, 80, 106, -1, -1
            }, ai18, ai19, ai20, ai21, new int[] {
                6, 30, 54, 78, 102, 126, -1
            }, new int[] {
                6, 26, 52, 78, 104, 130, -1
            }, 
            ai22, new int[] {
                6, 34, 60, 86, 112, 138, -1
            }, new int[] {
                6, 30, 58, 86, 114, 142, -1
            }, new int[] {
                6, 34, 62, 90, 118, 146, -1
            }, new int[] {
                6, 30, 54, 78, 102, 126, 150
            }, new int[] {
                6, 24, 50, 76, 102, 128, 154
            }, new int[] {
                6, 28, 54, 80, 106, 132, 158
            }, new int[] {
                6, 32, 58, 84, 110, 136, 162
            }, new int[] {
                6, 26, 54, 82, 110, 138, 166
            }, ai23
        });
    }
}
