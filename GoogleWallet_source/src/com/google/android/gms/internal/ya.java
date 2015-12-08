// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            yb

final class ya
{

    private static final yb aYm = new yb();
    private boolean aYn;
    private int aYo[];
    private yb aYp[];
    private int mSize;

    public ya()
    {
        this(10);
    }

    private ya(int i)
    {
        aYn = false;
        i = idealIntArraySize(i);
        aYo = new int[i];
        aYp = new yb[i];
        mSize = 0;
    }

    private static boolean a(int ai[], int ai1[], int i)
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

    private static boolean a(yb ayb[], yb ayb1[], int i)
    {
        for (int j = 0; j < i; j++)
        {
            if (!ayb[j].equals(ayb1[j]))
            {
                return false;
            }
        }

        return true;
    }

    private void gc()
    {
        int l = mSize;
        int ai[] = aYo;
        yb ayb[] = aYp;
        int i = 0;
        int j;
        int k;
        for (j = 0; i < l; j = k)
        {
            yb yb1 = ayb[i];
            k = j;
            if (yb1 != aYm)
            {
                if (i != j)
                {
                    ai[j] = ai[i];
                    ayb[j] = yb1;
                    ayb[i] = null;
                }
                k = j + 1;
            }
            i++;
        }

        aYn = false;
        mSize = j;
    }

    private static int idealByteArraySize(int i)
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

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ya))
            {
                return false;
            }
            obj = (ya)obj;
            if (size() != ((ya) (obj)).size())
            {
                return false;
            }
            if (!a(aYo, ((ya) (obj)).aYo, mSize) || !a(aYp, ((ya) (obj)).aYp, mSize))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (aYn)
        {
            gc();
        }
        int j = 17;
        for (int i = 0; i < mSize; i++)
        {
            j = (j * 31 + aYo[i]) * 31 + aYp[i].hashCode();
        }

        return j;
    }

    public final boolean isEmpty()
    {
        return size() == 0;
    }

    public final yb mr(int i)
    {
        if (aYn)
        {
            gc();
        }
        return aYp[i];
    }

    public final int size()
    {
        if (aYn)
        {
            gc();
        }
        return mSize;
    }

}
