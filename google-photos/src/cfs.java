// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cfs
    implements android.view.View.OnTouchListener
{

    private PlayerScreenFragment a;

    public cfs(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        PlayerScreenFragment.e(a, false);
        return false;
    }
}
