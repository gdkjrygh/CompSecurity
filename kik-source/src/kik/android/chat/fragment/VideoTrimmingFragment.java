// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import butterknife.ButterKnife;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.l.ab;
import com.kik.m.d;
import com.kik.sdkutils.y;
import java.io.File;
import java.security.Security;
import java.util.UUID;
import kik.android.VideoContentProvider;
import kik.android.util.an;
import kik.android.util.bf;
import kik.android.util.ct;
import kik.android.util.cv;
import kik.android.widget.VideoKeyFrameView;
import org.spongycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, rv, rs, ru, 
//            ry, rz, sa, sb, 
//            sc

public class VideoTrimmingFragment extends KikScopedDialogFragment
{
    public static final class a extends an
    {

        public final a a(long l1)
        {
            a("VIDEO_DURATION", l1);
            return this;
        }

        public final a a(String s)
        {
            a("VIDEO_PATH", s);
            return this;
        }

        public a()
        {
        }
    }

    private final class b extends bf
    {

        final VideoTrimmingFragment a;
        private ProgressDialog b;

        protected final Object doInBackground(Object aobj[])
        {
            return ct.a(kik.android.chat.fragment.VideoTrimmingFragment.d(a), a.a.b(UUID.randomUUID().toString()), kik.android.chat.fragment.VideoTrimmingFragment.a(a), VideoTrimmingFragment.b(a));
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

        private b()
        {
            a = VideoTrimmingFragment.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    TextView _editedSizeText;
    ImageButton _saveButton;
    VideoKeyFrameView _videoKeyFrameView;
    ImageView _videoPlayIcon;
    VideoView _videoView;
    FrameLayout _videoViewContainer;
    ab a;
    private View b;
    private String c;
    private boolean d;
    private long e;
    private float f;
    private float g;
    private p h;
    private bf i;

    public VideoTrimmingFragment()
    {
        d = false;
        f = 0.0F;
        g = 0.0F;
        h = null;
    }

    static float a(VideoTrimmingFragment videotrimmingfragment)
    {
        return videotrimmingfragment.f;
    }

    static float a(VideoTrimmingFragment videotrimmingfragment, float f1)
    {
        videotrimmingfragment.f = f1;
        return f1;
    }

    private String a()
    {
        long l1 = (long)Math.ceil((_videoKeyFrameView.c() - _videoKeyFrameView.b()) * (float)e);
        long l3 = l1 / 1000L / 60L;
        long l4 = (l1 / 1000L) % 60L;
        long l2 = l4;
        l1 = l3;
        if (l3 == 1L)
        {
            l2 = l4;
            l1 = l3;
            if (l4 == 59L)
            {
                l1 = 2L;
                l2 = 0L;
            }
        }
        if (l1 == 0L)
        {
            if (l2 == 1L)
            {
                return getActivity().getResources().getString(0x7f090199);
            } else
            {
                return getActivity().getResources().getString(0x7f090220, new Object[] {
                    Long.valueOf(l2)
                });
            }
        }
        if (l1 == 1L)
        {
            if (l2 == 0L)
            {
                return getActivity().getResources().getString(0x7f090195);
            }
            if (l2 == 1L)
            {
                return (new StringBuilder()).append(getActivity().getResources().getString(0x7f090195)).append(" ").append(getActivity().getResources().getString(0x7f090199)).toString();
            } else
            {
                return (new StringBuilder()).append(getActivity().getResources().getString(0x7f090195)).append(" ").append(getActivity().getResources().getString(0x7f090220, new Object[] {
                    Long.valueOf(l2)
                })).toString();
            }
        }
        if (l2 == 0L)
        {
            return getActivity().getResources().getString(0x7f090161, new Object[] {
                Long.valueOf(l1)
            });
        }
        if (l2 == 1L)
        {
            return (new StringBuilder()).append(getActivity().getResources().getString(0x7f090161, new Object[] {
                Long.valueOf(l1)
            })).append(" ").append(getActivity().getResources().getString(0x7f090199)).toString();
        } else
        {
            return (new StringBuilder()).append(getActivity().getResources().getString(0x7f090161, new Object[] {
                Long.valueOf(l1)
            })).append(" ").append(getActivity().getResources().getString(0x7f090220, new Object[] {
                Long.valueOf(l2)
            })).toString();
        }
    }

    static boolean a(VideoTrimmingFragment videotrimmingfragment, boolean flag)
    {
        videotrimmingfragment.d = flag;
        return flag;
    }

    static float b(VideoTrimmingFragment videotrimmingfragment)
    {
        return videotrimmingfragment.g;
    }

    static float b(VideoTrimmingFragment videotrimmingfragment, float f1)
    {
        videotrimmingfragment.g = f1;
        return f1;
    }

    static long c(VideoTrimmingFragment videotrimmingfragment)
    {
        return videotrimmingfragment.e;
    }

    static String d(VideoTrimmingFragment videotrimmingfragment)
    {
        return videotrimmingfragment.c;
    }

    static p e(VideoTrimmingFragment videotrimmingfragment)
    {
        (videotrimmingfragment. new b((byte)0)).a(new Void[0]);
        videotrimmingfragment.h = new p();
        return videotrimmingfragment.h;
    }

    static void f(VideoTrimmingFragment videotrimmingfragment)
    {
        if (videotrimmingfragment._videoView.isPlaying())
        {
            videotrimmingfragment.d = false;
            videotrimmingfragment._videoPlayIcon.setVisibility(0);
            videotrimmingfragment._videoView.pause();
        }
    }

    static String g(VideoTrimmingFragment videotrimmingfragment)
    {
        return videotrimmingfragment.a();
    }

    static boolean h(VideoTrimmingFragment videotrimmingfragment)
    {
        return videotrimmingfragment.d;
    }

    static bf i(VideoTrimmingFragment videotrimmingfragment)
    {
        videotrimmingfragment.i = null;
        return null;
    }

    static p j(VideoTrimmingFragment videotrimmingfragment)
    {
        return videotrimmingfragment.h;
    }

    static bf k(VideoTrimmingFragment videotrimmingfragment)
    {
        return videotrimmingfragment.i;
    }

    static void l(VideoTrimmingFragment videotrimmingfragment)
    {
        videotrimmingfragment.i = new rv(videotrimmingfragment);
        videotrimmingfragment.i.a(new Void[0]);
    }

    protected final int C()
    {
        return 32;
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        if (com.kik.sdkutils.y.c(21))
        {
            Security.removeProvider("SC");
            Security.insertProviderAt(new BouncyCastleProvider(), 1);
        }
        bundle = getArguments();
        c = bundle.getString("VIDEO_PATH");
        e = bundle.getLong("VIDEO_DURATION");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        long l2 = 0x1d4c0L;
        b = layoutinflater.inflate(0x7f030015, viewgroup, false);
        ButterKnife.inject(this, b);
        layoutinflater = c;
        long l1;
        long l3;
        long l4;
        if (_videoViewContainer != null && _videoView != null && layoutinflater != null)
        {
            cv.b(new View[] {
                _videoPlayIcon, _videoView
            });
            _videoPlayIcon.bringToFront();
            _videoView.setVideoURI(VideoContentProvider.a(layoutinflater));
            _videoView.setOnPreparedListener(new ry(this));
            _videoView.setOnErrorListener(new rz(this));
            _videoPlayIcon.setOnClickListener(new sa(this));
            _videoViewContainer.setOnTouchListener(new sb(this));
            _videoView.setOnCompletionListener(new sc(this));
        }
        _saveButton.setOnClickListener(new rs(this));
        _videoKeyFrameView.a(_videoKeyFrameView.getResources().getDrawable(0x7f0202e6), _videoKeyFrameView.getResources().getDrawable(0x7f0202e7), _videoKeyFrameView.getResources().getDrawable(0x7f0202f1));
        _videoKeyFrameView.a();
        layoutinflater = new Paint();
        layoutinflater.setColor(0x7f000000);
        viewgroup = new Paint();
        viewgroup.setColor(0x7f6a6a6a);
        _videoKeyFrameView.a(layoutinflater, viewgroup);
        _videoKeyFrameView.a(c, e);
        _videoKeyFrameView.bringToFront();
        l4 = (new File(c)).length();
        l3 = e;
        l1 = l3;
        if (!com.kik.sdkutils.y.a(18))
        {
            l1 = l3;
            if (l4 > 0xf00000L)
            {
                l1 = (long)Math.ceil((1.258291E+07F / (float)l4) * (float)e);
            }
        }
        if (l1 > 0x1d4c0L)
        {
            l1 = l2;
        }
        _videoKeyFrameView.a((float)l1 / (float)e);
        _videoKeyFrameView.b(1000F / (float)e);
        g = (float)l1 / 1000F;
        _editedSizeText.setText(a());
        _videoKeyFrameView.a(new ru(this));
        com.kik.m.d.a(_saveButton, "AUTOMATION_TRIM_SAVE_BUTTON");
        com.kik.m.d.a(_videoPlayIcon, "AUTOMATION_TRIM_PLAY_BUTTON");
        return b;
    }

    public void onDestroy()
    {
        if (i != null)
        {
            i.cancel(true);
            i = null;
        }
        super.onDestroy();
    }

    public void onPause()
    {
        FragmentActivity fragmentactivity;
        super.onPause();
        fragmentactivity = getActivity();
        if (fragmentactivity == null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 11 || android.os.Build.VERSION.SDK_INT >= 14) goto _L4; else goto _L3
_L3:
        fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(0);
_L2:
        if (_videoView.getCurrentPosition() > 0)
        {
            if (_videoView.isPlaying())
            {
                _videoView.pause();
            }
            _videoPlayIcon.setVisibility(0);
        }
        return;
_L4:
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(0);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final int y()
    {
        return 0xff000000;
    }
}
