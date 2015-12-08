// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.atmention;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;

// Referenced classes of package com.pinterest.ui.atmention:
//            AtMentionEditTextView

class this._cls0 extends ApiResponseHandler
{

    final AtMentionEditTextView this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        AtMentionEditTextView.access$300(AtMentionEditTextView.this, apiresponse);
    }

    ()
    {
        this$0 = AtMentionEditTextView.this;
        super();
    }
}
