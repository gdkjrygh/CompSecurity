// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            pk

class pj
{

    private static final pk awM = new pk();
    private boolean awN;
    private int awO[];
    private pk awP[];
    private int mSize;

    public pj()
    {
        this(10);
    }

    public pj(int i)
    {
        awN = false;
        i = idealIntArraySize(i);
        awO = new int[i];
        awP = new pk[i];
        mSize = 0;
    }

    private boolean a(int ai[], int ai1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (ai[j] != ai1[j])
            {
                return false;
            }
        }

        return true;
    }

    private boolean a(pk apk[], pk apk1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!apk[j].equals(apk1[j]))
            {
                return false;
            }
        }

        return true;
    }

    private int gG(int i)
    {
        int j = 0;
        for (int k = mSize - 1; j <= k;)
        {
            int l = j + k >>> 1;
            int i1 = awO[l];
            if (i1 < i)
            {
                j = l + 1;
            } else
            if (i1 > i)
            {
                k = l - 1;
            } else
            {
                return l;
            }
        }

        return ~j;
    }

    private void gc()
    {
        int l = mSize;
        int ai[] = awO;
        pk apk[] = awP;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            pk pk1 = apk[i];
            k = j;
            if (pk1 != awM)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    apk[j] = pk1;
                    apk[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        awN = false;
        mSize = j;
    }

    private int idealByteArraySize(int i)
    {
        int j = 4;
        do
        {
label0:
            {
                int k = i;
                if (j < 32)
                {
                    if (i > (1 << j) - 12)
                    {
                        break label0;
                    }
                    k = (1 << j) - 12;
                }
                return k;
            }
            j++;
        } while (true);
    }

    private int idealIntArraySize(int i)
    {
        return idealByteArraySize(i * 4) / 4;
    }

    public void a(int i, pk pk1)
    {
        int j = gG(i);
        if (j >= 0)
        {
            awP[j] = pk1;
            return;
        }
        int k = ~j;
        if (k < mSize && awP[k] == awM)
        {
            awO[k] = i;
            awP[k] = pk1;
            return;
        }
        j = k;
        if (awN)
        {
            j = k;
            if (mSize >= awO.length)
            {
                gc();
                j = ~gG(i);
            }
        }
        if (mSize >= awO.length)
        {
            int l = idealIntArraySize(mSize + 1);
            int ai[] = new int[l];
            pk apk[] = new pk[l];
            System.arraycopy(awO, 0, ai, 0, awO.length);
            System.arraycopy(awP, 0, apk, 0, awP.length);
            awO = ai;
            awP = apk;
        }
        if (mSize - j != 0)
        {
            System.arraycopy(awO, j, awO, j + 1, mSize - j);
            System.arraycopy(awP, j, awP, j + 1, mSize - j);
        }
        awO[j] = i;
        awP[j] = pk1;
        mSize = mSize + 1;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof pj))
            {
                return false;
            }
            obj = (pj)obj;
            if (size() != ((pj) (obj)).size())
            {
                return false;
            }
            if (!a(awO, ((pj) (obj)).awO, mSize) || !a(awP, ((pj) (obj)).awP, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public pk gE(int i)
    {
        i = gG(i);
        if (i < 0 || awP[i] == awM)
        {
            return null;
        } else
        {
            return awP[i];
        }
    }

    public pk gF(int i)
    {
        if (awN)
        {
            gc();
        }
        return awP[i];
    }

    public int hashCode()
    {
        if (awN)
        {
            gc();
        }
        int j = 17;
        for (int i = 0; i < mSize; i++)
        {
            j = (j * 31 + awO[i]) * 31 + awP[i].hashCode();
        }

        return j;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        if (awN)
        {
            gc();
        }
        return mSize;
    }

}
