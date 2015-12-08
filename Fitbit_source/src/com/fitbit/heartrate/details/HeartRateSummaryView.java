// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.details;

import android.content.Context;
import android.graphics.Typeface;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a.a.a.a;
import com.fitbit.FitBitApplication;
import com.fitbit.util.al;
import com.fitbit.util.be;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.format.e;

public class HeartRateSummaryView extends LinearLayout
{

    protected TextView a;
    protected TextView b;
    protected TextView c;

    public HeartRateSummaryView(Context context)
    {
        super(context);
    }

    public HeartRateSummaryView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public HeartRateSummaryView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private CharSequence a(String s, String s1)
    {
        be be1 = new be();
        be1.a(new RelativeSizeSpan(2.0F), s);
        be1.append((new StringBuilder()).append(" ").append(s1).toString());
        return be1;
    }

    private CharSequence d(int i)
    {
        be be1;
        int j;
        int k;
        be1 = new be();
        j = i / 60;
        if (j > 0)
        {
            String s = e.e(j);
            be1.a(new RelativeSizeSpan(2.0F), s);
            s = getContext().getString(0x7f08025f);
            be1.append(" ");
            be1.append(s);
            be1.append(" ");
        }
        k = i % 60;
        if (k <= 0 && (k != 0 || j != 0)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = e.e(k);
        be1.a(new RelativeSizeSpan(2.0F), ((String) (obj)));
        be1.append(" ");
        obj = null;
        if (i >= 60) goto _L4; else goto _L3
_L3:
        a a1 = FitBitApplication.a().e();
        if (a1 != null)
        {
            try
            {
                obj = a1.a(0x7f0b000e, i, al.j());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = getContext().getString(0x7f0803d8);
            }
        }
_L6:
        be1.append(((CharSequence) (obj)));
_L2:
        return be1;
_L4:
        obj = getContext().getString(0x7f0803d8);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void a()
    {
        a.setTypeface(FitbitFont.e.a(getContext(), Typeface.DEFAULT));
        b.setTypeface(FitbitFont.e.a(getContext(), Typeface.DEFAULT));
        c.setTypeface(FitbitFont.e.a(getContext(), Typeface.DEFAULT));
    }

    public void a(int i)
    {
        a.setText(a(String.valueOf(i), getContext().getString(0x7f0802bc)));
    }

    public void b(int i)
    {
        Object obj = null;
        a a1 = FitBitApplication.a().e();
        if (a1 != null)
        {
            try
            {
                obj = a1.a(0x7f0b0003, i, al.j());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = getContext().getString(0x7f0802be);
            }
        }
        b.setText(a(e.g(i), ((String) (obj))));
        return;
    }

    public void c(int i)
    {
        c.setText(d(i));
    }
}
