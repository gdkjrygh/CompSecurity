// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Handler;
import android.text.format.DateFormat;
import android.text.format.Time;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package kik.android.widget:
//            eh, ei

public class UpdatingDateView extends TextView
{

    private long a;
    private long b;
    private final int c;
    private final int d;
    private BroadcastReceiver e;
    private ContentObserver f;

    public UpdatingDateView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 1;
        d = 2;
        e = new eh(this);
        f = new ei(this, new Handler());
    }

    public UpdatingDateView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = 1;
        d = 2;
        e = new eh(this);
        f = new ei(this, new Handler());
    }

    static long a(UpdatingDateView updatingdateview)
    {
        return updatingdateview.a;
    }

    static void b(UpdatingDateView updatingdateview)
    {
        Time time = new Time();
        time.set(updatingdateview.b);
        time.hour = time.hour - 12;
        long l = time.toMillis(false);
        time.hour = time.hour + 12;
        long l1 = time.toMillis(false);
        time.hour = 0;
        time.minute = 0;
        long l2 = time.toMillis(false);
        time.monthDay = time.monthDay + 1;
        long l3 = time.toMillis(false);
        long l4 = System.currentTimeMillis();
        int i;
        if (l4 >= l2 && l4 < l3 || l4 >= l && l4 < l1)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        switch (i)
        {
        default:
            String s = android.provider.Settings.System.getString(updatingdateview.getContext().getContentResolver(), "date_format");
            if (s == null || "".equals(s))
            {
                s = DateFormat.format("m/d/y", updatingdateview.b).toString();
            } else
            {
                try
                {
                    s = DateFormat.format(s, updatingdateview.b).toString();
                }
                catch (Exception exception)
                {
                    exception = DateFormat.format("m/d/y", updatingdateview.b).toString();
                }
            }
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_207;
        }
        updatingdateview.setText(s);
        if (i == 1)
        {
            updatingdateview.a = Math.max(l1, l3);
            return;
        } else
        {
            updatingdateview.a = -1L;
            return;
        }
        if (DateFormat.is24HourFormat(updatingdateview.getContext()))
        {
            s = DateFormat.format("k:mm AA", updatingdateview.b).toString();
        } else
        {
            s = DateFormat.format("h:mm AA", updatingdateview.b).toString();
        }
        break MISSING_BLOCK_LABEL_185;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Object obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("android.intent.action.DATE_CHANGED");
        ((IntentFilter) (obj)).addAction("android.intent.action.TIME_SET");
        ((IntentFilter) (obj)).addAction("android.intent.action.TIME_TICK");
        ((IntentFilter) (obj)).addAction("android.intent.action.TIMEZONE_CHANGED");
        ((IntentFilter) (obj)).addAction("android.intent.action.CONFIGURATION_CHANGED");
        getContext().registerReceiver(e, ((IntentFilter) (obj)));
        obj = android.provider.Settings.System.getUriFor("date_format");
        getContext().getContentResolver().registerContentObserver(((android.net.Uri) (obj)), true, f);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        getContext().unregisterReceiver(e);
        getContext().getContentResolver().unregisterContentObserver(f);
    }
}
