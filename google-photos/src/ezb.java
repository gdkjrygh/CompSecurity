// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public final class ezb extends hgu
{

    private String a;
    private boolean b;
    private android.view.View.OnClickListener c;

    public ezb(String s, boolean flag, android.view.View.OnClickListener onclicklistener)
    {
        a = s;
        b = flag;
        c = onclicklistener;
    }

    public final int a()
    {
        return 2;
    }

    public final void a(afn afn)
    {
        afn = (ezd)afn;
        ((ezd) (afn)).o.setText(a);
        ((ezd) (afn)).p.setChecked(b);
        ((ezd) (afn)).a.setOnClickListener(c);
    }
}
