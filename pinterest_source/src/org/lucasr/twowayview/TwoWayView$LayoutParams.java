// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

public class height extends android.view.utParams
{

    boolean forceAdd;
    long id;
    int scrappedFromPosition;
    int viewType;

    public (int i, int j)
    {
        super(i, j);
        id = -1L;
        if (width == -1)
        {
            Log.w("TwoWayView", "Constructing LayoutParams with width FILL_PARENT does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
            width = -2;
        }
        if (height == -1)
        {
            Log.w("TwoWayView", "Constructing LayoutParams with height FILL_PARENT does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
            height = -2;
        }
    }

    public height(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        id = -1L;
        if (width == -1)
        {
            Log.w("TwoWayView", "Inflation setting LayoutParams width to MATCH_PARENT - does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
            width = -1;
        }
        if (height == -1)
        {
            Log.w("TwoWayView", "Inflation setting LayoutParams height to MATCH_PARENT - does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
            height = -2;
        }
    }

    public height(android.view.utParams utparams)
    {
        super(utparams);
        id = -1L;
        if (width == -1)
        {
            Log.w("TwoWayView", "Constructing LayoutParams with width MATCH_PARENT - does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
            width = -2;
        }
        if (height == -1)
        {
            Log.w("TwoWayView", "Constructing LayoutParams with height MATCH_PARENT - does not make much sense as the view might change orientation. Falling back to WRAP_CONTENT");
            height = -2;
        }
    }
}
