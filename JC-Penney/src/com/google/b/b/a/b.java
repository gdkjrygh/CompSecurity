// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.m;
import com.google.b.s;

// Referenced classes of package com.google.b.b.a:
//            a

public final class b
{

    private final com.google.b.b.b a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public b(com.google.b.b.b b1)
    {
        this(b1, 10, b1.f() / 2, b1.g() / 2);
    }

    public b(com.google.b.b.b b1, int i, int j, int k)
    {
        a = b1;
        b = b1.g();
        c = b1.f();
        i /= 2;
        d = j - i;
        e = j + i;
        g = k - i;
        f = i + k;
        if (g < 0 || d < 0 || f >= b || e >= c)
        {
            throw m.a();
        } else
        {
            return;
        }
    }

    private s a(float f1, float f2, float f3, float f4)
    {
        int j = com.google.b.b.a.a.a(com.google.b.b.a.a.a(f1, f2, f3, f4));
        f3 = (f3 - f1) / (float)j;
        f4 = (f4 - f2) / (float)j;
        for (int i = 0; i < j; i++)
        {
            int k = com.google.b.b.a.a.a((float)i * f3 + f1);
            int l = com.google.b.b.a.a.a((float)i * f4 + f2);
            if (a.a(k, l))
            {
                return new s(k, l);
            }
        }

        return null;
    }

    private boolean a(int i, int j, int k, boolean flag)
    {
        int l = i;
        if (!flag) goto _L2; else goto _L1
_L1:
        for (; i <= j; i++)
        {
            if (a.a(i, k))
            {
                return true;
            }
        }

          goto _L3
_L4:
        l++;
_L2:
        if (l > j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a.a(k, l))
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    private s[] a(s s1, s s2, s s3, s s4)
    {
        float f1 = s1.a();
        float f2 = s1.b();
        float f3 = s2.a();
        float f4 = s2.b();
        float f5 = s3.a();
        float f6 = s3.b();
        float f7 = s4.a();
        float f8 = s4.b();
        if (f1 < (float)c / 2.0F)
        {
            return (new s[] {
                new s(f7 - 1.0F, f8 + 1.0F), new s(f3 + 1.0F, f4 + 1.0F), new s(f5 - 1.0F, f6 - 1.0F), new s(f1 + 1.0F, f2 - 1.0F)
            });
        } else
        {
            return (new s[] {
                new s(f7 + 1.0F, f8 + 1.0F), new s(f3 + 1.0F, f4 - 1.0F), new s(f5 - 1.0F, f6 + 1.0F), new s(f1 - 1.0F, f2 - 1.0F)
            });
        }
    }

    public s[] a()
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        boolean flag;
        boolean flag2;
        boolean flag5;
        int l1;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        flag8 = false;
        flag7 = true;
        l = d;
        i = e;
        j = g;
        k = f;
        i1 = 0;
        flag2 = false;
        flag5 = false;
        flag = false;
        flag6 = false;
        l1 = 1;
_L1:
        s s1;
        s s2;
        int j1;
        if (l1 == 0)
        {
            break MISSING_BLOCK_LABEL_828;
        }
        boolean flag9 = true;
        l1 = 0;
        do
        {
            if (!flag9 && flag || i >= c)
            {
                break;
            }
            boolean flag13 = a(j, k, i, false);
            if (flag13)
            {
                i++;
                flag = true;
                l1 = 1;
                flag9 = flag13;
            } else
            {
                flag9 = flag13;
                if (!flag)
                {
                    i++;
                    flag9 = flag13;
                }
            }
        } while (true);
        if (i >= c)
        {
            boolean flag1 = true;
            i1 = i;
            i = k;
            k = j;
            j = l;
            l = ((flag1) ? 1 : 0);
        } else
        {
            boolean flag10 = true;
            do
            {
                if (!flag10 && flag5 || k >= b)
                {
                    break;
                }
                boolean flag14 = a(l, i, k, true);
                if (flag14)
                {
                    k++;
                    flag5 = true;
                    l1 = 1;
                    flag10 = flag14;
                } else
                {
                    flag10 = flag14;
                    if (!flag5)
                    {
                        k++;
                        flag10 = flag14;
                    }
                }
            } while (true);
            if (k >= b)
            {
                flag2 = true;
                i1 = i;
                i = k;
                j1 = l;
                k = j;
                l = ((flag2) ? 1 : 0);
                j = j1;
            } else
            {
                boolean flag11 = true;
                do
                {
                    if (!flag11 && flag2 || l < 0)
                    {
                        break;
                    }
                    boolean flag15 = a(j, k, l, false);
                    if (flag15)
                    {
                        l--;
                        flag2 = true;
                        l1 = 1;
                        flag11 = flag15;
                    } else
                    {
                        flag11 = flag15;
                        if (!flag2)
                        {
                            l--;
                            flag11 = flag15;
                        }
                    }
                } while (true);
                if (l < 0)
                {
                    boolean flag3 = true;
                    i1 = i;
                    i = k;
                    j1 = l;
                    k = j;
                    l = ((flag3) ? 1 : 0);
                    j = j1;
                } else
                {
label0:
                    {
                        int i2 = i1;
                        boolean flag12 = true;
                        i1 = l1;
                        l1 = i2;
                        do
                        {
                            if (!flag12 && l1 != 0 || j < 0)
                            {
                                break;
                            }
                            boolean flag16 = a(l, i, j, true);
                            if (flag16)
                            {
                                j--;
                                l1 = 1;
                                i1 = 1;
                                flag12 = flag16;
                            } else
                            {
                                flag12 = flag16;
                                if (l1 == 0)
                                {
                                    j--;
                                    flag12 = flag16;
                                }
                            }
                        } while (true);
                        if (j >= 0)
                        {
                            break label0;
                        }
                        boolean flag4 = true;
                        i1 = i;
                        i = k;
                        j1 = l;
                        k = j;
                        l = ((flag4) ? 1 : 0);
                        j = j1;
                    }
                }
            }
        }
_L5:
        if (l == 0 && flag6)
        {
            j1 = i1 - j;
            l = 1;
            s1 = null;
            break MISSING_BLOCK_LABEL_191;
        } else
        {
            throw m.a();
        }
        if (i1 != 0)
        {
            flag6 = true;
        }
        j2 = l1;
        l1 = i1;
        i1 = j2;
          goto _L1
        do
        {
            if (l >= j1)
            {
                break MISSING_BLOCK_LABEL_823;
            }
            s1 = a(j, i - l, j + l, i);
            int j2;
            if (s1 != null)
            {
                s2 = s1;
                break MISSING_BLOCK_LABEL_227;
            }
            l++;
        } while (true);
_L2:
        if (s3 == null)
        {
            throw m.a();
        }
        j = 1;
        s1 = null;
        s s4;
        for (; j < j1; j++)
        {
            s1 = a(i1, k + j, i1 - j, k);
            if (s1 != null)
            {
                s4 = s1;
                break MISSING_BLOCK_LABEL_723;
            }
        }

        s4 = s1;
        if (s4 == null)
        {
            throw m.a();
        }
        s1 = null;
        j = ((flag7) ? 1 : 0);
        do
        {
label1:
            {
                if (j < j1)
                {
                    s1 = a(i1, i - j, i1 - j, i);
                    if (s1 == null)
                    {
                        break label1;
                    }
                }
                if (s1 == null)
                {
                    throw m.a();
                } else
                {
                    return a(s1, s2, s4, s3);
                }
            }
            j++;
        } while (true);
_L4:
        if (s2 == null)
        {
            throw m.a();
        }
        l = 1;
        s1 = null;
        s s3;
        for (; l < j1; l++)
        {
            s1 = a(j, k + l, j + l, k);
            if (s1 != null)
            {
                s3 = s1;
                break MISSING_BLOCK_LABEL_664;
            }
        }

        s3 = s1;
          goto _L2
        s2 = s1;
        if (true) goto _L4; else goto _L3
_L3:
        i1 = i;
        i = k;
        int k1 = l;
        k = j;
        l = ((flag8) ? 1 : 0);
        j = k1;
          goto _L5
    }
}
