// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.ui.view.PlayButton;

public final class gba
    implements android.view.View.OnClickListener
{

    private PlayButton a;

    private gba(PlayButton playbutton)
    {
        a = playbutton;
        super();
    }

    public gba(PlayButton playbutton, byte byte0)
    {
        this(playbutton);
    }

    public final void onClick(View view)
    {
        PlayButton.a(a).b();
    }
}
