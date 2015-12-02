// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.app.WindowCallback;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class WindowCallbackWrapper
    implements WindowCallback
{

    private WindowCallback mWrapped;

    public WindowCallbackWrapper(WindowCallback windowcallback)
    {
        if (windowcallback == null)
        {
            throw new IllegalArgumentException("Window callback may not be null");
        } else
        {
            mWrapped = windowcallback;
            return;
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        return mWrapped.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i)
    {
        return mWrapped.onCreatePanelView(i);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        return mWrapped.onMenuItemSelected(i, menuitem);
    }

    public boolean onMenuOpened(int i, Menu menu)
    {
        return mWrapped.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu)
    {
        mWrapped.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        return mWrapped.onPreparePanel(i, view, menu);
    }

    public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return mWrapped.startActionMode(callback);
    }
}
