// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.video.VideoSurfacePriority;
import com.spotify.mobile.android.video.VideoSurfaceView;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class gkl
    implements dmx
{

    private static final Comparator b = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (VideoSurfaceView)obj;
            return ((VideoSurfaceView)obj1).e.compareTo(((VideoSurfaceView) (obj)).e);
        }

    };
    Set a;
    private LinkedList c;

    public gkl()
    {
        c = new LinkedList();
        a = new HashSet();
    }

    static LinkedList a(gkl gkl1)
    {
        return gkl1.c;
    }

    static void a(gkl gkl1, VideoSurfaceView videosurfaceview)
    {
        for (gkl1 = gkl1.a.iterator(); gkl1.hasNext(); ((gkm)gkl1.next()).b(videosurfaceview)) { }
    }

    private void b()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gkm)iterator.next()).i()) { }
    }

    static void b(gkl gkl1)
    {
        gkl1.b();
    }

    static void b(gkl gkl1, VideoSurfaceView videosurfaceview)
    {
        for (gkl1 = gkl1.a.iterator(); gkl1.hasNext(); ((gkm)gkl1.next()).a(videosurfaceview)) { }
    }

    final VideoSurfaceView a(PlayerTrack playertrack)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            VideoSurfaceView videosurfaceview = (VideoSurfaceView)iterator.next();
            boolean flag;
            if (videosurfaceview.a == null)
            {
                flag = false;
            } else
            if (videosurfaceview.c != null)
            {
                flag = videosurfaceview.c.a(playertrack);
            } else
            {
                flag = true;
            }
            if (flag)
            {
                return videosurfaceview;
            }
        }

        return null;
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gkm)iterator.next()).j()) { }
    }

    public final void a(VideoSurfaceView videosurfaceview)
    {
        if (c.contains(videosurfaceview))
        {
            return;
        }
        c.add(0, videosurfaceview);
        Collections.sort(c, b);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gkm)iterator.next()).h()) { }
        videosurfaceview.h = new android.view.TextureView.SurfaceTextureListener(videosurfaceview) {

            private VideoSurfaceView a;
            private gkl b;

            public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
            {
                gkl.a(b, a);
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
            {
                gkl.a(b).remove(a);
                gkl.b(b);
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
            {
                gkl.b(b, a);
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
            {
            }

            
            {
                b = gkl.this;
                a = videosurfaceview;
                super();
            }
        };
    }

    public final void b(VideoSurfaceView videosurfaceview)
    {
        c.remove(videosurfaceview);
        b();
    }

}
