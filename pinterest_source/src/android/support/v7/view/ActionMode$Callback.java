// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view;

import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.view:
//            ActionMode

public interface 
{

    public abstract boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem);

    public abstract boolean onCreateActionMode(ActionMode actionmode, Menu menu);

    public abstract void onDestroyActionMode(ActionMode actionmode);

    public abstract boolean onPrepareActionMode(ActionMode actionmode, Menu menu);
}
