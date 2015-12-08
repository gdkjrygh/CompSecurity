// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class cfb extends afn
{

    public final View o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final ImageView t;
    public final ImageView u;
    public final TextView v;
    final cfa w;

    public cfb(cfa cfa, View view)
    {
        w = cfa;
        super(view);
        view.setOnClickListener(new cfc(this, cfa));
        o = view;
        p = (TextView)view.findViewById(b.fU);
        q = (TextView)view.findViewById(b.fS);
        r = (TextView)view.findViewById(b.fT);
        s = (TextView)view.findViewById(b.fR);
        t = (ImageView)view.findViewById(b.fV);
        u = (ImageView)view.findViewById(b.fW);
        v = (TextView)view.findViewById(b.hs);
    }
}
