// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;


// Referenced classes of package com.amobee.adsdk:
//            AdManager, IAmobeeListener, AmobeeAdPlaceholder

class eholder
    implements Runnable
{

    final AdManager this$0;
    private final AmobeeAdPlaceholder val$placeholder;

    public void run()
    {
        getAmobeeListener().amobeeOnOverlayDismissed(val$placeholder);
    }

    eholder()
    {
        this$0 = final_admanager;
        val$placeholder = AmobeeAdPlaceholder.this;
        super();
    }
}
