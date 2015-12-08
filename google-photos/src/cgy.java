// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

final class cgy
    implements android.widget.AdapterView.OnItemClickListener
{

    private cgx a;

    cgy(cgx cgx1)
    {
        a = cgx1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (cqa)adapterview.getAdapter().getItem(i);
        if (cgp.d(a.d) != null && cgp.d(a.d).e.equals(((cqa) (adapterview)).e))
        {
            cgp.a(a.d).a(null);
            cgp.a(a.d, null);
        } else
        {
            mry.a(cgp.e(a.d), 4, (new msn()).a(view).a(a.d()));
            cgp.a(a.d).a(adapterview);
            cgp.a(a.d, adapterview);
        }
        cgx.a(a);
    }
}
