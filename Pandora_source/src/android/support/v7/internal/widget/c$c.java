// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.internal.widget:
//            c

class b
    implements android.widget.terView.OnItemClickListener
{

    final c a;
    private final a b;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        b.a(a, view, i, l);
    }

    public istener(c c1, istener istener)
    {
        a = c1;
        super();
        b = istener;
    }
}
