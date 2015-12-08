// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cgb
    implements android.view.View.OnClickListener
{

    private PlayerScreenFragment a;

    public cgb(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onClick(View view)
    {
        PlayerScreenFragment.B(a).a(23, 1);
        PlayerScreenFragment.n(a).b();
    }
}
