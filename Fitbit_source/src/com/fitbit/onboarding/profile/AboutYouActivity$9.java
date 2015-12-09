// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.profile;

import android.text.Editable;
import android.text.TextWatcher;
import com.fitbit.profile.ui.b;
import com.fitbit.ui.EditText;

// Referenced classes of package com.fitbit.onboarding.profile:
//            AboutYouActivity

class a
    implements TextWatcher
{

    final AboutYouActivity a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence != null && AboutYouActivity.h(a) != null)
        {
            AboutYouActivity.h(a).a(charsequence.toString().trim());
        }
        if (AboutYouActivity.g(a) && AboutYouActivity.i(a).getError() != null)
        {
            AboutYouActivity.i(a).c(0);
        }
    }

    (AboutYouActivity aboutyouactivity)
    {
        a = aboutyouactivity;
        super();
    }
}
