// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public final class bl
{

    public static void a(String s, String s1, TextView textview, ImageView imageview)
    {
        if ("AMEX".equalsIgnoreCase(s) || "American Express".equalsIgnoreCase(s))
        {
            if (!TextUtils.isEmpty(s1))
            {
                textview.setText(s1);
                textview.setVisibility(0);
            }
            imageview.setImageResource(0x7f020049);
        } else
        {
            if ("Visa".equalsIgnoreCase(s))
            {
                if (!TextUtils.isEmpty(s1))
                {
                    textview.setText(s1);
                    textview.setVisibility(0);
                }
                imageview.setImageResource(0x7f02024c);
                return;
            }
            if ("DISCOVER".equalsIgnoreCase(s))
            {
                if (!TextUtils.isEmpty(s1))
                {
                    textview.setText(s1);
                    textview.setVisibility(0);
                }
                imageview.setImageResource(0x7f0200f3);
                return;
            }
            if ("MASTERCARD".equalsIgnoreCase(s) || "Master Card".equalsIgnoreCase(s))
            {
                if (!TextUtils.isEmpty(s1))
                {
                    textview.setText(s1);
                    textview.setVisibility(0);
                }
                imageview.setImageResource(0x7f02016b);
                return;
            }
            if ("JCP".equalsIgnoreCase(s))
            {
                imageview.setImageResource(0x7f02015d);
                textview.setVisibility(8);
                return;
            }
            if ("DualCard".equalsIgnoreCase(s) || "JCPenney Mastercard".equalsIgnoreCase(s))
            {
                imageview.setImageResource(0x7f02015c);
                textview.setVisibility(8);
                return;
            }
        }
    }
}
