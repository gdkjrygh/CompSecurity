// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView;
import java.util.HashMap;
import java.util.Map;

final class etc extends eqg
{

    final PlayerTrack d;
    private final android.view.View.OnClickListener e;
    private final etl f;

    etc(Context context, android.view.View.OnClickListener onclicklistener, etl etl1)
    {
        f = (etl)ctz.a(etl1);
        e = (android.view.View.OnClickListener)ctz.a(onclicklistener);
        onclicklistener = new HashMap();
        onclicklistener.put("title", context.getString(0x7f0803e1));
        onclicklistener.put("artist_name", context.getString(0x7f0803e1));
        d = PlayerTrack.create("", onclicklistener);
    }

    private void a(ets ets1, int i)
    {
        ets1.a(f(i));
    }

    public final abo a(ViewGroup viewgroup, int i)
    {
        viewgroup = (MiniPlayerPageView)LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030118, viewgroup, false);
        viewgroup.setOnClickListener(e);
        return new ets(viewgroup, f);
    }

    public final volatile void a(abo abo, int i)
    {
        a((ets)abo, i);
    }

    public final volatile void a(eql eql, int i)
    {
        a((ets)eql, i);
    }
}
