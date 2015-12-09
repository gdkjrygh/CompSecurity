// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedbackFragment

final class i
    implements TextWatcher
{

    final AppboyFeedbackFragment a;

    i(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        a = appboyfeedbackfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        if (AppboyFeedbackFragment.a(a))
        {
            AppboyFeedbackFragment.b(a);
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
    {
    }
}
