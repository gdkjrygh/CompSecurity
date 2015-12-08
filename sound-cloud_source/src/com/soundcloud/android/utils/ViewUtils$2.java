// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.view.ViewGroup;
import java.util.Iterator;

final class val.viewGroup
    implements Iterable
{

    private final int count;
    final ViewGroup val$viewGroup;

    public final Iterator iterator()
    {
        class _cls1
            implements Iterator
        {

            int i;
            final ViewUtils._cls2 this$0;

            public boolean hasNext()
            {
                return i < count;
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

            _cls1()
            {
                this$0 = ViewUtils._cls2.this;
                super();
                i = 0;
            }
        }

        return new _cls1();
    }


    _cls1()
    {
        val$viewGroup = viewgroup;
        super();
        count = val$viewGroup.getChildCount();
    }
}
