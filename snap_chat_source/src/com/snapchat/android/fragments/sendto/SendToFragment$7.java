// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.sendto;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Filter;
import yj;

// Referenced classes of package com.snapchat.android.fragments.sendto:
//            SendToFragment

final class a
    implements TextWatcher
{

    private SendToFragment a;

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        SendToFragment.k(a).c().filter(charsequence);
        if (TextUtils.isEmpty(charsequence))
        {
            SendToFragment.l(a).setVisibility(4);
            SendToFragment.k(a).g = false;
            return;
        } else
        {
            SendToFragment.l(a).setVisibility(0);
            SendToFragment.k(a).g = true;
            return;
        }
    }

    (SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }
}
