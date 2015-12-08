// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.view;


// Referenced classes of package com.pinterest.ui.view:
//            PeekViewPager

class this._cls0
    implements android.view..OnGlobalLayoutListener
{

    final PeekViewPager this$0;

    public void onGlobalLayout()
    {
        if (PeekViewPager.access$000(PeekViewPager.this) == getWidth())
        {
            return;
        }
        if (PeekViewPager.access$000(PeekViewPager.this) == 0)
        {
            PeekViewPager.access$002(PeekViewPager.this, getWidth());
            return;
        } else
        {
            PeekViewPager.access$100(PeekViewPager.this, getWidth());
            PeekViewPager.access$002(PeekViewPager.this, getWidth());
            return;
        }
    }

    LayoutListener()
    {
        this$0 = PeekViewPager.this;
        super();
    }
}
