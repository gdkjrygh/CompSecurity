// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gaa
{

    public gab a;
    private List b;
    private Context c;
    private EmptyView d;
    private View e;

    public gaa(Context context, EmptyView emptyview, View view)
    {
        b = new ArrayList();
        c = context;
        d = emptyview;
        e = view;
    }

    private void a(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); Assertion.b(contentstate, ((gac)iterator.next()).a)) { }
    }

    public final ContentViewManager a()
    {
        ContentViewManager contentviewmanager = new ContentViewManager(c, d, e, a, (byte)0);
        gac gac1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); contentviewmanager.a.put(gac1.a, gac1))
        {
            gac1 = (gac)iterator.next();
        }

        return contentviewmanager;
    }

    public final gaa a(int i, int j)
    {
        a(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.a);
        b.add(new gac(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.a, SpotifyIcon.aO, i, j, (byte)0));
        return this;
    }

    public final gaa a(SpotifyIcon spotifyicon, int i, int j)
    {
        a(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.c);
        b.add(new gac(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.c, spotifyicon, i, j, (byte)0));
        return this;
    }

    public final gaa b(int i, int j)
    {
        a(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.b);
        b.add(new gac(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.b, SpotifyIcon.aI, i, j, (byte)0));
        return this;
    }

    public final gaa b(SpotifyIcon spotifyicon, int i, int j)
    {
        a(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d);
        b.add(new gac(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d, spotifyicon, i, j, (byte)0));
        return this;
    }
}
