// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public interface WindowCallback
{

    public abstract boolean onCreatePanelMenu(int i, Menu menu);

    public abstract View onCreatePanelView(int i);

    public abstract boolean onMenuItemSelected(int i, MenuItem menuitem);

    public abstract boolean onMenuOpened(int i, Menu menu);

    public abstract void onPanelClosed(int i, Menu menu);

    public abstract boolean onPreparePanel(int i, View view, Menu menu);

    public abstract ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback);
}
