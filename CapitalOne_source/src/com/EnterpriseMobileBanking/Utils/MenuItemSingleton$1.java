// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import java.util.ArrayList;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            MenuItemSingleton

class m
    implements Runnable
{

    final MenuItemSingleton this$0;
    final MenuItem val$item;

    public void run()
    {
        MenuItemSingleton.access$000(MenuItemSingleton.this).add(val$item);
        if (MenuItemSingleton.access$100(MenuItemSingleton.this) != null)
        {
            MenuItemSingleton.access$100(MenuItemSingleton.this).dataChanged();
        }
    }

    m()
    {
        this$0 = final_menuitemsingleton;
        val$item = MenuItem.this;
        super();
    }
}
