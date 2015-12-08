// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cfw
    implements android.view.View.OnClickListener
{

    private PlayerScreenFragment a;

    public cfw(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onClick(View view)
    {
        PlayerScreenFragment.b(a).a();
        PlayerScreenFragment.p(a);
    }
}
