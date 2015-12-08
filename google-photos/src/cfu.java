// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cfu
    implements android.view.View.OnClickListener
{

    private PlayerScreenFragment a;

    public cfu(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onClick(View view)
    {
        boolean flag = true;
        if (PlayerScreenFragment.s(a))
        {
            PlayerScreenFragment.g(a, true);
        } else
        if (PlayerScreenFragment.i(a))
        {
            if (PlayerScreenFragment.j(a).o() || PlayerScreenFragment.j(a).p())
            {
                PlayerScreenFragment.t(a);
                return;
            }
            view = a;
            if (PlayerScreenFragment.u(a))
            {
                flag = false;
            }
            PlayerScreenFragment.b(view, flag);
            return;
        }
    }
}
