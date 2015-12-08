// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            AddInterestView

class esponse extends com.pinterest.api.remote.tsFeedApiResponse
{

    final esponse.onSuccess this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        AddInterestView.access$500(_fld0, throwable, apiresponse);
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        AddInterestView.access$400(_fld0, feed, query);
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        if (_searchEt == null || !_searchEt.getText().toString().equals(query))
        {
            return;
        } else
        {
            super.onSuccess(pinterestjsonobject);
            return;
        }
    }

    esponse()
    {
        this$1 = this._cls1.this;
        super();
    }
}
