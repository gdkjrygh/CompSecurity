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

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            PostCommentsTextView

final class bs extends bi
{

    public TextView A;
    public ViewGroup B;
    public TextView C;
    public View j;
    public RoundImageView k;
    public TextView l;
    public TextView m;
    public ProgressBar n;
    public ImageView o;
    public TextView p;
    public PostCommentsTextView q;
    public ViewGroup r;
    public PostCommentsTextView s;
    public ViewGroup t;
    public ViewGroup u;
    public ViewGroup v;
    public ProgressBar w;
    public ImageView x;
    public TextView y;
    public TextView z;

    public bs(View view)
    {
        super(view);
        j = view.findViewById(ar.aJ);
        k = (RoundImageView)j.findViewById(ar.aL);
        l = (TextView)j.findViewById(ar.aM);
        m = (TextView)j.findViewById(ar.aK);
        B = (ViewGroup)j.findViewById(ar.ah);
        C = (TextView)B.findViewById(ar.aj);
        n = (ProgressBar)view.findViewById(ar.ap);
        p = (TextView)view.findViewById(ar.aq);
        o = (ImageView)view.findViewById(ar.ar);
        q = (PostCommentsTextView)view.findViewById(ar.ag);
        r = (ViewGroup)view.findViewById(ar.Q);
        s = (PostCommentsTextView)r.findViewById(ar.P);
        t = (ViewGroup)view.findViewById(ar.ax);
        u = (ViewGroup)view.findViewById(ar.N);
        v = (ViewGroup)view.findViewById(ar.aC);
        y = (TextView)t.findViewById(ar.az);
        x = (ImageView)t.findViewById(ar.aw);
        w = (ProgressBar)t.findViewById(ar.ay);
        z = (TextView)u.findViewById(ar.O);
        A = (TextView)v.findViewById(ar.aB);
        view.setTag(this);
    }
}
