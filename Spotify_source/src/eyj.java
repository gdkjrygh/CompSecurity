// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.party.json.TrackJacksonModel;

public final class eyj extends eym
{

    private final TextView k;
    private final String l;

    public eyj(ViewGroup viewgroup, String s)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300fd, viewgroup, false));
        k = (TextView)a.findViewById(0x7f11026e);
        l = s;
    }

    public final void a(TrackJacksonModel trackjacksonmodel)
    {
        k.setText(l);
    }
}
