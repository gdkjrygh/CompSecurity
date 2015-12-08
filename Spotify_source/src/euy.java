// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.GestureDetector;
import com.spotify.mobile.android.spotlets.momentsstart.model.Moment;
import com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentView;

public final class euy extends eql
{

    public int j[];
    private MomentView k;
    private final abf l;

    public euy(Context context, MomentPlayerSnapshotCache momentplayersnapshotcache, fyx fyx, abf abf, euk euk, eun eun)
    {
        super(new MomentView(context));
        k = (MomentView)a;
        context = k;
        context.t = new euj(momentplayersnapshotcache, fyx, euk, eun);
        context.a(((MomentView) (context)).t);
        context.u = new GestureDetector(context.getContext(), new com.spotify.mobile.android.spotlets.momentsstart.view.MomentView._cls1());
        l = abf;
    }

    public final void a(Object obj, int i)
    {
        Object obj1 = (Moment)obj;
        obj = k;
        obj.v = (Moment)ctz.a(obj1);
        obj1 = ((MomentView) (obj)).t;
        ((euj) (obj1)).a(((MomentView) (obj)).v.contexts);
        ((euj) (obj1)).c();
        k.a(j[i]);
        k.g();
        k.a(l);
        if (k.w())
        {
            k.v();
        }
    }
}
