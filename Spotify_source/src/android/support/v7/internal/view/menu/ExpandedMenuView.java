// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import ug;
import ui;
import uk;
import uw;
import wc;

public final class ExpandedMenuView extends ListView
    implements android.widget.AdapterView.OnItemClickListener, ui, uw
{

    private static final int a[] = {
        0x10100d4, 0x1010129
    };
    private ug b;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
        context = wc.a(context, attributeset, a, i);
        if (context.e(0))
        {
            setBackgroundDrawable(context.a(0));
        }
        if (context.e(1))
        {
            setDivider(context.a(1));
        }
        ((wc) (context)).a.recycle();
    }

    public final void a(ug ug1)
    {
        b = ug1;
    }

    public final boolean a(uk uk1)
    {
        return b.a(uk1, null, 0);
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a((uk)getAdapter().getItem(i));
    }

}
