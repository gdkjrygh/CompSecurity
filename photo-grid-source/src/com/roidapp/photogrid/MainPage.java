// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Process;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.ae;
import com.roidapp.baselib.c.ai;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ads.q;
import com.roidapp.cloudlib.sns.b.k;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.g;
import com.roidapp.cloudlib.sns.g.c;
import com.roidapp.cloudlib.sns.h.h;
import com.roidapp.cloudlib.sns.i;
import com.roidapp.cloudlib.sns.login.j;
import com.roidapp.cloudlib.sns.main.MainViewPager;
import com.roidapp.cloudlib.sns.main.a;
import com.roidapp.cloudlib.sns.main.d;
import com.roidapp.cloudlib.sns.main.e;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.u;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.cloud.TemplateSelectorActivity;
import com.roidapp.photogrid.cmid.LoginService;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.ag;
import com.roidapp.photogrid.common.ak;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.bk;
import com.roidapp.photogrid.common.bq;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.w;
import com.roidapp.photogrid.filter.selfiecam.SelfieCamImageEditGLESActivity;
import com.roidapp.photogrid.release.CameraPreviewActivity;
import com.roidapp.photogrid.release.ImageSelector;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.PhotoGridActivity;
import com.roidapp.photogrid.release.Preference;
import com.roidapp.photogrid.release.ap;
import com.roidapp.photogrid.release.bo;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import com.roidapp.photogrid.release.rf;
import com.roidapp.videolib.f;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.roidapp.photogrid:
//            v, al, aw, w, 
//            x, y, aj, ak, 
//            aa, z, az, k, 
//            f, ap, aq, au, 
//            av, ax, am, ab, 
//            ag, an, ba, ar, 
//            ac, af, ae, ai, 
//            ah, FacebookMessengerActivity, ad

public class MainPage extends ParentActivity
    implements android.support.v4.view.ViewPager.OnPageChangeListener, android.view.View.OnClickListener, c, a
{

    protected static int g = 1;
    private static boolean s = true;
    private ImageView A;
    private ImageView B;
    private View C;
    private View D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Bitmap H;
    private Bitmap I;
    private RelativeLayout J;
    private com.roidapp.photogrid.a.d K;
    private boolean L;
    private com.roidapp.photogrid.f M;
    private ImageView N;
    private ImageView O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private com.roidapp.photogrid.cloud.b.a T;
    private Intent U;
    private al V;
    private boolean W;
    private MainViewPager X;
    private View Y;
    private e Z;
    boolean a;
    private com.roidapp.cloudlib.sns.main.b aA;
    private boolean aB;
    private int aa;
    private View ab;
    private ImageView ac;
    private ImageView ad;
    private ImageView ae;
    private ImageView af;
    private View ag;
    private View ah;
    private View ai;
    private View aj;
    private ai ak;
    private ImageView al;
    private View am;
    private FrameLayout an;
    private boolean ao;
    private boolean ap;
    private i aq;
    private boolean ar;
    private long as;
    private boolean at;
    private boolean au;
    private boolean av;
    private com.roidapp.cloudlib.sns.notification.p aw;
    private RelativeLayout ax;
    private com.roidapp.photogrid.az ay;
    private boolean az;
    public String b;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    PopupWindow f;
    public final w h = new w();
    final Handler i = new v(this);
    private String j;
    private ExecutorService k;
    private long l;
    private com.roidapp.photogrid.ba m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private String r;
    private boolean y;
    private int z;

    public MainPage()
    {
        a = false;
        n = false;
        o = false;
        p = false;
        q = false;
        y = false;
        z = f.c;
        E = false;
        F = false;
        G = false;
        c = false;
        d = false;
        e = false;
        L = false;
        P = false;
        Q = false;
        R = false;
        S = false;
        aB = false;
    }

    static void A(MainPage mainpage)
    {
        mainpage.b(false);
    }

    static View B(MainPage mainpage)
    {
        return mainpage.C;
    }

    static ImageView C(MainPage mainpage)
    {
        return mainpage.B;
    }

    static com.roidapp.cloudlib.sns.main.b D(MainPage mainpage)
    {
        return mainpage.aA;
    }

    static com.roidapp.photogrid.ba E(MainPage mainpage)
    {
        return mainpage.m;
    }

    static void F(MainPage mainpage)
    {
        if (!mainpage.G)
        {
            mainpage.G = true;
            Intent intent = new Intent();
            intent.setClass(mainpage, com/roidapp/photogrid/release/Preference);
            mainpage.startActivity(intent);
            mainpage.finish();
        }
    }

    static ImageView G(MainPage mainpage)
    {
        return mainpage.A;
    }

    private void G()
    {
        com.roidapp.photogrid.common.af.a(this, "OpenPG");
        com.roidapp.baselib.c.b.a("MainPage");
        com.roidapp.photogrid.release.a.c.a().b();
        Object obj = getPreferences(0);
        if (((SharedPreferences) (obj)).contains("Main_Version"))
        {
            o = false;
            az.i = false;
        } else
        {
            o = true;
            az.i = true;
            q = true;
            p = true;
        }
        if (((SharedPreferences) (obj)).getInt("Main_Version", 0) != com.roidapp.baselib.c.n.c(getApplicationContext()))
        {
            ((SharedPreferences) (obj)).edit().putInt("Main_Version", com.roidapp.baselib.c.n.c(getApplicationContext())).apply();
            n = true;
        } else
        {
            n = false;
        }
        if (n)
        {
            obj = PreferenceManager.getDefaultSharedPreferences(this).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putBoolean("isRunning", true);
            String s1;
            if (!o)
            {
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("NEW_USER", false);
            } else
            {
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("NEW_USER", true);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("SHOW_NEW_GRID", true);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("SHOW_NEW_FREE_2", true);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("video_new_preview", true);
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("NEW_USER_SELECTOR", true);
                com.roidapp.baselib.c.b.f("NEW_USER/MainPage");
            }
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
        com.roidapp.cloudlib.a.a.a(com.roidapp.baselib.c.aj.a()).a(com.roidapp.cloudlib.ads.q.b());
        com.roidapp.cloudlib.a.a.a(this).a();
        com.roidapp.photogrid.cloud.w.a(this, com.roidapp.photogrid.common.an.a(this)).b();
        (new com.roidapp.photogrid.cloud.aj()).a(this);
        if (getPreferences(0).getInt("current_process_id", 0) != Process.myPid() && ih.C().M() == null)
        {
            k = Executors.newSingleThreadExecutor();
            obj = ImageLibrary.a().b(this);
            k.execute(new com.roidapp.photogrid.al(this, ((String) (obj))));
        }
        if (com.roidapp.cloudlib.a.a.a(this).a("other", "enableCrittercism50", false))
        {
            com.roidapp.photogrid.common.ak.a();
        }
        com.roidapp.cloudlib.push.a.a(getApplicationContext());
        com.roidapp.photogrid.b.f.a("MainPage_View", "OpenPG");
        az.B = com.roidapp.photogrid.common.a.a().c(this);
        com.roidapp.photogrid.cmid.a.a(com.roidapp.baselib.c.aj.a().getApplicationContext()).a();
        U = new Intent(this, com/roidapp/photogrid/cmid/LoginService);
        U.setAction("ACTION_FRESH_GOOGLE_TOKEN");
        startService(U);
        if (!c && com.roidapp.baselib.c.n.d())
        {
            (new Handler(getMainLooper())).postDelayed(new aw((byte)0), 500L);
        }
        obj = com.roidapp.cloudlib.push.a.b(getApplication());
        if (com.roidapp.cloudlib.sns.af.a(getApplication()))
        {
            s1 = com.roidapp.cloudlib.sns.b.q.a(getApplication()).c().a;
            if (!TextUtils.equals(((CharSequence) (obj)), s1))
            {
                com.roidapp.cloudlib.push.a.a(getApplication(), s1);
            }
        } else
        if (obj != null)
        {
            com.roidapp.cloudlib.push.a.b(getApplication(), ((String) (obj)));
            return;
        }
    }

    private void H()
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).create();
        alertdialog.setCanceledOnTouchOutside(false);
        alertdialog.show();
        try
        {
            alertdialog.getWindow().setContentView(0x7f03013b);
        }
        catch (Exception exception)
        {
            exception.getStackTrace();
            alertdialog.dismiss();
            return;
        }
        ((TextView)alertdialog.findViewById(0x7f0d04f0)).setOnClickListener(new com.roidapp.photogrid.w(this, alertdialog));
        ((TextView)alertdialog.findViewById(0x7f0d04f1)).setOnClickListener(new com.roidapp.photogrid.x(this, alertdialog));
        ((TextView)alertdialog.findViewById(0x7f0d04f2)).setOnClickListener(new y(this, alertdialog));
    }

    static void H(MainPage mainpage)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(mainpage)).create();
        alertdialog.setCanceledOnTouchOutside(false);
        alertdialog.setOnDismissListener(new com.roidapp.photogrid.aj(mainpage));
        alertdialog.show();
        try
        {
            alertdialog.getWindow().setContentView(0x7f03010a);
        }
        // Misplaced declaration of an exception variable
        catch (MainPage mainpage)
        {
            mainpage.getStackTrace();
            alertdialog.dismiss();
            return;
        }
        ((TextView)alertdialog.findViewById(0x7f0d041d)).setText(Html.fromHtml(mainpage.getResources().getString(0x7f070351)));
        ((TextView)alertdialog.findViewById(0x7f0d041e)).setOnClickListener(new com.roidapp.photogrid.ak(mainpage, alertdialog));
    }

    static View I(MainPage mainpage)
    {
        return mainpage.D;
    }

    private void I()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(0x7f07030f);
        builder.setMessage(0x7f070316).setNegativeButton(0x7f070049, new aa(this)).setPositiveButton(0x7f070261, new z(this));
        builder.create().show();
    }

    static View J(MainPage mainpage)
    {
        mainpage.D = null;
        return null;
    }

    private void J()
    {
        if (a && ay == null)
        {
            ay = new com.roidapp.photogrid.az(this);
            i.postDelayed(ay, 600L);
        }
    }

    private void K()
    {
        switch (az.r)
        {
        default:
            return;

        case 0: // '\0'
            a(ac, 0x7f0204db, 255);
            a(ad, 0x7f0204da, 102);
            a(ae, 0x7f0204de, 102);
            a(af, 0x7f0204dd, 102);
            ag.setVisibility(0);
            ah.setVisibility(4);
            ai.setVisibility(4);
            aj.setVisibility(4);
            return;

        case 1: // '\001'
            a(ad, 0x7f0204da, 255);
            a(ac, 0x7f0204db, 102);
            a(ae, 0x7f0204de, 102);
            a(af, 0x7f0204dd, 102);
            ah.setVisibility(0);
            ag.setVisibility(4);
            ai.setVisibility(4);
            aj.setVisibility(4);
            return;

        case 2: // '\002'
            a(ae, 0x7f0204de, 255);
            a(ac, 0x7f0204db, 102);
            a(ad, 0x7f0204da, 102);
            a(af, 0x7f0204dd, 102);
            ai.setVisibility(0);
            ag.setVisibility(4);
            ah.setVisibility(4);
            aj.setVisibility(4);
            return;

        case 3: // '\003'
            a(af, 0x7f0204dd, 255);
            break;
        }
        a(ac, 0x7f0204db, 102);
        a(ad, 0x7f0204da, 102);
        a(ae, 0x7f0204de, 102);
        aj.setVisibility(0);
        ag.setVisibility(4);
        ah.setVisibility(4);
        ai.setVisibility(4);
    }

    static void K(MainPage mainpage)
    {
        mainpage.M();
    }

    private void L()
    {
        Object obj;
        boolean flag;
        if ((float)Math.round(((float)com.roidapp.baselib.d.a.b(new File(com.roidapp.baselib.d.a.b())) / 1024F / 1024F) * 100F) / 100F < 15F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        E = flag;
        F = com.roidapp.baselib.e.l.b(this);
        aa = getWindowManager().getDefaultDisplay().getWidth();
        ab = findViewById(0x7f0d0393);
        ac = (ImageView)ab.findViewById(0x7f0d0398);
        ad = (ImageView)ab.findViewById(0x7f0d039a);
        ae = (ImageView)ab.findViewById(0x7f0d039d);
        af = (ImageView)ab.findViewById(0x7f0d039f);
        ag = findViewById(0x7f0d0399);
        ah = findViewById(0x7f0d039b);
        ai = findViewById(0x7f0d039e);
        aj = findViewById(0x7f0d03a0);
        al = (ImageView)findViewById(0x7f0d0395);
        flag = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("notification_is_click", true);
        h.b(new View[] {
            al, ag, ah, ai, aj
        });
        ac.setOnClickListener(this);
        ad.setOnClickListener(this);
        ae.setOnClickListener(this);
        af.setOnClickListener(this);
        al.setOnClickListener(this);
        Y = findViewById(0x7f0d0394);
        Y.setOnClickListener(this);
        Y.setClickable(false);
        X = (MainViewPager)findViewById(0x7f0d0392);
        X.addOnPageChangeListener(this);
        if (!flag)
        {
            B.setVisibility(0);
        }
        if (az.s)
        {
            N();
        }
        obj = new ArrayList();
        ((List) (obj)).add(new com.roidapp.photogrid.k());
        if (com.roidapp.cloudlib.sns.af.a(this))
        {
            Object obj1 = new com.roidapp.cloudlib.sns.d.a();
            if (S)
            {
                Bundle bundle = new Bundle();
                bundle.putBoolean("FromShare", true);
                ((com.roidapp.cloudlib.sns.d.a) (obj1)).setArguments(bundle);
            }
            ((List) (obj)).add(obj1);
            ((List) (obj)).add(new com.roidapp.cloudlib.b.a());
            obj1 = com.roidapp.cloudlib.sns.b.q.a(this).c().b;
            ((List) (obj)).add(com.roidapp.cloudlib.sns.h.h.a(((x) (obj1)).a, ((x) (obj1)).b, ((x) (obj1)).h));
        } else
        {
            ((List) (obj)).add(new com.roidapp.cloudlib.sns.d.f());
            ((List) (obj)).add(new com.roidapp.cloudlib.b.a());
            ((List) (obj)).add(com.roidapp.cloudlib.sns.login.j.a("Myprofile_Login_Page"));
        }
        Z = new e(getSupportFragmentManager(), ((List) (obj)));
        X.setAdapter(Z);
        X.setCurrentItem(az.r);
        obj = (com.roidapp.cloudlib.sns.main.b)((List) (obj)).get(az.r);
        com.roidapp.cloudlib.sns.a.a.a(an, Integer.valueOf(((com.roidapp.cloudlib.sns.main.b) (obj)).hashCode()));
        K();
        J();
        if (p() && V == null)
        {
            ((ViewStub)findViewById(0x7f0d0396)).inflate();
            V = new al(this, i);
            V.b();
            ba.a().b();
        }
        com.roidapp.photogrid.common.ag.a().a(this);
        if (getIntent() != null && getIntent().getBooleanExtra("snsPush", false))
        {
            getIntent().removeExtra("snsPush");
            e(getIntent().getIntExtra("snsPid", 0));
        }
        az = true;
    }

    static void L(MainPage mainpage)
    {
        mainpage.I();
    }

    private void M()
    {
        ih.C().j("video");
        if (!rf.b())
        {
            com.roidapp.baselib.c.an.a(new WeakReference(this), getString(0x7f07028d));
            return;
        } else
        {
            G = true;
            bq.d();
            com.roidapp.baselib.c.b.d("MainPage", "MainPage/Video");
            com.roidapp.photogrid.common.ag.a().b(this, "mainpage_video");
            com.roidapp.photogrid.common.b.a("MainPage/Video");
            az.q = 6;
            ih.C().D();
            ih.C().aj();
            ih.C().h(true);
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/release/ImageSelector);
            startActivity(intent);
            finish();
            return;
        }
    }

    static void M(MainPage mainpage)
    {
        mainpage.H();
    }

    private void N()
    {
        if (az.s && M != null)
        {
            return;
        }
        az.s = true;
        al.setImageResource(0x7f0204d0);
        Object obj1 = getSupportFragmentManager();
        Object obj = ((FragmentManager) (obj1)).findFragmentById(0x7f0d0394);
        obj1 = ((FragmentManager) (obj1)).beginTransaction();
        if (obj != null)
        {
            ((FragmentTransaction) (obj1)).remove(((Fragment) (obj)));
        }
        M = new com.roidapp.photogrid.f();
        ((FragmentTransaction) (obj1)).setCustomAnimations(0x7f040000, 0x7f040001, 0, 0).replace(0x7f0d0394, M, "fast_tools").commitAllowingStateLoss();
        Y.setBackgroundColor(0xa0000000);
        obj = new RotateAnimation(45F, 180F, 1, 0.5F, 1, 0.5F);
        ((RotateAnimation) (obj)).setDuration(100L);
        ((RotateAnimation) (obj)).setFillAfter(true);
        al.startAnimation(((Animation) (obj)));
        M.g();
        Y.setClickable(true);
    }

    static boolean N(MainPage mainpage)
    {
        mainpage.L = true;
        return true;
    }

    private void O()
    {
        if (aA != null)
        {
            int ai1[] = ak.a(aA);
            if (ai1[0] != -1 && ai1[1] != -1)
            {
                ak.a(ai1[0], ai1[1]);
            }
        }
        if (com.roidapp.cloudlib.sns.af.a(this))
        {
            aA = new com.roidapp.cloudlib.sns.notification.b();
        } else
        {
            aA = com.roidapp.cloudlib.sns.login.j.a("Notification_Login_Page");
        }
        aA.x();
        a(az.r).b(az.r, aA);
    }

    static void O(MainPage mainpage)
    {
        int i1 = Process.myPid();
        mainpage.getPreferences(0).edit().putInt("current_process_id", i1).apply();
    }

    static com.roidapp.cloudlib.sns.notification.p a(MainPage mainpage, com.roidapp.cloudlib.sns.notification.p p1)
    {
        mainpage.aw = p1;
        return p1;
    }

    private void a(int i1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        int j1 = az.r;
        if (i1 != j1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (aq != null)
        {
            aq.b();
        }
        if (X != null)
        {
            X.setCurrentItem(i1, false);
        }
        if (!ap) goto _L5; else goto _L4
_L4:
        if (i1 <= 0) goto _L7; else goto _L6
_L6:
        if (a(i1) instanceof j)
        {
            i();
        }
_L5:
        K();
        if (true) goto _L3; else goto _L8
_L8:
        Exception exception;
        exception;
        throw exception;
_L7:
        if (!(a(i1) instanceof com.roidapp.photogrid.k)) goto _L5; else goto _L9
_L9:
        ax.setVisibility(8);
          goto _L5
    }

    private void a(ImageView imageview, int i1, int j1)
    {
        Drawable drawable = getResources().getDrawable(i1);
        drawable.setAlpha(j1);
        imageview.setImageDrawable(drawable);
    }

    static void a(MainPage mainpage)
    {
        mainpage.G();
    }

    static void a(MainPage mainpage, long l1)
    {
        mainpage.c(l1);
    }

    static void a(MainPage mainpage, boolean flag)
    {
        com.roidapp.cloudlib.sns.main.b b2 = mainpage.a(0);
        Object obj = mainpage.a(1);
        mainpage.a(2);
        com.roidapp.cloudlib.sns.main.b b1 = mainpage.a(3);
        x x1 = com.roidapp.cloudlib.sns.b.q.a(mainpage).c().b;
        if (b2 instanceof j)
        {
            mainpage.a(az.r).a(new d[] {
                ((com.roidapp.cloudlib.sns.main.b) (obj)).a(0, new com.roidapp.cloudlib.sns.notification.b())
            });
        }
        if (obj instanceof j)
        {
            Fragment fragment = mainpage.ak.a(1);
            if (fragment != null && (fragment instanceof com.roidapp.cloudlib.sns.d.f))
            {
                mainpage.ak.a(1, new com.roidapp.cloudlib.sns.d.a());
            }
            mainpage.a(az.r).a(new d[] {
                ((com.roidapp.cloudlib.sns.main.b) (obj)).a(1, new com.roidapp.cloudlib.sns.notification.b())
            });
        } else
        {
            mainpage.a(az.r).a(new d[] {
                ((com.roidapp.cloudlib.sns.main.b) (obj)).a(1, new com.roidapp.cloudlib.sns.d.a())
            });
        }
        if (b1 instanceof j)
        {
            if (((j)b1).d())
            {
                obj = mainpage.ak.a(3);
                if (obj != null && (obj instanceof j))
                {
                    mainpage.ak.a(3, com.roidapp.cloudlib.sns.h.h.a(x1.a, x1.b, x1.h));
                }
                mainpage.a(az.r).a(new d[] {
                    b1.a(3, new com.roidapp.cloudlib.sns.notification.b())
                });
            } else
            {
                mainpage.a(az.r).a(new d[] {
                    b1.a(3, com.roidapp.cloudlib.sns.h.h.a(x1.a, x1.b, x1.h))
                });
            }
        } else
        {
            mainpage.a(az.r).a(new d[] {
                b1.a(3, com.roidapp.cloudlib.sns.h.h.a(x1.a, x1.b, x1.h))
            });
        }
        if (mainpage.au)
        {
            mainpage.au = false;
            (new g(new com.roidapp.photogrid.ap(mainpage))).a(mainpage);
        } else
        {
            mainpage.j();
            if (flag)
            {
                com.roidapp.cloudlib.sns.h.a a1 = new com.roidapp.cloudlib.sns.h.a();
                a1.a();
                a1.a(new aq(mainpage));
                if (!com.roidapp.baselib.c.n.a(mainpage.getSupportFragmentManager(), a1, com/roidapp/cloudlib/sns/h/a.getSimpleName()))
                {
                    com.roidapp.photogrid.social.c.a(true, mainpage);
                    return;
                }
            }
        }
    }

    static boolean a(MainPage mainpage, String s1)
    {
        return mainpage.c(s1);
    }

    private Bitmap b(int i1)
    {
        int j1 = 1;
        if (i1 > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inScaled = false;
        BitmapFactory.decodeResource(getResources(), 0x7f02044e, options);
        if (options.outWidth == -1 || options.outHeight == -1) goto _L1; else goto _L3
_L3:
        Object obj;
        i1 = (int)(((float)options.outWidth * 1.0F) / (float)i1);
        if (i1 <= 0)
        {
            i1 = j1;
        }
        options.inSampleSize = i1;
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        try
        {
            obj = BitmapFactory.decodeResource(getResources(), 0x7f02044e, options);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            outofmemoryerror = null;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            exception = null;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        j1 = c(i1);
        if (j1 <= i1)
        {
            i1 = j1 * 2;
        } else
        {
            i1 = j1;
        }
        try
        {
            options.inSampleSize = i1;
            obj = BitmapFactory.decodeResource(getResources(), 0x7f02044e, options);
        }
        catch (OutOfMemoryError outofmemoryerror1)
        {
            outofmemoryerror1.printStackTrace();
            outofmemoryerror1 = null;
        }
        catch (Exception exception1)
        {
            exception1.printStackTrace();
            exception1 = null;
        }
        return ((Bitmap) (obj));
    }

    static void b(MainPage mainpage)
    {
        mainpage.L();
    }

    static void b(String s1)
    {
        File file = new File(s1);
        if (file.exists() && file.isDirectory())
        {
            String as1[] = file.list();
            if (as1 != null)
            {
                for (int i1 = 0; i1 < as1.length; i1++)
                {
                    File file1 = new File((new StringBuilder()).append(s1).append(File.separator).append(as1[i1]).toString());
                    if (file1.isFile())
                    {
                        file1.delete();
                    }
                }

            }
        }
    }

    private void b(boolean flag)
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("notification_is_click", flag).apply();
    }

    static boolean b(MainPage mainpage, boolean flag)
    {
        mainpage.au = flag;
        return flag;
    }

    private static int c(int i1)
    {
        int k1;
        if (i1 <= 8)
        {
            int j1 = 1;
            do
            {
                k1 = j1;
                if (j1 >= i1)
                {
                    break;
                }
                j1 <<= 1;
            } while (true);
        } else
        {
            k1 = ((i1 + 7) / 8) * 8;
        }
        return k1;
    }

    private void c(long l1)
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putLong("notification_fresh_time", l1).apply();
    }

    static boolean c(MainPage mainpage)
    {
        return mainpage.ar;
    }

    private boolean c(String s1)
    {
        File file = new File((new StringBuilder()).append(com.roidapp.photogrid.release.ap.a()).append("/Content").toString());
        if (file.exists())
        {
            if ((s1 = new File(file, s1)).exists())
            {
                try
                {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
                    builder.setTitle(0x7f070186);
                    builder.setMessage(0x7f070185);
                    builder.setPositiveButton(0x7f070184, new au(this, s1));
                    builder.setNegativeButton(0x7f070049, new av(this, s1));
                    s1 = builder.create();
                    s1.setCanceledOnTouchOutside(false);
                    s1.show();
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                }
                return true;
            }
        }
        return false;
    }

    private boolean c(boolean flag)
    {
label0:
        {
            if (!com.roidapp.cloudlib.sns.af.a(com.roidapp.baselib.c.aj.a()) && (at || com.roidapp.cloudlib.a.a.a(com.roidapp.baselib.c.aj.a()).a("event", "quickpic2015_3", false)) && (flag || !PreferenceManager.getDefaultSharedPreferences(com.roidapp.baselib.c.aj.a()).getBoolean("QPicShow", false)))
            {
                PreferenceManager.getDefaultSharedPreferences(com.roidapp.baselib.c.aj.a()).edit().putBoolean("QPicShow", true).apply();
                ax ax1 = new ax();
                if (com.roidapp.baselib.c.n.a(getSupportFragmentManager(), ax1, "QPicLogin"))
                {
                    break label0;
                }
                if (flag)
                {
                    av = true;
                }
            }
            return false;
        }
        return true;
    }

    private void d(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        a(i1, true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void d(String s1)
    {
        boolean flag = true;
        if (!p) goto _L2; else goto _L1
_L1:
        p = false;
        r = s1;
_L4:
        return;
_L2:
        if (!q || r == null) goto _L4; else goto _L3
_L3:
        int i1 = 0;
_L7:
        if (i1 >= 7)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (!(new String[] {
            "grid", "single", "video", "free", "hw", "template", "back"
        })[i1].equals(s1)) goto _L6; else goto _L5
_L5:
        i1 = ((flag) ? 1 : 0);
_L8:
        if (i1 != 0)
        {
            q = false;
            return;
        }
          goto _L4
_L6:
        i1++;
          goto _L7
        i1 = 0;
          goto _L8
    }

    static boolean d(MainPage mainpage)
    {
        mainpage.ar = false;
        return false;
    }

    static long e(MainPage mainpage)
    {
        return mainpage.as;
    }

    private void e(int i1)
    {
        if (com.roidapp.cloudlib.sns.af.a(this))
        {
            O();
            if (B != null && B.getVisibility() == 0)
            {
                B.setVisibility(8);
            }
            if (i1 != 0 && (aA instanceof com.roidapp.cloudlib.sns.notification.b))
            {
                ((com.roidapp.cloudlib.sns.notification.b)aA).a(i1, true);
            }
        }
    }

    static long f(MainPage mainpage)
    {
        mainpage.as = -1L;
        return -1L;
    }

    static al g(MainPage mainpage)
    {
        return mainpage.V;
    }

    static void h(MainPage mainpage)
    {
        if (!mainpage.c(false) && mainpage.T == null)
        {
            mainpage.T = new com.roidapp.photogrid.cloud.b.a(mainpage);
            mainpage.T.b();
        }
    }

    static RelativeLayout i(MainPage mainpage)
    {
        return mainpage.J;
    }

    static ImageView j(MainPage mainpage)
    {
        return mainpage.N;
    }

    static ImageView k(MainPage mainpage)
    {
        return mainpage.O;
    }

    static Bitmap l(MainPage mainpage)
    {
        return mainpage.H;
    }

    static Bitmap m(MainPage mainpage)
    {
        return mainpage.I;
    }

    static Bitmap n(MainPage mainpage)
    {
        mainpage.H = null;
        return null;
    }

    static Bitmap o(MainPage mainpage)
    {
        mainpage.I = null;
        return null;
    }

    static void p(MainPage mainpage)
    {
        mainpage.J();
    }

    static boolean q(MainPage mainpage)
    {
        return mainpage.n;
    }

    static void r(MainPage mainpage)
    {
        if (!com.roidapp.cloudlib.a.a.a(mainpage).a("update", "force_update", false)) goto _L2; else goto _L1
_L1:
        String s1;
        boolean flag;
        flag = com.roidapp.baselib.c.n.a(mainpage, com.roidapp.cloudlib.a.a.a(mainpage).a("update", "update_package"));
        s1 = com.roidapp.cloudlib.a.a.a(mainpage).a("update", "update_url");
        if (flag || s1 == null) goto _L2; else goto _L3
_L3:
        int i1;
        (new bo()).a(mainpage, s1);
        i1 = 1;
_L5:
        if (i1 == 0)
        {
            i1 = com.roidapp.baselib.c.n.c(mainpage);
            String s2 = com.roidapp.baselib.c.n.d(mainpage);
            int j1 = com.roidapp.cloudlib.a.a.a(mainpage).a("version3", "version_code", 0);
            String s3 = com.roidapp.cloudlib.a.a.a(mainpage).a("version3", "version_name");
            String s4 = (new StringBuilder()).append(s3).append("_show_update_tips").toString();
            if (PreferenceManager.getDefaultSharedPreferences(mainpage).getBoolean(s4, true) && i1 < j1 && s2 != null && !s2.equals(s3))
            {
                bq.a(mainpage.p(), mainpage).b();
            }
        }
        return;
_L2:
        i1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void s(MainPage mainpage)
    {
        mainpage.k = Executors.newSingleThreadExecutor();
        mainpage.k.execute(new am(mainpage));
    }

    static boolean t(MainPage mainpage)
    {
        return mainpage.au;
    }

    static boolean u(MainPage mainpage)
    {
        return mainpage.c(true);
    }

    static boolean v(MainPage mainpage)
    {
        mainpage.av = true;
        return true;
    }

    static void w(MainPage mainpage)
    {
        mainpage.d(2);
    }

    static com.roidapp.photogrid.a.d x(MainPage mainpage)
    {
        return mainpage.K;
    }

    static void y(MainPage mainpage)
    {
        if (com.roidapp.cloudlib.sns.af.a(mainpage))
        {
            Object obj = com.roidapp.cloudlib.sns.b.q.a(mainpage).c();
            x x1 = ((p) (obj)).b;
            obj = com.roidapp.cloudlib.sns.q.a(((p) (obj)).a, x1.a, new ab(mainpage));
            ((o) (obj)).l();
            ((o) (obj)).a(mainpage);
        }
    }

    static com.roidapp.cloudlib.sns.notification.p z(MainPage mainpage)
    {
        return mainpage.aw;
    }

    public final ViewPager a()
    {
        return X;
    }

    public final com.roidapp.cloudlib.sns.main.b a(int i1)
    {
        if (Z != null)
        {
            return Z.a(i1);
        } else
        {
            return null;
        }
    }

    public final void a(int i1, com.roidapp.cloudlib.sns.main.b b1)
    {
        if (Z != null)
        {
            Z.a(i1, b1);
        }
    }

    public final void a(long l1)
    {
        c(l1);
    }

    public final void a(Fragment fragment)
    {
        if (X != null && ak != null)
        {
            ak.b(X.getCurrentItem(), fragment);
        }
    }

    public final void a(View view)
    {
        if (view == null) goto _L2; else goto _L1
_L1:
        an.removeAllViews();
        an.addView(view);
_L4:
        l_();
        return;
_L2:
        if (an.getChildAt(0) != am)
        {
            an.removeAllViews();
            an.addView(am);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(ViewGroup viewgroup, ViewGroup viewgroup1)
    {
        if (!aB)
        {
            ViewGroup viewgroup2 = viewgroup;
            if (viewgroup == null)
            {
                viewgroup2 = (ViewGroup)findViewById(0x7f0d02b6);
            }
            if (viewgroup1 == null)
            {
                viewgroup = (ViewGroup)findViewById(0x7f0d02bb);
            } else
            {
                viewgroup = viewgroup1;
            }
            if (viewgroup2 != null && viewgroup != null)
            {
                viewgroup1 = viewgroup2.findViewById(0x7f0d02b7);
                View view = viewgroup2.findViewById(0x7f0d02b9);
                View view1 = viewgroup.findViewById(0x7f0d02bc);
                View view2 = viewgroup.findViewById(0x7f0d02be);
                if (view != null && view1 != null && view2 != null)
                {
                    android.view.ViewGroup.LayoutParams layoutparams = view1.getLayoutParams();
                    view1.setLayoutParams(view2.getLayoutParams());
                    viewgroup2.removeView(view);
                    viewgroup.removeView(view2);
                    viewgroup.addView(view, 0, layoutparams);
                    viewgroup = getSupportFragmentManager().findFragmentById(0x7f0d0394);
                    if (viewgroup != null && (viewgroup instanceof com.roidapp.photogrid.f))
                    {
                        ((com.roidapp.photogrid.f)viewgroup).f();
                    }
                    h.a(new View[] {
                        viewgroup1, view, view1, null
                    });
                    aB = true;
                    return;
                }
            }
        }
    }

    public final void a(com.roidapp.cloudlib.sns.g.e e1, Object obj)
    {
        if (com.roidapp.cloudlib.sns.g.e.e.equals(e1))
        {
            e1 = a(X.getCurrentItem());
            obj = e1.b(1);
            com.roidapp.cloudlib.sns.main.b b1 = e1.b(2);
            com.roidapp.cloudlib.sns.main.b b2 = e1.b(3);
            e1.a(new d[] {
                ((com.roidapp.cloudlib.sns.main.b) (obj)).a(1, new com.roidapp.cloudlib.sns.d.f(), false), b1.a(2, new com.roidapp.cloudlib.b.a(), false), b2.a(3, com.roidapp.cloudlib.sns.login.j.a("Myprofile_Login_Page"), false)
            });
            e1 = a(0);
            do
            {
                obj = e1;
                if (e1 instanceof com.roidapp.photogrid.k)
                {
                    break;
                }
                obj = ak.b(0);
                e1 = ((com.roidapp.cloudlib.sns.g.e) (obj));
                if (obj != null)
                {
                    continue;
                }
                obj = new com.roidapp.photogrid.k();
                break;
            } while (true);
            a(0, (com.roidapp.cloudlib.sns.main.b)obj);
            if (Z != null)
            {
                Z.notifyDataSetChanged();
            }
            a(0, false);
            B.setVisibility(8);
            if (ak != null)
            {
                ak.a();
            }
        }
    }

    final void a(String s1)
    {
        d("single");
        if (!rf.b())
        {
            com.roidapp.baselib.c.an.a(new WeakReference(this), getString(0x7f07028d));
            return;
        } else
        {
            G = true;
            az.H = true;
            bq.d();
            com.roidapp.baselib.c.b.d("MainPage", "MainPage/single");
            com.roidapp.photogrid.common.ag.a().b(this, "mainpage_single");
            com.roidapp.photogrid.common.b.a("MainPage/single");
            az.q = 5;
            ih.C().D();
            ih.C().a(new ig[] {
                new ig(s1)
            });
            ih.C().d((new File(s1)).getParent());
            s1 = new Intent();
            s1.setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
            startActivity(s1);
            finish();
            return;
        }
    }

    protected final void a(boolean flag)
    {
        if (flag)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(200L);
            alphaanimation.setAnimationListener(new com.roidapp.photogrid.ag(this));
            if (J != null)
            {
                J.startAnimation(alphaanimation);
            }
            return;
        }
        a = true;
        if (J != null)
        {
            J.setVisibility(8);
        }
        if (N != null)
        {
            N.setImageBitmap(null);
        }
        if (O != null)
        {
            O.setImageBitmap(null);
        }
        if (H != null && !H.isRecycled())
        {
            H.recycle();
        }
        if (I != null && !I.isRecycled())
        {
            I.recycle();
        }
        H = null;
        I = null;
    }

    public final View b()
    {
        return an;
    }

    public final void b(long l1)
    {
        ih.C().j("template");
        d("template");
        if (!rf.b())
        {
            com.roidapp.baselib.c.an.a(new WeakReference(this), getString(0x7f07028d));
            return;
        }
        G = true;
        bq.d();
        com.roidapp.baselib.c.b.d("MainPage", "MainPage/template");
        com.roidapp.photogrid.common.ag.a().b(this, "mainpage_template");
        com.roidapp.photogrid.common.b.a("MainPage/template");
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
        az.q = 4;
        az.x = true;
        Intent intent = new Intent();
        intent.putExtra("template_tip", getResources().getString(0x7f0702e4));
        if (!TextUtils.isEmpty(b))
        {
            intent.putExtra("fromEvent", b);
        }
        intent.setClass(this, com/roidapp/photogrid/cloud/TemplateSelectorActivity);
        if (l1 > 0L)
        {
            intent.putExtra("cmlTid", l1);
        }
        startActivity(intent);
        sharedpreferences.edit().putBoolean("template_enter", true).apply();
        finish();
    }

    public final void d()
    {
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Show/Profile");
        com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Create/Show/Profile", Long.valueOf(1L));
        N();
    }

    public final void f()
    {
        if (ab.getVisibility() == 8)
        {
            ab.setVisibility(0);
            al.clearAnimation();
            al.setVisibility(0);
        }
    }

    public final Fragment g()
    {
        if (X != null && ak != null)
        {
            return ak.b(X.getCurrentItem());
        } else
        {
            return null;
        }
    }

    public final void i()
    {
        ap = true;
        if (ax.getVisibility() != 0)
        {
            ax.setVisibility(0);
        }
    }

    public final void j()
    {
        ap = false;
        if (ax.getVisibility() != 8)
        {
            ax.setVisibility(8);
        }
    }

    public final boolean k()
    {
        return ap;
    }

    public final i l()
    {
        if (aq == null)
        {
            aq = new i(this, getWindow().getDecorView().getRootView());
        }
        return aq;
    }

    public final void l_()
    {
        if (ViewCompat.getY(an) != 0.0F)
        {
            ViewCompat.setTranslationY(an, 0.0F);
        }
    }

    public final void m()
    {
        com.roidapp.photogrid.social.a a1 = new com.roidapp.photogrid.social.a();
        a1.x();
        a(az.r).a(a1);
    }

    public final void m_()
    {
        if (ab.getVisibility() == 0)
        {
            ab.setVisibility(8);
            al.clearAnimation();
            al.setVisibility(8);
        }
    }

    public final int n()
    {
        return z;
    }

    public final boolean o()
    {
        return G;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 != 13273) goto _L2; else goto _L1
_L1:
        if (com.roidapp.cloudlib.sns.af.b() == 1)
        {
            com.roidapp.cloudlib.sns.af.c(com.roidapp.baselib.c.aj.a());
        }
        if (j1 == -1) goto _L4; else goto _L3
_L3:
        j();
        if (au)
        {
            au = false;
            c(true);
        }
_L6:
        return;
_L4:
        i();
        com.roidapp.cloudlib.sns.af.a(this, new com.roidapp.photogrid.an(this, intent));
        return;
_L2:
        if (i1 == 18742 && j1 == -1 && j != null && (new File(j)).exists())
        {
            com.roidapp.photogrid.b.f.a("FilterPage_View", "_Filter");
            intent = new ig(j);
            String s1 = ImageLibrary.a().a(this);
            ih.C().a(new ig[] {
                intent
            });
            ih.C().j(1);
            ih.C().d(s1);
            ih.C().i(0);
            ih.C().F();
            intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity);
            intent.putExtra("edit_image_index", 0);
            intent.putExtra("entry_from", 3);
            intent.putExtra("entry_type", 0);
            intent.putExtra("edit_suppot_filter", true);
            startActivity(intent);
            finish();
            ih.C().j("camera");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 10: default 96
    //                   2131558873: 410
    //                   2131559316: 357
    //                   2131559317: 269
    //                   2131559319: 96
    //                   2131559320: 129
    //                   2131559322: 164
    //                   2131559325: 199
    //                   2131559327: 234
    //                   2131559330: 391
    //                   2131559332: 97;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return;
_L10:
        d("setting");
        m.a();
        int i1 = g;
        g = i1 + 1;
        com.roidapp.photogrid.b.f.c("Settings", i1);
        return;
_L5:
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Tab/Home");
        com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Tab/Home", Long.valueOf(1L));
        d(0);
        return;
_L6:
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Tab/Feed");
        com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Tab/Feed", Long.valueOf(1L));
        d(1);
        return;
_L7:
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Tab/Notification");
        com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Tab/Notification", Long.valueOf(1L));
        d(2);
        return;
_L8:
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Tab/Profile");
        com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Tab/Profile", Long.valueOf(1L));
        d(3);
        return;
_L4:
        if (aw != null)
        {
            aw.a();
        }
        if (!az.s)
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Show/Fast");
            com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Create/Show/Fast", Long.valueOf(1L));
            N();
            return;
        } else
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Close/Fast");
            com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Create/Close/Fast", Long.valueOf(1L));
            y();
            return;
        }
_L3:
        com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Close/Layout");
        com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Create/Close/Layout", Long.valueOf(1L));
        y();
        return;
_L9:
        b(true);
        B.setVisibility(8);
        O();
        return;
_L2:
        if (X != null && Z != null && (view = Z.a(X.getCurrentItem())) != null)
        {
            view.i_();
            return;
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    public void onCreate(Bundle bundle)
    {
        com.roidapp.cloudlib.sns.af.a(this);
        super.onCreate(bundle);
        Thread.setDefaultUncaughtExceptionHandler(new bk(this));
        ak = new ai();
        try
        {
            setContentView(0x7f0300da);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (v) goto _L2; else goto _L1
_L1:
        com.roidapp.cloudlib.sns.g.b.a().a(com.roidapp.cloudlib.sns.g.e.e, this);
        W = true;
        getWindow().setFormat(1);
        ao = com.roidapp.baselib.c.n.a(this, "com.android.vending");
        if (ao)
        {
            boolean flag;
            if (com.roidapp.photogrid.a.m.b(this) == 1 || com.roidapp.photogrid.a.m.c(this) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
            K = new com.roidapp.photogrid.a.d(this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3hDBUTqCFEy0ee8FVgMli9SgoFAEwh6LplNMMRM3GMnUIZMapwISgCeyVeoX1d3idHCG3hSEd3t6ukuBvsiyTi3UYryPl9SvECTpaQLnyjJLxNdZB/a1h5Bwbk+4ugKWuKXMKTI8MpKmDD/wx1EexO7PntgM1Y28CFUeJD93C9qVRGQNKqjVdNm/jImEQeZcCEDXDw9j03psvXyE02Xj6HIcMBVvRbUynXWl8KtAY8fNHgGvb0JYRLnmz8ei14m6wqrXHPTpe5lZ4zHTEd7nsjTAUNfvdNqn2p662IWemg7h1Q34DaIZlVycqKy/URffwgNrixRKN3AY/Y2YD0O0GQIDAQAB");
            K.a(new ar(this));
        }
        getIntent().getIntExtra("gcm_page", 0);
        JVM INSTR tableswitch 1 3: default 176
    //                   1 670
    //                   2 677
    //                   3 685;
           goto _L3 _L4 _L5 _L6
_L3:
        as = getIntent().getLongExtra("cmlTid", -1L);
        P = getIntent().getBooleanExtra("isFromShareGallery", false);
        Q = getIntent().getBooleanExtra("isFilterFromShareGallery", false);
        R = getIntent().getBooleanExtra("isFromShareGalleryVideoNotReady", false);
        S = getIntent().getBooleanExtra("jump_from_sharepage", false);
        an = (FrameLayout)findViewById(0x7f0d01d9);
        am = getLayoutInflater().inflate(0x7f0300dc, an, false);
        an.addView(am);
        an.setOnClickListener(this);
        h.b(am);
        C = findViewById(0x7f0d03a2);
        C.setOnClickListener(this);
        B = (ImageView)findViewById(0x7f0d03a3);
        A = (ImageView)findViewById(0x7f0d03a5);
        ax = (RelativeLayout)findViewById(0x7f0d01ab);
        bundle = PreferenceManager.getDefaultSharedPreferences(this);
        y = false;
        com.roidapp.baselib.gl.c.a();
        flag = com.roidapp.baselib.gl.c.b(this);
        com.roidapp.baselib.gl.c.a().a(com.roidapp.cloudlib.a.a.a(getApplicationContext()).c("opengl", "gpu_white_list"));
        if (!flag)
        {
            z = f.b;
            y = false;
        } else
        {
            com.roidapp.baselib.gl.c.a();
            if (com.roidapp.baselib.gl.c.a(getApplicationContext()))
            {
                com.roidapp.baselib.gl.c.a();
                com.roidapp.baselib.gl.c.a(i, this, (ViewGroup)findViewById(0x1020002));
                z = com.roidapp.videolib.e.a().a(this, com.roidapp.cloudlib.a.a.a(this).c("video", "black_list"));
                if (z == f.b)
                {
                    y = false;
                } else
                if (z == f.a)
                {
                    y = true;
                }
            } else
            if (com.roidapp.baselib.gl.c.a().c(getApplicationContext()))
            {
                z = com.roidapp.videolib.e.a().a(this, com.roidapp.cloudlib.a.a.a(this).c("video", "black_list"));
                if (z == f.c)
                {
                    y = false;
                } else
                {
                    boolean flag1;
                    if (z == f.a)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    y = flag1;
                }
            } else
            {
                y = false;
                z = f.b;
            }
        }
        flag = bundle.getBoolean("show_new_premium", true);
        if (az.B)
        {
            flag = false;
        }
        if (flag)
        {
            A.setVisibility(0);
        }
        bundle = findViewById(0x7f0d03a4);
        bundle.setOnClickListener(this);
        bq.d();
        m = new com.roidapp.photogrid.ba(this, flag, bundle, new ac(this), p(), ao, com.roidapp.photogrid.a.m.b(this), com.roidapp.photogrid.a.m.c(this));
        if (!az.z) goto _L8; else goto _L7
_L7:
        az.z = false;
        J = (RelativeLayout)((ViewStub)findViewById(0x7f0d0397)).inflate();
        J.setOnClickListener(this);
        N = (ImageView)J.findViewById(0x7f0d0264);
        J.findViewById(0x7f0d0265);
        O = (ImageView)J.findViewById(0x7f0d0263);
        H = b(N.getLayoutParams().width);
        if (H != null) goto _L10; else goto _L9
_L9:
        a = true;
        G();
        L();
_L2:
        return;
_L4:
        az.y = 1;
        continue; /* Loop/switch isn't completed */
_L5:
        ar = true;
        continue; /* Loop/switch isn't completed */
_L6:
        at = true;
        continue; /* Loop/switch isn't completed */
_L10:
        N.setImageBitmap(H);
        J.setBackgroundResource(0x7f0c00cf);
        J.setVisibility(0);
        i.sendEmptyMessageDelayed(2, 500L);
        return;
_L8:
        if (P)
        {
            bundle = new android.app.AlertDialog.Builder(this);
            bundle.setTitle(0x7f07030f);
            bundle.setMessage(0x7f07018b).setPositiveButton(0x7f070310, new com.roidapp.photogrid.af(this)).setNegativeButton(0x7f07030e, new com.roidapp.photogrid.ae(this));
            bundle.create().show();
        }
        if (Q)
        {
            bundle = new android.app.AlertDialog.Builder(this);
            bundle.setTitle(0x7f07030f);
            bundle.setMessage("Sorry, Filter function is not available on your device for the limitation of hardware performance.").setPositiveButton(0x7f070310, new com.roidapp.photogrid.ai(this)).setNegativeButton(0x7f07030e, new ah(this));
            bundle.create().show();
        }
        a = true;
        L();
        if (as > 0L)
        {
            b(as);
            as = -1L;
            return;
        }
        i.sendEmptyMessageDelayed(10, 500L);
        return;
        if (true) goto _L3; else goto _L11
_L11:
    }

    public void onDestroy()
    {
        if (k != null)
        {
            k.shutdownNow();
        }
        bq.d();
        if (K != null)
        {
            K.a();
            K = null;
        }
        if (aq != null)
        {
            aq.c();
        }
        if (ay != null)
        {
            i.removeCallbacks(ay);
            ay = null;
        }
        super.onDestroy();
        com.roidapp.cloudlib.sns.b.k.a();
        if (L)
        {
            if (com.roidapp.photogrid.FacebookMessengerActivity.a(this))
            {
                com.roidapp.photogrid.FacebookMessengerActivity.a.setResult(0);
                com.roidapp.photogrid.FacebookMessengerActivity.a.finish();
            } else
            {
                Process.killProcess(Process.myPid());
            }
        }
        if (T != null)
        {
            T.a();
        }
        T = null;
        com.roidapp.cloudlib.sns.u.a().b();
        com.roidapp.cloudlib.sns.g.b.a().b();
        com.roidapp.baselib.c.ae.a(this);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 != 4)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        if (az.s)
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "Main/Create/Close/Back");
            com.roidapp.photogrid.common.af.b(this, "SNS", "click", "Main/Create/Close/Back", Long.valueOf(1L));
            y();
            return true;
        }
        if (Z != null)
        {
            keyevent = Z.a(X.getCurrentItem());
            if (X.getCurrentItem() == 2 && (keyevent instanceof com.roidapp.cloudlib.b.a) && ((com.roidapp.cloudlib.b.a)keyevent).d())
            {
                return true;
            }
            if (keyevent != null && keyevent.h_())
            {
                return true;
            }
            if (X != null && X.getCurrentItem() != 0)
            {
                d(0);
                return true;
            }
        }
        if (D != null)
        {
            D.setVisibility(8);
            D = null;
            return true;
        }
        d("back");
        long l1;
        long l2;
        l1 = System.currentTimeMillis();
        l2 = l;
        if (l1 - l2 >= 3000L) goto _L2; else goto _L1
_L1:
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("isRunning", false).apply();
        L = true;
        finish();
_L3:
        return true;
        keyevent;
        keyevent.printStackTrace();
        L = true;
        finish();
          goto _L3
        keyevent;
        keyevent.printStackTrace();
        ih.C().G();
        PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("isRunning", false).apply();
        com.roidapp.videolib.a.a.a();
        L = true;
        finish();
          goto _L3
        keyevent;
        L = true;
        finish();
        throw keyevent;
_L2:
        l = System.currentTimeMillis();
        Toast.makeText(this, 0x7f07014b, 0).show();
          goto _L3
        keyevent;
        keyevent.printStackTrace();
        L = true;
        finish();
          goto _L3
        keyevent;
        L = true;
        finish();
        throw keyevent;
        if (i1 == 82 && a && Z != null && X != null)
        {
            com.roidapp.cloudlib.sns.main.b b1 = Z.a(X.getCurrentItem());
            if (b1 != null && (b1 instanceof com.roidapp.photogrid.k))
            {
                m.a();
                return true;
            }
        }
        return super.onKeyDown(i1, keyevent);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (intent != null && intent.getBooleanExtra("snsPush", false))
        {
            if (az)
            {
                e(intent.getIntExtra("snsPid", 0));
            } else
            if (getIntent() != null)
            {
                getIntent().putExtra("snsPush", true);
                getIntent().putExtra("snsPid", intent.getLongExtra("snsPid", 0L));
                return;
            }
        }
    }

    public void onPageScrollStateChanged(int i1)
    {
    }

    public void onPageScrolled(int i1, float f1, int j1)
    {
    }

    public void onPageSelected(int i1)
    {
        az.r = i1;
        if (Z != null)
        {
            com.roidapp.cloudlib.sns.main.b b1 = Z.a(az.r);
            if (b1 != null)
            {
                b1.a(b1.a(this), b1);
                com.roidapp.cloudlib.sns.a.a.a(an, Integer.valueOf(b1.hashCode()));
            }
            if (i1 != 0)
            {
                com.roidapp.cloudlib.sns.main.b b2 = Z.a(0);
                if (b2 instanceof com.roidapp.photogrid.k)
                {
                    h.b((ViewGroup)b2.getView());
                }
            }
        }
    }

    public void onPause()
    {
        ih.C().G();
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle != null)
        {
            au = bundle.getBoolean("wqpel", au);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (a)
        {
            Object obj = a(az.r);
            Signature signature;
            MessageDigest messagedigest;
            int i1;
            int k1;
            if (S)
            {
                S = false;
                d(1);
            } else
            if (az.r != X.getCurrentItem())
            {
                int j1 = az.r;
                az.r = X.getCurrentItem();
                d(j1);
            } else
            if (obj != null && (obj instanceof com.roidapp.cloudlib.b.a))
            {
                ((com.roidapp.cloudlib.b.a)obj).c();
                ((com.roidapp.cloudlib.sns.main.b) (obj)).a(((com.roidapp.cloudlib.sns.main.b) (obj)).a(this), ((com.roidapp.cloudlib.sns.main.b) (obj)));
            }
            if (((com.roidapp.cloudlib.sns.main.b) (obj)).w())
            {
                f();
            } else
            {
                m_();
            }
        }
        if (W)
        {
            W = false;
        }
        if (az.s)
        {
            N();
        }
        obj = getPackageManager().getPackageInfo("com.facebook.samples.hellofacebook", 64).signatures;
        k1 = obj.length;
        i1 = 0;
_L2:
        if (i1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        signature = obj[i1];
        messagedigest = MessageDigest.getInstance("SHA");
        messagedigest.update(signature.toByteArray());
        Base64.encodeToString(messagedigest.digest(), 0);
        i1++;
        if (true) goto _L2; else goto _L1
        Object obj1;
        obj1;
_L1:
label0:
        {
            if (av)
            {
                av = false;
                if (TextUtils.isEmpty(PreferenceManager.getDefaultSharedPreferences(this).getString("QPicCode", null)))
                {
                    break label0;
                }
                com.roidapp.cloudlib.sns.d.a(getSupportFragmentManager(), "QPicCode");
            }
            return;
        }
        c(true);
        return;
        obj1;
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (bundle != null)
        {
            bundle.putBoolean("wqpel", au);
        }
    }

    public void onStart()
    {
        super.onStart();
        com.roidapp.photogrid.common.b.a("MainPage");
        com.roidapp.baselib.c.b.d("MainPage");
    }

    public void onStop()
    {
        super.onStop();
        com.roidapp.baselib.c.b.a("MainPage", A());
    }

    public final boolean p()
    {
        return getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false);
    }

    public final void q()
    {
        ih.C().j("single");
        d("single");
        if (!rf.b())
        {
            com.roidapp.baselib.c.an.a(new WeakReference(this), getString(0x7f07028d));
            return;
        } else
        {
            G = true;
            bq.d();
            com.roidapp.baselib.c.b.d("MainPage", "MainPage/single");
            com.roidapp.photogrid.common.ag.a().b(this, "mainpage_single");
            com.roidapp.photogrid.common.b.a("MainPage/single");
            az.q = 5;
            ih.C().D();
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/release/ImageSelector);
            startActivity(intent);
            finish();
            return;
        }
    }

    public final void r()
    {
        ih.C().j("grid");
        d("grid");
        if (!rf.b())
        {
            com.roidapp.baselib.c.an.a(new WeakReference(this), getString(0x7f07028d));
            return;
        } else
        {
            G = true;
            bq.d();
            com.roidapp.baselib.c.b.d("MainPage", "MainPage/releaseGrid");
            com.roidapp.photogrid.common.ag.a().b(this, "mainpage_grid");
            com.roidapp.photogrid.common.b.a("MainPage/releaseGrid");
            az.q = 0;
            ih.C().D();
            ih.C().h(true);
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/release/ImageSelector);
            startActivity(intent);
            finish();
            return;
        }
    }

    public final void s()
    {
        d("video");
        if (!com.roidapp.baselib.gl.c.a().c(getApplicationContext()))
        {
            y = false;
            z = f.b;
        }
        if (!y && z == f.c)
        {
            if (!rf.b())
            {
                com.roidapp.baselib.c.an.a(new WeakReference(this), getString(0x7f07028d));
                return;
            }
            com.roidapp.videolib.g g1 = com.roidapp.videolib.g.a(getApplicationContext());
            if (g1.a())
            {
                if (g1.b())
                {
                    I();
                    return;
                } else
                {
                    H();
                    return;
                }
            }
            if (!com.roidapp.baselib.gl.c.a().c(getApplicationContext()))
            {
                H();
                return;
            }
            g1.a(new ad(this));
            if (D == null)
            {
                D = findViewById(0x7f0d019e);
            }
            if (D != null && D.getVisibility() != 0)
            {
                TextView textview = (TextView)D.findViewById(0x7f0d01ac);
                if (textview != null)
                {
                    textview.setText(0x7f070306);
                }
                D.setVisibility(0);
            }
            com.roidapp.videolib.g.a(getApplicationContext()).c();
            return;
        }
        if (!y && z == f.b)
        {
            H();
            return;
        } else
        {
            M();
            return;
        }
    }

    public final void t()
    {
        com.roidapp.baselib.c.b.d("MainPage", "MainPage/Click/camera");
        com.roidapp.photogrid.b.f.a(com.roidapp.photogrid.b.g.g);
        int i1 = g;
        g = i1 + 1;
        com.roidapp.photogrid.b.f.c("Camera", i1);
        if (rf.b())
        {
            SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
            boolean flag = sharedpreferences.getBoolean("cameraFilterDarkCorner", false);
            com.roidapp.imagelib.a.h.a(this, sharedpreferences.getInt("cameraFilterGroupId", 0), sharedpreferences.getInt("cameraFilterFilterId", 7), flag, sharedpreferences.getBoolean("cameraFilterIsCloudFilter", false), sharedpreferences.getString("cameraFilterCloudFilterPkgName", ""));
            az.q = 7;
            com.roidapp.baselib.gl.c.a();
            if (!com.roidapp.baselib.gl.c.f(this))
            {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                Object obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(getString(0x7f07002e)).append("/").toString();
                File file = new File(((String) (obj)));
                if (!file.exists())
                {
                    file.mkdirs();
                }
                obj = new File(((String) (obj)), (new StringBuilder("camera_")).append(System.currentTimeMillis()).append(".jpg").toString());
                j = ((File) (obj)).getAbsolutePath();
                intent.putExtra("output", Uri.fromFile(((File) (obj))));
                try
                {
                    startActivityForResult(intent, 18742);
                    return;
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
                return;
            } else
            {
                Intent intent1 = new Intent(this, com/roidapp/photogrid/release/CameraPreviewActivity);
                Bundle bundle = new Bundle();
                bundle.putString("current_mode", "MainPage");
                intent1.putExtras(bundle);
                startActivity(intent1);
                finish();
                com.roidapp.photogrid.b.f.a("Selfie_Page", "_Selfie");
                return;
            }
        } else
        {
            com.roidapp.baselib.c.an.a(getApplicationContext(), getString(0x7f07028d));
            return;
        }
    }

    public final void u()
    {
        ih.C().j("hw");
        d("hw");
        if (!rf.b())
        {
            com.roidapp.baselib.c.an.a(new WeakReference(this), getString(0x7f07028d));
            return;
        } else
        {
            G = true;
            bq.d();
            com.roidapp.baselib.c.b.d("MainPage", "MainPage/high&wide");
            com.roidapp.photogrid.common.ag.a().b(this, "mainpage_highwide");
            com.roidapp.photogrid.common.b.a("MainPage/high&wide");
            az.q = 3;
            ih.C().D();
            ih.C().h(true);
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/release/ImageSelector);
            startActivity(intent);
            finish();
            return;
        }
    }

    public final void v()
    {
        ih.C().j("free");
        d("free");
        if (!rf.b())
        {
            com.roidapp.baselib.c.an.a(new WeakReference(this), getString(0x7f07028d));
            return;
        } else
        {
            G = true;
            bq.d();
            com.roidapp.baselib.c.b.d("MainPage", "MainPage/free");
            com.roidapp.photogrid.common.ag.a().b(this, "mainpage_free");
            com.roidapp.photogrid.common.b.a("MainPage/free");
            az.q = 1;
            az.C = false;
            ih.C().D();
            ih.C().h(true);
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/release/ImageSelector);
            startActivity(intent);
            finish();
            return;
        }
    }

    public final void w()
    {
        b(-1L);
    }

    public final void x()
    {
        t = "";
    }

    public final void y()
    {
        if (!az.s && M != null)
        {
            return;
        }
        az.s = false;
        al.setImageResource(0x7f0204d9);
        Object obj = getSupportFragmentManager();
        Fragment fragment = ((FragmentManager) (obj)).findFragmentById(0x7f0d0394);
        if (fragment != null)
        {
            ((FragmentManager) (obj)).beginTransaction().setCustomAnimations(0x7f040000, 0x7f040001, 0, 0).remove(fragment).commitAllowingStateLoss();
            Y.setBackgroundColor(0);
        }
        obj = new RotateAnimation(135F, 0.0F, 1, 0.5F, 1, 0.5F);
        ((RotateAnimation) (obj)).setDuration(100L);
        ((RotateAnimation) (obj)).setFillAfter(true);
        al.startAnimation(((Animation) (obj)));
        Y.setClickable(false);
    }

    public final boolean z()
    {
        return c;
    }

}
