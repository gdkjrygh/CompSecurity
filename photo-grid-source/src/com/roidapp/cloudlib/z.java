// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.b.k;

// Referenced classes of package com.roidapp.cloudlib:
//            t, ar, at

final class z
    implements android.view.View.OnClickListener
{

    final String a;
    final ProgressBar b;
    final t c;

    z(t t1, String s, ProgressBar progressbar)
    {
        c = t1;
        a = s;
        b = progressbar;
        super();
    }

    public final void onClick(View view)
    {
        (new StringBuilder("retry to download ")).append(a);
        if (c.f != null)
        {
            c.f.findViewById(ar.r).setVisibility(8);
            view = (ProgressBar)c.f.findViewById(ar.q);
            view.setProgress(0);
            view.setVisibility(0);
            ((TextView)c.f.findViewById(ar.s)).setText(at.d);
            ((TextView)c.f.findViewById(ar.t)).setText("");
        }
        if (c.g != null)
        {
            c.g.a(a, t.a(c), b, c.i);
        }
    }
}
