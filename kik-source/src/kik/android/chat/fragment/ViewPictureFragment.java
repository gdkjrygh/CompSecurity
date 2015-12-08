// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import butterknife.ButterKnife;
import com.kik.cache.ContentImageView;
import com.kik.cache.ProfileImageView;
import com.kik.cache.ad;
import com.kik.cards.web.kik.KikContentMessageParcelable;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.l.ab;
import com.kik.m.e;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import kik.a.d.aa;
import kik.a.d.d;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.z;
import kik.android.HeadphoneUnpluggedReceiver;
import kik.android.VideoContentProvider;
import kik.android.chat.KikApplication;
import kik.android.sdkutils.a;
import kik.android.util.ae;
import kik.android.util.an;
import kik.android.util.av;
import kik.android.util.bx;
import kik.android.util.cq;
import kik.android.util.ct;
import kik.android.util.cv;
import kik.android.widget.EllipsizingTextView;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, se, st, tc, 
//            su, ta, KikDialogFragment, tb, 
//            sn, so, sp, sq, 
//            sr, ss, td, te, 
//            ProgressDialogFragment, tf, tg, ti, 
//            sf, tl, sh, si, 
//            sj, sv, sw, sx

public class ViewPictureFragment extends KikIqFragmentBase
    implements kik.android.sdkutils.a
{
    public static final class a extends an
    {

        public final a a()
        {
            a("VIEW_PICTURE_TYPE", 3);
            return this;
        }

        public final a a(KikContentMessageParcelable kikcontentmessageparcelable)
        {
            a("CONTENT_MESSAGE", ((android.os.Parcelable) (kikcontentmessageparcelable)));
            return this;
        }

        public final a a(String s1)
        {
            a("JID", s1);
            return this;
        }

        public final a a(byte abyte0[])
        {
            a("MESSAGING_KEY", abyte0);
            return this;
        }

        public final a b()
        {
            a("VIEW_PICTURE_TYPE", 7);
            return this;
        }

        public final a b(String s1)
        {
            a("PREVIEW", s1);
            return this;
        }

        public final a c()
        {
            a("VIEW_PICTURE_TYPE", 4);
            return this;
        }

        public final a c(String s1)
        {
            a("PHOTOURL", s1);
            return this;
        }

        public final a d()
        {
            a("VIEW_PICTURE_TYPE", 2);
            return this;
        }

        public final a e()
        {
            a("VIEW_PICTURE_TYPE", 5);
            a("ALLOW_TO_ATTACH_MESSAGE", false);
            return this;
        }

        public a()
        {
        }
    }


    public static CharSequence a = "";
    private kik.android.util.cv.c A;
    private boolean B;
    private boolean C;
    private k D;
    private aa E;
    private kik.a.d.a.a F;
    private File G;
    private long H;
    private boolean I;
    private boolean J;
    private boolean K;
    private MediaController L;
    private int M;
    private final f N = new f();
    private i O;
    private i U;
    private com.android.volley.r.a V;
    ImageButton _saveButton;
    ViewGroup _topbar;
    ImageView _videoPlayIcon;
    VideoView _videoView;
    FrameLayout _videoViewContainer;
    ad b;
    ad c;
    ContentImageView contentImageView;
    protected r d;
    protected w e;
    protected com.kik.android.a f;
    protected kik.a.e.n g;
    protected kik.a.f.k h;
    protected v i;
    protected ab j;
    android.view.animation.Animation.AnimationListener k;
    private View l;
    private ProgressDialogFragment m;
    private Handler n;
    private String o;
    ViewGroup openButton;
    private String p;
    ProfileImageView profImageView;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    TextView title;
    private int x;
    private boolean y;
    private byte z[];

    public ViewPictureFragment()
    {
        r = false;
        s = false;
        t = false;
        y = false;
        A = null;
        B = false;
        J = true;
        K = false;
        L = null;
        O = new se(this);
        U = new st(this);
        V = new tc(this);
        k = new su(this);
    }

    static File a(ViewPictureFragment viewpicturefragment, File file)
    {
        viewpicturefragment.G = file;
        return file;
    }

    static String a(ViewPictureFragment viewpicturefragment, String s1)
    {
        viewpicturefragment.o = s1;
        return s1;
    }

    public static kik.a.d.a.a a(KikContentMessageParcelable kikcontentmessageparcelable)
    {
        Hashtable hashtable;
        Hashtable hashtable1;
        Hashtable hashtable2;
        if (kikcontentmessageparcelable == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        hashtable = new Hashtable();
        hashtable1 = new Hashtable();
        hashtable2 = new Hashtable();
        hashtable1.putAll(kikcontentmessageparcelable.f);
        hashtable.putAll(kikcontentmessageparcelable.g);
        String s1 = kik.a.h.f.a(kikcontentmessageparcelable.a);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        byte abyte0[] = s1.getBytes();
        if (abyte0 != null)
        {
            try
            {
                hashtable2.put("icon", new d(com.kik.m.e.c(abyte0)));
            }
            catch (IOException ioexception) { }
        }
        return new kik.a.d.a.a(kikcontentmessageparcelable.b, kikcontentmessageparcelable.c, kikcontentmessageparcelable.d, kikcontentmessageparcelable.e, hashtable, hashtable2, hashtable1);
        return null;
    }

    private void a(int i1)
    {
        if (l == null)
        {
            return;
        } else
        {
            Object obj = new ta(this);
            obj = (new KikDialogFragment.a(l.getResources())).a(0x7f0902bc).b(i1).c(0x7f090193, ((android.content.DialogInterface.OnClickListener) (obj))).a;
            ((KikDialogFragment) (obj)).setCancelable(true);
            ((KikDialogFragment) (obj)).a(new tb(this));
            a(((KikDialogFragment) (obj)));
            return;
        }
    }

    static void a(ViewPictureFragment viewpicturefragment)
    {
        viewpicturefragment.a(0x7f09001f);
    }

    static void a(ViewPictureFragment viewpicturefragment, File file, kik.a.d.a.a a1)
    {
        if (viewpicturefragment._videoView == null || file == null || a1 == null)
        {
            return;
        }
        viewpicturefragment.c(true);
        viewpicturefragment.B = true;
        HeadphoneUnpluggedReceiver.a().a(viewpicturefragment);
        Object obj = viewpicturefragment.i.x(viewpicturefragment.q);
        if (obj == null)
        {
            obj = ct.a(viewpicturefragment.getActivity(), viewpicturefragment.o);
        } else
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inPurgeable = true;
            obj = BitmapFactory.decodeByteArray(((byte []) (obj)), 0, obj.length, options);
        }
        if (obj != null)
        {
            viewpicturefragment.contentImageView.d(((Bitmap) (obj)));
        }
        viewpicturefragment._videoView.setVideoURI(VideoContentProvider.a(file));
        if (!"com.kik.ext.gif".equals(a1.u()))
        {
            viewpicturefragment.L = new sn(viewpicturefragment, viewpicturefragment._videoView.getContext());
            viewpicturefragment.L.setAnchorView(viewpicturefragment._videoViewContainer);
            viewpicturefragment._videoView.setMediaController(viewpicturefragment.L);
        }
        viewpicturefragment._videoView.setOnPreparedListener(new so(viewpicturefragment, a1));
        viewpicturefragment._videoView.setOnErrorListener(new sp(viewpicturefragment, a1));
        viewpicturefragment._videoPlayIcon.setOnClickListener(new sq(viewpicturefragment));
        viewpicturefragment._videoViewContainer.setOnTouchListener(new sr(viewpicturefragment));
        viewpicturefragment._videoView.setOnCompletionListener(new ss(viewpicturefragment, a1));
    }

    private boolean a()
    {
        if (F != null)
        {
            return F.t().a(kik.a.d.a.a.b.e);
        } else
        {
            return false;
        }
    }

    static boolean a(ViewPictureFragment viewpicturefragment, boolean flag)
    {
        viewpicturefragment.s = flag;
        return flag;
    }

    private void b()
    {
        cv.b(new View[] {
            contentImageView
        });
        cv.e(new View[] {
            profImageView, _videoView, _videoViewContainer
        });
    }

    static void b(ViewPictureFragment viewpicturefragment, File file)
    {
        viewpicturefragment.i.b(file);
    }

    static void b(ViewPictureFragment viewpicturefragment, boolean flag)
    {
        viewpicturefragment.c(flag);
    }

    private void b(boolean flag)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT < 14)
        {
            fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(1);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (android.os.Build.VERSION.SDK_INT >= 11 && android.os.Build.VERSION.SDK_INT < 14)
        {
            fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(0);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static boolean b(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.B;
    }

    static ProgressDialogFragment c(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.m;
    }

    private void c()
    {
        cv.e(new View[] {
            contentImageView
        });
        cv.b(new View[] {
            profImageView
        });
    }

    private void c(boolean flag)
    {
        b(flag);
        if (!flag) goto _L2; else goto _L1
_L1:
        av.c(_topbar);
_L6:
        cv.e(new View[] {
            openButton
        });
_L4:
        B = flag;
        return;
_L2:
        av.a(_topbar, 500, 0L, null);
        if (!C)
        {
            continue; /* Loop/switch isn't completed */
        }
        cv.b(new View[] {
            openButton
        });
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    static Handler d(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.n;
    }

    static kik.a.d.a.a e(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.F;
    }

    static void f(ViewPictureFragment viewpicturefragment)
    {
        av.a(viewpicturefragment.contentImageView, 150, viewpicturefragment.k);
        if (!viewpicturefragment.B)
        {
            viewpicturefragment.c(true);
        }
        viewpicturefragment.B = true;
        viewpicturefragment._videoPlayIcon.setVisibility(8);
        viewpicturefragment._videoView.start();
    }

    static void g(ViewPictureFragment viewpicturefragment)
    {
        viewpicturefragment.a(0x7f09014d);
    }

    static void h(ViewPictureFragment viewpicturefragment)
    {
        viewpicturefragment.a(0x7f0900e3);
    }

    static kik.android.util.cv.c i(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.A;
    }

    static String j(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.o;
    }

    static boolean k(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.s;
    }

    static int l(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.x;
    }

    static File m(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.G;
    }

    static boolean n(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.a();
    }

    static byte[] o(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.z;
    }

    static com.android.volley.r.a p(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.V;
    }

    static boolean q(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.J;
    }

    static boolean r(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.I;
    }

    static long s(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.H;
    }

    static boolean t(ViewPictureFragment viewpicturefragment)
    {
        viewpicturefragment.J = false;
        return false;
    }

    static MediaController u(ViewPictureFragment viewpicturefragment)
    {
        return viewpicturefragment.L;
    }

    static void v(ViewPictureFragment viewpicturefragment)
    {
        viewpicturefragment.b();
        viewpicturefragment._videoView.seekTo(0);
        viewpicturefragment._videoPlayIcon.setVisibility(0);
        viewpicturefragment._videoPlayIcon.bringToFront();
        viewpicturefragment.c(false);
        viewpicturefragment.B = false;
        HeadphoneUnpluggedReceiver.a().b(viewpicturefragment);
    }

    protected final int C()
    {
        return 32;
    }

    public final void e()
    {
        if (_videoView != null && _videoView.isPlaying())
        {
            _videoView.pause();
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag1 = true;
        V().a(this);
        super.onCreate(bundle);
        H = System.currentTimeMillis();
        bundle = getArguments();
        o = bundle.getString("PHOTOURL");
        z = bundle.getByteArray("MESSAGING_KEY");
        p = bundle.getString("JID");
        x = bundle.getInt("VIEW_PICTURE_TYPE");
        K = bundle.getBoolean("ALLOW_TO_ATTACH_MESSAGE");
        F = a((KikContentMessageParcelable)bundle.getParcelable("CONTENT_MESSAGE"));
        if (F != null)
        {
            o = F.g();
            if (o == null)
            {
                o = F.h();
            }
            A = cv.a(F, getActivity(), o);
            boolean flag;
            if (K || F.x())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            K = flag;
            if (a() && j.c(F.o()))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            I = flag;
        }
        if (x == 3)
        {
            E = e.d();
            return;
        }
        try
        {
            D = d.a(p, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            D = null;
        }
        return;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        l = layoutinflater.inflate(0x7f030016, viewgroup, false);
        ButterKnife.inject(this, l);
        n = new Handler();
        a = getString(0x7f09001f);
        N.a(profImageView.a(), O);
        N.a(profImageView.b(), U);
        profImageView.setOnClickListener(new td(this));
        contentImageView.setOnClickListener(new te(this));
        if (F == null) goto _L2; else goto _L1
_L1:
        layoutinflater = ae.a(F);
        title.setText(layoutinflater);
_L4:
        q = getArguments().getString("PREVIEW");
        if (o == null && (x == 2 || x == 4 || x == 7))
        {
            Toast.makeText(getActivity(), 0x7f09001f, 1).show();
            J();
            return l;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (D != null)
        {
            if ((D instanceof n) && D.c() == null)
            {
                layoutinflater = (n)D;
                title.setText(cq.a(layoutinflater, d));
            } else
            {
                viewgroup = title;
                if (D.c() == null)
                {
                    layoutinflater = KikApplication.f(0x7f090202);
                } else
                {
                    layoutinflater = D.c();
                }
                viewgroup.setText(layoutinflater);
            }
        } else
        if (E != null)
        {
            title.setText((new StringBuilder()).append(E.d).append(" ").append(E.e).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
        m = new ProgressDialogFragment(getString(0x7f090148), true);
        m.setCancelable(true);
        m.e();
        m.a(new tf(this));
        a(m);
        if (x == 3)
        {
            c();
            profImageView.a(E, c, new tg(this), new ti(this));
            s = true;
        }
        if (x == 2)
        {
            c();
            profImageView.a(D, b);
            s = true;
        } else
        if (x == 4 && F != null)
        {
            if (a())
            {
                layoutinflater = (android.widget.RelativeLayout.LayoutParams)openButton.getLayoutParams();
                layoutinflater.setMargins(((android.widget.RelativeLayout.LayoutParams) (layoutinflater)).leftMargin, ((android.widget.RelativeLayout.LayoutParams) (layoutinflater)).topMargin, ((android.widget.RelativeLayout.LayoutParams) (layoutinflater)).rightMargin, ((android.widget.RelativeLayout.LayoutParams) (layoutinflater)).bottomMargin + KikApplication.a(65));
                openButton.setLayoutParams(layoutinflater);
                j.a(F, z, m.f(), f).a(new tl(this));
            } else
            {
                b();
                if (F.g("int-file-url-local") != null)
                {
                    try
                    {
                        layoutinflater = (Bitmap)g.a(F.o(), true);
                        contentImageView.d(layoutinflater);
                        s = true;
                        a(((KikDialogFragment) (null)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (LayoutInflater layoutinflater)
                    {
                        Toast.makeText(contentImageView.getContext(), 0x7f09001f, 1).show();
                        bx.a(layoutinflater);
                    }
                }
            }
        } else
        if (x == 5)
        {
            b();
            try
            {
                layoutinflater = com.kik.m.k.a(o, -1, -1);
                contentImageView.d(layoutinflater);
                s = true;
                a(((KikDialogFragment) (null)));
                title.setText(getText(0x7f0901cc));
                layoutinflater = new Bundle();
                layoutinflater.putString("photoUrl", null);
                a(layoutinflater);
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                Toast.makeText(contentImageView.getContext(), 0x7f09001f, 1).show();
                bx.a(layoutinflater);
            }
        } else
        if (x == 6)
        {
            b();
            try
            {
                contentImageView.b(kik.android.util.p.a().d());
                s = true;
                a(((KikDialogFragment) (null)));
                title.setText(getText(0x7f0901cc));
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                Toast.makeText(getActivity(), 0x7f09001f, 1).show();
                bx.a(layoutinflater);
            }
        } else
        if (x == 7)
        {
            b();
            try
            {
                layoutinflater = com.kik.cache.av.a(o, contentImageView.getMeasuredWidth(), contentImageView.getMeasuredHeight());
                contentImageView.a(layoutinflater, b);
                s = true;
                a(((KikDialogFragment) (null)));
                title.setText(getText(0x7f0901cc));
                layoutinflater = new Bundle();
                layoutinflater.putString("photoUrl", null);
                a(layoutinflater);
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                Toast.makeText(getActivity(), 0x7f09001f, 1).show();
                bx.a(layoutinflater);
            }
        }
        layoutinflater = (EllipsizingTextView)l.findViewById(0x7f0e0094);
        viewgroup = (ImageView)l.findViewById(0x7f0e0093);
        if (A != null)
        {
            C = true;
            if (!a())
            {
                openButton.setVisibility(0);
            }
            openButton.setOnClickListener(new sf(this));
            layoutinflater.setText(A.d());
            viewgroup.setImageBitmap(A.c());
        } else
        {
            C = false;
            openButton.setVisibility(8);
        }
        layoutinflater = new d(null);
        if (F != null)
        {
            layoutinflater.a(F.o());
        }
        if (x == 7)
        {
            layoutinflater.a(kik.android.util.a.b(o));
        }
        if (x == 3 || x == 2 || x == 6 || K)
        {
            _saveButton.setVisibility(8);
        } else
        if (kik.a.h.e.a().a(layoutinflater))
        {
            _saveButton.setImageResource(0x7f02024d);
            _saveButton.setClickable(false);
        } else
        if (x == 5)
        {
            _saveButton.setImageResource(0x7f02026e);
            _saveButton.setOnClickListener(new sh(this));
        } else
        if (a())
        {
            if (G != null && i.c(G) || kik.android.util.a.a(i, F))
            {
                _saveButton.setImageResource(0x7f02024d);
                _saveButton.setClickable(false);
            } else
            {
                _saveButton.setOnClickListener(new si(this));
            }
        } else
        if (F != null && (kik.android.util.a.a(i, F) || kik.android.util.a.a().a(F.o())))
        {
            _saveButton.setImageResource(0x7f02024d);
            _saveButton.setClickable(false);
        } else
        {
            _saveButton.setOnClickListener(new sj(this, layoutinflater));
        }
        return l;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        b(false);
        if (_videoView.getCurrentPosition() > 0)
        {
            _videoView.pause();
            M = _videoView.getCurrentPosition();
        }
        if (B)
        {
            c(false);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (!s && !t && !r)
        {
            m = new ProgressDialogFragment(getString(0x7f090148), new sv(this));
            m.setCancelable(true);
            m.e();
            m.a(new sw(this));
            a(m);
            if (x == 4 && !a())
            {
                contentImageView.a(F, z, b, f, h, kik.a.z.b(i), new sx(this));
            }
            t = true;
        }
        if (y)
        {
            y = false;
            a(0x7f09001f);
        }
        if (_videoView != null && M != 0)
        {
            _videoView.seekTo(M);
            M = 0;
        }
        if (F != null && "com.kik.ext.gif".equals(F.u()) && _videoView != null)
        {
            _videoView.start();
        }
    }

    public final int y()
    {
        return 0xff000000;
    }

}
