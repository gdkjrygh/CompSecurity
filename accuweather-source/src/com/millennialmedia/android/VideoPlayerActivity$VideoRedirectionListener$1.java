// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            VideoPlayerActivity

class val.activity
    implements Runnable
{

    final val.activity this$0;
    final VideoPlayerActivity val$activity;

    public void run()
    {
        val$activity.enableButtons();
    }

    ()
    {
        this$0 = final_;
        val$activity = VideoPlayerActivity.this;
        super();
    }
}
