// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.widget.ListPopupWindow;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            as, aq, SpinnerCompat

final class ap extends ListPopupWindow
    implements as
{

    final SpinnerCompat a;
    private CharSequence c;
    private ListAdapter d;

    public ap(SpinnerCompat spinnercompat, Context context, int i)
    {
        a = spinnercompat;
        super(context, null, i);
        a(spinnercompat);
        e();
        d();
        a(new aq(this, spinnercompat));
    }

    static ListAdapter a(ap ap1)
    {
        return ap1.d;
    }

    public final void a(ListAdapter listadapter)
    {
        super.a(listadapter);
        d = listadapter;
    }

    public final void a(CharSequence charsequence)
    {
        c = charsequence;
    }
}
