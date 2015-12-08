// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class fui
{

    AtomicReference a;
    public AtomicBoolean b;
    public SpotifyContextMenu c;

    public fui()
    {
        a = new AtomicReference();
        b = new AtomicBoolean(false);
    }

    public abstract Object a();

    public abstract void a(Object obj, SpotifyContextMenu spotifycontextmenu);
}
