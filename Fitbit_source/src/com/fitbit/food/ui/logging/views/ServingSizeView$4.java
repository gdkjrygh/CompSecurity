// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.fitbit.food.ui.logging.views:
//            ServingSizeView

class a
    implements android.widget.SelectedListener
{

    final ServingSizeView a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (ServingSizeView.a(a) != null)
        {
            ServingSizeView.a(a).a(a);
        }
        if (view != null)
        {
            a.a(true);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    (ServingSizeView servingsizeview)
    {
        a = servingsizeview;
        super();
    }
}
