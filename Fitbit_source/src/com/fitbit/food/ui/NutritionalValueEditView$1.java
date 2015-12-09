// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.view.View;

// Referenced classes of package com.fitbit.food.ui:
//            NutritionalValueEditView

class a
    implements android.view.iew._cls1
{

    final NutritionalValueEditView a;

    public void onFocusChange(View view, boolean flag)
    {
label0:
        {
            if (view instanceof NutritionalValueEditView)
            {
                view = (NutritionalValueEditView)view;
                if (!flag)
                {
                    break label0;
                }
                view.setText(NutritionalValueEditView.b(a.b()));
            }
            return;
        }
        if (NutritionalValueEditView.a(a) != null)
        {
            NutritionalValueEditView.a(a).a(a);
        }
        if (a.b() < 0.0001D)
        {
            view.setText("");
            return;
        } else
        {
            view.b(a.c(a.b()));
            return;
        }
    }

    (NutritionalValueEditView nutritionalvalueeditview)
    {
        a = nutritionalvalueeditview;
        super();
    }
}
