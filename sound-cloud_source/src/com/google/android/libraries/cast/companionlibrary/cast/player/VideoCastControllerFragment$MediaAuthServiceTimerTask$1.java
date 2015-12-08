// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;


// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment, VideoCastController, MediaAuthService, MediaAuthStatus

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        VideoCastControllerFragment.access$200(_fld0).showLoading(false);
        VideoCastControllerFragment.access$300(_fld0, getString(com.google.android.libraries.cast.companionlibrary.TimerTask.this._fld0));
        mAuthSuccess = false;
        if (VideoCastControllerFragment.access$400(_fld0) != null && VideoCastControllerFragment.access$400(_fld0).getStatus() == MediaAuthStatus.PENDING)
        {
            VideoCastControllerFragment.access$400(_fld0).abortAuthorization(MediaAuthStatus.TIMED_OUT);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
