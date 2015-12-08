// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.jcp.b.b;
import com.jcp.fragments.ShoppingBagFragment;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class n
    implements android.view.View.OnClickListener
{

    final AddToCartAdapter a;

    n(AddToCartAdapter addtocartadapter)
    {
        a = addtocartadapter;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(b.af()));
        AddToCartAdapter.f(a).a(view);
    }
}
