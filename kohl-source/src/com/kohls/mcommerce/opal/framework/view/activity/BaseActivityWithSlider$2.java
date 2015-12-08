// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import com.kohls.mcommerce.opal.framework.listener.HamburgerCloseListener;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithSlider

class this._cls0
    implements com.jeremyfeinstein.slidingmenu.lib.app.ner
{

    final BaseActivityWithSlider this$0;

    public void onClosed()
    {
        setIsHamburgerVisible(false);
        if (BaseActivityWithSlider.access$100(BaseActivityWithSlider.this) != null && !BaseActivityWithSlider.access$200(BaseActivityWithSlider.this))
        {
            BaseActivityWithSlider.access$202(BaseActivityWithSlider.this, false);
            BaseActivityWithSlider.access$100(BaseActivityWithSlider.this).onHamburgerMenuClose();
        }
    }

    ()
    {
        this$0 = BaseActivityWithSlider.this;
        super();
    }
}
