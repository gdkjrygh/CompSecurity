// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.widget.ArrayAdapter;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Utils.Log;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

static final class val.menuItemId
    implements Runnable
{

    final boolean val$makeSelection;
    final String val$menuItemId;

    public void run()
    {
        for (Iterator iterator = EnterpriseMobileBanking.access$800().iterator(); iterator.hasNext();)
        {
            MenuItem menuitem = (MenuItem)iterator.next();
            if (val$makeSelection && val$menuItemId.equalsIgnoreCase(menuitem.getId()))
            {
                Log.i(EnterpriseMobileBanking.access$100(), (new StringBuilder()).append("Selecting menuItem with id = ").append(menuitem.getId()).toString());
                if (EnterpriseMobileBanking.access$900() != null)
                {
                    EnterpriseMobileBanking.access$900().setSelected(false);
                }
                menuitem.setSelected(true);
                MenuItem _tmp = EnterpriseMobileBanking.access$902(menuitem);
            } else
            {
                menuitem.setSelected(false);
            }
        }

        EnterpriseMobileBanking.access$1000().notifyDataSetChanged();
    }

    (boolean flag, String s)
    {
        val$makeSelection = flag;
        val$menuItemId = s;
        super();
    }
}
