// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.widget.SectionIndexer;

public final class fsh
    implements SectionIndexer
{

    public SparseArray a;
    public Object b[];
    private final fsk c;

    public fsh(fsk fsk1)
    {
        c = fsk1;
    }

    public final int getPositionForSection(int i)
    {
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.size();
        }
        if (j == 0)
        {
            return 0;
        }
        if (i < j) goto _L2; else goto _L1
_L1:
        j--;
_L4:
        return a.keyAt(j);
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int getSectionForPosition(int i)
    {
        int j;
        int l;
        int i1;
        i1 = 0;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.size();
        }
        l = j - 1;
        if (j != 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        int k;
        int j1;
        if (i >= c.a())
        {
            return l;
        }
        j1 = Math.max(i, a.keyAt(0));
        k = 0;
_L6:
        int k1;
        do
        {
label0:
            {
                i = (k + l) / 2;
                k1 = a.keyAt(i);
                if (k1 <= j1)
                {
                    break label0;
                }
                l = i;
            }
        } while (true);
        i1 = i;
        if (k1 == j1) goto _L1; else goto _L3
_L3:
        i1 = i;
        if (j == i + 1) goto _L1; else goto _L4
_L4:
        i1 = i;
        if (a.keyAt(i + 1) > j1) goto _L1; else goto _L5
_L5:
        if (k == i)
        {
            return l;
        }
        k = i;
          goto _L6
    }

    public final Object[] getSections()
    {
        if (b == null)
        {
            int i;
            if (a != null)
            {
                i = a.size();
            } else
            {
                i = 0;
            }
            b = new Object[i];
            for (i--; i >= 0; i--)
            {
                b[i] = a.valueAt(i);
            }

        }
        return b;
    }
}
