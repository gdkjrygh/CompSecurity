// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import android.content.Context;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.fordsync.interactions:
//            AbstractOrder, CallStore_, ErrorHandler_, ErrorHandler

public class EasyOrder extends AbstractOrder
{

    public EasyOrder(Context context)
    {
        super(context);
    }

    public void start()
    {
        if (!mProfileManager.isAuthorizedUser())
        {
            CallStore_.getInstance_(app).start();
            return;
        }
        com.dominos.android.sdk.core.models.LabsOrder labsorder = mProfileManager.getEasyOrder();
        if (labsorder != null)
        {
            setOrder(labsorder);
            super.start();
            return;
        } else
        {
            ErrorHandler_.getInstance_(getContext()).reason("no_easy_order").start();
            return;
        }
    }
}
