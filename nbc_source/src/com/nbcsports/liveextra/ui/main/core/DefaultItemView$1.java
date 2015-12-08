// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.nbcsports.liveextra.content.FavoriteService;
import com.phunware.nbc.sochi.fragments.DetailActionDialogFragment;
import com.phunware.nbc.sochi.fragments.PlayerActionDialogFragment;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            DefaultItemView, AssetViewModel

class val.popup
    implements android.widget.emClickListener
{

    final DefaultItemView this$0;
    final PopupMenu val$popup;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        int i;
        val$popup.dismiss();
        i = menuitem.getItemId();
        if (i != 0x7f0f0205) goto _L2; else goto _L1
_L1:
        DetailActionDialogFragment.getInstance(DefaultItemView.access$100(DefaultItemView.this).asset(), DefaultItemView.access$200(DefaultItemView.this)).show(DefaultItemView.access$000(DefaultItemView.this), "df");
_L4:
        return true;
_L2:
        if (i == 0x7f0f0206)
        {
            favorites.toggle(DefaultItemView.access$100(DefaultItemView.this).asset());
        } else
        if (i == 0x7f0f0204)
        {
            PlayerActionDialogFragment.getInstance(DefaultItemView.access$100(DefaultItemView.this).asset(), DefaultItemView.access$200(DefaultItemView.this)).show(DefaultItemView.access$000(DefaultItemView.this), "dialog");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ment()
    {
        this$0 = final_defaultitemview;
        val$popup = PopupMenu.this;
        super();
    }
}
