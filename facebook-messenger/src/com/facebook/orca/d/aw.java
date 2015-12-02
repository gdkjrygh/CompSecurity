// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.OverlayLayout;

// Referenced classes of package com.facebook.orca.d:
//            ax

public class aw
{

    private final LayoutInflater a;
    private final Resources b;
    private final Handler c = new Handler();
    private View d;
    private boolean e;
    private TextView f;
    private final Runnable g = new ax(this);

    public aw(LayoutInflater layoutinflater, Resources resources)
    {
        a = layoutinflater;
        b = resources;
    }

    private void a(String s)
    {
        c.removeCallbacks(g);
        e();
        if (e)
        {
            return;
        } else
        {
            f.setText(s);
            f.setVisibility(0);
            return;
        }
    }

    private void e()
    {
        if (f != null || e)
        {
            return;
        }
        OverlayLayout overlaylayout = f();
        if (overlaylayout == null)
        {
            e = true;
            return;
        } else
        {
            f = (TextView)a.inflate(k.orca_audio_recorder_topbar, null);
            overlaylayout.addView(f);
            com.facebook.widget.k k1 = (com.facebook.widget.k)f.getLayoutParams();
            k1.width = -1;
            k1.height = -2;
            k1.c = 516;
            k1.a = true;
            k1.b = overlaylayout.getId();
            f.setVisibility(8);
            f.setLayoutParams(k1);
            return;
        }
    }

    private OverlayLayout f()
    {
        for (View view = d; view.getParent() instanceof View;)
        {
            View view1 = (View)view.getParent();
            view = view1;
            if (view1 instanceof OverlayLayout)
            {
                return (OverlayLayout)view1;
            }
        }

        return null;
    }

    public void a()
    {
        a(b.getString(o.audio_record_cancelled_message));
        c.postDelayed(g, 2000L);
    }

    public void a(View view)
    {
        d = view;
    }

    public void b()
    {
        a(b.getString(o.audio_cancel_record_instruction));
    }

    public void c()
    {
        a(b.getString(o.audio_recorder_maximum_length_notification));
    }

    public void d()
    {
        if (e || f == null)
        {
            return;
        } else
        {
            f.setVisibility(8);
            return;
        }
    }
}
