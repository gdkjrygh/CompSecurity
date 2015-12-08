// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ads.s;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.a.e;
import com.roidapp.cloudlib.template.b.a;
import com.roidapp.cloudlib.template.b.c;
import com.roidapp.cloudlib.template.c.i;
import com.roidapp.cloudlib.template.j;
import com.roidapp.imagelib.b.d;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.bd;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.y;
import com.roidapp.photogrid.release.FaceDetectorActivity;
import com.roidapp.photogrid.release.ImageSelector;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.ih;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            ct, cr, cu, aa, 
//            ac, cs, cq

public class TemplateSelectorActivity extends ParentActivity
    implements a
{

    private al a;
    private RelativeLayout b;
    private ViewPager c;
    private cu d;
    private c e;
    private boolean f[];
    private boolean g;
    private boolean h;
    private ImageView i;
    private ImageButton j;
    private RelativeLayout k;
    private RelativeLayout l;
    private RelativeLayout m;
    private Uri n;
    private ct o;
    private Bundle p;
    private aa q;
    private aa r;
    private long s;

    public TemplateSelectorActivity()
    {
        f = new boolean[3];
        g = false;
        h = false;
        o = new ct(this, this);
        s = -1L;
    }

    static ViewPager a(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.c;
    }

    static void b(TemplateSelectorActivity templateselectoractivity)
    {
        templateselectoractivity.j();
    }

    private void c(boolean flag)
    {
        if (e != null)
        {
            e.a();
        }
        Intent intent = new Intent();
        intent.putExtra("isFromTemplate", true);
        if (flag)
        {
            getSharedPreferences("FaceClip", 0).edit().putBoolean("needFaceClip", true).apply();
        } else
        {
            getSharedPreferences("FaceClip", 0).edit().putBoolean("needFaceClip", false).apply();
        }
        com.roidapp.photogrid.b.f.a("CartPage_View", "Select_Cart");
        intent.setClass(this, com/roidapp/photogrid/release/ImageSelector);
        startActivity(intent);
        finish();
    }

    static boolean[] c(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.f;
    }

    static c d(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.e;
    }

    static cu e(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.d;
    }

    static al f(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.a;
    }

    static void g(TemplateSelectorActivity templateselectoractivity)
    {
        templateselectoractivity.c(true);
    }

    static void h(TemplateSelectorActivity templateselectoractivity)
    {
        if (!com.roidapp.imagelib.b.d.a())
        {
            an.c(new WeakReference(templateselectoractivity), templateselectoractivity.getString(0x7f07028d));
            return;
        }
        if (!com.roidapp.imagelib.b.d.b())
        {
            y.a(templateselectoractivity);
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        String s1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(templateselectoractivity.getString(0x7f07002e)).append("/").toString();
        File file = new File(s1);
        if (!file.exists())
        {
            file.mkdirs();
            templateselectoractivity.n = Uri.fromFile(new File(s1, ".camera.jpg"));
            templateselectoractivity.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", templateselectoractivity.n));
        } else
        {
            templateselectoractivity.n = Uri.fromFile(new File(s1, ".camera.jpg"));
        }
        try
        {
            intent.putExtra("output", templateselectoractivity.n);
            intent.putExtra("android.intent.extra.videoQuality", 0);
            templateselectoractivity.startActivityForResult(intent, 1002);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TemplateSelectorActivity templateselectoractivity)
        {
            templateselectoractivity.printStackTrace();
        }
    }

    static ImageView i(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.i;
    }

    static ImageButton j(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.j;
    }

    private void j()
    {
        if (e != null)
        {
            e.a();
        }
        com.roidapp.cloudlib.template.j.d();
        ih.C().a(null);
        az.x = false;
        startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
        finish();
        com.roidapp.photogrid.b.f.a("MainPage_View", "Select_Home");
    }

    static RelativeLayout k(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.k;
    }

    static RelativeLayout l(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.l;
    }

    static RelativeLayout m(TemplateSelectorActivity templateselectoractivity)
    {
        return templateselectoractivity.m;
    }

    public final FragmentActivity a()
    {
        return this;
    }

    public final void a(TemplateInfo templateinfo)
    {
        if (!h())
        {
            android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag("unlock_loading");
            if (fragment != null)
            {
                getSupportFragmentManager().beginTransaction().remove(fragment).commit();
            }
            if (com.roidapp.baselib.e.l.b(this) && templateinfo != null)
            {
                boolean flag = com.roidapp.cloudlib.ads.s.c();
                i i1 = new i();
                i1.a(templateinfo);
                i1.a(0);
                byte byte0;
                if (flag)
                {
                    byte0 = 10;
                } else
                {
                    byte0 = 30;
                }
                i1.b(byte0);
                i1.show(getSupportFragmentManager(), "TemplateUnlockDialog");
                if (!flag)
                {
                    com.roidapp.cloudlib.template.j.c(templateinfo.e());
                    n_();
                    return;
                }
            } else
            {
                com.roidapp.baselib.e.l.a(this);
                return;
            }
        }
    }

    public final void a(com.roidapp.cloudlib.template.d d1)
    {
        bd.a(d1);
        ih.C().a(null);
        if (d1.d)
        {
            Object obj = LayoutInflater.from(this).inflate(0x7f03002b, null);
            d1 = (TextView)((View) (obj)).findViewById(0x7f0d00eb);
            TextView textview = (TextView)((View) (obj)).findViewById(0x7f0d00ec);
            obj = new cr(this, (new android.app.AlertDialog.Builder(this)).setView(((View) (obj))).setTitle(getResources().getString(0x7f0702d8)).show());
            d1.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            textview.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            return;
        } else
        {
            c(false);
            return;
        }
    }

    public final void a(Object obj)
    {
        if (obj != null)
        {
            an.c(new WeakReference(this), obj.toString());
        }
    }

    public final void a(List list)
    {
        f[0] = true;
        i();
        if (d != null && com.roidapp.photogrid.cloud.cu.a(d).get(0) != null && list != null)
        {
            ((com.roidapp.cloudlib.template.c.f)com.roidapp.photogrid.cloud.cu.a(d).get(0)).b(8);
            e e1 = ((com.roidapp.cloudlib.template.c.f)com.roidapp.photogrid.cloud.cu.a(d).get(0)).c();
            if (e1 != null)
            {
                e1.a(list);
                e1.c();
                e1.a("Template_New_Card");
                if (q == null)
                {
                    q = new aa(this, 2);
                    for (int i1 = 0; i1 < 2; i1++)
                    {
                        q.a(this, new ac(), e1);
                    }

                }
            }
        }
    }

    public final void a(boolean flag)
    {
        i i1;
label0:
        {
            i1 = (i)getSupportFragmentManager().findFragmentByTag("TemplateUnlockDialog");
            if (i1 != null)
            {
                if (!flag)
                {
                    break label0;
                }
                i1.a();
            }
            return;
        }
        i1.b();
    }

    public final ah b()
    {
        return e;
    }

    public final void b(Object obj)
    {
        f[0] = true;
        i();
        a(obj);
        if (d != null && com.roidapp.photogrid.cloud.cu.a(d).get(0) != null)
        {
            ((com.roidapp.cloudlib.template.c.f)com.roidapp.photogrid.cloud.cu.a(d).get(0)).b(0);
        }
    }

    public final void b(List list)
    {
        int i1;
        i1 = 0;
        f[1] = true;
        i();
        if (d == null) goto _L2; else goto _L1
_L1:
        com.roidapp.cloudlib.template.c.f f1 = (com.roidapp.cloudlib.template.c.f)com.roidapp.photogrid.cloud.cu.a(d).get(1);
        if (f1 == null || list == null) goto _L2; else goto _L3
_L3:
        e e1;
        f1.b(8);
        e1 = f1.c();
        if (e1 == null) goto _L2; else goto _L4
_L4:
        e1.a(list);
        e1.c();
        int k1;
        int l1;
        if (com.roidapp.baselib.c.n.a() && com.roidapp.photogrid.a.m.a(aj.a()) != 1 && com.roidapp.cloudlib.a.a.a(aj.a()).a("ad", "cmlEnable", false))
        {
            if (q == null)
            {
                q = new aa(this, 1);
            }
            com.roidapp.cloudlib.ads.j j1 = new com.roidapp.cloudlib.ads.j();
            j1.a("Template_CML_Card");
            j1.a(q);
            k1 = e1.a(j1);
        } else
        {
            k1 = -1;
        }
        if (s == -1L) goto _L2; else goto _L5
_L5:
        list = list.iterator();
_L11:
        if (!list.hasNext()) goto _L7; else goto _L6
_L6:
        if (((TemplateInfo)list.next()).e() != s) goto _L9; else goto _L8
_L8:
        l1 = i1;
        if (k1 >= 0)
        {
            l1 = i1;
            if (i1 >= k1)
            {
                l1 = i1;
                if (i1 != 5)
                {
                    l1 = i1 + 1;
                }
            }
        }
        f1.c(l1);
_L7:
        s = -1L;
_L2:
        return;
_L9:
        i1++;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void b(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!h()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        (new cs(this)).show(getSupportFragmentManager(), "unlock_loading");
        return;
_L2:
        if (b != null && !b.isShown())
        {
            b.setVisibility(0);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void c(Object obj)
    {
        f[1] = true;
        i();
        a(obj);
        if (d != null && com.roidapp.photogrid.cloud.cu.a(d).get(1) != null)
        {
            ((com.roidapp.cloudlib.template.c.f)com.roidapp.photogrid.cloud.cu.a(d).get(1)).b(0);
        }
    }

    public final void c(List list)
    {
    }

    public final void d()
    {
        c.setCurrentItem(0);
    }

    public final void e()
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("TEMPLATE_PERSONAL_TAB", 0).commit();
        d.b(com.roidapp.cloudlib.template.c.f.a(2));
        com.roidapp.photogrid.b.f.a("Template_Personal_Local", 4, 0);
    }

    public final void f()
    {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("TEMPLATE_PERSONAL_TAB", 1).commit();
        d.b(com.roidapp.cloudlib.template.c.f.a(3));
        com.roidapp.photogrid.b.f.a("Template_Personal_Favourite", 4, 0);
    }

    public final void g()
    {
        f[2] = true;
        i();
        n_();
    }

    public final void i()
    {
        if (b != null && f[c.getCurrentItem()])
        {
            b.setVisibility(8);
        } else
        if (b != null && !f[c.getCurrentItem()])
        {
            b.setVisibility(0);
            return;
        }
    }

    public final void n_()
    {
        if (d != null)
        {
            Iterator iterator = com.roidapp.photogrid.cloud.cu.a(d).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                e e1 = ((com.roidapp.cloudlib.template.c.f)iterator.next()).c();
                if (e1 != null)
                {
                    e1.c();
                }
            } while (true);
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (j1 != -1)
        {
            return;
        }
        i1;
        JVM INSTR tableswitch 1002 1002: default 24
    //                   1002 32;
           goto _L1 _L2
_L1:
        super.onActivityResult(i1, j1, intent);
        return;
_L2:
        if (n == null && p.getString("PATH") != null)
        {
            n = Uri.parse(p.getString("PATH"));
        }
        if (n == null)
        {
            Toast.makeText(getBaseContext(), getResources().getString(0x7f070210), 0).show();
            return;
        }
        Intent intent1 = new Intent(this, com/roidapp/photogrid/release/FaceDetectorActivity);
        intent1.putExtra("path", n.getPath());
        intent1.putExtra("entryFrom", 0);
        intent1.putExtra("entryType", 0);
        startActivity(intent1);
        finish();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!com.roidapp.photogrid.common.an.b(bundle)) goto _L2; else goto _L1
_L1:
        j();
_L9:
        return;
_L2:
        try
        {
            setContentView(0x7f03002c);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            h = true;
            (new cc(this)).a();
        }
        if (h) goto _L4; else goto _L3
_L3:
        e = new c(this);
        e.sendEmptyMessage(8976);
        e.sendEmptyMessage(8978);
        c = (ViewPager)findViewById(0x7f0d00f4);
        b = (RelativeLayout)findViewById(0x7f0d040d);
        i = (ImageView)findViewById(0x7f0d00f2);
        k = (RelativeLayout)findViewById(0x7f0d00f3);
        l = (RelativeLayout)findViewById(0x7f0d00ee);
        m = (RelativeLayout)findViewById(0x7f0d00f0);
        j = (ImageButton)findViewById(0x7f0d008c);
        if (getIntent() != null)
        {
            s = getIntent().getLongExtra("cmlTid", -1L);
        }
        d = new cu(this);
        c.setAdapter(d);
        c.setOffscreenPageLimit(2);
        bundle = PreferenceManager.getDefaultSharedPreferences(this);
        if (bundle.getBoolean("template_new", false) || bundle.getBoolean("TEMPLATE_STUFF_NEW", true))
        {
            i.setVisibility(0);
        }
        d.a(com.roidapp.cloudlib.template.c.f.a(0));
        d.a(com.roidapp.cloudlib.template.c.f.a(1));
        int i1;
        if (bundle.getInt("TEMPLATE_PERSONAL_TAB", 0) == 0)
        {
            d.a(com.roidapp.cloudlib.template.c.f.a(2));
        } else
        if (bundle.getInt("TEMPLATE_PERSONAL_TAB", 0) == 1)
        {
            d.a(com.roidapp.cloudlib.template.c.f.a(3));
        }
        bundle = new cq(this);
        k.setOnClickListener(bundle);
        l.setOnClickListener(bundle);
        m.setOnClickListener(bundle);
        j.setOnClickListener(bundle);
        findViewById(0x7f0d00e8).setOnClickListener(bundle);
        if (s == -1L)
        {
            i1 = PreferenceManager.getDefaultSharedPreferences(this).getInt("TEMPLATE_TAB", 0);
        } else
        {
            i1 = 1;
        }
        c.setCurrentItem(i1);
        i1;
        JVM INSTR tableswitch 0 2: default 416
    //                   0 586
    //                   1 575
    //                   2 597;
           goto _L5 _L6 _L7 _L8
_L5:
        com.roidapp.baselib.gl.c.a();
        if (com.roidapp.baselib.gl.c.b(this))
        {
            if (TextUtils.isEmpty(com.roidapp.baselib.gl.c.a().d(this)))
            {
                com.roidapp.photogrid.common.b.a("TemplateSelectorActivity/testGPU");
                com.roidapp.baselib.gl.c.a();
                com.roidapp.baselib.gl.c.a(o, this, (ViewGroup)findViewById(0x1020002));
            } else
            {
                com.roidapp.baselib.gl.c.a();
                if (com.roidapp.baselib.gl.c.b(this))
                {
                    com.roidapp.baselib.gl.c.a().a(true);
                } else
                {
                    com.roidapp.baselib.gl.c.a().a(false);
                }
            }
        } else
        {
            com.roidapp.baselib.gl.c.a().a(false);
        }
        if (getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false))
        {
            a = new al(this, o);
            a.b();
            ba.a().b();
            return;
        }
_L4:
        if (true) goto _L9; else goto _L7
_L7:
        m.setSelected(true);
          goto _L5
_L6:
        l.setSelected(true);
          goto _L5
_L8:
        k.setSelected(true);
          goto _L5
    }

    public void onDestroy()
    {
        if (c != null)
        {
            PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("TEMPLATE_TAB", c.getCurrentItem()).apply();
            c.removeAllViews();
            c.setAdapter(null);
        }
        if (e != null)
        {
            e.a();
        }
        if (q != null)
        {
            q.a();
        }
        if (r != null)
        {
            r.a();
        }
        d = null;
        r = null;
        q = null;
        com.roidapp.cloudlib.template.j.c();
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (g && i1 == 4 && keyevent.getRepeatCount() == 0)
        {
            j();
        }
        return true;
    }

    public void onPause()
    {
        if (!h())
        {
            android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag("unlock_loading");
            if (fragment != null)
            {
                getSupportFragmentManager().beginTransaction().remove(fragment).commit();
            }
        }
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        p = bundle;
    }

    protected void onResume()
    {
        g = true;
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        if (n != null)
        {
            bundle.putString("PATH", n.toString());
        }
        super.onSaveInstanceState(bundle);
        com.roidapp.photogrid.common.an.a(bundle);
    }

    protected void onStart()
    {
        com.roidapp.baselib.c.b.d("TemplateSellectorActivity");
        super.onStart();
    }

    public final void x()
    {
        t = "template";
    }
}
