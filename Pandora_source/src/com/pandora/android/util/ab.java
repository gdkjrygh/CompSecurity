// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pandora.android.view.SafeImageView;
import p.l.c;
import p.l.d;
import p.l.g;
import p.l.j;

public class ab
{

    public static void a(Context context, String s, View view)
    {
        FrameLayout framelayout = (FrameLayout)view.findViewById(0x7f10011a);
        int i = context.getResources().getDimensionPixelSize(0x7f090141);
        int j1 = Math.round((float)i * 0.75F);
        int k1 = Math.round((float)i * 0.06F);
        int l1 = Math.round((float)i * 0.023F);
        if (framelayout.getChildCount() == 0)
        {
            int k = 0;
            int i1 = 0;
            while (k < 4) 
            {
                SafeImageView safeimageview = new SafeImageView(context);
                safeimageview.setId(k);
                safeimageview.setImageResource(0x7f0200e9);
                safeimageview.setBackgroundResource(0x7f0b00b0);
                android.widget.FrameLayout.LayoutParams layoutparams;
                if (k > 0)
                {
                    safeimageview.setPadding(l1, l1, 0, 0);
                    layoutparams = new android.widget.FrameLayout.LayoutParams(j1 + l1, j1 + l1);
                } else
                {
                    layoutparams = new android.widget.FrameLayout.LayoutParams(j1, j1);
                }
                layoutparams.setMargins(i1, i1, 0, 0);
                framelayout.addView(safeimageview, layoutparams);
                i1 += k1;
                k++;
            }
        }
        s = TextUtils.split(s, "\\n");
        for (int l = 0; l < Math.min(s.length, 4); l++)
        {
            ImageView imageview = (ImageView)view.findViewById(3 - l);
            g.b(context).a(s[l]).a().a(0x7f0200e9).a(imageview);
        }

    }
}
