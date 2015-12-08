// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            BusinessSignupDialogView

class this._cls0 extends ApiResponseHandler
{

    final BusinessSignupDialogView this$0;

    public void onSuccess(final ApiResponse response)
    {
        super.onSuccess(response);
        class _cls1 extends BackgroundTask
        {

            final BusinessSignupDialogView._cls2 this$1;
            final ApiResponse val$response;

            public void run()
            {
                java.util.List _tmp = BusinessSignupDialogView.access$002(BusinessType.makeAll((PinterestJsonArray)response.getData()));
            }

            _cls1()
            {
                this$1 = BusinessSignupDialogView._cls2.this;
                response = apiresponse;
                super();
            }
        }

        (new _cls1()).execute();
    }

    _cls1()
    {
        this$0 = BusinessSignupDialogView.this;
        super();
    }
}
