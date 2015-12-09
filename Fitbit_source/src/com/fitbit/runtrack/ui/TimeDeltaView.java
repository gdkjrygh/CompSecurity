// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.f;
import java.util.Date;

public class TimeDeltaView extends TextView
{

    private Long a;
    private long b;
    private f c;
    private Duration d;

    public TimeDeltaView(Context context)
    {
        super(context);
        c = new f();
    }

    public TimeDeltaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new f();
    }

    public TimeDeltaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new f();
    }

    public Duration a()
    {
        return d;
    }

    public void a(long l)
    {
        b = l;
    }

    public void a(Date date)
    {
        if (date == null)
        {
            a = null;
            return;
        } else
        {
            a = Long.valueOf(date.getTime());
            return;
        }
    }

    public void b()
    {
        long l1 = c.a();
        long l;
        if (a == null)
        {
            l = l1;
        } else
        {
            l = a.longValue();
        }
        d = Duration.a(l, l1).a(Long.valueOf(b));
        setText(String.valueOf(d));
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        long al[] = parcelable.getLongArray("ref");
        if (al.length > 0)
        {
            a = Long.valueOf(al[0]);
        }
        b = parcelable.getLong("offset");
        c = f.b(parcelable);
        super.onRestoreInstanceState(parcelable.getParcelable("super"));
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        long al[];
        if (a == null)
        {
            al = new long[0];
        } else
        {
            al = new long[1];
            al[0] = a.longValue();
        }
        bundle.putLongArray("ref", al);
        bundle.putLong("offset", b);
        c.a(bundle);
        return bundle;
    }
}
