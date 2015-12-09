// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.widget.RadioGroup;

// Referenced classes of package com.fitbit.food.ui.logging.views:
//            ChooseMealTypeView

class a
    implements android.widget.hangeListener
{

    final ChooseMealTypeView a;

    public void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        if (i != -1 && ChooseMealTypeView.a(a))
        {
            ChooseMealTypeView.a(a, false);
            ChooseMealTypeView.b(a).clearCheck();
            ChooseMealTypeView.a(a, i);
        }
        ChooseMealTypeView.a(a, true);
        if (ChooseMealTypeView.c(a) != null)
        {
            ChooseMealTypeView.c(a).a(a);
        }
    }

    (ChooseMealTypeView choosemealtypeview)
    {
        a = choosemealtypeview;
        super();
    }
}
