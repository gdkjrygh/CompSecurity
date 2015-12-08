// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.view.ViewGroup;

// Referenced classes of package com.adobe.mobile:
//            MessageFullScreenActivity, MessageFullScreen

class val.rootViewGroup
    implements Runnable
{

    final MessageFullScreenActivity this$0;
    final ViewGroup val$rootViewGroup;

    public void run()
    {
        message.rootViewGroup = val$rootViewGroup;
        message.showInRootViewGroup();
    }

    ()
    {
        this$0 = final_messagefullscreenactivity;
        val$rootViewGroup = ViewGroup.this;
        super();
    }
}
