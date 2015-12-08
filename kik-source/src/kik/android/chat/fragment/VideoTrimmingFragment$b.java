// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.widget.VideoView;
import com.kik.g.p;
import com.kik.l.ab;
import java.util.UUID;
import kik.android.util.bf;
import kik.android.util.ct;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment

private final class <init> extends bf
{

    final VideoTrimmingFragment a;
    private ProgressDialog b;

    protected final Object doInBackground(Object aobj[])
    {
        return ct.a(VideoTrimmingFragment.d(a), a.a.b(UUID.randomUUID().toString()), VideoTrimmingFragment.a(a), VideoTrimmingFragment.b(a));
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        b.dismiss();
        if (obj != null)
        {
            VideoTrimmingFragment.j(a).a(obj);
        } else
        {
            VideoTrimmingFragment.j(a).a(new Throwable());
        }
        super.onPostExecute(obj);
    }

    protected final void onPreExecute()
    {
        if (a._videoView.isPlaying())
        {
            a._videoView.pause();
        }
        b = ProgressDialog.show(a.getActivity(), a._videoView.getResources().getString(0x7f090314), a.getResources().getString(0x7f0901bf), true);
    }

    private (VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    a(VideoTrimmingFragment videotrimmingfragment, byte byte0)
    {
        this(videotrimmingfragment);
    }
}
