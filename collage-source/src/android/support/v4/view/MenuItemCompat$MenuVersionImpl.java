// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            MenuItemCompat

static interface stener
{

    public abstract boolean collapseActionView(MenuItem menuitem);

    public abstract boolean expandActionView(MenuItem menuitem);

    public abstract View getActionView(MenuItem menuitem);

    public abstract boolean isActionViewExpanded(MenuItem menuitem);

    public abstract MenuItem setActionView(MenuItem menuitem, int i);

    public abstract MenuItem setActionView(MenuItem menuitem, View view);

    public abstract MenuItem setOnActionExpandListener(MenuItem menuitem, stener stener);

    public abstract void setShowAsAction(MenuItem menuitem, int i);
}
