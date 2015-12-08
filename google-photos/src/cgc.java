// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cgc
    implements Runnable
{

    private PlayerScreenFragment a;

    public cgc(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void run()
    {
        PlayerScreenFragment.D(a).invalidate();
    }
}
