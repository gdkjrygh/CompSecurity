// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public final class eze extends hgu
{

    private ekq a;
    private boolean b;
    private android.view.View.OnClickListener c;

    public eze(ekq ekq1, boolean flag, android.view.View.OnClickListener onclicklistener)
    {
        a = ekq1;
        b = flag;
        c = onclicklistener;
    }

    public final int a()
    {
        return 0;
    }

    public final void a(afn afn)
    {
        afn = (ezg)afn;
        ((ezg) (afn)).o.setText(((elj)a.a(elj)).a);
        ((ezg) (afn)).p.setChecked(b);
        ((ezg) (afn)).a.setOnClickListener(c);
    }
}
