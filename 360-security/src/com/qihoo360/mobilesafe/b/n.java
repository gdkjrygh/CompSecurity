// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import com.qihoo.security.locale.d;

public class n
{

    public static SpannableString a(int i, String s, int j, int k)
    {
        Object obj = d.a().a(i, new Object[] {
            s
        });
        i = ((String) (obj)).indexOf(s);
        obj = new SpannableString(((CharSequence) (obj)));
        ((SpannableString) (obj)).setSpan(new AbsoluteSizeSpan(j), i, s.length() + i, 33);
        ((SpannableString) (obj)).setSpan(new ForegroundColorSpan(k), i, s.length() + i, 33);
        return ((SpannableString) (obj));
    }

    public static SpannableString a(Context context, int i, int j)
    {
        return a(context, d.a().a(i), j);
    }

    public static SpannableString a(Context context, int i, int j, String s)
    {
        Object obj = d.a().a(i, new Object[] {
            s
        });
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return new SpannableString("");
        } else
        {
            i = ((String) (obj)).indexOf(s);
            obj = new SpannableString(((CharSequence) (obj)));
            ((SpannableString) (obj)).setSpan(new ForegroundColorSpan(context.getResources().getColor(j)), i, s.length() + i, 33);
            return ((SpannableString) (obj));
        }
    }

    public static SpannableString a(Context context, String s, int i)
    {
        if (TextUtils.isEmpty(s))
        {
            return new SpannableString("");
        } else
        {
            SpannableString spannablestring = new SpannableString(s);
            spannablestring.setSpan(new ForegroundColorSpan(context.getResources().getColor(i)), 0, s.length(), 33);
            return spannablestring;
        }
    }
}
