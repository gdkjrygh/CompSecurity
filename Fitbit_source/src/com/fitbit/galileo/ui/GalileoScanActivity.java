// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import android.app.Activity;
import android.widget.Button;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.b;
import com.fitbit.ui.ProgressFragmentActivity;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.ui:
//            GalileoScanActivity_, TrackersFragment

public class GalileoScanActivity extends ProgressFragmentActivity
    implements com.fitbit.galileo.b.a
{

    protected TrackersFragment a;
    protected Button b;
    private b c;
    private boolean d;

    public GalileoScanActivity()
    {
        c = new b(this, com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a);
    }

    public static void a(Activity activity)
    {
        GalileoScanActivity_.a(activity).b();
    }

    private void a(boolean flag)
    {
        d = flag;
        Button button = b;
        int i;
        if (flag)
        {
            i = 0x7f08061c;
        } else
        {
            i = 0x7f08061b;
        }
        button.setText(i);
        if (flag)
        {
            f();
            return;
        } else
        {
            g();
            return;
        }
    }

    public void a(List list)
    {
        a(false);
    }

    public boolean a(GalileoTracker galileotracker)
    {
        b(galileotracker);
        return false;
    }

    protected void b(GalileoTracker galileotracker)
    {
        a.a(galileotracker);
    }

    protected void c()
    {
        boolean flag;
        if (d)
        {
            c.e();
        } else
        {
            a.d();
            c.d();
        }
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public void onStart()
    {
        super.onStart();
        a(true);
        a.d();
        c.d();
    }

    public void onStop()
    {
        super.onStop();
        a(false);
        c.e();
    }
}
