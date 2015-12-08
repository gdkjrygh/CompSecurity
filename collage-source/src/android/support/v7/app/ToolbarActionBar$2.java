// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//            ToolbarActionBar

class this._cls0
    implements android.support.v7.widget.lickListener
{

    final ToolbarActionBar this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        return ToolbarActionBar.access$000(ToolbarActionBar.this).enuItemSelected(0, menuitem);
    }

    emClickListener()
    {
        this$0 = ToolbarActionBar.this;
        super();
    }
}
