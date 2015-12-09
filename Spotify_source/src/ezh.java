// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.collection.util.CollectionContains;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;

public final class ezh
{

    public WeakReference a;
    public Verified b;
    public Flags c;
    private final CollectionContains d;

    public ezh(Context context, Resolver resolver, Verified verified, Flags flags)
    {
        dmz.a(fop);
        a = new WeakReference(context);
        d = new CollectionContains(resolver);
        b = verified;
        c = flags;
    }

    public final void a(String s, eol eol1)
    {
        if ((new SpotifyLink(s)).c != com.spotify.mobile.android.util.SpotifyLink.LinkType.aT)
        {
            eol1.a(s);
            return;
        } else
        {
            d.a(s, eol1);
            return;
        }
    }
}
