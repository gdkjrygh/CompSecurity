// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.util.UUID;

public class bq
{

    public bq()
    {
    }

    public static int a()
    {
        return Math.abs(UUID.randomUUID().hashCode());
    }

    public static View a(Context context)
    {
        context = LayoutInflater.from(context).inflate(0x7f04018c, null);
        context.setEnabled(false);
        context.setOnClickListener(null);
        return context;
    }

    public static View a(Context context, int i, int j)
    {
        return a(context, 0x1090004, i, j);
    }

    public static View a(Context context, int i, int j, int k)
    {
        context = LayoutInflater.from(context).inflate(i, null);
        ((TextView)context.findViewById(0x1020014)).setText(j);
        TextView textview = (TextView)context.findViewById(0x1020015);
        if (k == 0)
        {
            textview.setVisibility(8);
            return context;
        } else
        {
            textview.setText(k);
            textview.setVisibility(0);
            return context;
        }
    }

    public static View a(Context context, int i, String s, String s1)
    {
        context = LayoutInflater.from(context).inflate(i, null);
        ((TextView)context.findViewById(0x1020014)).setText(s);
        s = (TextView)context.findViewById(0x1020015);
        if (s1 == null)
        {
            s.setVisibility(8);
            return context;
        } else
        {
            s.setText(s1);
            s.setVisibility(0);
            return context;
        }
    }

    public static View a(Context context, String s, String s1)
    {
        return a(context, 0x1090004, s, s1);
    }

    public static void a(Activity activity)
    {
        View view = activity.getCurrentFocus();
        if (view != null)
        {
            a(((Context) (activity)), view);
        }
    }

    public static void a(Context context, View view)
    {
        ((InputMethodManager)context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void a(View view, int i)
    {
        int j = view.getPaddingLeft();
        int k = view.getPaddingRight();
        int l = view.getPaddingTop();
        int i1 = view.getPaddingBottom();
        view.setBackgroundResource(i);
        view.setPadding(j, l, k, i1);
    }

    public static void b(Context context, View view)
    {
        ((InputMethodManager)context.getSystemService("input_method")).showSoftInput(view, 0);
    }
}
