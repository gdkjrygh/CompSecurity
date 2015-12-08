// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qt

class qs
{

    private static final qt ayZ = new qt();
    private boolean aza;
    private int azb[];
    private qt azc[];
    private int mSize;

    public qs()
    {
        this(10);
    }

    public qs(int i)
    {
        aza = false;
        i = idealIntArraySize(i);
        azb = new int[i];
        azc = new qt[i];
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

    private boolean a(qt aqt[], qt aqt1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!aqt[j].equals(aqt1[j]))
            {
                return false;
            }
        }

        return true;
    }

    private void gc()
    {
        int l = mSize;
        int ai[] = azb;
        qt aqt[] = azc;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            qt qt1 = aqt[i];
            k = j;
            if (qt1 != ayZ)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    aqt[j] = qt1;
                    aqt[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        aza = false;
        mSize = j;
    }

    private int hj(int i)
    {
        int j = 0;
        for (int k = mSize - 1; j <= k;)
        {
            int l = j + k >>> 1;
            int i1 = azb[l];
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

    public void a(int i, qt qt1)
    {
        int j = hj(i);
        if (j >= 0)
        {
            azc[j] = qt1;
            return;
        }
        int k = ~j;
        if (k < mSize && azc[k] == ayZ)
        {
            azb[k] = i;
            azc[k] = qt1;
            return;
        }
        j = k;
        if (aza)
        {
            j = k;
            if (mSize >= azb.length)
            {
                gc();
                j = ~hj(i);
            }
        }
        if (mSize >= azb.length)
        {
            int l = idealIntArraySize(mSize + 1);
            int ai[] = new int[l];
            qt aqt[] = new qt[l];
            System.arraycopy(azb, 0, ai, 0, azb.length);
            System.arraycopy(azc, 0, aqt, 0, azc.length);
            azb = ai;
            azc = aqt;
        }
        if (mSize - j != 0)
        {
            System.arraycopy(azb, j, azb, j + 1, mSize - j);
            System.arraycopy(azc, j, azc, j + 1, mSize - j);
        }
        azb[j] = i;
        azc[j] = qt1;
        mSize = mSize + 1;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof qs))
            {
                return false;
            }
            obj = (qs)obj;
            if (size() != ((qs) (obj)).size())
            {
                return false;
            }
            if (!a(azb, ((qs) (obj)).azb, mSize) || !a(azc, ((qs) (obj)).azc, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (aza)
        {
            gc();
        }
        int j = 17;
        for (int i = 0; i < mSize; i++)
        {
            j = (j * 31 + azb[i]) * 31 + azc[i].hashCode();
        }

        return j;
    }

    public qt hh(int i)
    {
        i = hj(i);
        if (i < 0 || azc[i] == ayZ)
        {
            return null;
        } else
        {
            return azc[i];
        }
    }

    public qt hi(int i)
    {
        if (aza)
        {
            gc();
        }
        return azc[i];
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        if (aza)
        {
            gc();
        }
        return mSize;
    }

}
