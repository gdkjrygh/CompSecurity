// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//            GridLayoutManager

public static class mSpanSize extends mSpanSize
{

    public static final int INVALID_SPAN_ID = -1;
    private int mSpanIndex;
    private int mSpanSize;

    public int getSpanIndex()
    {
        return mSpanIndex;
    }

    public int getSpanSize()
    {
        return mSpanSize;
    }



/*
    static int access$002( , int i)
    {
        .mSpanIndex = i;
        return i;
    }

*/



/*
    static int access$102(mSpanIndex mspanindex, int i)
    {
        mspanindex.mSpanSize = i;
        return i;
    }

*/

    public mSpanSize(int i, int j)
    {
        super(i, j);
        mSpanIndex = -1;
        mSpanSize = 0;
    }

    public mSpanSize(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSpanIndex = -1;
        mSpanSize = 0;
    }

    public mSpanSize(mSpanSize mspansize)
    {
        super(mspansize);
        mSpanIndex = -1;
        mSpanSize = 0;
    }

    public mSpanSize(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        mSpanIndex = -1;
        mSpanSize = 0;
    }

    public mSpanSize(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        mSpanIndex = -1;
        mSpanSize = 0;
    }
}
