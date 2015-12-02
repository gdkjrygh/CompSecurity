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
    implements android.view.ckListener
{

    final ShareActionProvider a;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        menuitem = ActivityChooserModel.get(ShareActionProvider.access$100(a), ShareActionProvider.access$200(a)).chooseActivity(menuitem.getItemId());
        if (menuitem != null)
        {
            menuitem.addFlags(0x80000);
            ShareActionProvider.access$100(a).startActivity(menuitem);
        }
        return true;
    }

    private erModel(ShareActionProvider shareactionprovider)
    {
        a = shareactionprovider;
        super();
    }

    a(ShareActionProvider shareactionprovider, a a1)
    {
        this(shareactionprovider);
    }
}
