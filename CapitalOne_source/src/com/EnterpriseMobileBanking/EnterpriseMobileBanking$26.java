// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.widget.ArrayAdapter;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class 
    implements Runnable
{

    final EnterpriseMobileBanking this$0;
    final MenuItem val$item;

    public void run()
    {
        if (EnterpriseMobileBanking.access$900() != null)
        {
            EnterpriseMobileBanking.access$900().setSelected(false);
            Log.d(EnterpriseMobileBanking.access$100(), "Clearing lastItem");
        }
        MenuItem _tmp = EnterpriseMobileBanking.access$902(val$item);
        if (val$item != null)
        {
            Log.d(EnterpriseMobileBanking.access$100(), (new StringBuilder()).append("Setting selected: ").append(val$item.getText()).toString());
            val$item.setSelected(true);
        }
        EnterpriseMobileBanking.access$1000().notifyDataSetChanged();
    }

    ()
    {
        this$0 = final_enterprisemobilebanking;
        val$item = MenuItem.this;
        super();
    }
}
