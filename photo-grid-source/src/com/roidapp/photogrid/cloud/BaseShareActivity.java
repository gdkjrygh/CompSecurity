// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.print.PrintHelper;
import android.text.Html;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.messenger.MessengerUtils;
import com.facebook.messenger.ShareToMessengerParams;
import com.facebook.messenger.ShareToMessengerParamsBuilder;
import com.pinterest.pinit.PinIt;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.b.a;
import com.roidapp.cloudlib.template.b.c;
import com.roidapp.cloudlib.template.b.h;
import com.roidapp.cloudlib.template.c.i;
import com.roidapp.cloudlib.template.j;
import com.roidapp.cloudlib.upload.x;
import com.roidapp.imagelib.b.d;
import com.roidapp.photogrid.FacebookMessengerActivity;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.cloud.a.l;
import com.roidapp.photogrid.cloud.a.q;
import com.roidapp.photogrid.cloud.a.t;
import com.roidapp.photogrid.common.ae;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bd;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.filter.selfiecam.SelfieCamImageShowActivity;
import com.roidapp.photogrid.release.ImageEditor;
import com.roidapp.photogrid.release.ImageSelector;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.PhotoGridActivity;
import com.roidapp.photogrid.release.ap;
import com.roidapp.photogrid.release.ih;
import com.roidapp.photogrid.release.jj;
import com.roidapp.photogrid.release.rf;
import java.io.File;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            p, o, l, br, 
//            bf, m, r, PGShareActivity, 
//            k, e, g, ch, 
//            f, h, n, i, 
//            j

public class BaseShareActivity extends ParentActivity
    implements android.view.View.OnClickListener, a, t
{

    public static int a = 0;
    public static int b = 1;
    public static int c = 2;
    static final p d[] = {
        new p(0x7f02016a, "Line", "jp.naver.line.android"), new p(0x7f020195, "Wechat", "com.tencent.mm"), new p(0x7f020182, "Skype", "com.skype.raider"), new p(0x7f02018a, "Telegram", "org.telegram.messenger")
    };
    private String A;
    private boolean B;
    private int C[];
    private String D;
    private boolean E;
    private long F;
    private int G;
    private boolean H;
    private q I;
    private RelativeLayout J;
    private TextView K;
    private RelativeLayout L;
    private ListView M;
    private ch N;
    private x O;
    private c P;
    private TemplateInfo Q;
    View e;
    String f;
    String g;
    String h;
    String i;
    boolean j;
    int k;
    String l;
    String m;
    String n;
    int o;
    public boolean p;
    public boolean q;
    private o r;
    private ImageView s;
    private r y;
    private int z;

    public BaseShareActivity()
    {
        l = "";
        H = false;
        o = a;
    }

    public static int a(long l1, boolean flag)
    {
        if (!flag && l1 > 30000L)
        {
            return b;
        } else
        {
            return a;
        }
    }

    static RelativeLayout a(BaseShareActivity baseshareactivity)
    {
        return baseshareactivity.J;
    }

    static void a(BaseShareActivity baseshareactivity, TemplateInfo templateinfo)
    {
        while (templateinfo == null || com.roidapp.cloudlib.template.j.b(templateinfo.e()) || baseshareactivity.h() || com.roidapp.cloudlib.template.b.h.a(templateinfo.g())) 
        {
            return;
        }
        baseshareactivity.Q = templateinfo;
        baseshareactivity.getSharedPreferences("share", 0).edit().putLong("lastUnlockDialogTime", System.currentTimeMillis()).apply();
        baseshareactivity.P = new c(baseshareactivity);
        templateinfo = new i();
        templateinfo.a(baseshareactivity.Q);
        templateinfo.a(1);
        templateinfo.show(baseshareactivity.getSupportFragmentManager(), "unlockTemplate");
        af.c(aj.a(), "/Template/Unlock/Show/Share");
    }

    static void a(BaseShareActivity baseshareactivity, String s1, String s2)
    {
        baseshareactivity.a(s1, s2);
    }

    static void a(BaseShareActivity baseshareactivity, String s1, String s2, String s3)
    {
        baseshareactivity.a(s1, s2, s3);
    }

    private void a(String s1, String s2)
    {
        if (r.f() && !TextUtils.isEmpty(r.e()))
        {
            com.roidapp.photogrid.cloud.l l1 = new com.roidapp.photogrid.cloud.l();
            Bundle bundle = new Bundle();
            bundle.putString("path", s1);
            bundle.putString("mime", s2);
            l1.setArguments(bundle);
            com.roidapp.baselib.c.n.a(getSupportFragmentManager(), l1, com/roidapp/photogrid/cloud/l.getSimpleName());
            return;
        } else
        {
            a(s1, s2, r.e());
            return;
        }
    }

    private void a(String s1, String s2, String s3)
    {
        if (s1 == null)
        {
            an.a(this, 0x7f07022b);
            setResult(34816);
            finish();
            return;
        }
        af.b(this, (new StringBuilder()).append(l).append("Instagram").append(n).toString());
        if (az.q == 4)
        {
            com.roidapp.baselib.c.b.f("SendInstagram", com.roidapp.cloudlib.template.j.g());
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage("com.instagram.android");
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(s1)));
        intent.putExtra("android.intent.extra.TEXT", s3);
        intent.setType(s2);
        intent.setFlags(0x14000000);
        try
        {
            startActivityForResult(intent, 44241);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return;
        }
    }

    private void a(String s1, String s2, boolean flag)
    {
        if (TextUtils.isEmpty(s2) || TextUtils.isEmpty(s1))
        {
            return;
        }
        af.b(this, (new StringBuilder()).append(l).append(s1).append(n).toString());
        if (az.q == 4)
        {
            com.roidapp.baselib.c.b.f((new StringBuilder("Send")).append(s1).toString(), com.roidapp.cloudlib.template.j.g());
        }
        if (I != null)
        {
            I.a((new StringBuilder("share_")).append(s1).toString());
        }
        StringBuilder stringbuilder = new StringBuilder();
        Object obj;
        if (r.f())
        {
            obj = "Save/Share/";
        } else
        {
            obj = "Save/Save/";
        }
        com.roidapp.baselib.c.b.a("SNS", "share_click", stringbuilder.append(((String) (obj))).append(s1).toString());
        stringbuilder = new StringBuilder();
        if (r.f())
        {
            obj = "Save/Share/";
        } else
        {
            obj = "Save/Save/";
        }
        af.b(this, "SNS", "share_click", stringbuilder.append(((String) (obj))).append(s1).toString(), Long.valueOf(1L));
        obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).setPackage(s2);
        if (flag)
        {
            if (A == null)
            {
                s1 = "";
            } else
            {
                s1 = A;
            }
            ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", s1);
            ((Intent) (obj)).putExtra("android.intent.extra.TEXT", getString(0x7f0702be));
        }
        ((Intent) (obj)).putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(f)));
        ((Intent) (obj)).setType(h);
        ((Intent) (obj)).setFlags(0x4000000);
        try
        {
            startActivityForResult(((Intent) (obj)), 44241);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
    }

    static boolean a(Activity activity, int i1, String s1, int j1, String s2, String s3, String s4, String s5, 
            String s6, boolean flag, boolean flag1, int k1)
    {
        Intent intent = new Intent(activity, com/roidapp/photogrid/cloud/BaseShareActivity);
        intent.putExtra("image_path", s1);
        intent.putExtra("thumbPath", s3);
        intent.putExtra("format", j1);
        intent.putExtra("textTitle", s2);
        intent.putExtra("textContent", s4);
        intent.putExtra("mode", s5);
        intent.putExtra("gaParams", s6);
        intent.putExtra("isfromfilter", flag);
        intent.putExtra("isShare", flag1);
        intent.putExtra("share_restrict", k1);
        if (activity instanceof ImageEditor)
        {
            intent.putExtra("hideOptions", true);
        }
        activity.startActivityForResult(intent, i1);
        return true;
    }

    private boolean a(Intent intent)
    {
        if (v)
        {
            return false;
        }
        g = null;
        h = null;
        f = null;
        if (intent == null) goto _L2; else goto _L1
_L1:
        f = intent.getStringExtra("image_path");
        g = intent.getStringExtra("thumbPath");
        A = intent.getStringExtra("textTitle");
        i = intent.getStringExtra("textContent");
        B = intent.getBooleanExtra("hideOptions", false);
        z = intent.getIntExtra("format", 0);
        m = intent.getStringExtra("mode");
        n = intent.getStringExtra("gaParams");
        H = intent.getBooleanExtra("isfromfilter", false);
        boolean flag = intent.getBooleanExtra("isShare", false);
        Object obj;
        if (flag)
        {
            com.roidapp.cloudlib.sns.f.a.a().a("Share_Finish_Page", 1);
        } else
        {
            com.roidapp.cloudlib.sns.f.a.a().a("Save_Finish_Page", 1);
        }
        if (flag)
        {
            obj = new br(this);
        } else
        {
            obj = new bf(this);
        }
        r = ((o) (obj));
        if (n == null)
        {
            obj = "";
        } else
        {
            obj = "/".concat(n);
        }
        n = ((String) (obj));
        o = intent.getIntExtra("share_restrict", 0);
        j = false;
        z;
        JVM INSTR lookupswitch 2: default 232
    //                   1: 318
    //                   10: 328;
           goto _L3 _L4 _L5
_L3:
        h = "image/jpeg";
_L7:
        l = r.a(m);
_L2:
        return r != null && f != null && h != null;
_L4:
        h = "image/png";
        continue; /* Loop/switch isn't completed */
_L5:
        h = "video/mp4";
        j = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static o b(BaseShareActivity baseshareactivity)
    {
        return baseshareactivity.r;
    }

    static boolean c(BaseShareActivity baseshareactivity)
    {
        return baseshareactivity.E;
    }

    static ImageView d(BaseShareActivity baseshareactivity)
    {
        return baseshareactivity.s;
    }

    static q e(BaseShareActivity baseshareactivity)
    {
        return baseshareactivity.I;
    }

    static void f(BaseShareActivity baseshareactivity)
    {
        Object obj;
label0:
        {
label1:
            {
                if (baseshareactivity.C == null)
                {
                    baseshareactivity.C = com.roidapp.imagelib.b.d.a(baseshareactivity.f);
                }
                if (baseshareactivity.C != null && baseshareactivity.C.length >= 2)
                {
                    if (baseshareactivity.e != null)
                    {
                        baseshareactivity.e.setVisibility(0);
                    }
                    obj = ap.a(baseshareactivity);
                    File file = new File(((String) (obj)));
                    if (baseshareactivity.D != null && (new File((new StringBuilder()).append(((String) (obj))).append("/").append(baseshareactivity.D).toString())).exists())
                    {
                        break label0;
                    }
                    if (!file.exists() && !file.mkdirs() && android.os.Build.VERSION.SDK_INT == 19)
                    {
                        obj = new ae(baseshareactivity.getContentResolver(), file);
                        StringBuilder stringbuilder;
                        try
                        {
                            ((ae) (obj)).a();
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            ((Exception) (obj)).printStackTrace();
                            baseshareactivity.y.obtainMessage(52227, baseshareactivity.z, 0, baseshareactivity.f).sendToTarget();
                            return;
                        }
                    }
                    if (!file.exists())
                    {
                        break label1;
                    }
                    stringbuilder = (new StringBuilder("PhotoGrid_")).append(System.currentTimeMillis());
                    if (baseshareactivity.z == 1)
                    {
                        obj = ".png";
                    } else
                    {
                        obj = ".jpg";
                    }
                    baseshareactivity.D = stringbuilder.append(((String) (obj))).toString();
                    (new Thread(new m(baseshareactivity.y, baseshareactivity.f, file.getAbsolutePath(), baseshareactivity.D, baseshareactivity.C[0], baseshareactivity.C[1]))).start();
                }
                return;
            }
            baseshareactivity.y.obtainMessage(52227, baseshareactivity.z, 0, baseshareactivity.f).sendToTarget();
            return;
        }
        baseshareactivity.y.obtainMessage(52227, baseshareactivity.z, 0, (new StringBuilder()).append(((String) (obj))).append("/").append(baseshareactivity.D).toString()).sendToTarget();
    }

    private boolean n()
    {
        long l1 = System.currentTimeMillis();
        if (l1 - F < 1000L)
        {
            return true;
        } else
        {
            F = l1;
            return false;
        }
    }

    public final FragmentActivity a()
    {
        return this;
    }

    public final void a(int i1)
    {
        if (M != null)
        {
            M.smoothScrollBy(i1, 200);
        }
    }

    public final void a(TemplateInfo templateinfo)
    {
    }

    public final void a(com.roidapp.cloudlib.template.d d1)
    {
        setResult(34825);
        finish();
        bd.a(d1);
        com.roidapp.cloudlib.template.j.c();
        d1 = new Intent();
        d1.putExtra("isFromTemplate", true);
        getSharedPreferences("FaceClip", 0).edit().putBoolean("needFaceClip", false).apply();
        d1.setClass(this, com/roidapp/photogrid/release/ImageSelector);
        startActivity(d1);
    }

    public final void a(l l1)
    {
        boolean flag = true;
        if (l1 != null && !isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        l1.d();
        JVM INSTR lookupswitch 9: default 100
    //                   0: 101
    //                   1: 284
    //                   2: 506
    //                   3: 547
    //                   4: 623
    //                   5: 242
    //                   6: 641
    //                   8: 659
    //                   48338: 155;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L11:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (I != null && (l1 instanceof com.roidapp.photogrid.cloud.a.a))
        {
            I.a((new StringBuilder("adCard")).append(((com.roidapp.photogrid.cloud.a.a)l1).a + 1).toString(), ((com.roidapp.photogrid.cloud.a.a)l1).b);
            return;
        }
          goto _L1
_L12:
        if (com.roidapp.cloudlib.sns.af.a(this))
        {
            l1 = new Intent(this, com/roidapp/photogrid/cloud/PGShareActivity);
            l1.putExtra("image_path", f);
            l1.putExtra("mode_str", m);
            l1.putExtra("is_video", j);
            startActivityForResult(l1, 44243);
            return;
        }
        if (!q)
        {
            com.roidapp.cloudlib.sns.af.a(this, new k(this), "Save_Finish_Page");
            return;
        }
          goto _L1
_L9:
        if (I != null)
        {
            I.a("home");
        }
        az.s = false;
        com.roidapp.photogrid.b.f.a("MainPage_View", "Share_Home");
        setResult(34819);
        finish();
        return;
_L5:
        if (I == null) goto _L1; else goto _L13
_L13:
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("lastClickCardID", 1).apply();
        l1 = PreferenceManager.getDefaultSharedPreferences(this).edit();
        if (I.b)
        {
            flag = false;
        }
        l1.putBoolean("weiduoneIsFilter", flag).apply();
        l1 = new Intent();
        l1.putExtra("isUseRetouch", I.c);
        l1.putExtra("isUseFilter", I.b);
        setResult(34824, l1);
        finish();
        if (I == null) goto _L1; else goto _L14
_L14:
        if (az.q != 5)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (I.b)
        {
            I.a("Retouch");
        }
        if (I.c)
        {
            I.a("Filter");
        }
        if (I.b || I.c) goto _L1; else goto _L15
_L15:
        I.a("Filter");
        return;
        if (az.q != 0) goto _L1; else goto _L16
_L16:
        I.a("Template");
        return;
_L6:
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("lastClickCardID", 2).apply();
        if (I != null)
        {
            I.a("Sticker");
            return;
        }
          goto _L1
_L7:
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("lastClickCardID", 3).apply();
        l1 = new Intent();
        l1.putExtra("swich_mode", I.a);
        setResult(34823, l1);
        finish();
        if (I == null) goto _L1; else goto _L17
_L17:
        I.a("mode");
        return;
_L8:
        if (I == null) goto _L1; else goto _L18
_L18:
        I.a("CMBackup");
        return;
_L10:
        if (I == null) goto _L1; else goto _L19
_L19:
        I.a("followUS");
        return;
        if (I == null) goto _L1; else goto _L20
_L20:
        I.a("FBInvite");
        return;
    }

    public final void a(Object obj)
    {
    }

    public final void a(String s1)
    {
        J.setVisibility(0);
        K.setText(s1);
        J.postDelayed(new e(this), 3000L);
    }

    public final void a(String s1, int i1)
    {
        Object obj = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = ((FragmentManager) (obj)).findFragmentById(0x7f0d00d7);
        if (fragment == null || !(fragment instanceof x))
        {
            obj = ((FragmentManager) (obj)).beginTransaction();
            if (O == null)
            {
                O = new x();
            }
            O.a(i1);
            O.a(new g(this));
            ((FragmentTransaction) (obj)).setCustomAnimations(0x7f040000, 0x7f040001, 0, 0).replace(0x7f0d00d7, O, "search_fragment");
            ((FragmentTransaction) (obj)).commitAllowingStateLoss();
        } else
        {
            O = (x)fragment;
        }
        O.a(s1);
    }

    public final void a(List list)
    {
    }

    public final void a(boolean flag)
    {
        i i1;
label0:
        {
            if (!isFinishing() && Q != null)
            {
                i1 = (i)getSupportFragmentManager().findFragmentByTag("unlockTemplate");
                if (i1 != null)
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    i1.a();
                }
            }
            return;
        }
        i1.b();
    }

    public final ah b()
    {
        return P;
    }

    public final void b(int i1)
    {
        Object obj = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = ((FragmentManager) (obj)).findFragmentById(0x7f0d00d7);
        if (fragment == null || !(fragment instanceof ch))
        {
            obj = ((FragmentManager) (obj)).beginTransaction();
            if (N == null)
            {
                N = new ch();
            }
            N.a(i1);
            N.a(new com.roidapp.photogrid.cloud.f(this));
            ((FragmentTransaction) (obj)).setCustomAnimations(0x7f040000, 0x7f040001, 0, 0).replace(0x7f0d00d7, N, "tag_fragment");
            ((FragmentTransaction) (obj)).commitAllowingStateLoss();
            return;
        } else
        {
            N = (ch)fragment;
            return;
        }
    }

    public final void b(Object obj)
    {
    }

    public final void b(List list)
    {
    }

    public final void b(boolean flag)
    {
    }

    public final void c(Object obj)
    {
    }

    public final void c(List list)
    {
    }

    public final void d()
    {
    }

    public final void e()
    {
    }

    public final void f()
    {
    }

    public final void g()
    {
        if (P != null)
        {
            Message.obtain(P, 8985, Q).sendToTarget();
        }
    }

    public final int i()
    {
        View view = M.getChildAt(0);
        if (view == null)
        {
            return 0;
        } else
        {
            int i1 = M.getFirstVisiblePosition();
            int j1 = -view.getTop();
            return i1 * view.getHeight() + j1;
        }
    }

    public final boolean j()
    {
        if (r != null && (r instanceof br))
        {
            ((br)r).i();
        }
        FragmentManager fragmentmanager = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = fragmentmanager.findFragmentById(0x7f0d00d7);
        boolean flag;
        if (fragment != null && (fragment instanceof ch))
        {
            fragmentmanager.beginTransaction().remove(fragment).commitAllowingStateLoss();
            flag = true;
        } else
        {
            flag = false;
        }
        if (M != null && flag)
        {
            M.smoothScrollToPosition(0);
        }
        if (r != null && (r instanceof br))
        {
            ((br)r).l();
        }
        return flag;
    }

    public final boolean k()
    {
        if (r != null && (r instanceof br))
        {
            ((br)r).h();
        }
        FragmentManager fragmentmanager = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = fragmentmanager.findFragmentById(0x7f0d00d7);
        boolean flag;
        if (fragment != null && (fragment instanceof x))
        {
            fragmentmanager.beginTransaction().remove(fragment).commitAllowingStateLoss();
            flag = true;
        } else
        {
            flag = false;
        }
        if (M != null && flag)
        {
            M.smoothScrollToPosition(0);
        }
        return flag;
    }

    public final void l()
    {
        q = true;
        e.setVisibility(0);
    }

    public final void m()
    {
        q = false;
        e.setVisibility(8);
    }

    public final void n_()
    {
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        i1;
        JVM INSTR lookupswitch 5: default 60
    //                   13272: 72
    //                   13273: 246
    //                   44241: 73
    //                   44242: 215
    //                   44243: 271;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        r.a(i1, j1, intent);
_L8:
        return;
_L4:
        com.roidapp.photogrid.b.f.a("SharePage_View", "Share_BackShare");
        if (j1 == -1 && intent != null && f != null)
        {
            try
            {
                intent = intent.getStringExtra("shareEntry");
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent = null;
            }
            if (intent != null && intent.startsWith("com.roidapp"))
            {
                Intent intent1 = new Intent("android.intent.action.SEND");
                intent1.setClassName(getApplicationContext(), intent);
                intent1.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(f)));
                intent1.setType(h);
                intent1.setFlags(0x4000000);
                intent1.putExtra("shareToSelf", true);
                setResult(34822, intent1);
                finish();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        com.roidapp.photogrid.b.f.a("SharePage_View", "Share_BackShare");
        if (FacebookMessengerActivity.b)
        {
            setResult(34819);
            finish();
            FacebookMessengerActivity.b = false;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (j1 != -1)
        {
            m();
            return;
        } else
        {
            com.roidapp.cloudlib.sns.af.a(this, new com.roidapp.photogrid.cloud.h(this, intent));
            return;
        }
_L6:
        if (j1 == 34825)
        {
            setResult(34825);
            finish();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void onClick(View view)
    {
        if (!isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        if (view != null)
        {
            i1 = view.getId();
        } else
        {
            i1 = 0x80000000;
        }
        com.roidapp.photogrid.common.b.a((new StringBuilder("Share/")).append(i1).toString());
        i1;
        JVM INSTR lookupswitch 15: default 172
    //                   -8: 623
    //                   -7: 2626
    //                   -6: 2082
    //                   -5: 2375
    //                   -4: 1175
    //                   -3: 1493
    //                   -2: 1798
    //                   1: 2656
    //                   2131558440: 270
    //                   2131558561: 460
    //                   2131558562: 460
    //                   2131558564: 857
    //                   2131558566: 1175
    //                   2131558596: 857
    //                   2131558608: 365;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L13 _L14 _L8 _L14 _L15
_L11:
        continue; /* Loop/switch isn't completed */
_L3:
        if (i1 < 0 || i1 >= d.length) goto _L17; else goto _L16
_L16:
        if (n()) goto _L1; else goto _L18
_L18:
        w = false;
        a(d[i1].c, d[i1].d, true);
        view = d[i1].c;
_L19:
        if (view != null)
        {
            getSharedPreferences("share", 0).edit().putLong(view, System.currentTimeMillis()).apply();
            return;
        }
          goto _L1
_L12:
        view = getCallingActivity();
        if (view != null)
        {
            if (view.getClassName().equals(com/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity.getName()))
            {
                com.roidapp.photogrid.b.f.a("Preview_Page", "Share_Preview");
            } else
            if (view.getClassName().equals(com/roidapp/photogrid/release/PhotoGridActivity.getName()))
            {
                com.roidapp.photogrid.b.f.a("EditPage_View", "Share_Edit");
            }
        }
        setResult(34816);
        if (I != null)
        {
            I.a("Back");
        }
        finish();
        view = null;
          goto _L19
_L15:
        af.c(this, (new StringBuilder()).append(l).append("option").toString());
        w = false;
        setResult(34817);
        if (I != null)
        {
            q q1 = I;
            if (r != null && r.f())
            {
                view = "shareoption";
            } else
            {
                view = "saveoption";
            }
            q1.a(view);
        }
        finish();
        view = null;
          goto _L19
_L13:
        if (n()) goto _L1; else goto _L20
_L20:
        af.b(this, (new StringBuilder()).append(l).append("preview").toString());
        if (I != null)
        {
            I.a("preview");
        }
        if (!j)
        {
            view = new jj();
            view.a(f);
            view.setStyle(0, 2);
            com.roidapp.baselib.c.n.a(getSupportFragmentManager(), view, "ImagePreviewDialogFragment");
            return;
        }
        view = new Intent("android.intent.action.VIEW");
        view.setDataAndType(Uri.fromFile(new File(f)), h);
        View view1 = findViewById(0x7f0d00ce);
        if (view1 != null)
        {
            G = view1.getHeight();
        }
        startActivity(view);
        view = null;
          goto _L19
        view;
        view = null;
          goto _L19
_L4:
        af.b(this, (new StringBuilder()).append(l).append("Facebook Message").append(n).toString());
        if (az.q == 4)
        {
            com.roidapp.baselib.c.b.f("SendMessenger", com.roidapp.cloudlib.template.j.g());
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        com.roidapp.baselib.c.b.a("SNS", "share_click", stringbuilder.append(view).append("Facebook Message").toString());
        stringbuilder = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        af.b(this, "SNS", "share_click", stringbuilder.append(view).append("Facebook Message").toString(), Long.valueOf(1L));
        if (FacebookMessengerActivity.a(this))
        {
            FacebookMessengerActivity.a(f, h);
            setResult(34825);
            finish();
        } else
        {
            MessengerUtils.shareToMessenger(this, 44242, ShareToMessengerParams.newBuilder(Uri.fromFile(new File(f)), h).build());
        }
        view = "Messenger";
          goto _L19
_L14:
        if (n()) goto _L1; else goto _L21
_L21:
label0:
        {
            w = false;
            if (!com.roidapp.baselib.c.n.a(this, "com.instagram.android"))
            {
                break MISSING_BLOCK_LABEL_1163;
            }
            af.b(this, (new StringBuilder()).append(l).append("InstagramClick").append(n).toString());
            if (I != null)
            {
                I.a("share_Instagram");
            }
            StringBuilder stringbuilder1 = new StringBuilder();
            if (r.f())
            {
                view = "Save/Share/";
            } else
            {
                view = "Save/Save/";
            }
            com.roidapp.baselib.c.b.a("SNS", "share_click", stringbuilder1.append(view).append("Instagram").toString());
            stringbuilder1 = new StringBuilder();
            if (r.f())
            {
                view = "Save/Share/";
            } else
            {
                view = "Save/Save/";
            }
            af.b(this, "SNS", "share_click", stringbuilder1.append(view).append("Instagram").toString(), Long.valueOf(1L));
            if (!j)
            {
                if (C == null)
                {
                    C = com.roidapp.imagelib.b.d.a(f);
                }
                if (C != null && C.length >= 2 && C[0] == C[1])
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 == 0)
                {
                    break label0;
                }
            }
            a(f, h);
            view = null;
        }
          goto _L19
        com.roidapp.photogrid.common.b.a("FitInstagramDialog");
        com.roidapp.baselib.c.n.a(getSupportFragmentManager(), (new com.roidapp.photogrid.cloud.n()).a(this), "fit_instagram_dialog");
        view = null;
          goto _L19
        an.a(this, 0x7f0701f4);
        view = null;
          goto _L19
_L8:
        if (n()) goto _L1; else goto _L22
_L22:
        w = false;
        af.b(this, (new StringBuilder()).append(l).append("Other").append(n).toString());
        if (az.q == 4)
        {
            com.roidapp.baselib.c.b.f("SendOther", com.roidapp.cloudlib.template.j.g());
        }
        if (I != null)
        {
            I.a("share_Other");
        }
        Object obj = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        com.roidapp.baselib.c.b.a("SNS", "share_click", ((StringBuilder) (obj)).append(view).append("Other").toString());
        obj = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        af.b(this, "SNS", "share_click", ((StringBuilder) (obj)).append(view).append("Other").toString(), Long.valueOf(1L));
        obj = new Intent("android.intent.action.SEND");
        if (A == null)
        {
            view = "";
        } else
        {
            view = A;
        }
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", view);
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", getString(0x7f0702be));
        ((Intent) (obj)).putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(f)));
        ((Intent) (obj)).putExtra("pgMode", getCallingActivity().getClassName());
        ((Intent) (obj)).setType(h);
        ((Intent) (obj)).setFlags(0x4000000);
        startActivityForResult(((Intent) (obj)), 44241);
        view = null;
          goto _L19
        view;
        view = null;
          goto _L19
_L9:
        if (n()) goto _L1; else goto _L23
_L23:
        w = false;
        af.b(this, (new StringBuilder()).append(l).append("Email").append(n).toString());
        if (az.q == 4)
        {
            com.roidapp.baselib.c.b.f("SendEmail", com.roidapp.cloudlib.template.j.g());
        }
        if (I != null)
        {
            I.a("share_Email");
        }
        Object obj1 = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        com.roidapp.baselib.c.b.a("SNS", "share_click", ((StringBuilder) (obj1)).append(view).append("Email").toString());
        obj1 = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        af.b(this, "SNS", "share_click", ((StringBuilder) (obj1)).append(view).append("Email").toString(), Long.valueOf(1L));
        obj1 = new Intent("android.intent.action.SEND");
        ((Intent) (obj1)).setType("text/html");
        ((Intent) (obj1)).putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(f)));
        if (A == null)
        {
            view = "";
        } else
        {
            view = A;
        }
        ((Intent) (obj1)).putExtra("android.intent.extra.SUBJECT", view);
        ((Intent) (obj1)).putExtra("android.intent.extra.TEXT", Html.fromHtml(getString(0x7f0702bd)));
        ((Intent) (obj1)).setFlags(0x4000000);
        PinIt pinit;
        try
        {
            startActivityForResult(((Intent) (obj1)), 44241);
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        view = getString(0x7f070140);
          goto _L19
_L10:
        if (n()) goto _L1; else goto _L24
_L24:
        w = false;
        af.b(this, (new StringBuilder()).append(l).append("Goolge").append(n).toString());
        if (az.q == 4)
        {
            com.roidapp.baselib.c.b.f("SendGoogle", com.roidapp.cloudlib.template.j.g());
        }
        if (I != null)
        {
            I.a("share_Goolge");
        }
        obj1 = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        com.roidapp.baselib.c.b.a("SNS", "share_click", ((StringBuilder) (obj1)).append(view).append("Goolge").toString());
        obj1 = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        af.b(this, "SNS", "share_click", ((StringBuilder) (obj1)).append(view).append("Goolge").toString(), Long.valueOf(1L));
        view = new com.google.android.gms.plus.i(this);
        obj1 = r.e();
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            view.a(((CharSequence) (obj1)));
        }
        view.a(h);
        view.a(Uri.fromFile(new File(f)));
        view = view.a();
        if (view != null)
        {
            view.addFlags(0x10000000);
            try
            {
                startActivityForResult(view, 44241);
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
        }
        view = "Google+";
          goto _L19
_L6:
        if (n()) goto _L1; else goto _L25
_L25:
        w = false;
        af.b(this, (new StringBuilder()).append(l).append("Pinterest").append(n).toString());
        if (az.q == 4)
        {
            com.roidapp.baselib.c.b.f("SendPinterest", com.roidapp.cloudlib.template.j.g());
        }
        if (I != null)
        {
            I.a("share_Pinterest");
        }
        obj1 = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        com.roidapp.baselib.c.b.a("SNS", "share_click", ((StringBuilder) (obj1)).append(view).append("Pinterest").toString());
        obj1 = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        af.b(this, "SNS", "share_click", ((StringBuilder) (obj1)).append(view).append("Pinterest").toString(), Long.valueOf(1L));
        PinIt.setPartnerId("1434491");
        PinIt.setDebugMode(false);
        pinit = new PinIt();
        pinit.setImageUri(Uri.fromFile(new File(f)));
        obj1 = r.e();
        view = ((View) (obj1));
        if (obj1 == null)
        {
            view = getString(0x7f0702be);
        }
        pinit.setDescription(view);
        pinit.setListener(new com.roidapp.photogrid.cloud.i(this));
        pinit.setListener(new com.roidapp.photogrid.cloud.j(this));
        pinit.doPinIt(this);
        view = "Pinterest";
          goto _L19
_L7:
        if (n()) goto _L1; else goto _L26
_L26:
        w = false;
        af.b(this, (new StringBuilder()).append(l).append("Print").append(n).toString());
        if (az.q == 4)
        {
            com.roidapp.baselib.c.b.f("SendPrint", com.roidapp.cloudlib.template.j.g());
        }
        if (I != null)
        {
            I.a("share_Print");
        }
        obj1 = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        com.roidapp.baselib.c.b.a("SNS", "share_click", ((StringBuilder) (obj1)).append(view).append("Print").toString());
        obj1 = new StringBuilder();
        if (r.f())
        {
            view = "Save/Share/";
        } else
        {
            view = "Save/Save/";
        }
        af.b(this, "SNS", "share_click", ((StringBuilder) (obj1)).append(view).append("Print").toString(), Long.valueOf(1L));
        view = new File(f);
        if (!view.exists())
        {
            break MISSING_BLOCK_LABEL_2714;
        }
        obj1 = new PrintHelper(this);
        ((PrintHelper) (obj1)).setScaleMode(1);
        ((PrintHelper) (obj1)).printBitmap("PhotoGrid Share", Uri.fromFile(view));
        view = null;
          goto _L19
        view;
        view.printStackTrace();
        view = null;
          goto _L19
_L5:
        if (n()) goto _L1; else goto _L27
_L27:
        w = false;
        a("Whatsapp", "com.whatsapp", true);
        view = "Whatsapp";
          goto _L19
        if (n()) goto _L1; else goto _L28
_L28:
        w = false;
        a(d[i1].c, d[i1].d, false);
        view = d[i1].c;
          goto _L19
_L17:
        r.a(view);
        view = null;
          goto _L19
    }

    protected void onCreate(Bundle bundle)
    {
        int i1;
        boolean flag;
label0:
        {
            i1 = 2;
            flag = true;
            super.onCreate(bundle);
            try
            {
                setContentView(0x7f030024);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
                v = true;
                (new cc(this)).a();
            }
            if (!v)
            {
                if (a(getIntent()))
                {
                    break label0;
                }
                setResult(34816);
                finish();
            }
            return;
        }
        p = com.roidapp.cloudlib.sns.af.a(this);
        findViewById(0x7f0d0028).setOnClickListener(this);
        bundle = (TextView)findViewById(0x7f0d00d0);
        l al[];
        ListView listview;
        StringBuilder stringbuilder;
        boolean flag1;
        boolean flag2;
        if (B)
        {
            bundle.setText(null);
        } else
        {
            bundle.setText(r.d());
            findViewById(0x7f0d00d0).setOnClickListener(this);
        }
        e = findViewById(0x7f0d00d6);
        J = (RelativeLayout)findViewById(0x7f0d00d2);
        K = (TextView)findViewById(0x7f0d00d3);
        L = (RelativeLayout)findViewById(0x7f0d00d7);
        M = (ListView)findViewById(0x7f0d00d1);
        bundle = r.a(M);
        if (bundle != null)
        {
            M.addHeaderView(bundle);
        }
        if (az.q != 6)
        {
            flag = false;
        }
        flag1 = r.f();
        flag2 = H;
        al = r.b();
        listview = M;
        stringbuilder = (new StringBuilder()).append(l);
        if (r.f())
        {
            bundle = "Share/finish";
        } else
        {
            bundle = "Save/finish";
        }
        I = new q(this, flag, flag1, flag2, al, listview, stringbuilder.append(bundle).toString(), this);
        r.c();
        s = (ImageView)findViewById(0x7f0d00a1);
        if (s != null)
        {
            s.setOnClickListener(this);
            bundle = new AlphaAnimation(0.0F, 1.0F);
            bundle.setDuration(3000L);
            s.setAnimation(bundle);
            int l1 = s.getLayoutParams().width;
            if (l1 > 0)
            {
                k = l1;
            }
            if (j)
            {
                bundle = (TextView)findViewById(0x7f0d00b7);
                if (bundle != null)
                {
                    Object obj = new File(f);
                    int j1;
                    long l2;
                    if (((File) (obj)).exists())
                    {
                        l2 = ((File) (obj)).length();
                    } else
                    {
                        l2 = 0L;
                    }
                    bundle.setText(rf.a(l2));
                    bundle.setVisibility(0);
                }
                bundle = (ImageView)findViewById(0x7f0d00a2);
                bundle.setOnClickListener(this);
                obj = bundle.getLayoutParams();
                j1 = k;
                if (l1 < 100)
                {
                    i1 = 2;
                } else
                {
                    i1 = 3;
                }
                i1 = j1 / i1;
                obj.height = i1;
                obj.width = i1;
                bundle.setImageResource(0x7f0200fa);
                bundle.setVisibility(0);
            } else
            {
                bundle = (ImageView)findViewById(0x7f0d00a2);
                bundle.setOnClickListener(this);
                android.view.ViewGroup.LayoutParams layoutparams = bundle.getLayoutParams();
                int k1 = k;
                if (l1 >= 100)
                {
                    i1 = 3;
                }
                i1 = k1 / i1;
                layoutparams.height = i1;
                layoutparams.width = i1;
                bundle.setImageResource(0x7f0200dc);
                bundle.setVisibility(0);
            }
        }
        E = false;
        y = new r(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (r != null)
        {
            r.g();
        }
        if (P != null)
        {
            P.a();
            P = null;
        }
        Q = null;
        if (I != null)
        {
            I.b();
            I = null;
        }
        if (y != null)
        {
            y.a();
        }
        y = null;
        r = null;
        if (s != null)
        {
            s.setImageBitmap(null);
            s = null;
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 != 4) goto _L2; else goto _L1
_L1:
        if (!j()) goto _L4; else goto _L3
_L3:
        com.roidapp.baselib.c.b.a("SNS", "click", "back/closehashtags");
        af.b(this, "SNS", "click", "back/closehashtags", Long.valueOf(1L));
_L6:
        return false;
_L4:
        if (k()) goto _L6; else goto _L5
_L5:
        ComponentName componentname = getCallingActivity();
        if (componentname == null) goto _L8; else goto _L7
_L7:
        if (!componentname.getClassName().equals(com/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity.getName())) goto _L10; else goto _L9
_L9:
        com.roidapp.photogrid.b.f.a("Preview_Page", "Share_Preview");
_L8:
        setResult(34816);
        if (I != null)
        {
            I.a("Back");
        }
_L2:
        return super.onKeyDown(i1, keyevent);
_L10:
        if (componentname.getClassName().equals(com/roidapp/photogrid/release/PhotoGridActivity.getName()))
        {
            com.roidapp.photogrid.b.f.a("EditPage_View", "Share_Edit");
        }
        if (true) goto _L8; else goto _L11
_L11:
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (!v && !a(intent))
        {
            setResult(34816);
            finish();
        }
    }

    protected void onPause()
    {
        if (v)
        {
            super.onPause();
        } else
        {
            super.onPause();
            if (y != null)
            {
                y.removeMessages(52225);
                y.removeMessages(52226);
                return;
            }
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (r != null && !v)
        {
            if (ih.C().M() == null || ih.C().M() != null && az.q != 1 && ih.C().M().length == 0)
            {
                setResult(34816);
                finish();
                return;
            }
            if (TextUtils.isEmpty(f) || !(new File(f)).exists())
            {
                an.a(this, 0x7f07022b);
                setResult(34816);
                finish();
                return;
            }
            if (y != null && s != null && s.getVisibility() != 0)
            {
                Object obj1 = y;
                r r1 = y;
                int i1 = k;
                Object obj;
                if (g == null)
                {
                    obj = f;
                } else
                {
                    obj = g;
                }
                ((r) (obj1)).sendMessageDelayed(r1.obtainMessage(52225, i1, 0, obj), 500L);
            }
            if (G > 0)
            {
                obj = findViewById(0x7f0d00ce);
                if (obj != null)
                {
                    obj1 = ((View) (obj)).getLayoutParams();
                    if (obj1 != null)
                    {
                        obj1.height = G;
                        ((View) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                    }
                }
                G = 0;
            }
            r.a();
            if (I != null)
            {
                I.a();
                return;
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
    }

    protected void onStart()
    {
label0:
        {
            super.onStart();
            if (r != null)
            {
                if (!(r instanceof br))
                {
                    break label0;
                }
                com.roidapp.baselib.c.b.d("SaveFinishPage/Share");
            }
            return;
        }
        com.roidapp.baselib.c.b.d("SaveFinishPage/Save");
    }

    protected void onStop()
    {
label0:
        {
            super.onStop();
            if (r != null)
            {
                if (!(r instanceof br))
                {
                    break label0;
                }
                com.roidapp.baselib.c.b.a("SaveFinishPage/Share", A());
            }
            return;
        }
        com.roidapp.baselib.c.b.a("SaveFinishPage/Save", A());
    }

    public final void x()
    {
        t = "share";
    }

}
