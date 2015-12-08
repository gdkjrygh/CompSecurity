// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;

public class viewType extends android.view.utParams
{

    public boolean decorView;
    public boolean forceAdd;
    public int viewType;

    public (int i, int j)
    {
        super(i, j);
        forceAdd = false;
        decorView = false;
        viewType = 0;
    }

    public viewType(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        forceAdd = false;
        decorView = false;
        viewType = 0;
    }

    public viewType(android.view.utParams utparams)
    {
        super(utparams);
        forceAdd = false;
        decorView = false;
        viewType = 0;
    }
}
