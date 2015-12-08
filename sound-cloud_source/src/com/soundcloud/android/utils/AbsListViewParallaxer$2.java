// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.view.View;
import com.soundcloud.android.view.ParallaxImageView;
import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.utils:
//            AbsListViewParallaxer

class this._cls0
    implements Predicate
{

    final AbsListViewParallaxer this$0;

    public boolean apply(View view)
    {
        return view instanceof ParallaxImageView;
    }

    public volatile boolean apply(Object obj)
    {
        return apply((View)obj);
    }

    ()
    {
        this$0 = AbsListViewParallaxer.this;
        super();
    }
}
