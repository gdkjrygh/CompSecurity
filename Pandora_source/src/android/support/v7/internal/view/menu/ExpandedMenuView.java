// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
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

    private f a;
    private int b;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
    }

    public void a(f f1)
    {
        a = f1;
    }

    public boolean a(h h1)
    {
        return a.a(h1, 0);
    }

    public int getWindowAnimations()
    {
        return b;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a((h)getAdapter().getItem(i));
    }
}
