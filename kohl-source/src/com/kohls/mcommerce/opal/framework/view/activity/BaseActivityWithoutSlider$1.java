// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;


// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

class val.object
    implements Runnable
{

    final BaseActivityWithoutSlider this$0;
    final Object val$object;

    public void run()
    {
        updateViewsOnSuccess(val$object);
    }

    ()
    {
        this$0 = final_baseactivitywithoutslider;
        val$object = Object.this;
        super();
    }
}
