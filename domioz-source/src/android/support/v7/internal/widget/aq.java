// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            ap, SpinnerCompat

final class aq
    implements android.widget.AdapterView.OnItemClickListener
{

    final SpinnerCompat a;
    final ap b;

    aq(ap ap1, SpinnerCompat spinnercompat)
    {
        b = ap1;
        a = spinnercompat;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.a.a(i);
        if (b.a.s != null)
        {
            adapterview = b.a;
            ap.a(b).getItemId(i);
            adapterview.a(view);
        }
        b.a();
    }
}
