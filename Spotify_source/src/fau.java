// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.video.VideoSurfaceView;

final class fau extends eqg
{

    Flags d;
    final fbh e;
    private final ezn f;
    private final android.view.View.OnClickListener g = new android.view.View.OnClickListener() {

        private fau a;

        public final void onClick(View view)
        {
            view = a.e.b;
            ctz.a(((fae) (view)).c);
            ((fae) (view)).c.J();
        }

            
            {
                a = fau.this;
                super();
            }
    };
    private final android.view.View.OnClickListener h = new android.view.View.OnClickListener() {

        private fau a;

        public final void onClick(View view)
        {
            view = a.e.b;
            ctz.a(((fae) (view)).c);
            ((fae) (view)).c.K();
        }

            
            {
                a = fau.this;
                super();
            }
    };

    fau(fbh fbh, ezn ezn, Flags flags)
    {
        e = fbh;
        f = ezn;
        d = flags;
    }

    private void a(fav fav1, int i)
    {
        com.spotify.mobile.android.cosmos.player.v2.PlayerTrack playertrack = f(i);
        fav1.a(d);
        fav1.a(playertrack, i);
        if (PlayerTrackUtil.isVideo(playertrack))
        {
            fav1 = (fax)fav1;
            android.view.View.OnClickListener onclicklistener = g;
            ((fax) (fav1)).k.setOnClickListener(onclicklistener);
            onclicklistener = h;
            ((fax) (fav1)).l.setOnClickListener(onclicklistener);
        }
    }

    public final int a(int i)
    {
        return !PlayerTrackUtil.isVideo(f(i)) ? 0 : 1;
    }

    public final abo a(ViewGroup viewgroup, int i)
    {
        if (i == 1)
        {
            return new fax(LayoutInflater.from(viewgroup.getContext()), viewgroup);
        } else
        {
            return new faw(LayoutInflater.from(viewgroup.getContext()), viewgroup, f);
        }
    }

    public final volatile void a(abo abo, int i)
    {
        a((fav)abo, i);
    }

    public final volatile void a(eql eql, int i)
    {
        a((fav)eql, i);
    }
}
