// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.ui.view.PlayButton;

public final class gbc
    implements android.view.View.OnLongClickListener
{

    private PlayButton a;

    private gbc(PlayButton playbutton)
    {
        a = playbutton;
        super();
    }

    public gbc(PlayButton playbutton, byte byte0)
    {
        this(playbutton);
    }

    public final boolean onLongClick(View view)
    {
        PlayButton.a(a);
        return false;
    }
}
