// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cfv
    implements android.view.View.OnClickListener
{

    private PlayerScreenFragment a;

    public cfv(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onClick(View view)
    {
        if (PlayerScreenFragment.j(a).p() && PlayerScreenFragment.v(a) != null)
        {
            view = PlayerScreenFragment.v(a);
            boolean flag = ((byh) (view)).c.g();
            if (!flag)
            {
                ((byh) (view)).b.c = 0;
                if (((byh) (view)).b.b != -1L)
                {
                    ((dcj)((byh) (view)).e.a(dcj)).a();
                }
                view.c();
            }
            if (flag)
            {
                return;
            }
        }
        PlayerScreenFragment.b(a).a();
        PlayerScreenFragment.p(a);
    }
}
