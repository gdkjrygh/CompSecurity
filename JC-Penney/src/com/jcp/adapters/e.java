// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.DialogInterface;
import android.content.Intent;
import com.jcp.activities.SelectPickUpStoreActivity;
import com.jcp.fragments.ShoppingBagFragment;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class e
    implements android.content.DialogInterface.OnClickListener
{

    final AddToCartAdapter a;

    e(AddToCartAdapter addtocartadapter)
    {
        a = addtocartadapter;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent(AddToCartAdapter.h(a), com/jcp/activities/SelectPickUpStoreActivity);
        AddToCartAdapter.f(a).a(dialoginterface, 1000);
    }
}
