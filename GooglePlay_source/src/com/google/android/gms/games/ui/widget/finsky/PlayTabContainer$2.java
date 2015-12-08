// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget.finsky;

import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;

// Referenced classes of package com.google.android.gms.games.ui.widget.finsky:
//            PlayTabContainer, PlayTabStrip

final class this._cls0
    implements android.view.GlobalLayoutListener
{

    final PlayTabContainer this$0;

    public final void onGlobalLayout()
    {
        PlayTabContainer.access$200$14308133(PlayTabContainer.this, PlayTabContainer.access$100(PlayTabContainer.this).mCurItem);
        boolean _tmp = PlayTabContainer.access$302$5b7daba5(PlayTabContainer.this);
        PlayTabContainer.access$400(PlayTabContainer.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    ()
    {
        this$0 = PlayTabContainer.this;
        super();
    }
}
