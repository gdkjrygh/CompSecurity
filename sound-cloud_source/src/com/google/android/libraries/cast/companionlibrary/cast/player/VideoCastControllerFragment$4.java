// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;


// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment

class val.message
    implements Runnable
{

    final VideoCastControllerFragment this$0;
    final String val$message;

    public void run()
    {
        VideoCastControllerFragment.access$2102(VideoCastControllerFragment.this, erallState.UNKNOWN);
        VideoCastControllerFragment.access$300(VideoCastControllerFragment.this, val$message);
    }

    erallState()
    {
        this$0 = final_videocastcontrollerfragment;
        val$message = String.this;
        super();
    }
}
