// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.support.v4.app.ac;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            CustomSavedItemAdapter

class ap
    implements android.view.View.OnClickListener
{

    final int a;
    final CustomSavedItemAdapter b;

    ap(CustomSavedItemAdapter customsaveditemadapter, int i)
    {
        b = customsaveditemadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        CustomSavedItemAdapter.b(b, a);
        if (CustomSavedItemAdapter.b(b) instanceof ac)
        {
            view = ((TextView)view).getText().toString();
            if (view.equals(CustomSavedItemAdapter.b(b).getString(0x7f070302)))
            {
                CustomSavedItemAdapter.c(b);
            } else
            {
                if (view.equals(CustomSavedItemAdapter.b(b).getString(0x7f070065)))
                {
                    CustomSavedItemAdapter.d(b);
                    return;
                }
                if (view.equals(CustomSavedItemAdapter.b(b).getString(0x7f0703bc)))
                {
                    CustomSavedItemAdapter.c(b, a);
                    return;
                }
            }
        }
    }
}
