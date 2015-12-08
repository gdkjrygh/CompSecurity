// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.a.h;
import com.roidapp.imagelib.a.i;
import com.roidapp.imagelib.a.y;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.filter.selfiecam.SelfieCamImageShowActivity;
import java.io.IOException;
import jp.co.cyberagent.android.gpuimage.GPUImageNativeLibrary;

// Referenced classes of package com.roidapp.photogrid.release:
//            ih, ig, ar

public class CameraPreviewActivity extends FragmentActivity
    implements y
{

    i a;
    private boolean b;
    private int c;
    private int d;
    private String e;
    private int f;
    private String g;
    private String h;
    private String i;
    private RelativeLayout j;

    public CameraPreviewActivity()
    {
        b = false;
        c = -1;
        a = null;
    }

    private void d()
    {
        if (f == 1)
        {
            setResult(0);
            finish();
            return;
        } else
        {
            ih.C().D();
            ih.C().a(null);
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/MainPage);
            startActivity(intent);
            finish();
            com.roidapp.photogrid.b.f.a("MainPage_View", "Selfie_Home");
            com.roidapp.photogrid.b.f.a("Cancel_Photo", "Selfie_Cancel");
            return;
        }
    }

    public final void a()
    {
        j.setVisibility(0);
        com.roidapp.photogrid.b.f.a("Take_Photo", "Selfie_Take");
    }

    public final void a(IGroupInfo igroupinfo, boolean flag)
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(this);
        sharedpreferences.edit().putBoolean("cameraFilterDarkCorner", flag).apply();
        if (igroupinfo instanceof CloudGroupInfo)
        {
            sharedpreferences.edit().putBoolean("cameraFilterIsCloudFilter", true).apply();
            sharedpreferences.edit().putString("cameraFilterCloudFilterPkgName", igroupinfo.f()).apply();
            sharedpreferences.edit().putInt("cameraFilterGroupId", (int)igroupinfo.c()).apply();
            sharedpreferences.edit().putInt("cameraFilterFilterId", igroupinfo.b()).apply();
        } else
        {
            sharedpreferences.edit().putBoolean("cameraFilterIsCloudFilter", false).apply();
            sharedpreferences.edit().putString("cameraFilterCloudFilterPkgName", "").apply();
            if (igroupinfo != null)
            {
                sharedpreferences.edit().putInt("cameraFilterGroupId", (int)igroupinfo.c()).apply();
                sharedpreferences.edit().putInt("cameraFilterFilterId", igroupinfo.b()).apply();
                return;
            }
        }
    }

    public final void a(String s, b b1, IFilterInfo ifilterinfo, String s1)
    {
        j.setVisibility(8);
        if (f == 1)
        {
            setResult(-1);
            finish();
            return;
        } else
        {
            Object obj = new ig(s);
            ig aig[] = new ig[1];
            aig[0] = ((ig) (obj));
            obj = ImageLibrary.a().a(this);
            aig[d].o = s;
            aig[d].b = null;
            aig[d].k = ifilterinfo;
            aig[d].i = b1;
            ih.C().a(aig);
            ih.C().j(1);
            ih.C().d(((String) (obj)));
            ih.C().i(0);
            ih.C().F();
            s = new Intent();
            s.setClass(this, com/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity);
            s.putExtra("edit_image_index", 0);
            h.l = s1;
            startActivity(s);
            finish();
            com.roidapp.photogrid.b.f.a("Preview_page", "Selfie_Preview");
            return;
        }
    }

    public final void a(Throwable throwable, String s)
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
                    com.roidapp.photogrid.common.y.a(this);
                } else
                if (throwable.equals("700"))
                {
                    com.roidapp.photogrid.common.y.a(this, s);
                } else
                if (throwable.equals("701"))
                {
                    com.roidapp.photogrid.common.y.b(this, s);
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
    }

    public final void c()
    {
        d();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (an.b(bundle))
        {
            Log.w("CameraPreviewActivity", "new process, go to home");
            startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
            finish();
            com.roidapp.photogrid.b.f.a("MainPage_View", "Selfie_Home");
        } else
        {
            try
            {
                setContentView(0x7f03000a);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
                b = true;
                (new cc(this)).a();
            }
            if (GPUImageNativeLibrary.loadGPUImageFailed)
            {
                Toast.makeText(this, "error exception,please reinstall the app from Google Play", 1).show();
                bundle = new Intent();
                bundle.setClass(this, com/roidapp/photogrid/MainPage);
                startActivity(bundle);
                finish();
                return;
            }
            if (!b)
            {
                e = "SelfieCam";
                g = getIntent().getStringExtra("current_mode");
                h = getIntent().getStringExtra("camera_image_dir");
                i = getIntent().getStringExtra("camera_image_name");
                int k;
                if (g.equalsIgnoreCase("ImageSelector"))
                {
                    f = 1;
                } else
                {
                    f = 0;
                }
                k = ar.a;
                bundle = getSupportFragmentManager().beginTransaction();
                if (ar.a == k)
                {
                    if (getSupportFragmentManager().findFragmentByTag("CameraPreviewFragment") == null)
                    {
                        a = new i();
                        Bundle bundle1 = new Bundle();
                        bundle1.putString("camera_image_dir", h);
                        bundle1.putString("camera_image_filename", i);
                        bundle1.putString("current_mode", g);
                        a.setArguments(bundle1);
                        bundle.add(0x7f0d005e, a, "CameraPreviewFragment");
                        bundle.commitAllowingStateLoss();
                    } else
                    {
                        a = (i)getSupportFragmentManager().findFragmentByTag("CameraPreviewFragment");
                    }
                } else
                {
                    k = com.roidapp.photogrid.release.ar.b;
                }
                j = (RelativeLayout)findViewById(0x7f0d040d);
                j.setVisibility(8);
                return;
            }
        }
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        if (k == 4)
        {
            if (a != null && a.a())
            {
                a.b();
            } else
            {
                d();
            }
            return true;
        } else
        {
            return super.onKeyDown(k, keyevent);
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("key_edit_image_index"))
        {
            d = bundle.getInt("key_edit_image_index");
        }
        bundle.containsKey("entry_from");
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        an.a(bundle);
        if (d != -1)
        {
            bundle.putInt("key_edit_image_index", d);
        }
    }
}
