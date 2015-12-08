// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.c.s;
import com.roidapp.cloudlib.ar;

final class f extends s
{

    ProgressBar k;
    TextView l;
    TextView m;
    TextView n;
    ImageView o;
    ImageView p;
    ImageView q;
    ImageView r;
    ImageView s;
    ImageView t;
    View u;

    public f(View view, int i)
    {
        super(view, i);
        u = a.findViewById(ar.cA);
        o = (ImageView)a.findViewById(ar.cz);
        l = (TextView)a.findViewById(ar.cx);
        p = (ImageView)a.findViewById(ar.cF);
        m = (TextView)a.findViewById(ar.cs);
        q = (ImageView)a.findViewById(ar.cy);
        k = (ProgressBar)a.findViewById(ar.cB);
        n = (TextView)a.findViewById(ar.cC);
        r = (ImageView)a.findViewById(ar.cr);
        s = (ImageView)a.findViewById(ar.cu);
        t = (ImageView)a.findViewById(ar.cv);
    }
}
