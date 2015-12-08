// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

final class ifa extends afn
{

    public final ImageView o;
    public final TextView p;
    iey q;

    public ifa(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.yG, viewgroup, false));
        o = (ImageView)a.findViewById(ce.c);
        p = (TextView)a.findViewById(ce.n);
    }
}
