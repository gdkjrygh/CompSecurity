// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.internal.widget.az;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            k, z, i, m

public final class ExpandedMenuView extends ListView
    implements k, z, android.widget.AdapterView.OnItemClickListener
{

    private static final int a[] = {
        0x10100d4, 0x1010129
    };
    private i b;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
        context = az.a(context, attributeset, a, j);
        if (context.f(0))
        {
            setBackgroundDrawable(context.a(0));
        }
        if (context.f(1))
        {
            setDivider(context.a(1));
        }
        context.b();
    }

    public final void a(i j)
    {
        b = j;
    }

    public final boolean a(m m1)
    {
        return b.b(m1);
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        a((m)getAdapter().getItem(j));
    }

}
