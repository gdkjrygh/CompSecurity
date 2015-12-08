// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.view.View;
import com.soundcloud.android.view.ParallaxImageView;
import com.soundcloud.java.functions.Function;

// Referenced classes of package com.soundcloud.android.utils:
//            AbsListViewParallaxer

class this._cls0
    implements Function
{

    final AbsListViewParallaxer this$0;

    public ParallaxImageView apply(View view)
    {
        return (ParallaxImageView)view;
    }

    public volatile Object apply(Object obj)
    {
        return apply((View)obj);
    }

    ()
    {
        this$0 = AbsListViewParallaxer.this;
        super();
    }
}
