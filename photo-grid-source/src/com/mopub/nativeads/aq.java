// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import com.mopub.common.logging.MoPubLog;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.mopub.nativeads:
//            ac, NativeResponse

final class aq
{

    public static final int NOT_FOUND = -1;
    private final int a[] = new int[200];
    private final int b[] = new int[200];
    private int c;
    private final int d[] = new int[200];
    private final int e[] = new int[200];
    private final ac f[] = new ac[200];
    private int g;

    private aq(int ai[])
    {
        c = 0;
        g = 0;
        c = Math.min(ai.length, 200);
        System.arraycopy(ai, 0, b, 0, c);
        System.arraycopy(ai, 0, a, 0, c);
    }

    private static int a(int ai[], int j, int k)
    {
        j = c(ai, j, k);
        if (j < 0)
        {
            return ~j;
        }
        for (k = ai[j]; j >= 0 && ai[j] == k; j--) { }
        return j + 1;
    }

    static aq a()
    {
        return new aq(new int[0]);
    }

    static aq a(MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        int j = 0;
        Object obj = mopubclientpositioning.a();
        int j1 = mopubclientpositioning.b();
        int k;
        int l;
        int i1;
        if (j1 == 0x7fffffff)
        {
            l = ((List) (obj)).size();
        } else
        {
            l = 200;
        }
        mopubclientpositioning = new int[l];
        obj = ((List) (obj)).iterator();
        k = 0;
        do
        {
            i1 = j;
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            k = ((Integer)((Iterator) (obj)).next()).intValue() - j;
            mopubclientpositioning[j] = k;
            j++;
        } while (true);
        for (; i1 < l; i1++)
        {
            k = (k + j1) - 1;
            mopubclientpositioning[i1] = k;
        }

        return new aq(mopubclientpositioning);
    }

    private static int b(int ai[], int j, int k)
    {
        k = c(ai, j, k);
        if (k >= 0) goto _L2; else goto _L1
_L1:
        int l = ~k;
_L4:
        return l;
_L2:
        int i1 = ai[k];
_L6:
        l = k;
        if (k >= j) goto _L4; else goto _L3
_L3:
        l = k;
        if (ai[k] != i1) goto _L4; else goto _L5
_L5:
        k++;
          goto _L6
    }

    private static int c(int ai[], int j, int k)
    {
        int l;
label0:
        {
            l = j - 1;
            for (j = 0; j <= l;)
            {
                int i1 = j + l >>> 1;
                int j1 = ai[i1];
                if (j1 < k)
                {
                    j = i1 + 1;
                } else
                {
                    l = i1;
                    if (j1 <= k)
                    {
                        break label0;
                    }
                    l = i1 - 1;
                }
            }

            l = ~j;
        }
        return l;
    }

    final int a(int j, int k)
    {
        boolean flag = false;
        int ai[] = new int[g];
        int ai1[] = new int[g];
        int i1 = 0;
        int l = 0;
        while (i1 < g) 
        {
            int k1 = d[i1];
            int l1 = e[i1];
            int j1;
            if (j <= l1 && l1 < k)
            {
                ai[l] = k1;
                ai1[l] = l1 - l;
                f[i1].b().destroy();
                f[i1] = null;
                j1 = l + 1;
            } else
            {
                j1 = l;
                if (l > 0)
                {
                    j1 = i1 - l;
                    d[j1] = k1;
                    e[j1] = l1 - l;
                    f[j1] = f[i1];
                    j1 = l;
                }
            }
            i1++;
            l = j1;
        }
        if (l == 0)
        {
            return 0;
        }
        j = ai1[0];
        i1 = a(b, c, j);
        j = c - 1;
        do
        {
            k = ((flag) ? 1 : 0);
            if (j < i1)
            {
                break;
            }
            a[j + l] = a[j];
            b[j + l] = b[j] - l;
            j--;
        } while (true);
        for (; k < l; k++)
        {
            a[i1 + k] = ai[k];
            b[i1 + k] = ai1[k];
        }

        c = c + l;
        g = g - l;
        return l;
    }

    final void a(int j, ac ac1)
    {
        int k = a(b, c, j);
        if (k == c || b[k] != j)
        {
            MoPubLog.w("Attempted to insert an ad at an invalid position");
        } else
        {
            int i1 = a[k];
            int l = b(d, g, i1);
            if (l < g)
            {
                int j1 = g - l;
                System.arraycopy(d, l, d, l + 1, j1);
                System.arraycopy(e, l, e, l + 1, j1);
                System.arraycopy(f, l, f, l + 1, j1);
            }
            d[l] = i1;
            e[l] = j;
            f[l] = ac1;
            g = g + 1;
            j = c - k - 1;
            System.arraycopy(b, k + 1, b, k, j);
            System.arraycopy(a, k + 1, a, k, j);
            c = c - 1;
            for (j = k; j < c; j++)
            {
                ac1 = b;
                ac1[j] = ac1[j] + 1;
            }

            j = l + 1;
            while (j < g) 
            {
                ac1 = e;
                ac1[j] = ac1[j] + 1;
                j++;
            }
        }
    }

    final boolean a(int j)
    {
        return c(b, c, j) >= 0;
    }

    final int b(int j)
    {
        j = b(b, c, j);
        if (j == c)
        {
            return -1;
        } else
        {
            return b[j];
        }
    }

    final int[] b()
    {
        int ai[] = new int[g];
        System.arraycopy(e, 0, ai, 0, g);
        return ai;
    }

    final void c()
    {
        if (g == 0)
        {
            return;
        } else
        {
            a(0, e[g - 1] + 1);
            return;
        }
    }

    final boolean c(int j)
    {
        return c(e, g, j) >= 0;
    }

    final ac d(int j)
    {
        j = c(e, g, j);
        if (j < 0)
        {
            return null;
        } else
        {
            return f[j];
        }
    }

    final int e(int j)
    {
        int k = c(e, g, j);
        if (k < 0)
        {
            return j - ~k;
        } else
        {
            return -1;
        }
    }

    final int f(int j)
    {
        return b(d, g, j) + j;
    }

    final int g(int j)
    {
        if (j == 0)
        {
            return 0;
        } else
        {
            return f(j - 1) + 1;
        }
    }

    final void h(int j)
    {
        for (int k = a(a, c, j); k < c; k++)
        {
            int ai[] = a;
            ai[k] = ai[k] + 1;
            ai = b;
            ai[k] = ai[k] + 1;
        }

        for (j = a(d, g, j); j < g; j++)
        {
            int ai1[] = d;
            ai1[j] = ai1[j] + 1;
            ai1 = e;
            ai1[j] = ai1[j] + 1;
        }

    }

    final void i(int j)
    {
        for (int k = b(a, c, j); k < c; k++)
        {
            int ai[] = a;
            ai[k] = ai[k] - 1;
            ai = b;
            ai[k] = ai[k] - 1;
        }

        for (j = b(d, g, j); j < g; j++)
        {
            int ai1[] = d;
            ai1[j] = ai1[j] - 1;
            ai1 = e;
            ai1[j] = ai1[j] - 1;
        }

    }
}
