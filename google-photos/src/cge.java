// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cge
    implements android.view.View.OnLayoutChangeListener
{

    private PlayerScreenFragment a;

    public cge(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        PlayerScreenFragment.b(a).b();
    }
}
