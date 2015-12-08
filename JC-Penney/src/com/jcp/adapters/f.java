// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.adapters:
//            AddToCartAdapter

class f
    implements android.content.DialogInterface.OnClickListener
{

    final AddToCartAdapter a;

    f(AddToCartAdapter addtocartadapter)
    {
        a = addtocartadapter;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
