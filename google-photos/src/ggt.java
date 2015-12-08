// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class ggt
    implements android.widget.AdapterView.OnItemClickListener
{

    private ggp a;

    ggt(ggp ggp1)
    {
        a = ggp1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        switch ((int)l)
        {
        default:
            ggp.a(a, (int)l);
            ggp.a(a, false);
            return;

        case -1: 
            ggp.f(a).a(a);
            return;

        case -2: 
            a.O_().setResult(-1);
            a.O_().finish();
            return;
        }
    }
}
