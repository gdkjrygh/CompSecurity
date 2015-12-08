// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

final class fyu extends hgu
{

    private final String a;
    private final boolean b;

    fyu(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public final int a()
    {
        return q.ap;
    }

    public final void a(afn afn)
    {
        afn = (fyv)afn;
        View view = ((fyv) (afn)).o;
        int i;
        if (b)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
        ((fyv) (afn)).p.setText(a);
    }
}
