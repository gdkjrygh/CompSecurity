// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.PopupWindow;
import com.jcp.pojo.SavedItems;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            CustomSavedItemAdapter

class ar
    implements android.view.View.OnClickListener
{

    final int a;
    final CustomSavedItemAdapter b;

    ar(CustomSavedItemAdapter customsaveditemadapter, int i)
    {
        b = customsaveditemadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        CustomSavedItemAdapter.f(b).clear();
        int j = Integer.parseInt(((SavedItems)CustomSavedItemAdapter.e(b).get(a)).getMaxQuantity());
        for (int i = 0; i <= j; i++)
        {
            CustomSavedItemAdapter.f(b).add(Integer.valueOf(i + 1));
        }

        CustomSavedItemAdapter.g(b).showAsDropDown(view);
        CustomSavedItemAdapter.d(b, a);
    }
}
