// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class dqu extends dqx
{

    private final TextView k;
    private final TextView l;

    public dqu(ViewGroup viewgroup, doh doh)
    {
        super(a(0x7f030120, viewgroup), doh);
        k = (TextView)a.findViewById(0x7f11026e);
        l = (TextView)a.findViewById(0x7f1102a3);
    }

    protected final void a(drf drf, doj doj)
    {
        drf = (dre)drf;
        k.setText(drf.getTitle());
        l.setText(drf.getDescription());
    }
}
