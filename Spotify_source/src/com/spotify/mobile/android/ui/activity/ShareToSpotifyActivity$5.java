// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            ShareToSpotifyActivity

final class a
    implements TextWatcher
{

    private ShareToSpotifyActivity a;

    public final void afterTextChanged(Editable editable)
    {
        if (ShareToSpotifyActivity.b(a))
        {
            if (ShareToSpotifyActivity.c(a) != null)
            {
                ShareToSpotifyActivity.a(a).setEnabled(true);
                ShareToSpotifyActivity.d(a).dismissDropDown();
            }
            ShareToSpotifyActivity.e(a);
            return;
        } else
        {
            ShareToSpotifyActivity.a(a, null);
            ShareToSpotifyActivity.a(a).setEnabled(false);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (ShareToSpotifyActivity sharetospotifyactivity)
    {
        a = sharetospotifyactivity;
        super();
    }
}
