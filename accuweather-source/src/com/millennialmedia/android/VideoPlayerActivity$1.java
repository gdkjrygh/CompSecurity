// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            VideoPlayerActivity

class val.action
    implements Runnable
{

    final VideoPlayerActivity this$0;
    final String val$action;

    public void run()
    {
        if (val$action.equalsIgnoreCase("restartVideo"))
        {
            restartVideo();
        } else
        if (val$action.equalsIgnoreCase("endVideo"))
        {
            endVideo();
            return;
        }
    }

    ()
    {
        this$0 = final_videoplayeractivity;
        val$action = String.this;
        super();
    }
}
