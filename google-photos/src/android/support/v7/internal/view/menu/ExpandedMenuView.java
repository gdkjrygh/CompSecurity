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
import vu;
import vw;
import vy;
import wl;
import yj;

public final class ExpandedMenuView extends ListView
    implements android.widget.AdapterView.OnItemClickListener, vw, wl
{

    private static final int a[] = {
        0x10100d4, 0x1010129
    };
    private vu b;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
        context = yj.a(context, attributeset, a, i, 0);
        if (context.d(0))
        {
            setBackgroundDrawable(context.a(0));
        }
        if (context.d(1))
        {
            setDivider(context.a(1));
        }
        ((yj) (context)).a.recycle();
    }

    public final void a(vu vu1)
    {
        b = vu1;
    }

    public final boolean a(vy vy1)
    {
        return b.a(vy1, null, 0);
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a((vy)getAdapter().getItem(i));
    }

}
