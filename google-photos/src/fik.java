// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

public final class fik extends afn
{

    public final TextView o;
    public final TextView p;
    public final Switch q;

    public fik(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.pp, viewgroup, false));
        o = (TextView)a.findViewById(ag.g);
        p = (TextView)a.findViewById(ag.f);
        q = (Switch)a.findViewById(ag.h);
    }
}
