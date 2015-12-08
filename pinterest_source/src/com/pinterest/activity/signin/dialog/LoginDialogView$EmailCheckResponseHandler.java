// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonArray;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginDialogView

class _loginApiResponse extends BaseApiResponseHandler
{

    private ApiResponse _loginApiResponse;
    final LoginDialogView this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
label0:
        {
            if (apiresponse.getData() instanceof PinterestJsonArray)
            {
                apiresponse = (PinterestJsonArray)apiresponse.getData();
                if (apiresponse.a() != 0)
                {
                    break label0;
                }
                LoginDialogView.access$400(LoginDialogView.this, _loginApiResponse.getMessageDisplay());
            }
            return;
        }
        apiresponse = apiresponse.a(0);
        LoginDialogView.access$500(LoginDialogView.this, apiresponse);
    }

    public (ApiResponse apiresponse)
    {
        this$0 = LoginDialogView.this;
        super();
        _loginApiResponse = apiresponse;
    }
}
