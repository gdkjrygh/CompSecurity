// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

class i
    implements Iterator
{

    int i;
    final it> this$0;

    public boolean hasNext()
    {
        return i < cess._mth000(this._cls0.this);
    }

    public View next()
    {
        ViewGroup viewgroup = viewGroup;
        int j = i;
        i = j + 1;
        return viewgroup.getChildAt(j);
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
        i = 0;
    }
}
