// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

public final class HW extends android.support.v7.widget.RecyclerView.v
{

    public TextView l;
    public PI m;

    public HW(View view)
    {
        this(view, (TextView)view.findViewById(0x7f0d0434), new PI(view, 0x7f0d0435, 0x7f0d0436));
    }

    private HW(View view, TextView textview, PI pi)
    {
        super(view);
        l = textview;
        m = pi;
    }

    public final void a(String s)
    {
        l.setText(s);
    }
}
