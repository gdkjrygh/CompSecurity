// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuView, MenuBuilder, MenuItemImpl

public final class ExpandedMenuView extends ListView
    implements MenuBuilder.ItemInvoker, MenuView, android.widget.AdapterView.OnItemClickListener
{

    private static final int TINT_ATTRS[] = {
        0x10100d4, 0x1010129
    };
    private MenuBuilder mMenu;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
        context = TintTypedArray.obtainStyledAttributes$1a6c1917(context, attributeset, TINT_ATTRS, i);
        if (context.hasValue(0))
        {
            setBackgroundDrawable(context.getDrawable(0));
        }
        if (context.hasValue(1))
        {
            setDivider(context.getDrawable(1));
        }
        ((TintTypedArray) (context)).mWrapped.recycle();
    }

    public final void initialize(MenuBuilder menubuilder)
    {
        mMenu = menubuilder;
    }

    public final boolean invokeItem(MenuItemImpl menuitemimpl)
    {
        return mMenu.performItemAction(menuitemimpl, null, 0);
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        invokeItem((MenuItemImpl)getAdapter().getItem(i));
    }

}
