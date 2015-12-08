// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.kik.cache.ContactImageView;
import com.kik.cache.ad;
import com.kik.g.f;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.scan.KikCode;
import com.kik.scan.UsernameKikCode;
import com.kik.sdkutils.a;
import kik.a.d.aa;
import kik.a.d.j;
import kik.a.d.n;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.k;
import kik.android.chat.KikApplication;
import kik.android.scan.d;
import kik.android.util.cq;
import kik.android.util.cs;
import kik.android.util.cv;
import kik.android.widget.KikCodeBackgroundImageView;
import kik.android.widget.KikFinderCodeImageView;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, id, ir, it, 
//            ix, iw, iv, in, 
//            io, iy, ie, ig, 
//            ih, ij, ip, il, 
//            ik, iu, is

public class KikCodeFragment extends KikIqFragmentBase
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        private final String a = "kik.code.group.jid";

        public final String a()
        {
            return g("kik.code.group.jid");
        }

        public final a a(String s1)
        {
            if (s1 != null)
            {
                a("kik.code.group.jid", s1);
            }
            return this;
        }

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract void a();
    }

    private abstract class c
    {

        final KikCodeFragment b;

        abstract void a();

        private c()
        {
            b = KikCodeFragment.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }


    ViewGroup _codeContainer;
    ViewGroup _codeInfo;
    KikFinderCodeImageView _drawArea;
    LinearLayout _errorHolder;
    KikCodeBackgroundImageView _fakeCode;
    TextView _nameText;
    ContactImageView _profilePic;
    ImageView _retryImage;
    TextView _scanText;
    ProgressBar _spinner;
    ImageView _tellAFriendImage;
    TextView _usernameText;
    View _wipeContainer;
    ad a;
    k b;
    protected v c;
    protected r d;
    protected w e;
    protected com.kik.android.a f;
    protected kik.android.chat.b.d g;
    protected d h;
    protected l i;
    private View j;
    private KikCode k;
    private boolean l;
    private int m;
    private p n;
    private boolean o;
    private b p;
    private boolean q;
    private final cs r = new cs();
    private final a s = new a();
    private n t;
    private final android.view.View.OnTouchListener x = new id(this);
    private final c y = new ir(this);

    public KikCodeFragment()
    {
        l = false;
        m = 0;
        o = false;
        q = false;
    }

    static KikCode a(KikCodeFragment kikcodefragment, KikCode kikcode)
    {
        kikcodefragment.k = kikcode;
        return kikcode;
    }

    private void a(KikCode kikcode)
    {
        k = kikcode;
        b(new it(this));
    }

    private void a(n n1)
    {
        _profilePic.a(n1, a, false, d, f);
        _profilePic.setOnClickListener(new ix(this, n1));
        String s2 = n1.c();
        String s1 = s2;
        if (cq.c(s2))
        {
            if (n1.I())
            {
                s1 = n1.J();
            } else
            {
                s1 = cq.a(n1.w(), d);
            }
        }
        cv.e(new View[] {
            _usernameText
        });
        cv.a(s1, _nameText);
    }

    static void a(KikCodeFragment kikcodefragment, MotionEvent motionevent)
    {
        float f3 = motionevent.getY();
        float f2 = -Math.min(Math.abs((f3 - (float)(kikcodefragment._drawArea.getHeight() / 2)) / (float)(kikcodefragment._drawArea.getHeight() / 2)), 1.0F) * 5F;
        float f1 = f2;
        if (f3 < (float)(kikcodefragment._drawArea.getHeight() / 2))
        {
            f1 = f2 * -1F;
        }
        float f4 = motionevent.getX();
        f3 = Math.min(Math.abs((f4 - (float)(kikcodefragment._drawArea.getWidth() / 2)) / (float)(kikcodefragment._drawArea.getWidth() / 2)), 1.0F) * 5F;
        f2 = f3;
        if (f4 < (float)(kikcodefragment._drawArea.getWidth() / 2))
        {
            f2 = f3 * -1F;
        }
        kikcodefragment._drawArea.setRotationX(f1);
        kikcodefragment._drawArea.setRotationY(f2);
    }

    static void a(KikCodeFragment kikcodefragment, String s1)
    {
        if (kikcodefragment._drawArea != null)
        {
            kikcodefragment.b(new iw(kikcodefragment));
            kikcodefragment._drawArea.postDelayed(new iv(kikcodefragment, s1), 200L);
        }
    }

    static void a(KikCodeFragment kikcodefragment, n n1)
    {
        kikcodefragment.a(n1);
    }

    static void a(KikCodeFragment kikcodefragment, c c1)
    {
        kikcodefragment._fakeCode.setOnTouchListener(new in(kikcodefragment, c1));
        kikcodefragment.b(new io(kikcodefragment));
    }

    static boolean a(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.l;
    }

    static cs b(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.r;
    }

    private void b(n n1)
    {
        cv.a(KikApplication.f(0x7f090123), _scanText);
        _drawArea.clearAnimation();
        a(n1);
        U().a(i.e(), com.kik.sdkutils.a.a(this, new iy(this, n1)));
        a(((KikCode) (null)));
        Object obj = kik.a.f.f.j.a(n1.a().b());
        obj = com.kik.g.s.b(S.a(((kik.a.f.f.z) (obj))));
        if (obj != null)
        {
            ((p) (obj)).a(new ie(this, n1));
        }
    }

    static void b(KikCodeFragment kikcodefragment, KikCode kikcode)
    {
        kikcodefragment.a(kikcode);
    }

    static void b(KikCodeFragment kikcodefragment, n n1)
    {
        kikcodefragment.b(n1);
    }

    static void c(KikCodeFragment kikcodefragment)
    {
        kikcodefragment._drawArea.setScaleX(0.98F);
        kikcodefragment._drawArea.setScaleY(0.98F);
    }

    static boolean d(KikCodeFragment kikcodefragment)
    {
        kikcodefragment.l = true;
        return true;
    }

    static boolean e(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.o;
    }

    static int f(KikCodeFragment kikcodefragment)
    {
        int i1 = kikcodefragment.m;
        kikcodefragment.m = i1 + 1;
        return i1;
    }

    public static int g()
    {
        return 0;
    }

    static void g(KikCodeFragment kikcodefragment)
    {
        kikcodefragment.j();
    }

    private void h()
    {
        if (h != null)
        {
            h.a();
            n = h.b();
        }
    }

    static void h(KikCodeFragment kikcodefragment)
    {
        kikcodefragment.h();
    }

    static KikCode i(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.k;
    }

    private void i()
    {
        k();
        if (t != null)
        {
            b(t);
            return;
        } else
        {
            cv.b(new View[] {
                _drawArea
            });
            cv.e(new View[] {
                _fakeCode
            });
            a(((KikCode) (null)));
            String s1 = KikApplication.a(0x7f090216, new Object[] {
                e.d().d
            });
            a(0);
            _profilePic.a(e.d(), a);
            cv.a((new StringBuilder()).append(e.d().d).append(" ").append(e.d().e).toString(), _nameText);
            cv.a(e.d().c, _usernameText);
            cv.a(s1, _scanText);
            _profilePic.setOnClickListener(new ig(this));
            return;
        }
    }

    static n j(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.t;
    }

    private void j()
    {
        int i1 = kik.android.chat.b.a.b(k);
        if (k == null)
        {
            i1 = kik.android.chat.b.a.a();
            cv.b(new View[] {
                _spinner
            });
            _fakeCode.setOnTouchListener(null);
        } else
        {
            Object obj = k;
            if (obj instanceof UsernameKikCode)
            {
                obj = ((UsernameKikCode)obj).getUsername();
            } else
            {
                obj = "";
            }
            cv.a(((String) (obj)), _usernameText);
            cv.e(new View[] {
                _spinner
            });
            if (!cv.c(_drawArea))
            {
                j.postDelayed(new ih(this), 300L);
            } else
            {
                cv.b(new View[] {
                    _tellAFriendImage
                });
            }
            _drawArea.setOnTouchListener(x);
        }
        if (j.getBackground() instanceof kik.android.scan.widget.a)
        {
            ((kik.android.scan.widget.a)j.getBackground()).a(i1, r.a());
        } else
        {
            obj = new kik.android.scan.widget.a(i1);
            j.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
            if (j != null)
            {
                j.postDelayed(new ij(this, i1), 200L);
                return;
            }
        }
    }

    static b k(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.p;
    }

    private void k()
    {
        b(new ip(this));
    }

    static boolean l(KikCodeFragment kikcodefragment)
    {
        kikcodefragment.q = true;
        return true;
    }

    static View m(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.j;
    }

    static android.view.View.OnTouchListener n(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.x;
    }

    static c o(KikCodeFragment kikcodefragment)
    {
        return kikcodefragment.y;
    }

    static void p(KikCodeFragment kikcodefragment)
    {
        if (kikcodefragment._fakeCode != null)
        {
            kikcodefragment._fakeCode.setOnTouchListener(null);
        }
        kikcodefragment.k();
        cv.b(new View[] {
            kikcodefragment._spinner
        });
    }

    public final boolean M()
    {
        return true;
    }

    public final void a()
    {
        c();
        o = false;
    }

    public final void a(int i1)
    {
        n.a(new il(this, i1));
    }

    protected final void a(String s1, String s2)
    {
        a((new KikDialogFragment.a()).a(s1).b(s2).a(KikApplication.f(0x7f090193), new ik(this)).a(false).a);
    }

    public final void a(b b1)
    {
        p = b1;
    }

    public final void b()
    {
        o = true;
    }

    protected final void b(f f1)
    {
        super.b(f1);
        f1.a(h.c(), new iu(this));
    }

    public final void c()
    {
        if (l)
        {
            Object obj = _drawArea;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ObjectAnimator.ofPropertyValuesHolder(obj, new PropertyValuesHolder[] {
                    PropertyValuesHolder.ofFloat(View.ROTATION_X, new float[] {
                        _drawArea.getRotationX(), 0.0F
                    }), PropertyValuesHolder.ofFloat(View.ROTATION_Y, new float[] {
                        _drawArea.getRotationY(), 0.0F
                    }), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[] {
                        _drawArea.getScaleX(), 1.0F
                    }), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[] {
                        _drawArea.getScaleY(), 1.0F
                    })
                });
                ((ObjectAnimator) (obj)).setInterpolator(new OvershootInterpolator(5F));
            }
            ((ObjectAnimator) (obj)).start();
            l = false;
        }
    }

    public final void d()
    {
        if (_drawArea != null)
        {
            m = 0;
            _drawArea.c();
            k = _drawArea.d();
            j();
        }
        if (_wipeContainer != null)
        {
            _wipeContainer.setBackgroundDrawable(null);
            cv.e(new View[] {
                _wipeContainer
            });
        }
        h();
        i();
    }

    public final boolean e()
    {
        return q;
    }

    public final void f()
    {
        if (f != null)
        {
            com.kik.android.a.f f1 = f.b("Code View Closed");
            f1.a("Colour", kik.android.chat.b.a.a(k));
            f1.a("Colour Change Count", m);
            f1.b();
        }
        m = 0;
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        bundle = getArguments();
        s.a(bundle);
        h();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        j = layoutinflater.inflate(0x7f030045, viewgroup, false);
        ButterKnife.inject(this, j);
        layoutinflater = s.a();
        if (layoutinflater != null)
        {
            t = i.a(layoutinflater, true);
        }
        i();
        int i1 = N();
        if (i1 > 0)
        {
            cv.b(_tellAFriendImage).a(i1);
            cv.b(_codeContainer).a(i1);
        }
        _tellAFriendImage.setOnClickListener(new is(this));
        return j;
    }

    public void onDestroy()
    {
        h.a();
        super.onDestroy();
    }

    public void onPause()
    {
        o = true;
        super.onPause();
    }

    public void onResume()
    {
        a();
        super.onResume();
        q = false;
    }
}
