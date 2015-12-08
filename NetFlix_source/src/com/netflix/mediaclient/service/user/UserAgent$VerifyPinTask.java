// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent, UserWebClient, UserAgentWebCallback, SimpleUserAgentWebCallback

private class enteredPin extends enteredPin
{

    final String enteredPin;
    final UserAgent this$0;
    private final UserAgentWebCallback webClientCallback = new SimpleUserAgentWebCallback() {

        final UserAgent.VerifyPinTask this$1;

        public void onPinVerified(final boolean isPinValid, int i)
        {
            UserAgent.access$4100(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final boolean val$isPinValid;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onPinVerified(isPinValid, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                isPinValid = flag;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = UserAgent.VerifyPinTask.this;
                super();
            }
    };

    public void run()
    {
        UserAgent.access$2700(UserAgent.this).verifyPin(enteredPin, webClientCallback);
    }

    public ack(String s, ack ack)
    {
        this$0 = UserAgent.this;
        super(ack);
        enteredPin = s;
    }
}
