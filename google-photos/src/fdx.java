// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

final class fdx extends afn
{

    public final ViewGroup o;
    public final TextView p;
    public final TextView q;
    public final ProgressBar r;
    public final ImageView s;

    public fdx(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.nI, viewgroup, false));
        o = viewgroup;
        p = (TextView)a.findViewById(aa.h);
        q = (TextView)a.findViewById(aa.a);
        r = (ProgressBar)a.findViewById(aa.g);
        s = (ImageView)a.findViewById(aa.b);
    }
}
