// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.content.res.Resources;
import android.support.v4.app.ac;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.jcp.h.a;

// Referenced classes of package com.jcp.helper:
//            CartSummaryHelper

public class r
    implements TextWatcher
{

    final CartSummaryHelper a;
    private EditText b;
    private TextView c;

    public r(CartSummaryHelper cartsummaryhelper, EditText edittext, TextView textview)
    {
        a = cartsummaryhelper;
        super();
        c = textview;
        b = edittext;
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (a.mRewardEditText != null && b.getId() == 0x7f0e010e && b.length() == 1 && CartSummaryHelper.c(a))
        {
            com.jcp.h.a.a("Find Coupon", "1");
            com.jcp.helper.CartSummaryHelper.a(a, false);
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (b.getEditableText().toString().length() > 0) goto _L2; else goto _L1
_L1:
        if (b.getEditableText().toString().length() == 0)
        {
            com.jcp.helper.CartSummaryHelper.a(a, true);
        }
        c.setTextColor(CartSummaryHelper.b(a).getResources().getColor(0x7f0d0054));
        if (b == null || b.getEditableText().toString().length() != 0) goto _L4; else goto _L3
_L3:
        c.getId();
        JVM INSTR lookupswitch 2: default 120
    //                   2131624207: 121
    //                   2131624219: 169;
           goto _L4 _L5 _L6
_L4:
        return;
_L5:
        if (a.mInvalidCouponsText.getVisibility() != 0) goto _L4; else goto _L7
_L7:
        a.mInvalidCouponsText.setVisibility(8);
        b.setTextColor(CartSummaryHelper.b(a).getResources().getColor(0x7f0d0045));
        return;
_L6:
        if (a.mInvalidRewardText.getVisibility() != 0) goto _L4; else goto _L8
_L8:
        a.mInvalidRewardText.setVisibility(8);
        b.setTextColor(CartSummaryHelper.b(a).getResources().getColor(0x7f0d0045));
        return;
_L2:
        c.setTextColor(CartSummaryHelper.b(a).getResources().getColor(0x7f0d00bb));
        return;
    }
}
