// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.appboy.a;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedbackFragment

final class k
    implements android.view.View.OnClickListener
{

    final AppboyFeedbackFragment a;

    k(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        a = appboyfeedbackfragment;
        super();
    }

    public final void onClick(View view)
    {
        if (AppboyFeedbackFragment.b(a))
        {
            AppboyFeedbackFragment.c(a);
            boolean flag = AppboyFeedbackFragment.f(a).isChecked();
            view = AppboyFeedbackFragment.g(a).getText().toString();
            String s = AppboyFeedbackFragment.h(a).getText().toString();
            com.appboy.a.a(a.getActivity()).a(s, view, flag);
            if (AppboyFeedbackFragment.d(a) != null)
            {
                AppboyFeedbackFragment.d(a);
            }
            AppboyFeedbackFragment.e(a);
            return;
        } else
        {
            AppboyFeedbackFragment.i(a);
            return;
        }
    }
}
