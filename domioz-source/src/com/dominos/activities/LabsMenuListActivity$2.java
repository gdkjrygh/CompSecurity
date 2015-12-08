// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;

// Referenced classes of package com.dominos.activities:
//            LabsMenuListActivity

class this._cls0
    implements android.view.ctivity._cls2
{

    final LabsMenuListActivity this$0;

    public void onClick(View view)
    {
        class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
        {

            final LabsMenuListActivity._cls2 this$1;

            public void onAlertDismissed()
            {
                if (c.i())
                {
                    CartConfirmAgent.redirection = com.dominos.nina.dialog.agent.CartConfirmAgent.Redirection.MENULIST;
                }
            }

            _cls1()
            {
                this$1 = LabsMenuListActivity._cls2.this;
                super();
            }
        }

        mActivityHelper.showAlert(AlertType.DISCONTINUED_PRODUCTS_ARTISAN_MESSAGE, new _cls1());
    }

    _cls1()
    {
        this$0 = LabsMenuListActivity.this;
        super();
    }
}
