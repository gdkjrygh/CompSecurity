// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.imagelib.filter.av;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.freecrop.e;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.y;
import java.io.IOException;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, ii, ih, ig, 
//            PhotoGridActivity, qx, ij

public class ImageEditFreeCropActivity extends ParentActivity
    implements android.view.View.OnClickListener, av
{

    private int a;
    private int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private e g;
    private RelativeLayout h;
    private boolean i;

    public ImageEditFreeCropActivity()
    {
        a = -1;
        b = -1;
        c = false;
        d = false;
        e = false;
        i = false;
    }

    static void a(ImageEditFreeCropActivity imageeditfreecropactivity)
    {
        if (!imageeditfreecropactivity.isFinishing())
        {
            Object obj = imageeditfreecropactivity.getSharedPreferences("FreeCropMode", 0);
            if (!((SharedPreferences) (obj)).getBoolean("freecrop_tech", false))
            {
                ((SharedPreferences) (obj)).edit().putBoolean("freecrop_tech", true).apply();
                obj = new Dialog(imageeditfreecropactivity, 0x7f0b001d);
                try
                {
                    ((Dialog) (obj)).setContentView(0x7f0300ee);
                }
                // Misplaced declaration of an exception variable
                catch (ImageEditFreeCropActivity imageeditfreecropactivity)
                {
                    imageeditfreecropactivity.printStackTrace();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ImageEditFreeCropActivity imageeditfreecropactivity)
                {
                    imageeditfreecropactivity.printStackTrace();
                    return;
                }
                ((Dialog) (obj)).findViewById(0x7f0d0279).setOnClickListener(new ii(imageeditfreecropactivity, ((Dialog) (obj))));
                ((Dialog) (obj)).show();
            }
        }
    }

    private void a(boolean flag)
    {
        if (u != null)
        {
            u.removeAllViews();
        }
        az.w = false;
        Intent intent;
        Rect rect;
        if (b == 0)
        {
            if (az.q == 9 || az.q == 10)
            {
                ih.C().a(new ig[] {
                    ih.C().au()
                });
                ih.C().a(null);
            } else
            {
                ih.C().a(ih.C().O());
                ih.C().b(null);
            }
        }
        ih.C().ak();
        intent = new Intent();
        intent.setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
        rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top > 0)
        {
            az.g = rect.top;
        }
        if (flag)
        {
            intent.putExtra("freecropImageIndex", -1);
        } else
        {
            intent.putExtra("freecropImageIndex", a);
        }
        intent.putExtra("isfreeCrop", true);
        intent.putExtra("isInterFilter", true);
        startActivity(intent);
        finish();
    }

    private void d()
    {
        startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
        finish();
    }

    public final void a()
    {
        h.setVisibility(0);
        d = true;
    }

    public final void a(int j)
    {
    }

    public final void a(int j, String s, com.roidapp.imagelib.b.b b1, IGroupInfo igroupinfo, int k)
    {
    }

    public final void a(Uri uri, String s, com.roidapp.imagelib.b.b b1, IGroupInfo igroupinfo, int j)
    {
        if (uri != null)
        {
            uri = uri.getPath();
            qx.a().a(uri);
            a(false);
        }
        h.setVisibility(8);
        d = false;
    }

    public final void a(Throwable throwable, String s)
    {
        h.setVisibility(8);
        if (!java/lang/OutOfMemoryError.isInstance(throwable)) goto _L2; else goto _L1
_L1:
        an.c(new WeakReference(this), getString(0x7f07020f));
_L4:
        a(false);
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
                    an.c(new WeakReference(this), getString(0x7f07028d));
                } else
                {
                    an.c(new WeakReference(this), throwable);
                }
            }
        } else
        if (throwable != null)
        {
            an.c(new WeakReference(this), (new StringBuilder()).append(throwable.getMessage()).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        h.setVisibility(8);
        d = false;
        an.c(new WeakReference(this), getString(0x7f07017c));
    }

    public final String c()
    {
        return "ClipPage";
    }

    public void onClick(View view)
    {
        if (!d && !e)
        {
            switch (view.getId())
            {
            default:
                return;

            case 2131558440: 
                a(true);
                return;

            case 2131558458: 
                break;
            }
            if (g != null)
            {
                d = true;
                e = true;
                g.a();
                ((TextView)h.findViewById(0x7f0d01ac)).setText(0x7f07028a);
                h.setVisibility(0);
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!com.roidapp.photogrid.common.an.b(bundle)) goto _L2; else goto _L1
_L1:
        bundle = getSupportFragmentManager().findFragmentByTag("ImageEditFreeCropActivity");
        if (bundle != null)
        {
            getSupportFragmentManager().beginTransaction().remove(bundle).commit();
        }
        com.roidapp.photogrid.common.c.a("160", this);
        Log.w("ImageEditFreeCropActivity", "The process has been killed, return to home.");
_L4:
        return;
_L2:
        com.roidapp.photogrid.common.b.a("ImageEditFreeCropActivity/onCreate");
        try
        {
            setContentView(0x7f0300d3);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            c = true;
            (new cc(this)).a();
        }
        if (c) goto _L4; else goto _L3
_L3:
        Object obj;
        i = getIntent().getBooleanExtra("freeSingleCrop", false);
        b = getSharedPreferences("FreeCropMode", 0).getInt("entry_mode", -1);
        if (b == -1)
        {
            Log.e("ImageEditFreeCropActivity", "error Entry!");
            d();
            return;
        }
        bundle = getSupportFragmentManager().beginTransaction();
        obj = ih.C().M();
        if (obj != null && obj.length != 0) goto _L6; else goto _L5
_L5:
        d();
_L9:
        bundle = (TextView)findViewById(0x7f0d0028);
        bundle.setOnClickListener(this);
        bundle.getViewTreeObserver().addOnGlobalLayoutListener(new ij(this, bundle));
        bundle.setText(0x7f07005a);
        ((TextView)findViewById(0x7f0d003a)).setOnClickListener(this);
        h = (RelativeLayout)findViewById(0x7f0d040d);
        h.setVisibility(0);
        return;
_L6:
        if (b != 0) goto _L8; else goto _L7
_L7:
        f = obj[0].d();
_L10:
        obj = new Bundle();
        ((Bundle) (obj)).putString("edit_image_path", f);
        if (getSupportFragmentManager().findFragmentByTag("ImageEditFreeCropActivity") == null)
        {
            g = new e();
            g.setArguments(((Bundle) (obj)));
            bundle.add(0x7f0d005e, g, "ImageEditFreeCropActivity");
            bundle.commitAllowingStateLoss();
        } else
        {
            g = (e)getSupportFragmentManager().findFragmentByTag("ImageEditFreeCropActivity");
        }
          goto _L9
_L8:
label0:
        {
            a = getIntent().getIntExtra("edit_image_index", -1);
            if (a >= 0 && a < obj.length)
            {
                break label0;
            }
            Log.e("ImageEditFreeCropActivity", "get edit_image_index failed.");
            d();
        }
          goto _L9
        f = obj[a].d();
          goto _L10
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        if (j == 4)
        {
            if (d)
            {
                return true;
            } else
            {
                a(true);
                return true;
            }
        } else
        {
            return super.onKeyDown(j, keyevent);
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("entry_mode"))
        {
            b = bundle.getInt("entry_mode");
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        com.roidapp.photogrid.common.an.a(bundle);
        bundle.putInt("entry_mode", b);
    }

    public final void x()
    {
        t = "freecrop";
    }
}
