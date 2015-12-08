// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListTabStrip, PlayHeaderListTabContainer

final class this._cls0
    implements android.view.LayoutListener
{

    final PlayHeaderListTabStrip this$0;

    public final void onGlobalLayout()
    {
        int i = PlayHeaderListTabStrip.access$100(PlayHeaderListTabStrip.this).mCurItem;
        PlayHeaderListTabStrip.access$200$77a5b19b(PlayHeaderListTabStrip.this, i, 0);
        PlayHeaderListTabStrip.access$300(PlayHeaderListTabStrip.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    r()
    {
        this$0 = PlayHeaderListTabStrip.this;
        super();
    }
}
