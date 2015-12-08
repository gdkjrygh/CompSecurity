// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.moviemaker.MovieMakerActivity;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cgd
    implements dbj
{

    private PlayerScreenFragment a;

    public cgd(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void a(View view)
    {
        if (PlayerScreenFragment.j(a).o() && b.e(view))
        {
            cgz cgz1 = (cgz)((MovieMakerActivity)a.O_()).e.v();
            mry.a(PlayerScreenFragment.E(a), 4, (new msn()).a(b.d(view)).a(cgz1.r()));
        }
    }
}
