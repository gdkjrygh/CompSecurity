// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;


// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            MediaAuthService, VideoCastControllerFragment

class val.authService
    implements Runnable
{

    final VideoCastControllerFragment this$0;
    final MediaAuthService val$authService;

    public void run()
    {
        val$authService.setMediaAuthListener(VideoCastControllerFragment.this);
        val$authService.startAuthorization();
    }

    ()
    {
        this$0 = final_videocastcontrollerfragment;
        val$authService = MediaAuthService.this;
        super();
    }
}
