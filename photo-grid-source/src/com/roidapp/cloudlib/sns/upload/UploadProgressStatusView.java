// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.upload;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;

// Referenced classes of package com.roidapp.cloudlib.sns.upload:
//            e

public class UploadProgressStatusView extends LinearLayout
{

    private Context a;
    private View b;
    private RelativeLayout c;
    private RelativeLayout d;
    private RelativeLayout e;
    private ImageView f;
    private RelativeLayout g;
    private RelativeLayout h;
    private ProgressBar i;
    private TextView j;

    public UploadProgressStatusView(Context context)
    {
        super(context);
        a(context);
    }

    public UploadProgressStatusView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    private void a(Context context)
    {
        a = context;
        b = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(as.aj, this, true);
        c = (RelativeLayout)b.findViewById(ar.dm);
        d = (RelativeLayout)b.findViewById(ar.dh);
        e = (RelativeLayout)b.findViewById(ar.dt);
        f = (ImageView)b.findViewById(ar.bL);
        g = (RelativeLayout)b.findViewById(ar.di);
        h = (RelativeLayout)b.findViewById(ar.dj);
        i = (ProgressBar)b.findViewById(ar.dk);
        j = (TextView)b.findViewById(ar.dl);
    }

    public static int b()
    {
        return ar.di;
    }

    public static int c()
    {
        return ar.dj;
    }

    public final void a()
    {
        d.setVisibility(8);
    }

    public final void a(int k)
    {
        if (k == 0)
        {
            e.setVisibility(0);
            c.setVisibility(8);
            d.setVisibility(8);
        } else
        {
            if (k == 1)
            {
                e.setVisibility(8);
                c.setVisibility(0);
                d.setVisibility(8);
                return;
            }
            if (k == 2)
            {
                e.setVisibility(8);
                c.setVisibility(8);
                d.setVisibility(0);
                return;
            }
        }
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        g.setOnClickListener(onclicklistener);
        h.setOnClickListener(onclicklistener);
    }

    public final void a(String s)
    {
        com.roidapp.cloudlib.sns.upload.e.a();
        com.roidapp.cloudlib.sns.upload.e.a(f, s);
    }

    public final void b(int k)
    {
        i.setProgress(k);
        j.setText((new StringBuilder()).append(k).append("%").toString());
    }
}
