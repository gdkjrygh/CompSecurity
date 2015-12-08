// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzwv

class zzwu
    implements Cloneable
{

    private static final zzwv zzaHE = new zzwv();
    private int mSize;
    private boolean zzaHF;
    private int zzaHG[];
    private zzwv zzaHH[];

    public zzwu()
    {
        this(10);
    }

    public zzwu(int i)
    {
        zzaHF = false;
        i = idealIntArraySize(i);
        zzaHG = new int[i];
        zzaHH = new zzwv[i];
        mSize = 0;
    }

    private void gc()
    {
        int l = mSize;
        int ai[] = zzaHG;
        zzwv azzwv[] = zzaHH;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            zzwv zzwv1 = azzwv[i];
            k = j;
            if (zzwv1 != zzaHE)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    azzwv[j] = zzwv1;
                    azzwv[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        zzaHF = false;
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
        return idealByteArraySize(i << 2) / 4;
    }

    private boolean zza(int ai[], int ai1[], int i)
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

    private boolean zza(zzwv azzwv[], zzwv azzwv1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!azzwv[j].equals(azzwv1[j]))
            {
                return false;
            }
        }

        return true;
    }

    private int zziG(int i)
    {
        int k;
label0:
        {
            k = mSize;
            int j = 0;
            for (k--; j <= k;)
            {
                int l = j + k >>> 1;
                int i1 = zzaHG[l];
                if (i1 < i)
                {
                    j = l + 1;
                } else
                {
                    k = l;
                    if (i1 <= i)
                    {
                        break label0;
                    }
                    k = l - 1;
                }
            }

            k = ~j;
        }
        return k;
    }

    public Object clone()
    {
        return zzvO();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzwu))
            {
                return false;
            }
            obj = (zzwu)obj;
            if (size() != ((zzwu) (obj)).size())
            {
                return false;
            }
            if (!zza(zzaHG, ((zzwu) (obj)).zzaHG, mSize) || !zza(zzaHH, ((zzwu) (obj)).zzaHH, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (zzaHF)
        {
            gc();
        }
        int j = 17;
        for (int i = 0; i < mSize; i++)
        {
            j = (j * 31 + zzaHG[i]) * 31 + zzaHH[i].hashCode();
        }

        return j;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public int size()
    {
        if (zzaHF)
        {
            gc();
        }
        return mSize;
    }

    public void zza(int i, zzwv zzwv1)
    {
        int j = zziG(i);
        if (j >= 0)
        {
            zzaHH[j] = zzwv1;
            return;
        }
        int k = ~j;
        if (k < mSize && zzaHH[k] == zzaHE)
        {
            zzaHG[k] = i;
            zzaHH[k] = zzwv1;
            return;
        }
        j = k;
        if (zzaHF)
        {
            j = k;
            if (mSize >= zzaHG.length)
            {
                gc();
                j = ~zziG(i);
            }
        }
        if (mSize >= zzaHG.length)
        {
            int l = idealIntArraySize(mSize + 1);
            int ai[] = new int[l];
            zzwv azzwv[] = new zzwv[l];
            System.arraycopy(zzaHG, 0, ai, 0, zzaHG.length);
            System.arraycopy(zzaHH, 0, azzwv, 0, zzaHH.length);
            zzaHG = ai;
            zzaHH = azzwv;
        }
        if (mSize - j != 0)
        {
            System.arraycopy(zzaHG, j, zzaHG, j + 1, mSize - j);
            System.arraycopy(zzaHH, j, zzaHH, j + 1, mSize - j);
        }
        zzaHG[j] = i;
        zzaHH[j] = zzwv1;
        mSize = mSize + 1;
    }

    public zzwv zziE(int i)
    {
        i = zziG(i);
        if (i < 0 || zzaHH[i] == zzaHE)
        {
            return null;
        } else
        {
            return zzaHH[i];
        }
    }

    public zzwv zziF(int i)
    {
        if (zzaHF)
        {
            gc();
        }
        return zzaHH[i];
    }

    public final zzwu zzvO()
    {
        int i = 0;
        int j = size();
        zzwu zzwu1 = new zzwu(j);
        System.arraycopy(zzaHG, 0, zzwu1.zzaHG, 0, j);
        for (; i < j; i++)
        {
            if (zzaHH[i] != null)
            {
                zzwu1.zzaHH[i] = zzaHH[i].zzvP();
            }
        }

        zzwu1.mSize = j;
        return zzwu1;
    }

}
