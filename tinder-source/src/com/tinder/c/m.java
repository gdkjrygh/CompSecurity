// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import android.view.Window;
import com.tinder.e.ae;
import com.tinder.model.Match;
import com.tinder.utils.ad;

public final class m extends Dialog
    implements android.view.View.OnClickListener
{

    private ae a;

    public m(Context context, ae ae1, Match match, View view)
    {
        super(context, 0x103006f);
        a = ae1;
        requestWindowFeature(1);
        setContentView(0x7f0300af);
        if (view == null)
        {
            ae1 = getWindow();
            ae1.setLayout(-2, -2);
            ae1 = ae1.getAttributes();
            ae1.gravity = 53;
            ae1.flags = 512;
            ae1.y = (int)(context.getResources().getDimension(0x7f090076) - context.getResources().getDimension(0x7f0900e4));
        } else
        {
            int i = ad.a(view).y;
            int j = ad.b(getContext()) / 2;
            int k = view.getHeight();
            context = getWindow();
            context.setLayout(-2, -2);
            context = context.getAttributes();
            context.gravity = 5;
            context.flags = 256;
            context.y = (i - j) + k * 3;
        }
        setCanceledOnTouchOutside(true);
        context = findViewById(0x7f0e033d);
        ae1 = findViewById(0x7f0e02e8);
        if (match == null)
        {
            context.setVisibility(8);
            ae1.setVisibility(8);
        } else
        {
            context.setVisibility(0);
            ae1.setVisibility(0);
            context.setOnClickListener(this);
        }
        findViewById(0x7f0e033c).setOnClickListener(this);
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624764: 
            a.d();
            dismiss();
            return;

        case 2131624765: 
            a.C_();
            break;
        }
        dismiss();
    }
}
