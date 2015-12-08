// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import com.pinterest.api.model.Interest;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderGridCell

class this._cls0
    implements com.pinterest.base.derGridCell._cls1
{

    final HomefeedBuilderGridCell this$0;

    public void onEventMainThread(com.pinterest.api.model.idCell._cls1 _pcls1)
    {
        if (_interest != null && _interest.equals(_pcls1.terest()))
        {
            _interest.setFollowing(_pcls1.terest().getFollowing());
            updateFollowing();
        }
    }

    ()
    {
        this$0 = HomefeedBuilderGridCell.this;
        super();
    }
}
