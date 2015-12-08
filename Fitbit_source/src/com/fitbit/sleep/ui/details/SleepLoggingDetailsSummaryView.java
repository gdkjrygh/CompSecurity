// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.details;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.sleep.ui.charts.SleepParam;
import com.fitbit.util.al;
import com.fitbit.util.be;
import com.fitbit.util.format.e;

public class SleepLoggingDetailsSummaryView extends LinearLayout
{

    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private View f;
    private SleepLogEntry g;

    public SleepLoggingDetailsSummaryView(Context context)
    {
        super(context);
        a();
    }

    public SleepLoggingDetailsSummaryView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public SleepLoggingDetailsSummaryView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private be a(int i, int j)
    {
        String s = com.fitbit.util.format.e.e(i);
        TextAppearanceSpan textappearancespan = new TextAppearanceSpan(getContext(), 0x7f0c0178);
        be be1 = new be();
        be1.a(getContext(), s, j, new Object[] {
            textappearancespan
        });
        return be1;
    }

    private be a(int i, String s)
    {
        String s1 = com.fitbit.util.format.e.e(i);
        TextAppearanceSpan textappearancespan = new TextAppearanceSpan(getContext(), 0x7f0c0178);
        be be1 = new be();
        be1.a(s1, s, new Object[] {
            textappearancespan
        });
        return be1;
    }

    private void a()
    {
        inflate(getContext(), 0x7f0401a7, this);
        a = (TextView)findViewById(0x7f11044c);
        b = (TextView)findViewById(0x7f11044f);
        e = (TextView)findViewById(0x7f110452);
        d = (TextView)findViewById(0x7f110451);
        f = findViewById(0x7f11035b);
        c = (TextView)findViewById(0x7f110450);
        View view = findViewById(0x7f11044e);
        if (al.h())
        {
            view.setVisibility(0);
        } else
        {
            view.setVisibility(8);
        }
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final SleepLoggingDetailsSummaryView a;

                public void onClick(View view1)
                {
                    SleepLoggingDetailsSummaryView.a(a);
                }

            
            {
                a = SleepLoggingDetailsSummaryView.this;
                super();
            }
            });
        }
    }

    static void a(SleepLoggingDetailsSummaryView sleeploggingdetailssummaryview)
    {
        sleeploggingdetailssummaryview.b();
    }

    private void b()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(getContext().getString(0x7f08062c)));
        getContext().startActivity(intent);
    }

    public void a(SleepLogEntry sleeplogentry)
    {
        g = sleeplogentry;
        if (sleeplogentry == null)
        {
            return;
        }
        int i = sleeplogentry.g();
        Object obj = new TextAppearanceSpan(getContext(), 0x7f0c0178);
        TextAppearanceSpan textappearancespan = new TextAppearanceSpan(getContext(), 0x7f0c0178);
        a.setText(com.fitbit.util.format.e.a(getContext(), i, new Object[] {
            obj
        }, new Object[] {
            textappearancespan
        }));
        i = sleeplogentry.f();
        int j;
        if (i > 0)
        {
            b.setVisibility(0);
            b.setText(a(i, 0x7f0804c4));
        } else
        {
            b.setVisibility(8);
        }
        i = sleeplogentry.k();
        obj = a(i, SleepParam.b.a(i));
        c.setText(((CharSequence) (obj)));
        i = sleeplogentry.l();
        obj = a(i, SleepParam.c.a(i));
        d.setText(((CharSequence) (obj)));
        i = sleeplogentry.p();
        j = sleeplogentry.q();
        e.setText(a(i + j, 0x7f0804c3));
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            f.setVisibility(0);
            return;
        } else
        {
            f.setVisibility(8);
            return;
        }
    }
}
