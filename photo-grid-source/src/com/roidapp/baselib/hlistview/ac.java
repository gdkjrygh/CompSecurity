// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            ab, AbsHListView

public final class ac
    implements ab
{

    private ab a;
    private AbsHListView b;

    public final void a(ActionMode actionmode, int i, long l, boolean flag)
    {
        a.a(actionmode, i, l, flag);
        if (b.e == 0)
        {
            actionmode.finish();
        }
    }

    public final boolean a()
    {
        return a != null;
    }

    public final boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return a.onActionItemClicked(actionmode, menuitem);
    }

    public final boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        boolean flag = false;
        if (a.onCreateActionMode(actionmode, menu))
        {
            b.setLongClickable(false);
            flag = true;
        }
        return flag;
    }

    public final void onDestroyActionMode(ActionMode actionmode)
    {
        a.onDestroyActionMode(actionmode);
        b.c = null;
        b.a();
        b.aj = true;
        b.y();
        b.requestLayout();
        b.setLongClickable(true);
    }

    public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return a.onPrepareActionMode(actionmode, menu);
    }
}
