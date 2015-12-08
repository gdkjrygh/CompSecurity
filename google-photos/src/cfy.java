// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;
import java.util.List;

public final class cfy
    implements dbo
{

    private PlayerScreenFragment a;

    public cfy(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void a()
    {
        PlayerScreenFragment.A(a);
        PlayerScreenFragment.z(a).a();
    }

    public final void a(int i)
    {
        if (PlayerScreenFragment.w(a).get(i) == PlayerScreenFragment.x(a))
        {
            PlayerScreenFragment.y(a);
            return;
        } else
        {
            PlayerScreenFragment.z(a).a((cyy)PlayerScreenFragment.w(a).get(i));
            return;
        }
    }
}
