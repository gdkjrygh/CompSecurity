// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import android.os.Handler;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment

class mThread extends TimerTask
{

    private final Thread mThread;
    final VideoCastControllerFragment this$0;

    public void run()
    {
        if (mThread != null)
        {
            LogUtils.LOGD(VideoCastControllerFragment.access$100(), "Timer is expired, going to interrupt the thread");
            mThread.interrupt();
            class _cls1
                implements Runnable
            {

                final VideoCastControllerFragment.MediaAuthServiceTimerTask this$1;

                public void run()
                {
                    VideoCastControllerFragment.access$200(this$0).showLoading(false);
                    VideoCastControllerFragment.access$300(this$0, getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_authorization_timeout));
                    mAuthSuccess = false;
                    if (VideoCastControllerFragment.access$400(this$0) != null && VideoCastControllerFragment.access$400(this$0).getStatus() == MediaAuthStatus.PENDING)
                    {
                        VideoCastControllerFragment.access$400(this$0).abortAuthorization(MediaAuthStatus.TIMED_OUT);
                    }
                }

            _cls1()
            {
                this$1 = VideoCastControllerFragment.MediaAuthServiceTimerTask.this;
                super();
            }
            }

            VideoCastControllerFragment.access$500(VideoCastControllerFragment.this).post(new _cls1());
        }
    }

    public _cls1(Thread thread)
    {
        this$0 = VideoCastControllerFragment.this;
        super();
        mThread = thread;
    }
}
