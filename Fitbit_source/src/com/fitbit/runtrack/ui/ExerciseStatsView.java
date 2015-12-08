// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.util.format.e;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class ExerciseStatsView extends LinearLayout
{

    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;

    public ExerciseStatsView(Context context)
    {
        this(context, null);
    }

    public ExerciseStatsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public ExerciseStatsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        View.inflate(getContext(), 0x7f04007d, this);
    }

    public void a(ActivityLogEntry activitylogentry)
    {
        if (activitylogentry == null)
        {
            return;
        }
        Object obj = an.a().b().t();
        String s2 = DateUtils.formatElapsedTime(activitylogentry.a(TimeUnit.SECONDS));
        String s = "";
        String s4 = com.fitbit.util.format.e.e(activitylogentry.c());
        String s5 = getContext().getString(0x7f0803dd);
        String s1 = "";
        String s6 = getContext().getString(0x7f0804ef).toLowerCase(Locale.getDefault());
        if (activitylogentry.b() != null)
        {
            s = com.fitbit.util.format.e.b(activitylogentry.b().a(((com.fitbit.data.domain.Length.LengthUnits) (obj))).b());
            s1 = ((com.fitbit.data.domain.Length.LengthUnits) (obj)).getDisplayName();
        }
        String s3;
        if (activitylogentry.y() > 0)
        {
            s3 = com.fitbit.util.format.e.e(activitylogentry.y());
            obj = getContext().getString(0x7f0802bc);
        } else
        {
            int i;
            if (activitylogentry.n() == 0)
            {
                i = activitylogentry.i();
            } else
            {
                i = activitylogentry.n();
            }
            s3 = com.fitbit.util.format.e.e(i);
            obj = getContext().getString(0x7f0800bb);
        }
        activitylogentry = SupportedActivity.a(activitylogentry.a().getServerId());
        if (activitylogentry == null)
        {
            activitylogentry = s6;
            s = s4;
            s1 = s5;
        } else
        if (!((SupportedActivity) (activitylogentry)).isRecordable)
        {
            activitylogentry = s5;
            s4 = s;
            s = s2;
            s2 = s4;
        } else
        {
            s2 = s;
            activitylogentry = s6;
            s = s4;
        }
        a.setText(s2);
        b.setText(s);
        c.setText(s3);
        d.setText(s1);
        e.setText(activitylogentry);
        f.setText(((CharSequence) (obj)));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(0x7f110229);
        b = (TextView)findViewById(0x7f11022b);
        c = (TextView)findViewById(0x7f11022d);
        d = (TextView)findViewById(0x7f11022a);
        e = (TextView)findViewById(0x7f11022c);
        f = (TextView)findViewById(0x7f11022e);
    }
}
