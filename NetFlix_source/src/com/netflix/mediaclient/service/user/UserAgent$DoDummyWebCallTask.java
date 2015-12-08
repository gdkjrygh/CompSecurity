// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent, UserWebClient, UserAgentWebCallback, SimpleUserAgentWebCallback

private class mCallback
    implements Runnable
{

    UserAgentWebCallback mCallback;
    final UserAgent this$0;
    private final UserAgentWebCallback webClientCallback = new SimpleUserAgentWebCallback() {

        final UserAgent.DoDummyWebCallTask this$1;

        public void onDummyWebCallDone(int i)
        {
            if (mCallback != null)
            {
                mCallback.onDummyWebCallDone(i);
                mCallback = null;
            }
            Log.d("nf_service_useragent", "dummy web call done");
        }

            
            {
                this$1 = UserAgent.DoDummyWebCallTask.this;
                super();
            }
    };

    public void run()
    {
        UserAgent.access$2700(UserAgent.this).doDummyWebCall(webClientCallback);
    }

    public nit>(UserAgentWebCallback useragentwebcallback)
    {
        this$0 = UserAgent.this;
        super();
        mCallback = useragentwebcallback;
    }
}
