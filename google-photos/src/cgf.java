// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cgf
    implements android.widget.TextView.OnEditorActionListener
{

    private PlayerScreenFragment a;

    public cgf(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            PlayerScreenFragment.a(a, textview, false);
            PlayerScreenFragment.c(a);
            ((InputMethodManager)textview.getContext().getSystemService("input_method")).hideSoftInputFromWindow(textview.getWindowToken(), 0);
            PlayerScreenFragment.c(a, false);
            PlayerScreenFragment.d(a).a(textview.getText().toString(), false);
        }
        return false;
    }
}
