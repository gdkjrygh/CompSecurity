// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class eou extends afn
{

    public final ImageView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;

    public eou(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.mp, viewgroup, false));
        o = (ImageView)a.findViewById(s.f);
        p = (TextView)a.findViewById(s.o);
        q = (TextView)a.findViewById(s.m);
        r = (TextView)a.findViewById(s.n);
        s = (TextView)a.findViewById(s.b);
    }
}
