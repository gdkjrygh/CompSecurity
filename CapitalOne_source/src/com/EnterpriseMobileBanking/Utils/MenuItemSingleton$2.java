// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import java.util.ArrayList;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            MenuItemSingleton

class this._cls0
    implements Runnable
{

    final MenuItemSingleton this$0;

    public void run()
    {
        MenuItemSingleton.access$000(MenuItemSingleton.this).clear();
        if (MenuItemSingleton.access$100(MenuItemSingleton.this) != null)
        {
            MenuItemSingleton.access$100(MenuItemSingleton.this).dataChanged();
        }
    }

    angeListener()
    {
        this$0 = MenuItemSingleton.this;
        super();
    }
}
