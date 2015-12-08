// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.translate.r;

// Referenced classes of package com.google.android.apps.translate.widget:
//            InputTextView, z

final class y
    implements android.view.ActionMode.Callback
{

    final InputTextView a;

    y(InputTextView inputtextview)
    {
        a = inputtextview;
        super();
    }

    public final boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x1020022 && InputTextView.b(a).c())
        {
            actionmode.finish();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        if (InputTextView.b(a) != null && InputTextView.b(a).b())
        {
            actionmode = new TypedValue();
            a.getContext().getTheme().resolveAttribute(0x1010313, actionmode, true);
            menu.add(0, 0x1020022, 5, r.label_paste).setIcon(((TypedValue) (actionmode)).resourceId).setAlphabeticShortcut('c').setShowAsAction(6);
        }
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionmode)
    {
    }

    public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return true;
    }
}
