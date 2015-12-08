// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.widget:
//            q, AppCompatSpinner

final class r
    implements android.widget.AdapterView.OnItemClickListener
{

    final AppCompatSpinner a;
    final q b;

    r(q q1, AppCompatSpinner appcompatspinner)
    {
        b = q1;
        a = appcompatspinner;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.b.setSelection(i);
        if (b.b.getOnItemClickListener() != null)
        {
            b.b.performItemClick(view, i, q.a(b).getItemId(i));
        }
        b.d();
    }
}
