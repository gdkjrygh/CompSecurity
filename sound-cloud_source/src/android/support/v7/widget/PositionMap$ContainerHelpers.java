// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            PositionMap

static class 
{

    static final boolean EMPTY_BOOLEANS[] = new boolean[0];
    static final int EMPTY_INTS[] = new int[0];
    static final long EMPTY_LONGS[] = new long[0];
    static final Object EMPTY_OBJECTS[] = new Object[0];

    static int binarySearch(int ai[], int i, int j)
    {
        int k;
label0:
        {
            k = i - 1;
            for (i = 0; i <= k;)
            {
                int l = i + k >>> 1;
                int i1 = ai[l];
                if (i1 < j)
                {
                    i = l + 1;
                } else
                {
                    k = l;
                    if (i1 <= j)
                    {
                        break label0;
                    }
                    k = l - 1;
                }
            }

            k = ~i;
        }
        return k;
    }


    ()
    {
    }
}
