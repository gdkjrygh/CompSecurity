// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ShareActionProvider

private class <init>
    implements android.view.lickListener
{

    final ShareActionProvider this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = ActivityChooserModel.get(ShareActionProvider.access$100(ShareActionProvider.this), ShareActionProvider.access$200(ShareActionProvider.this)).chooseActivity(menuitem.getItemId());
        if (menuitem != null)
        {
            menuitem.addFlags(0x80000);
            ShareActionProvider.access$100(ShareActionProvider.this).startActivity(menuitem);
        }
        return true;
    }

    private ()
    {
        this$0 = ShareActionProvider.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
