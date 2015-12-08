// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.internal.widget.p;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            m, f, h

public final class ExpandedMenuView extends ListView
    implements f.b, m, android.widget.AdapterView.OnItemClickListener
{

    private static final int a[] = {
        0x10100d4, 0x1010129
    };
    private f b;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
        context = p.a(context, attributeset, a, i);
        if (context.g(0))
        {
            setBackgroundDrawable(context.a(0));
        }
        if (context.g(1))
        {
            setDivider(context.a(1));
        }
        context.b();
    }

    public final void a(f f1)
    {
        b = f1;
    }

    public final boolean a(h h1)
    {
        return b.b(h1);
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a((h)getAdapter().getItem(i));
    }

}
