// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;

// Referenced classes of package com.jcp.adapters:
//            CustomSavedItemAdapter

class ao
    implements android.view.View.OnClickListener
{

    final int a;
    final CustomSavedItemAdapter b;

    ao(CustomSavedItemAdapter customsaveditemadapter, int i)
    {
        b = customsaveditemadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        CustomSavedItemAdapter.a(b, a);
    }
}
