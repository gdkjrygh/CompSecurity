// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.kik.android.a;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.m.e;
import com.kik.scan.GroupKikCode;
import com.kik.scan.KikCode;
import com.kik.scan.RemoteKikCode;
import com.kik.scan.UsernameKikCode;
import com.kik.sdkutils.y;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.f;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.f.f.i;
import kik.android.c.b;
import kik.android.chat.KikApplication;
import kik.android.chat.fragment.KikIqFragmentBase;
import kik.android.scan.ICSScanPreviewView;
import kik.android.scan.ScanPreviewView;
import kik.android.scan.a.c;
import kik.android.scan.d;
import kik.android.scan.widget.ScannerViewFinder;
import kik.android.util.bx;
import kik.android.util.by;
import kik.android.util.cv;
import kik.android.util.u;

// Referenced classes of package kik.android.scan.fragment:
//            a, m, n, l, 
//            t, d, e, g, 
//            p, b, j, q, 
//            o, c, u, s, 
//            k

public class ScanFragment extends KikIqFragmentBase
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        private final String a = "scan.fragment.scan.launch.first";

        public final a a(boolean flag)
        {
            a("scan.fragment.scan.launch.first", flag);
            return this;
        }

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract boolean c();
    }

    private static final class c extends Handler
    {

        private final WeakReference a;

        public final void handleMessage(Message message)
        {
            super.handleMessage(message);
            ScanFragment scanfragment = (ScanFragment)a.get();
            if (scanfragment == null)
            {
                bx.d(new IllegalAccessException("Unable to post to fragment! Reference cleaned up!"));
                return;
            }
            removeMessages(1);
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                ScanFragment.o(scanfragment);
                kik.android.scan.fragment.ScanFragment.p(scanfragment);
                return;

            case 2: // '\002'
                ScanFragment.q(scanfragment);
                break;
            }
        }

        public c(ScanFragment scanfragment)
        {
            a = new WeakReference(scanfragment);
        }
    }


    private final List A = new ArrayList();
    private final com.kik.g.i B = new kik.android.scan.fragment.a(this);
    private kik.android.c.b.b C;
    private kik.android.c.b.c D;
    protected View _animationContainer;
    protected TextView _callToActionTextView;
    protected ImageView _cameraBlurView;
    protected View _cameraErrorCover;
    protected View _errorImage;
    protected TextView _errorRetryButton;
    protected TextView _errorText;
    protected TextView _errorTitle;
    protected View _loadingContainer;
    protected ProgressBar _progress;
    protected ImageView _resultImageView;
    protected ViewGroup _scanContainer;
    protected ScannerViewFinder _scanFinder;
    com.kik.android.a a;
    kik.android.chat.b.d b;
    r c;
    d d;
    l e;
    kik.a.e.i f;
    private kik.android.scan.k g;
    private kik.android.c.b h;
    private kik.android.widget.a i;
    private int j;
    private Camera k;
    private b l;
    private boolean m;
    private boolean n;
    private c o;
    private final Object p = new Object();
    private boolean q;
    private boolean r;
    private boolean s;
    private a t;
    private Point x;
    private int y;
    private kik.android.scan.k.a z;

    public ScanFragment()
    {
        j = -1;
        m = true;
        n = false;
        o = new c(this);
        r = false;
        s = false;
        t = new a();
        x = new Point();
        C = new m(this);
        D = new kik.android.scan.fragment.n(this);
    }

    static int a(ScanFragment scanfragment, int i1)
    {
        scanfragment.y = i1;
        return i1;
    }

    static Point a(ScanFragment scanfragment, com.kik.scan.Scanner.ScanResult scanresult)
    {
        if (scanresult == null)
        {
            return new Point(0, 0);
        } else
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            scanfragment.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            int i1 = displaymetrics.heightPixels;
            int j1 = displaymetrics.widthPixels;
            float f1 = j1;
            float f2 = (float)(j1 * scanresult.y) / 480F;
            float f3 = ((float)scanresult.x * (float)i1) / 640F;
            return new Point((int)(f1 - f2), (int)f3);
        }
    }

    private p a(p p1)
    {
        synchronized (A)
        {
            A.add(p1);
            p1.a(new kik.android.scan.fragment.l(this, p1));
        }
        return p1;
        p1;
        list;
        JVM INSTR monitorexit ;
        throw p1;
    }

    private p a(n n1, kik.android.scan.a.c c1)
    {
        if (n1 == null)
        {
            return com.kik.g.s.a(new IllegalArgumentException("null group"));
        }
        String s2 = "";
        String s1 = s2;
        if (c1 != null)
        {
            s1 = s2;
            if (c1.d() != null)
            {
                try
                {
                    s1 = com.kik.m.e.b(c1.d());
                }
                // Misplaced declaration of an exception variable
                catch (kik.android.scan.a.c c1)
                {
                    s1 = s2;
                }
            }
        }
        return e.a(null, s1, n1.a().a());
    }

    static p a(ScanFragment scanfragment, p p1)
    {
        return scanfragment.a(p1);
    }

    static p a(ScanFragment scanfragment, n n1, kik.android.scan.a.c c1)
    {
        return scanfragment.a(n1, c1);
    }

    static kik.android.scan.k.a a(ScanFragment scanfragment, kik.android.scan.k.a a1)
    {
        scanfragment.z = a1;
        return a1;
    }

    static kik.android.scan.k a(ScanFragment scanfragment)
    {
        return scanfragment.g;
    }

    private void a(Camera camera)
    {
        if (camera == null || e())
        {
            if (camera != null)
            {
                camera.release();
            }
            if (k == null)
            {
                d();
            }
            return;
        }
        Object obj = p;
        obj;
        JVM INSTR monitorenter ;
        k = camera;
        f();
        if (h != null)
        {
            h.a(k);
        }
_L1:
        return;
        camera;
        obj;
        JVM INSTR monitorexit ;
        throw camera;
        camera;
        d();
          goto _L1
    }

    private void a(KikCode kikcode)
    {
        a(kikcode, "", KikApplication.f(0x7f09020a));
    }

    private void a(KikCode kikcode, String s1, String s2)
    {
        cv.a(KikApplication.f(0x7f090212), _errorRetryButton);
        _errorRetryButton.setOnClickListener(new t(this, kikcode));
        b(s1, s2);
    }

    private void a(k k1, kik.android.scan.a.c c1)
    {
        boolean flag = true;
        if (k1 == null)
        {
            return;
        }
        b(new kik.android.scan.fragment.d(this));
        a.b("Code Resolved").a("Is Group", k1.t()).a("Is Blocked", k1.m()).a("In Roster", k1.l()).b();
        q = true;
        if (k1.m())
        {
            k1 = (new kik.android.chat.fragment.KikChatInfoFragment.a()).a(k1).b(1).a(c1);
        } else
        {
            d.a(c1, k1);
            if (!k1.p() && k1 != null && !k1.t())
            {
                r r1 = c;
                j j1 = k1.a();
                HashMap hashmap = new HashMap();
                if (c1 != null)
                {
                    hashmap.put("type", "scan");
                    hashmap.put("nonce", String.valueOf(c1.c()));
                    if (c1.a() != null)
                    {
                        hashmap.put("bytes", com.kik.m.e.a(c1.a()));
                    }
                    if (c1.b() != null)
                    {
                        hashmap.put("data", c1.b());
                    }
                }
                r1.a(j1, hashmap);
            }
            c1 = (new kik.android.chat.fragment.KikChatFragment.a()).a(k1);
            if (k1 instanceof n)
            {
                flag = false;
            }
            k1 = c1.d(flag);
        }
        k1 = kik.android.chat.activity.k.a(k1, getActivity()).b();
        _animationContainer.postDelayed(new kik.android.scan.fragment.e(this, k1), 200L);
    }

    static void a(ScanFragment scanfragment, KikCode kikcode)
    {
        if (scanfragment.s || kikcode == null)
        {
            return;
        }
        scanfragment.s = true;
        scanfragment.g.d();
        if (scanfragment.k != null)
        {
            scanfragment.k.stopPreview();
        }
        scanfragment._animationContainer.post(new g(scanfragment, kikcode));
    }

    static void a(ScanFragment scanfragment, KikCode kikcode, String s1, String s2)
    {
        scanfragment.a(kikcode, s1, s2);
    }

    static void a(ScanFragment scanfragment, String s1, String s2)
    {
        scanfragment.b(s1, s2);
    }

    static void a(ScanFragment scanfragment, k k1, kik.android.scan.a.c c1)
    {
        scanfragment.a(k1, c1);
    }

    static void a(ScanFragment scanfragment, kik.android.scan.a.b b1)
    {
        String s1;
        RemoteKikCode remotekikcode;
label0:
        {
            if (b1 != null && (b1 instanceof kik.android.scan.a.a))
            {
                b1 = (kik.android.scan.a.a)b1;
                s1 = b1.b();
                remotekikcode = b1.c();
                k k1 = scanfragment.c.b(s1);
                if (k1 == null || k1.g())
                {
                    break label0;
                }
                scanfragment.a(k1, kik.android.scan.a.c.a(b1));
            }
            return;
        }
        scanfragment.a(scanfragment.c.d(s1)).a(new kik.android.scan.fragment.p(scanfragment, b1, remotekikcode));
    }

    private void b(String s1, String s2)
    {
        _animationContainer.postDelayed(new kik.android.scan.fragment.b(this, s2, s1), 200L);
    }

    static void b(ScanFragment scanfragment, KikCode kikcode)
    {
        scanfragment.a(kikcode);
    }

    static boolean b(ScanFragment scanfragment)
    {
        return scanfragment.q;
    }

    static void c(ScanFragment scanfragment, KikCode kikcode)
    {
        if (kikcode instanceof RemoteKikCode)
        {
            RemoteKikCode remotekikcode = (RemoteKikCode)kikcode;
            scanfragment.a(scanfragment.d.a(remotekikcode)).a(new kik.android.scan.fragment.j(scanfragment, kikcode));
            return;
        }
        if (kikcode instanceof GroupKikCode)
        {
            kikcode = (GroupKikCode)kikcode;
            if (kikcode == null || scanfragment.q)
            {
                scanfragment.a(kikcode);
                return;
            }
            Object obj = kik.a.f.f.i.a(kikcode.getInviteCode());
            if (obj != null)
            {
                obj = com.kik.g.s.b(scanfragment.S.a(((kik.a.f.f.z) (obj))));
                scanfragment.a(((p) (obj)));
                if (obj != null)
                {
                    ((p) (obj)).a(new q(scanfragment, kikcode));
                    return;
                }
            }
            scanfragment.a(kikcode);
            return;
        }
        if (kikcode instanceof UsernameKikCode)
        {
            kikcode = (UsernameKikCode)kikcode;
            if (kikcode == null || scanfragment.q)
            {
                scanfragment.a(kikcode);
                return;
            }
            String s1 = kikcode.getUsername();
            k k1 = scanfragment.c.b(s1);
            if (k1 != null && !k1.g())
            {
                scanfragment.a(k1, kik.android.scan.a.c.a(kikcode));
                return;
            } else
            {
                scanfragment.a(scanfragment.c.d(s1)).a(new o(scanfragment, kikcode));
                return;
            }
        } else
        {
            scanfragment.a(kikcode);
            return;
        }
    }

    static boolean c(ScanFragment scanfragment)
    {
        return scanfragment.r;
    }

    private void d()
    {
        b(new kik.android.scan.fragment.c(this));
    }

    static boolean d(ScanFragment scanfragment)
    {
        scanfragment.r = true;
        return true;
    }

    static Point e(ScanFragment scanfragment)
    {
        return scanfragment.x;
    }

    private boolean e()
    {
        return _scanContainer == null;
    }

    private void f()
    {
        if (k != null && !e())
        {
            int i1 = u.a(getActivity());
            int j1 = g();
            if (j1 != -1)
            {
                i1 = u.a(i1, j1);
                if (j != i1)
                {
                    j = i1;
                    if (com.kik.sdkutils.y.b(16))
                    {
                        k.stopPreview();
                    }
                    g.a(j);
                    k.setDisplayOrientation(j);
                    android.hardware.Camera.Parameters parameters = k.getParameters();
                    Object obj = u.b(getActivity(), parameters.getSupportedPreviewSizes(), 1.3333333333333333D);
                    parameters.setPreviewSize(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height);
                    Object obj1 = parameters.getSupportedPictureSizes();
                    obj1 = u.a(getActivity(), ((List) (obj1)), (double)((android.hardware.Camera.Size) (obj)).width / (double)((android.hardware.Camera.Size) (obj)).height);
                    if (obj1 != null)
                    {
                        parameters.setPictureSize(((android.hardware.Camera.Size) (obj1)).width, ((android.hardware.Camera.Size) (obj1)).height);
                    }
                    int k1 = ((android.hardware.Camera.Size) (obj)).width;
                    i1 = ((android.hardware.Camera.Size) (obj)).height;
                    if (j % 180 != 0)
                    {
                        k1 = ((android.hardware.Camera.Size) (obj)).height;
                        i1 = ((android.hardware.Camera.Size) (obj)).width;
                    }
                    obj = _scanContainer.getResources().getDisplayMetrics();
                    float f1 = (float)((DisplayMetrics) (obj)).widthPixels / (float)k1;
                    i1 = (int)((float)i1 * f1);
                    k1 = ((DisplayMetrics) (obj)).widthPixels;
                    if (i != null)
                    {
                        i.a(k1, i1);
                    }
                    if (com.kik.sdkutils.y.a(9))
                    {
                        int ai[] = u.b(parameters.getSupportedPreviewFpsRange());
                        if (ai != null)
                        {
                            parameters.setPreviewFpsRange(ai[0], ai[1]);
                        }
                    }
                    try
                    {
                        k.setParameters(parameters);
                        return;
                    }
                    catch (RuntimeException runtimeexception)
                    {
                        bx.f(runtimeexception);
                    }
                    return;
                }
            }
        }
    }

    static void f(ScanFragment scanfragment)
    {
        scanfragment.d();
    }

    private static int g()
    {
        int j1 = u.b();
        int i1 = j1;
        if (j1 == -1)
        {
            i1 = u.c();
        }
        return i1;
    }

    static void g(ScanFragment scanfragment)
    {
        scanfragment.b(new kik.android.scan.fragment.u(scanfragment));
    }

    private void h()
    {
        j = -1;
        if (_cameraBlurView != null)
        {
            _cameraBlurView.setAlpha(1.0F);
            cv.b(new View[] {
                _cameraBlurView
            });
        }
        if (k != null)
        {
            synchronized (p)
            {
                h.b();
                k.stopPreview();
                g.c();
                k.release();
                k = null;
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void h(ScanFragment scanfragment)
    {
        scanfragment.b(new kik.android.scan.fragment.s(scanfragment));
    }

    static int i(ScanFragment scanfragment)
    {
        return scanfragment.y;
    }

    private void i()
    {
        if (g != null)
        {
            g.d();
        }
        j = -1;
    }

    static b j(ScanFragment scanfragment)
    {
        return scanfragment.l;
    }

    private void j()
    {
        if (_resultImageView != null)
        {
            _resultImageView.setImageDrawable(null);
            cv.e(new View[] {
                _resultImageView
            });
        }
    }

    private void k()
    {
        if (n && !s && !e())
        {
            o.removeMessages(2);
            o.sendEmptyMessageDelayed(1, 400L);
            if (a != null)
            {
                a.b("Scan Started").b();
                a.b("Scan Started", true);
                return;
            }
        }
    }

    static void k(ScanFragment scanfragment)
    {
        if (scanfragment.l != null)
        {
            scanfragment.l.a();
        }
    }

    private void l()
    {
        List list = A;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = A.iterator(); iterator.hasNext(); ((p)iterator.next()).e()) { }
        break MISSING_BLOCK_LABEL_46;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        A.clear();
        list;
        JVM INSTR monitorexit ;
    }

    static void l(ScanFragment scanfragment)
    {
        scanfragment.k();
    }

    static void m(ScanFragment scanfragment)
    {
        scanfragment.j();
    }

    static List n(ScanFragment scanfragment)
    {
        return scanfragment.A;
    }

    static void o(ScanFragment scanfragment)
    {
        if (scanfragment.k != null)
        {
            scanfragment.a(scanfragment.k);
            return;
        }
        int i1 = g();
        if (i1 == -1)
        {
            scanfragment.d();
            return;
        } else
        {
            scanfragment.a(u.b(i1));
            return;
        }
    }

    static void p(ScanFragment scanfragment)
    {
        if (scanfragment.g != null)
        {
            scanfragment.g.e();
        }
    }

    static void q(ScanFragment scanfragment)
    {
        scanfragment.h();
    }

    public final void a()
    {
        o.removeMessages(1);
        o.sendEmptyMessage(2);
    }

    protected final void a(com.kik.g.f f1)
    {
        super.a(f1);
        if (g != null)
        {
            f1.a(g.b(), B);
        }
    }

    public final void a(b b1)
    {
        l = b1;
    }

    public final void b()
    {
        s = false;
        q = false;
        r = false;
        j = -1;
        z = null;
        if (l != null)
        {
            l.b();
        }
        l();
        b(((Runnable) (new kik.android.scan.fragment.k(this))));
    }

    public final void b(boolean flag)
    {
        n = flag;
        if (n)
        {
            if (isResumed())
            {
                k();
            }
            return;
        } else
        {
            i();
            l();
            return;
        }
    }

    public final void c()
    {
        if (a != null)
        {
            by.a("Cancel", a).b();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        f();
        if (h != null)
        {
            h.a(k);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
        bundle = getArguments();
        t.a(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03008f, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        if (com.kik.sdkutils.y.a(16))
        {
            viewgroup = new ICSScanPreviewView(getActivity());
            i = viewgroup;
            _scanContainer.addView(viewgroup, new android.view.ViewGroup.LayoutParams(-1, -1));
            h = new kik.android.c.e(viewgroup, D);
        } else
        {
            viewgroup = new ScanPreviewView(getActivity());
            i = viewgroup;
            _scanContainer.addView(viewgroup);
            h = new kik.android.c.c(viewgroup, o, D);
        }
        g = new kik.android.scan.k(h, _cameraBlurView);
        h.a(C);
        cv.e(new View[] {
            _loadingContainer, _errorImage, _errorRetryButton, _errorText, _errorTitle
        });
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        l();
    }

    public void onPause()
    {
        super.onPause();
        i();
        h();
    }

    public void onResume()
    {
        super.onResume();
        k();
        if (z != null)
        {
            android.graphics.Bitmap bitmap = u.a(z.a, z.c, z.d, z.e, z.f);
            _resultImageView.setImageBitmap(bitmap);
            cv.b(new View[] {
                _resultImageView
            });
            return;
        } else
        {
            j();
            return;
        }
    }
}
