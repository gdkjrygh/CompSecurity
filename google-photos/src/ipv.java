// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class ipv
    implements android.widget.AdapterView.OnItemClickListener
{

    private ipu a;

    ipv(ipu ipu1)
    {
        a = ipu1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (ipu.a(a))
        {
            return;
        }
        ipu.a(a, true);
        adapterview = a;
        if (b.a((Boolean)view.getTag(s.bV), false))
        {
            i = 3;
        } else
        {
            i = 1;
        }
        ipu.a(adapterview, view, i);
        ipu.c(a).startAnimation(ipu.b(a));
    }
}
