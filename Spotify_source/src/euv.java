// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.momentsstart.MomentsStartFragment;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache;
import com.spotify.mobile.android.video.VideoSurfaceView;
import java.util.Map;

public final class euv extends euw
{

    public final VideoSurfaceView j;
    private final fyx p;
    private final MomentPlayerSnapshotCache q;
    private final gkl r = (gkl)dmz.a(gkl);
    private String s;

    public euv(ViewGroup viewgroup, euk euk, eun eun, MomentPlayerSnapshotCache momentplayersnapshotcache, fyx fyx1)
    {
        super(viewgroup, 0x7f030148, euk, eun);
        p = fyx1;
        q = momentplayersnapshotcache;
        j = (VideoSurfaceView)a.findViewById(0x7f1102e6);
        viewgroup = m.getResources();
        int i = ((gcz)dmz.a(gcz)).b();
        int k = viewgroup.getDimensionPixelOffset(0x7f0c0028);
        int l = viewgroup.getDimensionPixelOffset(0x7f0c0037);
        i = Math.min((int)((float)m.getResources().getDimensionPixelOffset(0x7f0c0013) * 1.77F), i - (k << 2) - (l << 1));
        this.k.getLayoutParams().width = i;
        j.getLayoutParams().width = i;
    }

    public final void a(MomentContext momentcontext, int i)
    {
        s = momentcontext.uri;
        j.c = new gjy(momentcontext) {

            private MomentContext a;

            public final boolean a(PlayerTrack playertrack)
            {
                return a.equals(dmz.b(com/spotify/mobile/android/spotlets/momentsstart/MomentsStartFragment, com/spotify/mobile/android/spotlets/momentsstart/model/MomentContext)) && a.uri.equals(playertrack.metadata().get("entity_uri"));
            }

            
            {
                a = momentcontext;
                super();
            }
        };
        j.a(p.a());
        VideoSurfaceView videosurfaceview = j;
        Object obj = com.spotify.mobile.android.video.VideoSurfaceView.ScaleType.b;
        videosurfaceview.f = ((com.spotify.mobile.android.video.VideoSurfaceView.ScaleType) (obj));
        videosurfaceview.a(((com.spotify.mobile.android.video.VideoSurfaceView.ScaleType) (obj)));
        android.view.TextureView.SurfaceTextureListener surfacetexturelistener = videosurfaceview.l;
        if (videosurfaceview.a != null)
        {
            obj = videosurfaceview.a.getSurfaceTexture();
        } else
        {
            obj = null;
        }
        surfacetexturelistener.onSurfaceTextureSizeChanged(((android.graphics.SurfaceTexture) (obj)), videosurfaceview.getWidth(), videosurfaceview.getHeight());
        r.a(j);
        super.a(momentcontext, i);
    }

    protected final void a(MomentContext momentcontext, android.view.View.OnClickListener onclicklistener)
    {
        super.a(momentcontext, onclicklistener);
        j.setOnClickListener(onclicklistener);
    }

    public final volatile void a(Object obj, int i)
    {
        a((MomentContext)obj, i);
    }

    protected final void b(MomentContext momentcontext)
    {
        if (!x())
        {
            super.b(momentcontext);
        }
    }

    public final void u()
    {
        super.u();
        r.a(j);
        x();
    }

    public final void w()
    {
        super.w();
        s = null;
    }

    public final boolean x()
    {
        if (s != null)
        {
            com.spotify.mobile.android.spotlets.momentsstart.player.MomentPlayerSnapshotCache.Entry entry = q.get(s);
            if (entry != null)
            {
                j.a(entry.track, entry.timestamp);
                return true;
            }
        }
        return false;
    }
}
