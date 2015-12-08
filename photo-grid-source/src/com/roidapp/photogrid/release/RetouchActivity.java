// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.gl.c;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.imagelib.filter.groupinfo.b;
import com.roidapp.imagelib.retouch.a;
import com.roidapp.imagelib.retouch.l;
import com.roidapp.imagelib.retouch.m;
import com.roidapp.imagelib.retouch.t;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.y;
import java.io.IOException;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, qu, PhotoGridActivity, ih, 
//            ig, qs

public class RetouchActivity extends ParentActivity
    implements android.view.View.OnClickListener, t
{

    protected int a;
    protected int b;
    private final int c = 1026;
    private m d;
    private a e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private RelativeLayout j;
    private int k;
    private String l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private String q;
    private String r;
    private Handler s;

    public RetouchActivity()
    {
        a = -1;
        b = -1;
        n = 0;
        o = 0;
        p = false;
        s = new qu(this, (byte)0);
    }

    static RelativeLayout a(RetouchActivity retouchactivity)
    {
        return retouchactivity.j;
    }

    private void a(int i1, String s1)
    {
        if (h())
        {
            return;
        }
        ((TextView)j.findViewById(0x7f0d01ac)).setText(0x7f0701a0);
        j.setVisibility(0);
        if (i1 == 1)
        {
            if (getSupportFragmentManager().findFragmentByTag("blemish") == null)
            {
                e = new a();
                Bundle bundle = new Bundle();
                bundle.putString("image_path", s1);
                l = s1;
                e.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().setCustomAnimations(0x10a0000, 0, 0, 0).replace(0x7f0d005e, e, "blemish").commit();
            } else
            {
                e = (a)getSupportFragmentManager().findFragmentByTag("blemish");
            }
            g.setVisibility(0);
            f.setVisibility(0);
        } else
        {
            if (getSupportFragmentManager().findFragmentByTag("skin") == null)
            {
                Bundle bundle1;
                boolean flag;
                if (d != null)
                {
                    flag = d.a();
                } else
                {
                    flag = false;
                }
                d = new m();
                bundle1 = new Bundle();
                bundle1.putBoolean("auto_retouch", flag);
                bundle1.putString("image_path", s1);
                bundle1.putInt("smoother_bar", n);
                bundle1.putInt("whiten_bar", o);
                d.setArguments(bundle1);
                getSupportFragmentManager().beginTransaction().replace(0x7f0d005e, d, "skin").commit();
            } else
            {
                d = (m)getSupportFragmentManager().findFragmentByTag("skin");
            }
            g.setVisibility(8);
            f.setVisibility(8);
        }
        k = i1;
    }

    private void a(boolean flag, Drawable drawable, TextView textview)
    {
        drawable.setAlpha(255);
        if (!flag)
        {
            drawable.setAlpha(50);
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
        int i1;
        if (flag)
        {
            i1 = getResources().getColor(0x7f0c00bf);
        } else
        {
            i1 = getResources().getColor(0x7f0c00c0);
        }
        textview.setTextColor(i1);
        textview.setEnabled(flag);
    }

    static void b(RetouchActivity retouchactivity)
    {
        retouchactivity.d();
    }

    private void d()
    {
        if (isFinishing())
        {
            return;
        }
        if (k == 1)
        {
            a(2, l);
            return;
        }
        if (u != null)
        {
            u.removeAllViews();
        }
        Intent intent = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
        intent.putExtra("isRetouch", true);
        startActivity(intent);
        finish();
    }

    public final void a()
    {
        j.setVisibility(0);
        p = true;
    }

    public final void a(int i1)
    {
        n = i1;
    }

    public final void a(Uri uri)
    {
        if (k == 1)
        {
            a(2, uri.getPath());
            k = 2;
            j.setVisibility(8);
        } else
        if (uri != null)
        {
            ig aig[] = ih.C().M();
            if (aig != null && aig.length > 0)
            {
                ig ig1 = aig[m];
                String s1 = uri.getPath();
                com.roidapp.imagelib.b.b b1;
                int i1;
                if (!TextUtils.isEmpty(ig1.c))
                {
                    ig1.c = s1;
                } else
                {
                    ig1.a = s1;
                }
                if (ig1.j == null)
                {
                    b1 = aa.a().e();
                    uri = aa.a().d();
                    i1 = aa.a().b();
                } else
                {
                    b1 = ig1.i;
                    uri = ig1.j;
                    i1 = ig1.l;
                }
                if (com.roidapp.imagelib.filter.groupinfo.b.a(uri) || b1 != null && b1.a())
                {
                    com.roidapp.baselib.gl.c.a();
                    if (com.roidapp.baselib.gl.c.b(this))
                    {
                        (new Thread(new qs(this, uri, b1, i1, s1, ig1))).start();
                        return;
                    }
                }
            }
            j.setVisibility(8);
            d();
            return;
        }
    }

    public final void a(String s1)
    {
        a(1, s1);
    }

    public final void a(Throwable throwable, String s1)
    {
        j.setVisibility(8);
        if (!java/lang/OutOfMemoryError.isInstance(throwable)) goto _L2; else goto _L1
_L1:
        Toast.makeText(this, 0x7f07020f, 1).show();
_L4:
        d();
        return;
_L2:
        if (java/io/IOException.isInstance(throwable))
        {
            throwable = (new StringBuilder()).append(throwable.getMessage()).toString();
            if (throwable != null)
            {
                if (throwable.equals("702"))
                {
                    y.a(this);
                } else
                if (throwable.equals("700"))
                {
                    y.a(this, s1);
                } else
                if (throwable.equals("701"))
                {
                    y.b(this, s1);
                } else
                if (throwable.equals("703"))
                {
                    Toast.makeText(this, getString(0x7f07028d), 1).show();
                } else
                {
                    Toast.makeText(this, throwable, 1).show();
                }
            }
        } else
        if (throwable != null)
        {
            Toast.makeText(this, (new StringBuilder()).append(throwable.getMessage()).toString(), 1).show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        j.setVisibility(8);
        p = false;
    }

    public final void b(int i1)
    {
        o = i1;
    }

    public final String c()
    {
        return "RetouchPage";
    }

    public void onClick(View view)
    {
        if (!p) goto _L2; else goto _L1
_L1:
        return;
_L2:
        view.getId();
        JVM INSTR tableswitch 2131559073 2131559076: default 44
    //                   2131559073 45
    //                   2131559074 449
    //                   2131559075 376
    //                   2131559076 50;
           goto _L3 _L4 _L5 _L6 _L7
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        d();
        return;
_L7:
        String s1;
        p = true;
        if (r != null && r.length() > 0)
        {
            af.c(this, r);
        }
        ((TextView)j.findViewById(0x7f0d01ac)).setText(0x7f07028a);
        s1 = ih.C().M()[m].n;
        j.setVisibility(0);
        if (k != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (e == null || !e.e() || !com.roidapp.imagelib.retouch.l.f().e()) goto _L1; else goto _L8
_L8:
        com.roidapp.photogrid.b.f.a("SingleRetouch", "SingleBlemish_Apply", 0, s1.hashCode());
        return;
        if (d == null || !d.b()) goto _L1; else goto _L9
_L9:
        Object obj;
        if (!TextUtils.isEmpty(q))
        {
            af.c(this, q.concat("/Retouch/applyRetouchBtn"));
        }
        obj = "";
        l l1 = com.roidapp.imagelib.retouch.l.f();
        boolean flag = l1.a();
        if (flag)
        {
            com.roidapp.photogrid.b.f.a("SingleRetouch", "SingleAutoRetouch_Apply", 0, s1.hashCode());
        }
        if (l1.c())
        {
            view = "/Smoother";
            obj = view;
            if (!flag)
            {
                com.roidapp.photogrid.b.f.a("SingleRetouch", "SingleSmoother_Apply", 0, s1.hashCode());
                obj = view;
            }
        }
        view = ((View) (obj));
        if (l1.d())
        {
            obj = ((String) (obj)).concat("/Whiten");
            view = ((View) (obj));
            if (!flag)
            {
                com.roidapp.photogrid.b.f.a("SingleRetouch", "SingleWhiten_Apply", 0, s1.hashCode());
                view = ((View) (obj));
            }
        }
        obj = view;
        if (l1.e())
        {
            obj = view.concat("/Blemishes");
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.isEmpty(q)) goto _L1; else goto _L10
_L10:
        af.c(this, q.concat("/Retouch/apply/HasRetouch".concat(((String) (obj)))));
        return;
_L6:
        if (k != 1 || e == null) goto _L1; else goto _L11
_L11:
        e.b();
        a(e.c(), getResources().getDrawable(0x7f020411), f);
        a(e.d(), getResources().getDrawable(0x7f0203dd), g);
        return;
        if (k != 1 || e == null) goto _L1; else goto _L12
_L12:
        e.a();
        a(e.c(), getResources().getDrawable(0x7f020411), f);
        a(e.d(), getResources().getDrawable(0x7f0203dd), g);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (an.b(bundle))
        {
            bundle = getSupportFragmentManager().findFragmentByTag("skin");
            if (bundle != null)
            {
                getSupportFragmentManager().beginTransaction().remove(bundle).commitAllowingStateLoss();
            }
            bundle = getSupportFragmentManager().findFragmentByTag("blemish");
            if (bundle != null)
            {
                getSupportFragmentManager().beginTransaction().remove(bundle).commitAllowingStateLoss();
            }
            com.roidapp.photogrid.common.c.a("360", this);
            Log.w("RetouchActivity", "The process has been killed, return to home.");
            return;
        }
        com.roidapp.photogrid.common.b.a("RetouchAct/onCreate");
        af.d(this, "ImageEdit/Retouch");
        try
        {
            setContentView(0x7f03010b);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (v)
        {
            break MISSING_BLOCK_LABEL_388;
        }
        q = getIntent().getStringExtra("modeStr");
        getIntent().getIntExtra("entry_ga_tag", 0);
        JVM INSTR tableswitch 4 6: default 168
    //                   4 238
    //                   5 168
    //                   6 248;
           goto _L1 _L2 _L1 _L3
_L1:
        bundle = ih.C().M();
        if (bundle == null || bundle.length == 0)
        {
            Log.e("RetouchActivity", "selectImages is null, go to main page.");
            startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
            finish();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        r = "/Save/finish/save/retouch";
        continue; /* Loop/switch isn't completed */
_L3:
        r = "/share/finish/save/retouch";
        if (true) goto _L1; else goto _L4
_L4:
        m = getIntent().getIntExtra("edit_image_index", 0);
        if (m == -1)
        {
            com.roidapp.photogrid.common.c.a("360", this);
            return;
        }
        l = bundle[m].e();
        bundle = getSupportFragmentManager().beginTransaction();
        Bundle bundle1 = new Bundle();
        bundle1.putString("image_path", l);
        bundle1.putString("modeStr", q);
        if (getSupportFragmentManager().findFragmentByTag("skin") == null)
        {
            d = new m();
            d.setArguments(bundle1);
            bundle.add(0x7f0d005e, d, "skin");
            bundle.commitAllowingStateLoss();
        } else
        {
            d = (m)getSupportFragmentManager().findFragmentByTag("skin");
        }
        i = (TextView)findViewById(0x7f0d02a4);
        i.setOnClickListener(this);
        h = (TextView)findViewById(0x7f0d02a1);
        h.setOnClickListener(this);
        g = (TextView)findViewById(0x7f0d02a3);
        g.setOnClickListener(this);
        f = (TextView)findViewById(0x7f0d02a2);
        f.setOnClickListener(this);
        g.setVisibility(8);
        f.setVisibility(8);
        j = (RelativeLayout)findViewById(0x7f0d040d);
        return;
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            d();
        }
        return true;
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onStart()
    {
        super.onStart();
        com.roidapp.baselib.c.b.d("RetouchPage");
    }

    protected void onStop()
    {
        super.onStop();
        com.roidapp.baselib.c.b.a("RetouchPage", A());
    }

    public final void q_()
    {
        if (k == 1 && e != null)
        {
            a(e.c(), getResources().getDrawable(0x7f020411), f);
            a(e.d(), getResources().getDrawable(0x7f0203dd), g);
        }
    }

    public final void x()
    {
        t = "retouch";
    }
}
