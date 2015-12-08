// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;

// Referenced classes of package com.fitbit.util:
//            bh

public class be extends SpannableStringBuilder
{

    public be()
    {
    }

    private void b(String s, String s1, Object aobj[])
    {
        append(s1);
        int i = length();
        int k = s1.length();
        k = s1.indexOf(s) + (i - k);
        int l = s.length();
        int i1 = aobj.length;
        for (int j = 0; j < i1; j++)
        {
            setSpan(aobj[j], k, k + l, 33);
        }

    }

    public void a(Context context, String s, int i, Object aobj[])
    {
        if (context == null)
        {
            return;
        } else
        {
            b(s, bh.a(context, i, new String[] {
                s
            }), aobj);
            return;
        }
    }

    public void a(Object obj, String s)
    {
        append(s);
        setSpan(obj, length() - s.length(), length(), 33);
    }

    public void a(String s)
    {
        a(new RelativeSizeSpan(0.6F), s);
    }

    public void a(String s, String s1, Object aobj[])
    {
        b(s, String.format(s1, new Object[] {
            s
        }), aobj);
    }

    public void b(String s)
    {
        a(new StyleSpan(1), s);
    }
}
