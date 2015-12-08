// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Application;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.user:
//            UserSetImageActivity

class this._cls0 extends ApiResponseHandler
{

    final UserSetImageActivity this$0;

    public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
    {
        Application.showToast(0x7f0705d5);
        finish();
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        Application.showToastShort(0x7f0705d6);
        class _cls1 extends com.pinterest.api.remote.UserApi.UserApiResponse
        {

            final UserSetImageActivity._cls1 this$1;

            public void onSuccess(User user)
            {
                super.onSuccess(user);
                Pinalytics.a(EventType.USER_EDIT, null);
                finish();
            }

            _cls1()
            {
                this$1 = UserSetImageActivity._cls1.this;
                super();
            }
        }

        UserApi.a(String.valueOf(MyUser.getUid()), new _cls1(), UserSetImageActivity.access$000(UserSetImageActivity.this));
    }

    _cls1()
    {
        this$0 = UserSetImageActivity.this;
        super();
    }
}
