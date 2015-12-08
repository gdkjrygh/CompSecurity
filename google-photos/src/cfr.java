// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cfr
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private PlayerScreenFragment a;

    public cfr(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onGlobalLayout()
    {
        if (!PlayerScreenFragment.o(a))
        {
            return;
        } else
        {
            a.I_();
            return;
        }
    }
}
