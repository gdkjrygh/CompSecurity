// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//            AsyncListUtil

public static abstract class 
{

    public static final int HINT_SCROLL_ASC = 2;
    public static final int HINT_SCROLL_DESC = 1;
    public static final int HINT_SCROLL_NONE = 0;

    public void extendRangeInto(int ai[], int ai1[], int i)
    {
        int j = (ai[1] - ai[0]) + 1;
        int k = j / 2;
        int i1 = ai[0];
        int l;
        if (i == 1)
        {
            l = j;
        } else
        {
            l = k;
        }
        ai1[0] = i1 - l;
        l = ai[1];
        if (i != 2)
        {
            j = k;
        }
        ai1[1] = l + j;
    }

    public abstract void getItemRangeInto(int ai[]);

    public abstract void onDataRefresh();

    public abstract void onItemLoaded(int i);

    public ()
    {
    }
}
