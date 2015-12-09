// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.fitbit.data.domain.Gender;

public class OnboardingGenderPicker extends LinearLayout
{
    public static interface a
    {

        public abstract void a(OnboardingGenderPicker onboardinggenderpicker);
    }


    private final ImageView a = (ImageView)findViewById(0x7f110438);
    private final ImageView b = (ImageView)findViewById(0x7f11043a);
    private final ImageView c = (ImageView)findViewById(0x7f11043b);
    private a d;
    private Gender e;

    public OnboardingGenderPicker(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = Gender.NA;
        LayoutInflater.from(context).inflate(0x7f040192, this);
        context = new _cls1();
        a.setOnClickListener(context);
        b.setOnClickListener(context);
        c();
    }

    static ImageView a(OnboardingGenderPicker onboardinggenderpicker)
    {
        return onboardinggenderpicker.a;
    }

    static Gender a(OnboardingGenderPicker onboardinggenderpicker, Gender gender)
    {
        onboardinggenderpicker.e = gender;
        return gender;
    }

    static void b(OnboardingGenderPicker onboardinggenderpicker)
    {
        onboardinggenderpicker.c();
    }

    private void c()
    {
    /* anonymous class not found */
    class _anm2 {}

        switch (_cls2.a[e.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            b.setImageResource(0x7f0202d7);
            a.setImageResource(0x7f0201d6);
            return;

        case 2: // '\002'
            b.setImageResource(0x7f0202d6);
            break;
        }
        a.setImageResource(0x7f0201d7);
    }

    public Gender a()
    {
        return e;
    }

    public void a(Gender gender)
    {
        if (gender != null && e != gender)
        {
            e = gender;
            c();
        }
    }

    public void a(a a1)
    {
        d = a1;
    }

    public void a(String s)
    {
        ImageView imageview = c;
        int i;
        if (s != null)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    public a b()
    {
        return d;
    }

    /* member class not found */
    class _cls1 {}

}
