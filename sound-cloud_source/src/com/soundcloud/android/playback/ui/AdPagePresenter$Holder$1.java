// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import com.soundcloud.java.functions.Predicate;

class this._cls0
    implements Predicate
{

    final apply this$0;

    public boolean apply(View view)
    {
        return view != null;
    }

    public volatile boolean apply(Object obj)
    {
        return apply((View)obj);
    }

    A()
    {
        this$0 = this._cls0.this;
        super();
    }
}
