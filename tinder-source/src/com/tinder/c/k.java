// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.tinder.e.ai;
import com.tinder.utils.ad;

public final class k extends Dialog
    implements android.view.View.OnClickListener
{

    private final RadioGroup a = (RadioGroup)findViewById(0x7f0e024a);
    private ai b;

    public k(Context context, ai ai1)
    {
        super(context, 0x7f0b0166);
        setContentView(0x7f030094);
        context = getWindow();
        context.setLayout(-2, -2);
        context.setGravity(17);
        ad.a(this);
        context = (TextView)findViewById(0x7f0e024d);
        context.setOnClickListener(this);
        ad.b(context);
        b = ai1;
    }

    public final void onClick(View view)
    {
        int i;
        switch (view.getId())
        {
        default:
            return;

        case 2131624525: 
            i = a.getCheckedRadioButtonId();
            break;
        }
        if (i != 0x7f0e024b) goto _L2; else goto _L1
_L1:
        b.a();
_L4:
        dismiss();
        return;
_L2:
        if (i == 0x7f0e024c)
        {
            b.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
