// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ads.s;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.common.e;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.b.a;
import com.roidapp.cloudlib.template.b.c;
import com.roidapp.cloudlib.template.c.i;
import com.roidapp.cloudlib.template.d;
import com.roidapp.cloudlib.template.j;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.bd;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ImageSelector;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.PhotoGridActivity;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            FlickrSelectorActivity, FbPhotoSelectorActivity, DropBoxSelectorActivity, GoogleSearchSelectorActivity, 
//            InstagramSelectorActivity, co, aa, ac, 
//            cn, cp

public class TemplateChangeActivity extends ParentActivity
    implements a
{

    private c a;
    private com.roidapp.cloudlib.template.c.f b;
    private ImageButton c;
    private RelativeLayout d;
    private al e;
    private aa f;
    private int g;
    private boolean h;
    private boolean i;

    public TemplateChangeActivity()
    {
        a = new c(this);
        h = false;
        i = false;
    }

    private void a(int k)
    {
        Message message = Message.obtain();
        message.arg1 = ih.C().N();
        message.what = k;
        a.sendMessage(message);
        h = true;
    }

    static void a(TemplateChangeActivity templatechangeactivity)
    {
        templatechangeactivity.i();
    }

    static boolean b(TemplateChangeActivity templatechangeactivity)
    {
        return templatechangeactivity.h;
    }

    static c c(TemplateChangeActivity templatechangeactivity)
    {
        return templatechangeactivity.a;
    }

    static com.roidapp.cloudlib.template.c.f d(TemplateChangeActivity templatechangeactivity)
    {
        return templatechangeactivity.b;
    }

    static void e(TemplateChangeActivity templatechangeactivity)
    {
        templatechangeactivity.a(9010);
    }

    static int f(TemplateChangeActivity templatechangeactivity)
    {
        return templatechangeactivity.g;
    }

    static boolean g(TemplateChangeActivity templatechangeactivity)
    {
        return templatechangeactivity.i;
    }

    static void h(TemplateChangeActivity templatechangeactivity)
    {
        templatechangeactivity.j();
    }

    static al i(TemplateChangeActivity templatechangeactivity)
    {
        return templatechangeactivity.e;
    }

    private void i()
    {
        a.a();
        Intent intent = new Intent();
        intent.putExtra("return_template_choose", i);
        intent.setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
        startActivity(intent);
        finish();
        com.roidapp.photogrid.b.f.a("EditPage_View", "LayoutTemplateSelect_Back_Edit");
    }

    private void j()
    {
        ig aig[];
        i = false;
        aig = ih.C().M();
        if (az.q != 4)
        {
            ih.C().a(null);
        }
        Intent intent = new Intent();
        if (com.roidapp.cloudlib.common.a.z(this) == 0)
        {
            intent.setClass(this, com/roidapp/photogrid/release/ImageSelector);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 3)
        {
            intent.setClass(this, com/roidapp/photogrid/cloud/FlickrSelectorActivity);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 1)
        {
            intent.setClass(this, com/roidapp/photogrid/cloud/FbPhotoSelectorActivity);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 5)
        {
            intent.setClass(this, com/roidapp/photogrid/cloud/DropBoxSelectorActivity);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 4)
        {
            intent.setClass(this, com/roidapp/photogrid/cloud/GoogleSearchSelectorActivity);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 2)
        {
            intent.setClass(this, com/roidapp/photogrid/cloud/InstagramSelectorActivity);
        }
        az.q;
        JVM INSTR tableswitch 4 5: default 76
    //                   4 216
    //                   5 76;
           goto _L1 _L2 _L1
_L1:
        ih.C().ak();
        intent.putExtra("firstCreate", true);
        intent.putExtra("folder_path", ih.C().L());
        startActivity(intent);
        finish();
        com.roidapp.photogrid.b.f.a("CartPage_View", "LayoutTemplateSelect_Cart");
        return;
_L2:
        if (!ih.C().h() && aig != null)
        {
            ih.C().h(false);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final FragmentActivity a()
    {
        return this;
    }

    public final void a(TemplateInfo templateinfo)
    {
        if (!h())
        {
            Fragment fragment = getSupportFragmentManager().findFragmentByTag("unlock_loading");
            if (fragment != null)
            {
                getSupportFragmentManager().beginTransaction().remove(fragment).commit();
            }
            if (l.b(this) && templateinfo != null)
            {
                boolean flag = s.c();
                i k = new i();
                k.a(templateinfo);
                k.a(0);
                byte byte0;
                if (flag)
                {
                    byte0 = 10;
                } else
                {
                    byte0 = 30;
                }
                k.b(byte0);
                k.show(getSupportFragmentManager(), "TemplateUnlockDialog");
                if (!flag)
                {
                    com.roidapp.cloudlib.template.j.c(templateinfo.e());
                    n_();
                    return;
                }
            } else
            {
                l.a(this);
                return;
            }
        }
    }

    public final void a(d d1)
    {
        bd.a(d1);
        ig aig[] = ih.C().M();
        if (aig != null && aig.length > d1.c)
        {
            ig aig1[] = new ig[d1.c];
            System.arraycopy(aig, 0, aig1, 0, d1.c);
            ih.C().a(aig1);
        }
        i = true;
        a.a();
        com.roidapp.cloudlib.template.j.c();
        ih.C().e(true);
        d1 = new Intent();
        d1.putExtra("return_template_choose", i);
        d1.setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
        startActivity(d1);
        finish();
        com.roidapp.photogrid.b.f.a("EditPage_View", "LayoutTemplateSelect_Change_Edit");
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
    }

    public final void a(boolean flag)
    {
        i k;
label0:
        {
            k = (i)getSupportFragmentManager().findFragmentByTag("TemplateUnlockDialog");
            if (k != null)
            {
                if (!flag)
                {
                    break label0;
                }
                k.a();
            }
            return;
        }
        k.b();
    }

    public final ah b()
    {
        return a;
    }

    public final void b(Object obj)
    {
        h = false;
        if (d != null && d.isShown())
        {
            d.setVisibility(8);
        }
        b.b(0);
        a(obj);
    }

    public final void b(List list)
    {
    }

    public final void b(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!h()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        (new co(this)).show(getSupportFragmentManager(), "unlock_loading");
        return;
_L2:
        if (d != null && !d.isShown())
        {
            d.setVisibility(0);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final void c(Object obj)
    {
    }

    public final void c(List list)
    {
        int k;
        k = 0;
        h = false;
        if (d != null && d.isShown())
        {
            d.setVisibility(8);
        }
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        b.b(0);
_L4:
        return;
_L2:
        b.b(8);
        b.c().a(list);
        list = b.c();
        if (list == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (g)
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_174;
_L5:
        list.c();
        if (f == null)
        {
            f = new aa(this, 2);
            while (k < 2) 
            {
                f.a(this, new ac(), list);
                k++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        list.a("Template_Switch_Card");
          goto _L5
        list.a("Template_Layout_Card");
          goto _L5
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
    }

    public final void n_()
    {
        b.c().c();
    }

    public void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (fragment instanceof com.roidapp.cloudlib.template.c.f)
        {
            b = (com.roidapp.cloudlib.template.c.f)fragment;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        int k;
        k = 15;
        super.onCreate(bundle);
        try
        {
            setContentView(0x7f03002a);
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
        bundle = getSupportFragmentManager();
        Fragment fragment = bundle.findFragmentById(0x7f0d00ea);
        if (fragment == null)
        {
            bundle.beginTransaction().add(0x7f0d00ea, com.roidapp.cloudlib.template.c.f.a(1)).commitAllowingStateLoss();
        } else
        {
            bundle.beginTransaction().attach(fragment).commitAllowingStateLoss();
        }
        bundle = getIntent();
        g = bundle.getIntExtra("infoc_tag", 0);
        i = bundle.getBooleanExtra("return_template_choose", false);
        d = (RelativeLayout)findViewById(0x7f0d040d);
        c = (ImageButton)findViewById(0x7f0d008c);
        a(9008);
        g;
        JVM INSTR tableswitch 1 2: default 148
    //                   1 318
    //                   2 329;
           goto _L3 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_329;
_L6:
        bundle = new cn(this);
        c.setOnClickListener(bundle);
        findViewById(0x7f0d00e8).setOnClickListener(bundle);
        int i1 = ih.C().N();
        if (i1 <= 15)
        {
            k = i1;
        }
        ((TextView)findViewById(0x7f0d00e9)).setText(String.format(getString(0x7f0702e0), new Object[] {
            Integer.valueOf(k)
        }));
        if (getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false))
        {
            e = new al(this, new cp(this));
            e.b();
            ba.a().b();
        }
_L2:
        return;
_L4:
        com.roidapp.photogrid.b.f.a("Template_Switch_Page", 1, 0);
          goto _L6
        com.roidapp.photogrid.b.f.a("Template_Layout_Page", 1, 0);
          goto _L6
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (f != null)
        {
            f.a();
            f = null;
        }
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        if (k == 4 && keyevent.getRepeatCount() == 0)
        {
            if (i)
            {
                j();
            } else
            {
                i();
            }
        }
        return true;
    }

    protected void onStart()
    {
        super.onStart();
    }

    public final void x()
    {
        t = "template";
    }
}
