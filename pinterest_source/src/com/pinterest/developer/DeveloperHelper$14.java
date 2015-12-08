// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.view.View;
import com.pinterest.api.remote.WidgetApi;
import com.pinterest.networking.MccMnc;

final class a
    implements android.view.r
{

    final MccMnc a;

    public final void onClick(View view)
    {
        class _cls1 extends ApiResponseHandler
        {

            final DeveloperHelper._cls14 a;

            public void onSuccess(ApiResponse apiresponse)
            {
                super.onSuccess(apiresponse);
                Application.showToast((new StringBuilder("loadWidgetAvailability: ")).append(apiresponse).toString());
            }

            _cls1()
            {
                a = DeveloperHelper._cls14.this;
                super();
            }
        }

        WidgetApi.a(a.a, a.b, new _cls1());
    }

    _cls1(MccMnc mccmnc)
    {
        a = mccmnc;
        super();
    }
}
