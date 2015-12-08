// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;

public final class fil extends hgu
{

    final String a;
    private final msm b;

    public fil(String s)
    {
        b = new msm(pwz.c);
        a = s;
    }

    public final int a()
    {
        return p.O;
    }

    public final void a(afn afn)
    {
        afn = (fin)afn;
        b.a(((fin) (afn)).o, b);
        if (TextUtils.isEmpty(a))
        {
            Context context = ((fin) (afn)).q;
            ((fin) (afn)).o.setEnabled(false);
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                ((fin) (afn)).o.setTextColor(((fin) (afn)).q.getResources().getColor(b.pq));
            }
            ((fin) (afn)).p.setText(b.pt);
            return;
        } else
        {
            ((fin) (afn)).o.setOnClickListener(new msj(new fim(this, afn)));
            ((fin) (afn)).p.setText(a);
            return;
        }
    }

    public final long b()
    {
        return (long)p.O;
    }
}
