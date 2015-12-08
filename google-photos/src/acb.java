// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

final class acb
    implements android.widget.AdapterView.OnItemClickListener
{

    private aca a;

    acb(aca aca1, abx abx1)
    {
        a = aca1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.b.setSelection(i);
        if (a.b.getOnItemClickListener() != null)
        {
            a.b.performItemClick(view, i, aca.a(a).getItemId(i));
        }
        a.c();
    }
}
