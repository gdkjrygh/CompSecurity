// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.collect.Maps;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Map;

public final class eun
{

    private static final Verified b;
    public final Map a = Maps.b();

    public eun(Context context, Resolver resolver, am am, Flags flags)
    {
        a.put(com.spotify.mobile.android.util.SpotifyLink.LinkType.an, new euq(context, am, flags));
        a.put(com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ, new eus(context, resolver, b));
    }

    static 
    {
        b = ViewUri.j;
    }
}
