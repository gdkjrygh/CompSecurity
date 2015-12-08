// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v7.widget.bi;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.view.RoundImageView;
import com.roidapp.cloudlib.ar;

final class bt extends bi
{

    public ImageView j;
    public View k;
    public View l;
    public TextView m;
    public RoundImageView n;
    public TextView o;
    public ViewGroup p;
    public TextView q;
    public ProgressBar r;
    public ViewGroup s;
    public ImageView t;
    public ImageView u;
    public ImageView v;

    public bt(View view)
    {
        super(view);
        k = view.findViewById(ar.aJ);
        m = (TextView)k.findViewById(ar.ak);
        j = (ImageView)k.findViewById(ar.al);
        l = k.findViewById(ar.am);
        n = (RoundImageView)l.findViewById(ar.an);
        o = (TextView)l.findViewById(ar.ao);
        p = (ViewGroup)l.findViewById(ar.ah);
        q = (TextView)p.findViewById(ar.aj);
        r = (ProgressBar)p.findViewById(ar.ai);
        s = (ViewGroup)view.findViewById(ar.av);
        t = (ImageView)s.findViewById(ar.as);
        u = (ImageView)s.findViewById(ar.at);
        v = (ImageView)s.findViewById(ar.au);
        view.setTag(this);
    }
}
