// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.DialogInterface;
import com.jcp.b.b;
import com.jcp.c.aa;
import com.jcp.pojo.SavedItems;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            CustomSavedItemAdapter

class as
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final CustomSavedItemAdapter b;

    as(CustomSavedItemAdapter customsaveditemadapter, int i)
    {
        b = customsaveditemadapter;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        com.jcp.adapters.CustomSavedItemAdapter.b(b, a);
        com.jcp.b.b.b(CustomSavedItemAdapter.h(b));
        dialoginterface = com.jcp.b.b.l(((SavedItems)CustomSavedItemAdapter.e(b).get(CustomSavedItemAdapter.h(b))).getId());
        CustomSavedItemAdapter.i(b).b(dialoginterface);
    }
}
