// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.widget.ArrayAdapter;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Utils.MenuItemSingleton;
import org.json.JSONObject;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking, AppHelper

static final class val.value
    implements Runnable
{

    final JSONObject val$value;

    public void run()
    {
        MenuItem menuitem = new MenuItem(val$value);
        MenuItemSingleton.getInstance().addMenuItem(menuitem);
        EnterpriseMobileBanking.access$1000().add(menuitem);
        if (menuitem.getImage() != null && (menuitem.getImage().startsWith(AppHelper.getAppString(0x7f090103)) || menuitem.getText().startsWith(AppHelper.getAppString(0x7f0900fd))))
        {
            MenuItem _tmp = EnterpriseMobileBanking.access$902(menuitem);
            menuitem.setSelected(true);
        }
    }

    (JSONObject jsonobject)
    {
        val$value = jsonobject;
        super();
    }
}
