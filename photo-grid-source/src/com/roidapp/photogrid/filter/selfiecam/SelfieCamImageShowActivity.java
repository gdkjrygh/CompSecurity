// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.an;
import com.roidapp.imagelib.a.h;
import com.roidapp.imagelib.filter.aq;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.photogrid.FacebookMessengerActivity;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.y;
import com.roidapp.photogrid.release.CameraPreviewActivity;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.PhotoGridActivity;
import com.roidapp.photogrid.release.ap;
import com.roidapp.photogrid.release.hw;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            l, k, o, f, 
//            b, a, j, g, 
//            i, h, m

public class SelfieCamImageShowActivity extends ParentActivity
    implements android.view.View.OnClickListener
{

    protected RelativeLayout a;
    protected String b;
    protected boolean c;
    private String d;
    private boolean e;
    private int f;
    private ig g[];
    private ImageView h;
    private o i;
    private int j;
    private int k;
    private Handler l;
    private boolean m;
    private String n;

    public SelfieCamImageShowActivity()
    {
        c = false;
        l = new l(this, (byte)0);
    }

    static ImageView a(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        return selfiecamimageshowactivity.h;
    }

    private void a()
    {
        startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
        finish();
    }

    static void a(SelfieCamImageShowActivity selfiecamimageshowactivity, Throwable throwable, String s)
    {
        selfiecamimageshowactivity.l.post(new k(selfiecamimageshowactivity, throwable, s));
    }

    static void a(SelfieCamImageShowActivity selfiecamimageshowactivity, boolean flag, aq aq)
    {
        selfiecamimageshowactivity.a(flag, aq);
    }

    private void a(boolean flag, aq aq)
    {
        a.setVisibility(0);
        e = flag;
        String s = "/Save/Save/Click";
        if (flag)
        {
            s = "/Share/Save/Click";
        }
        Object obj1 = s;
        if (b != null)
        {
            obj1 = b.concat(s);
        }
        af.c(this, ((String) (obj1)));
        TextUtils.isEmpty(n);
        obj1 = g[f].k;
        if (obj1 != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            StringBuilder stringbuilder1 = stringbuilder.append(b);
            Object obj;
            if (flag)
            {
                obj = "/Share/Save/Filter/";
            } else
            {
                obj = "/Save/Save/Filter/";
            }
            stringbuilder1.append(((String) (obj))).append(((IFilterInfo) (obj1)).b());
            af.c(this, stringbuilder.toString());
        }
        obj = Message.obtain(l, 1022, 0, 0);
        obj.obj = aq;
        l.sendMessage(((Message) (obj)));
    }

    private void a(boolean flag, boolean flag1)
    {
        i = new o(this, new com.roidapp.photogrid.filter.selfiecam.f(this, flag), g(), flag, flag1);
        i.show();
    }

    static String b(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        return selfiecamimageshowactivity.d;
    }

    private void b()
    {
        com.roidapp.photogrid.b.f.a("Edit_Photo", "Preview_Edit");
        az.q = 10;
        if (g[0].o != null)
        {
            g[0].n = g[0].o;
        }
        Object obj = ih.C();
        ((ih) (obj)).D();
        ((ih) (obj)).k(2);
        ((ih) (obj)).b(g);
        ((ih) (obj)).e(false);
        ((ih) (obj)).e(0.0F);
        ((ih) (obj)).c(-2);
        ig ig1 = g[f];
        az.F = false;
        ig1.m = false;
        ig1.h = 0;
        ig1.B = false;
        ((ih) (obj)).a(new ig[] {
            ig1
        });
        obj = new Intent();
        ((Intent) (obj)).setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
        startActivity(((Intent) (obj)));
        finish();
    }

    static boolean c(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        return selfiecamimageshowactivity.m;
    }

    private void d()
    {
        int i1;
        int j1;
        j1 = hw.c(this);
        i1 = j1;
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        if (!m) goto _L4; else goto _L3
_L3:
        Integer ainteger[];
        Object obj;
        int ai[];
        int k1;
        if (getResources().getDisplayMetrics().widthPixels >= 1080)
        {
            i1 = 1920;
        } else
        {
            i1 = 720;
        }
_L2:
        ai = g();
        obj = null;
        k1 = ai.length;
        j1 = 0;
_L6:
        ainteger = obj;
        if (j1 >= k1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ai[j1] == i1)
        {
            ai = Arrays.copyOfRange(ai, 0, j1 + 1);
            int l1 = ai.length;
            Integer ainteger1[] = new Integer[l1];
            j1 = 0;
            do
            {
                ainteger = ainteger1;
                if (j1 >= l1)
                {
                    break;
                }
                ainteger1[j1] = Integer.valueOf(ai[l1 - 1 - j1]);
                j1++;
            } while (true);
            break; /* Loop/switch isn't completed */
        }
        j1++;
        continue; /* Loop/switch isn't completed */
_L4:
        a(true, false);
        return;
        if (true) goto _L6; else goto _L5
_L5:
        Integer ainteger2[] = ainteger;
        if (ainteger == null)
        {
            ainteger2 = new Integer[1];
            ainteger2[0] = Integer.valueOf(i1);
        }
        a(true, new com.roidapp.photogrid.filter.selfiecam.b(this, ainteger2, d, hw.b(this), m));
        return;
    }

    static void d(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        selfiecamimageshowactivity.b();
    }

    static int e(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        return selfiecamimageshowactivity.j;
    }

    static int f(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        return selfiecamimageshowactivity.k;
    }

    private void f()
    {
        Object obj = "/Save/retake";
        if (b != null)
        {
            obj = b.concat("/Save/retake");
        }
        af.c(this, ((String) (obj)));
        obj = new Intent(this, com/roidapp/photogrid/release/CameraPreviewActivity);
        Bundle bundle = new Bundle();
        bundle.putString("current_mode", "MainPage");
        ((Intent) (obj)).putExtras(bundle);
        startActivity(((Intent) (obj)));
        finish();
        com.roidapp.photogrid.b.f.a("Retake_Photo", "Preview_Retake");
        com.roidapp.photogrid.b.f.a("Selfie_Page", "Preview_Selfie");
    }

    static Handler g(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        return selfiecamimageshowactivity.l;
    }

    private int[] g()
    {
        int i1 = getResources().getDisplayMetrics().widthPixels;
        if (i1 >= 1080)
        {
            if (i1 < 1440)
            {
                return (new int[] {
                    720, 1024, 1080, 1660, 1920, 2048
                });
            } else
            {
                return (new int[] {
                    720, 1024, 1080, 1660, 1920, 2048, 2560
                });
            }
        } else
        {
            return hw.bd(this);
        }
    }

    public final void a(String s)
    {
        if (isFinishing())
        {
            return;
        }
        if (s != null)
        {
            sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(s))));
        }
        if (m)
        {
            FacebookMessengerActivity.a(s, "image/jpeg");
            finish();
            return;
        }
        if (x == null)
        {
            x = new a(this, b);
        }
        if (s != null && g != null && g.length > 0)
        {
            g[f].n = s;
            g[f].b = null;
            g[f].c = null;
        }
        a.setVisibility(8);
        if (e)
        {
            x.a();
        } else
        {
            x.b();
        }
        an.a(this, (new StringBuilder()).append(getString(0x7f07027e)).append(ap.a(this)).toString());
    }

    public final void a(Throwable throwable, String s)
    {
        a.setVisibility(8);
        if (!java/lang/OutOfMemoryError.isInstance(throwable)) goto _L2; else goto _L1
_L1:
        Toast.makeText(this, 0x7f07020f, 1).show();
_L4:
        f();
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
                    y.a(this, s);
                } else
                if (throwable.equals("701"))
                {
                    y.b(this, s);
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
        if (java/lang/NoSuchMethodError.isInstance(throwable))
        {
            Toast.makeText(this, 0x7f070208, 0).show();
        } else
        if (throwable != null)
        {
            Toast.makeText(this, (new StringBuilder()).append(throwable.getMessage()).toString(), 1).show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        i1;
        JVM INSTR lookupswitch 2: default 36
    //                   8262: 37
    //                   52225: 153;
           goto _L1 _L2 _L3
_L11:
        return;
_L2:
        j1;
        JVM INSTR tableswitch 34816 34825: default 92
    //                   34816 93
    //                   34817 119
    //                   34818 92
    //                   34819 136
    //                   34820 131
    //                   34821 92
    //                   34822 141
    //                   34823 92
    //                   34824 92
    //                   34825 114;
           goto _L4 _L5 _L6 _L4 _L7 _L8 _L4 _L9 _L4 _L4 _L10
_L4:
        return;
_L5:
        intent = ih.C().M();
        if (intent == null || intent.length == 0)
        {
            a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        finish();
        return;
_L6:
        a(e, true);
          goto _L5
_L8:
        f();
        return;
_L7:
        a();
        return;
_L9:
        try
        {
            startActivity(intent);
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
_L1:
        if (true) goto _L11; else goto _L3
_L3:
        if (i != null)
        {
            i.a(i1, j1, intent);
            return;
        }
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131559281 2131559284: default 36
    //                   2131559281 37
    //                   2131559282 42
    //                   2131559283 42
    //                   2131559284 148;
           goto _L1 _L2 _L3 _L3 _L4
_L1:
        return;
_L2:
        f();
        return;
_L3:
        switch (((Integer)Integer.valueOf(view.getId())).intValue())
        {
        default:
            return;

        case 2131559282: 
            if (m)
            {
                d();
            } else
            {
                i = new o(this, new j(this), g(), false, false);
                i.show();
            }
            com.roidapp.photogrid.b.f.a("Save_Photo", "Preview_Save");
            return;

        case 2131559283: 
            d();
            com.roidapp.photogrid.b.f.a("Share_Photo", "Preview_Share");
            return;
        }
_L4:
        if (g[f].g == null)
        {
            b();
            return;
        }
        view = PreferenceManager.getDefaultSharedPreferences(this);
        if (view.getBoolean("selfie_camera_edit_tip", true))
        {
            View view1 = LayoutInflater.from(this).inflate(0x7f0300ed, null);
            if (view1 != null)
            {
                CheckBox checkbox = (CheckBox)view1.findViewById(0x7f0d03c1);
                ((TextView)view1.findViewById(0x7f0d03bf)).setText(0x7f07031a);
                view1.findViewById(0x7f0d03c0).setOnClickListener(new g(this, checkbox));
                (new android.app.AlertDialog.Builder(this)).setIcon(0x1080027).setTitle(0x7f0702e7).setView(view1).setPositiveButton(0x7f07016b, new i(this, checkbox, view)).setNegativeButton(0x7f07016a, new com.roidapp.photogrid.filter.selfiecam.h(this)).show();
                return;
            }
        } else
        {
            b();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        com.roidapp.photogrid.common.b.a("SelfieCamImageShowActivity/onCreate");
        m = FacebookMessengerActivity.a(this);
        try
        {
            setContentView(0x7f0300d2);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        n = h.l;
        f = getIntent().getIntExtra("edit_image_index", 0);
        g = ih.C().M();
        if (g == null || g.length == 0)
        {
            Log.e("SelfieCamImageShowActivity", "selectImages is null, go to main page.");
            startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
            finish();
            return;
        }
        b = "SelfieCam";
        Object obj;
        if (g[f].g != null)
        {
            bundle = g[f].g;
        } else
        if (g[f].o != null)
        {
            bundle = g[f].o;
        } else
        {
            bundle = g[f].n;
        }
        d = bundle;
        h = (ImageView)findViewById(0x7f0d0376);
        a = (RelativeLayout)findViewById(0x7f0d040d);
        a.setVisibility(0);
        ((RelativeLayout)findViewById(0x7f0d0374)).setOnClickListener(this);
        ((TextView)findViewById(0x7f0d0371)).setOnClickListener(this);
        bundle = (TextView)findViewById(0x7f0d0372);
        bundle.setOnClickListener(this);
        obj = (TextView)findViewById(0x7f0d0373);
        ((TextView) (obj)).setOnClickListener(this);
        if (m)
        {
            ((TextView) (obj)).setVisibility(8);
            bundle.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            bundle.setBackgroundResource(0x7f020459);
            bundle.setText(null);
            obj = (android.widget.RelativeLayout.LayoutParams)bundle.getLayoutParams();
            int i1 = getResources().getDimensionPixelSize(0x7f090193);
            obj.width = i1;
            obj.height = i1;
            ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, getResources().getDimensionPixelSize(0x7f090187), 0);
            bundle.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        j = getResources().getDisplayMetrics().widthPixels;
        k = getResources().getDisplayMetrics().heightPixels;
        (new Thread(new m(this))).start();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            f();
        }
        return super.onKeyDown(i1, keyevent);
    }

    public final void x()
    {
    }
}
