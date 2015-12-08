// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Stack;

// Referenced classes of package com.soundcloud.android.utils:
//            ViewUtils

class l.viewGroup
    implements Iterator
{

    final it> this$0;

    private void pushViews(ViewGroup viewgroup)
    {
        View view;
        for (viewgroup = ViewUtils.childViewsOf(viewgroup).iterator(); viewgroup.hasNext(); cess._mth100(this._cls0.this).push(view))
        {
            view = (View)viewgroup.next();
        }

    }

    public boolean hasNext()
    {
        return !cess._mth100(this._cls0.this).empty();
    }

    public View next()
    {
        View view = (View)cess._mth100(this._cls0.this).pop();
        if (view instanceof ViewGroup)
        {
            pushViews((ViewGroup)view);
        }
        return view;
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
        pushViews(viewGroup);
    }
}
