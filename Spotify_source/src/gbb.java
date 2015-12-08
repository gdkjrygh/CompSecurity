// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.ui.view.PlayButton;

public final class gbb
    implements android.view.View.OnClickListener
{

    private PlayButton a;

    private gbb(PlayButton playbutton)
    {
        a = playbutton;
        super();
    }

    public gbb(PlayButton playbutton, byte byte0)
    {
        this(playbutton);
    }

    public final void onClick(View view)
    {
        PlayButton.a(a).a();
    }
}
