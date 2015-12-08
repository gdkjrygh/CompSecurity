// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import android.content.Context;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.util.a;
import com.fitbit.util.be;
import com.fitbit.util.format.e;

public class ActivitySummaryView extends LinearLayout
{

    private ImageView a;
    private TextView b;
    private TextView c;
    private ImageView d;

    public ActivitySummaryView(Context context)
    {
        super(context);
        a();
    }

    public ActivitySummaryView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public ActivitySummaryView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private static CharSequence a(String s, String s1)
    {
        be be1 = new be();
        be1.a(new RelativeSizeSpan(2.0F), s);
        be1.append((new StringBuilder()).append(" ").append(s1).toString());
        return be1;
    }

    private static String a(Context context, ActivityType activitytype)
    {
        int i = 0;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ActivityType.values().length];
                try
                {
                    a[ActivityType.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[ActivityType.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ActivityType.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ActivityType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ActivityType.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.activity.ui.details._cls1.a[activitytype.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 50
    //                   2 56
    //                   3 62
    //                   4 68
    //                   5 74;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return context.getString(i);
_L2:
        i = 0x7f0800ae;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 0x7f080162;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f08003a;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f080032;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f0804ef;
        if (true) goto _L1; else goto _L7
_L7:
    }

    protected void a()
    {
        inflate(getContext(), 0x7f040118, this);
        c = (TextView)findViewById(0x7f110394);
        b = (TextView)findViewById(0x7f110393);
        d = (ImageView)findViewById(0x7f11035b);
        a = (ImageView)findViewById(0x7f1101ec);
    }

    public void a(ActivityType activitytype, double d1, boolean flag)
    {
        boolean flag1 = false;
        com.fitbit.activity.ui.details._cls1.a[activitytype.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 113
    //                   2 120
    //                   3 127
    //                   4 134
    //                   5 141;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_141;
_L1:
        int i = 0;
_L7:
        a.setImageResource(i);
        b.setText(a(getContext(), activitytype));
        activitytype = a(e.b(d1), com.fitbit.util.a.a(activitytype, d1));
        c.setText(activitytype);
        activitytype = d;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 4;
        }
        activitytype.setVisibility(i);
        return;
_L2:
        i = 0x7f02010d;
          goto _L7
_L3:
        i = 0x7f0201a4;
          goto _L7
_L4:
        i = 0x7f0201e7;
          goto _L7
_L5:
        i = 0x7f020054;
          goto _L7
        i = 0x7f020377;
          goto _L7
    }
}
