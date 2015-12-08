// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache;

public final class eui extends eqk
{

    public int c[];
    public abf d;
    private final MomentPlayerSnapshotCache e;
    private final fyx f;
    private final euk g;
    private final eun h;

    public eui(MomentPlayerSnapshotCache momentplayersnapshotcache, fyx fyx, euk euk, eun eun)
    {
        e = momentplayersnapshotcache;
        f = fyx;
        g = euk;
        h = eun;
        a();
    }

    private void a(euy euy1, int i)
    {
        euy1.j = c;
        super.a(euy1, i);
    }

    public final abo a(ViewGroup viewgroup, int i)
    {
        return new euy(viewgroup.getContext(), e, f, d, g, h);
    }

    public final volatile void a(abo abo, int i)
    {
        a((euy)abo, i);
    }

    public final volatile void a(eql eql, int i)
    {
        a((euy)eql, i);
    }

    public final long b(int i)
    {
        return (long)((Moment)f(i)).hashCode();
    }
}
