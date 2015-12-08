// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cgg
    implements TextWatcher
{

    private PlayerScreenFragment a;

    public cgg(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        PlayerScreenFragment.e(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
