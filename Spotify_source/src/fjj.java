// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.spotlets.socialchart.model.TrackModel;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class fjj
{

    public Context a;

    public fjj(Context context)
    {
        dmz.a(fop);
        a = context;
    }

    public final void a(ClientEvent clientevent, TrackModel trackmodel, int i)
    {
        if (trackmodel != null)
        {
            clientevent.a("index", String.valueOf(i));
            clientevent.a("target_uri", trackmodel.getTrackUri());
        }
        fop.a(a, ViewUri.o, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
    }
}
