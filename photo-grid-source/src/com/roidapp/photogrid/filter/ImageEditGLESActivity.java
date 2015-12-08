// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.imagelib.a.h;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.crop.j;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.imagelib.filter.aj;
import com.roidapp.imagelib.filter.aq;
import com.roidapp.imagelib.filter.av;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.y;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.PhotoGridActivity;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.io.IOException;

// Referenced classes of package com.roidapp.photogrid.filter:
//            f, e, d, a

public class ImageEditGLESActivity extends ParentActivity
    implements android.view.View.OnClickListener, av, com.roidapp.photogrid.filter.f
{

    protected aj a;
    protected int b;
    protected int c;
    protected int d;
    protected boolean e;
    protected boolean f;
    protected RelativeLayout g;
    protected String h;
    protected String i;
    public final String j = "FILTER_OPTIMIZATION";
    private j k;
    private boolean l;
    private String m;
    private boolean n;
    private int o;
    private String p;

    public ImageEditGLESActivity()
    {
        b = -1;
        c = -1;
        d = -1;
        e = false;
        f = false;
        l = false;
        n = true;
        p = "";
    }

    private void a(boolean flag, String s)
    {
        if (flag)
        {
            Intent intent = new Intent();
            intent.putExtra("crop_path", s);
            setResult(-1, intent);
            finish();
            return;
        } else
        {
            setResult(0);
            finish();
            return;
        }
    }

    private boolean b(int i1)
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        if (c == 10)
        {
            Bundle bundle = new Bundle();
            bundle.putString("edit_image_path", i);
            bundle.putBoolean("edit_is_crop", false);
            bundle.putBoolean("edit_photo_profile", true);
            if (getSupportFragmentManager().findFragmentByTag("ImageCrop") == null)
            {
                k = new j();
                k.setArguments(bundle);
                fragmenttransaction.add(0x7f0d005e, k, "ImageCrop");
                fragmenttransaction.commitAllowingStateLoss();
            } else
            {
                k = (j)getSupportFragmentManager().findFragmentByTag("ImageCrop");
            }
            o = i1;
            return true;
        }
        ig aig[] = ih.C().M();
        if (aig == null || aig.length == 0)
        {
            Log.e("ImageEditGLESActivity", "selectImages is null, go to main page.");
            startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
            finish();
            return false;
        }
        Object obj;
        Object obj1;
        Bundle bundle1;
        int j1;
        if (d == 1)
        {
            i = aig[b].e();
        } else
        if (aig[b].c == null)
        {
            i = aig[b].e();
        } else
        {
            i = aig[b].c;
        }
        m = aig[b].n;
        obj1 = aig[b].i;
        obj = aig[b].j;
        j1 = aig[b].l;
        if (obj == null)
        {
            obj = obj1;
            if (!((b) (obj1)).a())
            {
                obj = aa.a().e();
            }
            obj1 = aa.a().d();
            j1 = aa.a().b();
        } else
        {
            Object obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        }
        bundle1 = new Bundle();
        bundle1.putString("edit_image_path", i);
        bundle1.putString("edit_image_origin_path", m);
        bundle1.putString("mode_str", h);
        bundle1.putInt("edit_image_property_lightness", ((b) (obj)).a);
        bundle1.putInt("edit_image_property_contast", ((b) (obj)).b);
        bundle1.putInt("edit_image_property_saturation", ((b) (obj)).c);
        bundle1.putInt("edit_image_property_hue", ((b) (obj)).d);
        bundle1.putInt("alphaProgress", j1);
        bundle1.putParcelable("edit_filter_type", ((android.os.Parcelable) (obj1)));
        bundle1.putBoolean("edit_filter_support", n);
        if (e.a == i1)
        {
            if (getSupportFragmentManager().findFragmentByTag("ImageFilter") == null)
            {
                a = new aj();
                a.setArguments(bundle1);
                fragmenttransaction.add(0x7f0d005e, a, "ImageFilter");
                fragmenttransaction.commitAllowingStateLoss();
            } else
            {
                a = (aj)getSupportFragmentManager().findFragmentByTag("ImageFilter");
            }
        }
        if (com.roidapp.photogrid.filter.e.b == i1)
        {
            if (aig[b].c != null)
            {
                bundle1.putBoolean("edit_is_crop", true);
            } else
            {
                bundle1.putBoolean("edit_is_crop", false);
            }
            if (getSupportFragmentManager().findFragmentByTag("ImageCrop") == null)
            {
                k = new j();
                k.setArguments(bundle1);
                fragmenttransaction.add(0x7f0d005e, k, "ImageCrop");
                fragmenttransaction.commitAllowingStateLoss();
            } else
            {
                k = (j)getSupportFragmentManager().findFragmentByTag("ImageCrop");
            }
        }
        o = i1;
        return true;
    }

    private boolean j()
    {
        while (e || f) 
        {
            return false;
        }
        return true;
    }

    private void k()
    {
        i();
        Intent intent = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
        intent.putExtra("firstCreate", false);
        intent.putExtra("isInterFilter", true);
        startActivity(intent);
        finish();
    }

    public final void a()
    {
        g.setVisibility(0);
        e = true;
    }

    public final void a(int i1)
    {
        TextView textview = (TextView)findViewById(0x7f0d0028);
        if (i1 == 0)
        {
            textview.setText(0x7f07013b);
        } else
        {
            if (i1 == 1)
            {
                textview.setText(0x7f07015e);
                return;
            }
            if (i1 == 2)
            {
                textview.setText(0x7f070027);
                return;
            }
        }
    }

    public final void a(int i1, String s, b b1, IGroupInfo igroupinfo, int j1)
    {
        f = false;
        if (i1 == 0)
        {
            ((TextView)g.findViewById(0x7f0d01ac)).setText(0x7f0701a0);
            a(e.a, s, b1, igroupinfo, false, j1);
            l = false;
        } else
        {
            ((TextView)g.findViewById(0x7f0d01ac)).setText(0x7f0701a0);
            a(com.roidapp.photogrid.filter.e.b, s, b1, igroupinfo, false, j1);
            l = true;
        }
        g.setVisibility(0);
    }

    protected final void a(int i1, String s, b b1, IGroupInfo igroupinfo, boolean flag, int j1)
    {
        if (h())
        {
            return;
        }
        if (e.a == i1)
        {
            if (getSupportFragmentManager().findFragmentByTag("ImageFilter") == null || flag)
            {
                a = new aj();
                Object obj = new Bundle();
                ((Bundle) (obj)).putString("edit_image_path", s);
                ((Bundle) (obj)).putString("edit_image_origin_path", m);
                ((Bundle) (obj)).putString("mode_str", h);
                ((Bundle) (obj)).putInt("edit_image_property_lightness", b1.a);
                ((Bundle) (obj)).putInt("edit_image_property_contast", b1.b);
                ((Bundle) (obj)).putInt("edit_image_property_saturation", b1.c);
                ((Bundle) (obj)).putInt("edit_image_property_hue", b1.d);
                ((Bundle) (obj)).putParcelable("edit_filter_type", igroupinfo);
                ((Bundle) (obj)).putInt("alphaProgress", j1);
                ((Bundle) (obj)).putBoolean("edit_crop_to_filter_entry", true);
                ((Bundle) (obj)).putBoolean("edit_filter_support", n);
                a.setArguments(((Bundle) (obj)));
                obj = getSupportFragmentManager().beginTransaction();
                ((FragmentTransaction) (obj)).replace(0x7f0d005e, a, "ImageFilter");
                ((FragmentTransaction) (obj)).commitAllowingStateLoss();
            } else
            {
                a = (aj)getSupportFragmentManager().findFragmentByTag("ImageFilter");
            }
        }
        if (com.roidapp.photogrid.filter.e.b == i1)
        {
            if (getSupportFragmentManager().findFragmentByTag("ImageCrop") == null || flag)
            {
                k = new j();
                Bundle bundle = new Bundle();
                bundle.putString("edit_image_path", s);
                bundle.putString("edit_crop_image_path", i);
                bundle.putInt("edit_image_property_lightness", b1.a);
                bundle.putInt("edit_image_property_contast", b1.b);
                bundle.putInt("edit_image_property_saturation", b1.c);
                bundle.putInt("edit_image_property_hue", b1.d);
                bundle.putParcelable("edit_filter_type", igroupinfo);
                bundle.putInt("alphaProgress", j1);
                k.setArguments(bundle);
                s = getSupportFragmentManager().beginTransaction();
                s.replace(0x7f0d005e, k, "ImageCrop");
                s.commitAllowingStateLoss();
            } else
            {
                k = (j)getSupportFragmentManager().findFragmentByTag("ImageCrop");
            }
        }
        o = i1;
    }

    public void a(Uri uri, String s, b b1, IGroupInfo igroupinfo, int i1)
    {
        g.setVisibility(8);
        if (uri != null)
        {
            ig aig[] = ih.C().M();
            if (aig != null && aig.length > 0)
            {
                ig ig1 = aig[b];
                boolean flag;
                if (ig1.n.equals(s))
                {
                    ig1.z = false;
                } else
                if (ig1.c != s)
                {
                    ig1.z = true;
                }
                if (com.roidapp.imagelib.filter.groupinfo.b.a(igroupinfo) || b1 != null && b1.a())
                {
                    ig1.b = uri.getPath();
                } else
                {
                    ig1.b = null;
                }
                if (d == 1)
                {
                    ig1.c = s;
                }
                ig1.j = igroupinfo;
                ig1.l = i1;
                if (b1 != null)
                {
                    ig1.i = b1.b();
                }
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                flag = com.roidapp.imagelib.filter.groupinfo.b.a(igroupinfo);
                if (b1 != null && b1.a())
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (m != null)
                {
                    if (flag)
                    {
                        com.roidapp.photogrid.b.f.a("SingleFilter", "SingleFilter_Apply", 0, m.hashCode());
                    }
                    if (i1 != 0)
                    {
                        com.roidapp.photogrid.b.f.a("SingleFilter", "SingleAdjust_Apply", 0, m.hashCode());
                    }
                }
            }
        }
        if (c == 10)
        {
            a(true, s);
            return;
        } else
        {
            k();
            return;
        }
    }

    protected final void a(aq aq)
    {
        if (a != null && aq != null)
        {
            ((TextView)g.findViewById(0x7f0d01ac)).setText(0x7f07028a);
            g.setVisibility(0);
            a(true);
            a.a(aq);
        }
    }

    public void a(Object obj)
    {
        d;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 29
    //                   1 93;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        com.roidapp.photogrid.common.b.a((new StringBuilder()).append(h).append("/ImageEdit/Filter/applyFilterBtn").toString());
        if (p != null && p.length() > 0)
        {
            af.c(this, p);
        }
        a(((aq) (new d(this))));
        return;
_L3:
        if (k != null)
        {
            com.roidapp.photogrid.common.b.a((new StringBuilder()).append(h).append("/ImageEdit/Crop/applyCropBtn").toString());
            ((TextView)g.findViewById(0x7f0d01ac)).setText(0x7f07028a);
            g.setVisibility(0);
            a(true);
            k.a(d);
            if (ih.C().W() == 2)
            {
                az.h = true;
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(Throwable throwable, String s)
    {
        g.setVisibility(8);
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

    protected final void a(boolean flag)
    {
        e = flag;
        f = flag;
    }

    public final void b()
    {
        g.setVisibility(8);
        e = false;
    }

    public final String c()
    {
        return "FilterPage";
    }

    protected Fragment d()
    {
        a a1 = new a();
        Bundle bundle = new Bundle();
        bundle.putInt("entry_type", d);
        a1.setArguments(bundle);
        return a1;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (!j())
        {
            return true;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }

    protected void f()
    {
        k();
    }

    protected void g()
    {
        if (c == 10)
        {
            a(false, null);
            return;
        } else
        {
            k();
            return;
        }
    }

    protected final void i()
    {
        if (u != null)
        {
            u.removeAllViews();
        }
    }

    protected final String o_()
    {
        return "ca-app-pub-7109791911060569/4632065934";
    }

    public void onClick(View view)
    {
        if (!j())
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131558440: 
            g();
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!an.b(bundle)) goto _L2; else goto _L1
_L1:
        bundle = getSupportFragmentManager().findFragmentByTag("ImageFilter");
        if (bundle != null)
        {
            getSupportFragmentManager().beginTransaction().remove(bundle).commitAllowingStateLoss();
        }
        bundle = getSupportFragmentManager().findFragmentByTag("ImageCrop");
        if (bundle != null)
        {
            getSupportFragmentManager().beginTransaction().remove(bundle).commitAllowingStateLoss();
        }
        com.roidapp.photogrid.common.c.a("360", this);
        Log.w("ImageEditGLESActivity", "The process has been killed, return to home.");
_L4:
        return;
_L2:
        com.roidapp.photogrid.common.b.a("ImageEditGLESActivity/onCreate");
        com.roidapp.baselib.c.b.d("ImageEdit/ImageEditGLESActivity");
        try
        {
            setContentView(0x7f0300d1);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (v) goto _L4; else goto _L3
_L3:
        bundle = getIntent();
        c = bundle.getIntExtra("entry_from", -1);
        if (c == 10)
        {
            i = bundle.getStringExtra("image_path");
        }
        getIntent().getIntExtra("entry_ga_tag", 0);
        JVM INSTR tableswitch 5 7: default 188
    //                   5 248
    //                   6 188
    //                   7 258;
           goto _L5 _L6 _L5 _L7
_L5:
        if (c == -1)
        {
            Log.e("ImageEditGLESActivity", "error Entry!");
            startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
            finish();
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        p = "/Save/finish/goto/filter";
        continue; /* Loop/switch isn't completed */
_L7:
        p = "/share/finish/goto/filter";
        if (true) goto _L5; else goto _L8
_L8:
        az.q;
        JVM INSTR tableswitch 0 10: default 328
    //                   0 436
    //                   1 496
    //                   2 328
    //                   3 328
    //                   4 506
    //                   5 446
    //                   6 328
    //                   7 328
    //                   8 328
    //                   9 476
    //                   10 486;
           goto _L9 _L10 _L11 _L9 _L9 _L12 _L13 _L9 _L9 _L9 _L14 _L15
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_506;
_L16:
        if (az.q != 10)
        {
            com.roidapp.imagelib.a.h.a();
        }
        b = getIntent().getIntExtra("edit_image_index", -1);
        if (b == -1)
        {
            Log.e("ImageEditGLESActivity", "get edit_image_index failed.");
        } else
        {
            d = getIntent().getIntExtra("entry_type", -1);
            if (!h() && !isFinishing())
            {
                bundle = getSupportFragmentManager().beginTransaction();
                bundle.replace(0x7f0d036f, d());
                bundle.commit();
            }
            n = getIntent().getBooleanExtra("edit_suppot_filter", true);
            if (d == -1)
            {
                Log.e("ImageEditGLESActivity", "error Entry type!");
                startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
                finish();
                return;
            }
            if (d == 0)
            {
                af.d(this, "ImageEdit/Filter");
                b(e.a);
                l = false;
            } else
            if (d == 1)
            {
                af.d(this, "ImageEdit/Crop");
                b(com.roidapp.photogrid.filter.e.b);
                l = true;
            }
        }
        bundle = (TextView)findViewById(0x7f0d0028);
        bundle.setOnClickListener(this);
        if (n && d == 0)
        {
            bundle.setText(0x7f07015e);
        } else
        {
            bundle.setText(0x7f070114);
        }
        g = (RelativeLayout)findViewById(0x7f0d040d);
        g.setVisibility(0);
        e = true;
        return;
_L10:
        h = "GridActivity";
          goto _L16
_L13:
        if (ih.C().W() == 1)
        {
            h = "GridActivity/Single/Instagram";
        } else
        {
            h = "GridActivity/Single/Original";
        }
          goto _L16
_L14:
        h = "VideoActivity/Single";
          goto _L16
_L15:
        h = "CameraActivity/Single";
          goto _L16
_L11:
        h = "FreeActivity";
          goto _L16
        h = "GridActivity/Template";
          goto _L16
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 != 4)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (e)
        {
            return true;
        }
        if (o != e.a) goto _L2; else goto _L1
_L1:
        a = (aj)getSupportFragmentManager().findFragmentByTag("ImageFilter");
        if (!a.h()) goto _L4; else goto _L3
_L3:
        i1 = 0;
_L5:
        return i1 == 0;
_L4:
        g();
_L7:
        i1 = 1;
          goto _L5
_L2:
        if (o != com.roidapp.photogrid.filter.e.b) goto _L7; else goto _L6
_L6:
        k = (j)getSupportFragmentManager().findFragmentByTag("ImageCrop");
        if (d != 1 && k != null && n)
        {
            k.a();
        } else
        {
            g();
        }
        i1 = 1;
          goto _L5
        return super.onKeyDown(i1, keyevent);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("key_edit_image_index"))
        {
            b = bundle.getInt("key_edit_image_index");
        }
        if (bundle.containsKey("entry_from"))
        {
            c = bundle.getInt("entry_from");
        }
        if (bundle.containsKey("entry_type"))
        {
            d = bundle.getInt("entry_type");
        }
        if (bundle.containsKey("filter_support"))
        {
            n = bundle.getBoolean("filter_support");
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (!v)
        {
            a = (aj)getSupportFragmentManager().findFragmentByTag("ImageFilter");
            if (a == null)
            {
                Log.e("ImageEditGLESActivity", "ImageEditGLESFragment is null");
            }
            k = (j)getSupportFragmentManager().findFragmentByTag("ImageCrop");
            if (k == null)
            {
                Log.e("ImageEditGLESActivity", "ImageEditCropFragment is null");
            }
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        an.a(bundle);
        if (b != -1)
        {
            bundle.putInt("key_edit_image_index", b);
            bundle.putInt("entry_from", c);
            bundle.putInt("entry_type", d);
            bundle.putBoolean("filter_support", n);
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (d == 0)
        {
            com.roidapp.baselib.c.b.d("EditPage/Filter");
        } else
        if (d == 1)
        {
            com.roidapp.baselib.c.b.d("EditPage/Crop");
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        if (d == 0)
        {
            com.roidapp.baselib.c.b.a("EditPage/Filter", A());
        } else
        if (d == 1)
        {
            com.roidapp.baselib.c.b.a("EditPage/Crop", A());
            return;
        }
    }

    public final void x()
    {
        t = "filter";
    }
}
