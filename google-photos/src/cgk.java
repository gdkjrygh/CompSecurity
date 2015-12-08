// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;
import com.google.android.apps.moviemaker.ui.ImeDismissalReportingEditText;

public final class cgk
    implements byu
{

    private PlayerScreenFragment a;

    public cgk(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void a()
    {
        PlayerScreenFragment.f(a).setVisibility(0);
        PlayerScreenFragment.g(a).d();
        PlayerScreenFragment.h(a).setVisibility(0);
        PlayerScreenFragment.a(a, null);
    }

    public final void a(int i)
    {
        PlayerScreenFragment.b(a).a(i);
    }

    public final void a(Intent intent)
    {
        PlayerScreenFragment.k(a).a(b.gE, intent);
    }

    public final void b()
    {
        if (PlayerScreenFragment.i(a))
        {
            PlayerScreenFragment.j(a).q();
        }
    }
}
