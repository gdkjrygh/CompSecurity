// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cgh
    implements android.view.View.OnFocusChangeListener
{

    private PlayerScreenFragment a;

    public cgh(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onFocusChange(View view, boolean flag)
    {
        view = (TextView)view;
        PlayerScreenFragment.a(a, view, flag);
        if (flag)
        {
            PlayerScreenFragment.a(a, view.getText().toString());
        }
        PlayerScreenFragment.c(a, flag);
    }
}
