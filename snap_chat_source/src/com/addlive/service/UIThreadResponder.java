// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;

import android.app.Activity;

// Referenced classes of package com.addlive.service:
//            Responder

public abstract class UIThreadResponder
    implements Responder
{

    private Activity activity;

    public UIThreadResponder(Activity activity1)
    {
        activity = activity1;
    }

    public void errHandler(final int errCode, final String errMessage)
    {
        activity.runOnUiThread(new Runnable() {

            final UIThreadResponder this$0;
            final int val$errCode;
            final String val$errMessage;

            public void run()
            {
                handleError(errCode, errMessage);
            }

            
            {
                this$0 = UIThreadResponder.this;
                errCode = i;
                errMessage = s;
                super();
            }
        });
    }

    protected abstract void handleError(int i, String s);

    protected abstract void handleResult(Object obj);

    public void resultHandler(final Object result)
    {
        activity.runOnUiThread(new Runnable() {

            final UIThreadResponder this$0;
            final Object val$result;

            public void run()
            {
                handleResult(result);
            }

            
            {
                this$0 = UIThreadResponder.this;
                result = obj;
                super();
            }
        });
    }
}
