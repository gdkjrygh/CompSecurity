// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;

// Referenced classes of package com.pinterest.activity.commerce:
//            SecureDialogActivity

class val.contentView
    implements android.view.alLayoutListener
{

    private int mPreviousHeight;
    final SecureDialogActivity this$0;
    final View val$contentView;

    public void onGlobalLayout()
    {
        int i = val$contentView.getHeight();
        if (mPreviousHeight == 0) goto _L2; else goto _L1
_L1:
        if (mPreviousHeight <= i) goto _L4; else goto _L3
_L3:
        SecureDialogActivity.access$100(SecureDialogActivity.this, true);
_L2:
        mPreviousHeight = i;
        return;
_L4:
        if (mPreviousHeight < i)
        {
            SecureDialogActivity.access$100(SecureDialogActivity.this, false);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    ()
    {
        this$0 = final_securedialogactivity;
        val$contentView = View.this;
        super();
    }
}
