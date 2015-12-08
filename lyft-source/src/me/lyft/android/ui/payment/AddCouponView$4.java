// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCouponView

class this._cls0
    implements android.widget.rActionListener
{

    final AddCouponView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6 && applyCouponButton.isEnabled())
        {
            AddCouponView.access$100(AddCouponView.this);
            return true;
        } else
        {
            return false;
        }
    }

    ner()
    {
        this$0 = AddCouponView.this;
        super();
    }
}
