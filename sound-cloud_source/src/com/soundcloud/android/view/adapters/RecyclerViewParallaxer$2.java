// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.view.View;
import com.soundcloud.android.view.ParallaxImageView;
import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            RecyclerViewParallaxer

class this._cls0
    implements Predicate
{

    final RecyclerViewParallaxer this$0;

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
        this$0 = RecyclerViewParallaxer.this;
        super();
    }
}
