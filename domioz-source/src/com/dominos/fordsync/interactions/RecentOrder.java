// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import android.content.Context;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.google.a.a.t;
import com.google.a.b.cn;
import java.util.List;

// Referenced classes of package com.dominos.fordsync.interactions:
//            AbstractOrder, CallStore_, ErrorHandler_, ErrorHandler

public class RecentOrder extends AbstractOrder
{

    private t mSortByPlaceOrderTime;

    public RecentOrder(Context context)
    {
        super(context);
        mSortByPlaceOrderTime = new _cls1();
    }

    public void start()
    {
        if (!mProfileManager.isAuthorizedUser())
        {
            CallStore_.getInstance_(app).start();
            return;
        }
        java.util.ArrayList arraylist = mProfileManager.getOrderHistoryList();
        if (arraylist != null && !arraylist.isEmpty())
        {
            setOrder((LabsOrder)cn.b().a(mSortByPlaceOrderTime).a().a(arraylist).get(0));
            super.start();
            return;
        } else
        {
            ErrorHandler_.getInstance_(getContext()).reason("no_recent_order").start();
            return;
        }
    }

    private class _cls1
        implements t
    {

        final RecentOrder this$0;

        public volatile Object apply(Object obj)
        {
            return apply((LabsOrder)obj);
        }

        public String apply(LabsOrder labsorder)
        {
            return labsorder.getPlaceOrderTime();
        }

        _cls1()
        {
            this$0 = RecentOrder.this;
            super();
        }
    }

}
