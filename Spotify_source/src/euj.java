// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache;

public final class euj extends eqk
{

    private final MomentPlayerSnapshotCache c;
    private final fyx d;
    private final euk e;
    private final eun f;

    public euj(MomentPlayerSnapshotCache momentplayersnapshotcache, fyx fyx, euk euk, eun eun)
    {
        c = momentplayersnapshotcache;
        d = fyx;
        e = euk;
        f = eun;
    }

    public final int a(int i)
    {
        return ((MomentContext)f(i)).type.ordinal();
    }

    public final abo a(ViewGroup viewgroup, int i)
    {
        com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext.Type type = com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext.Type.values()[i];
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext.Type.values().length];
                try
                {
                    a[com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext.Type.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext.Type.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext.Type.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[type.ordinal()])
        {
        default:
            return new euv(viewgroup, e, f, c, d);

        case 1: // '\001'
            return new euw(viewgroup, 0x7f030146, e, f);

        case 2: // '\002'
            return new eut(viewgroup, e, f);

        case 3: // '\003'
            return eux.a(viewgroup);
        }
    }
}
