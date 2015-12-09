// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.app:
//            h, ActionBarActivity

class i extends h
    implements android.support.v7.internal.widget.NativeActionModeAwareLayout.a
{
    private class a
        implements android.view.ActionMode.Callback
    {

        final i a;
        private final android.view.ActionMode.Callback b;

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            return b.onActionItemClicked(actionmode, menuitem);
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            boolean flag = b.onCreateActionMode(actionmode, menu);
            if (flag)
            {
                i.a(a, actionmode);
                a.d();
            }
            return flag;
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
            b.onDestroyActionMode(actionmode);
            a.e();
            i.a(a, null);
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return b.onPrepareActionMode(actionmode, menu);
        }

        a(android.view.ActionMode.Callback callback)
        {
            a = i.this;
            super();
            b = callback;
        }
    }


    final NativeActionModeAwareLayout b;
    private ActionMode c;

    public i(ActionBarActivity actionbaractivity, ActionBar.a a1)
    {
        super(actionbaractivity, a1);
        b = (NativeActionModeAwareLayout)actionbaractivity.findViewById(android.support.v7.appcompat.R.id.action_bar_root);
        if (b != null)
        {
            b.setActionModeForChildListener(this);
        }
    }

    static ActionMode a(i j, ActionMode actionmode)
    {
        j.c = actionmode;
        return actionmode;
    }

    public android.view.ActionMode.Callback a(android.view.ActionMode.Callback callback)
    {
        return new a(callback);
    }

    boolean f()
    {
        return c == null && super.f();
    }
}
