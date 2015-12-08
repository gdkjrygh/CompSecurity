// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//            GridLayoutManager

public static final class mSpanSize extends mSpanSize
{

    public int mSpanIndex;
    public int mSpanSize;



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

    public mSpanSize()
    {
        super(-2, -2);
        mSpanIndex = -1;
        mSpanSize = 0;
    }

    public mSpanSize(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
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
