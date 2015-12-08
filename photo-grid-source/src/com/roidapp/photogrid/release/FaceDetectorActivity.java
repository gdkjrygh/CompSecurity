// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.roidapp.cloudlib.common.a;
import com.roidapp.imagelib.facedetector.e;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.cloud.DropBoxSelectorActivity;
import com.roidapp.photogrid.cloud.FbPhotoSelectorActivity;
import com.roidapp.photogrid.cloud.FlickrSelectorActivity;
import com.roidapp.photogrid.cloud.GoogleSearchSelectorActivity;
import com.roidapp.photogrid.cloud.InstagramSelectorActivity;
import com.roidapp.photogrid.cloud.TemplateSelectorActivity;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.y;
import java.io.IOException;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector, ih, ig, PhotoGridActivity, 
//            bi

public class FaceDetectorActivity extends FragmentActivity
    implements e
{

    com.roidapp.imagelib.facedetector.a a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private float f[];
    private String g;
    private RelativeLayout h;

    public FaceDetectorActivity()
    {
        b = false;
        c = false;
        d = -1;
        e = -1;
        a = null;
    }

    private void c()
    {
        startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
        finish();
    }

    private void d()
    {
        Intent intent1;
        if (d == 0)
        {
            Intent intent = new Intent();
            intent.setClass(this, com/roidapp/photogrid/cloud/TemplateSelectorActivity);
            startActivity(intent);
            finish();
            return;
        }
        intent1 = new Intent();
        if (com.roidapp.cloudlib.common.a.z(this) != 0) goto _L2; else goto _L1
_L1:
        intent1.setClass(this, com/roidapp/photogrid/release/ImageSelector);
_L4:
        String s = ih.C().L();
        int i = ih.C().K();
        String as[] = ih.C().J();
        ig aig[] = ih.C().M();
        aig[i - 1].n = g;
        aig[i - 1].c = null;
        aig[i - 1].b = null;
        intent1.putExtra("firstCreate", true);
        intent1.putExtra("folder_path", s);
        intent1.putExtra("image_paths", as);
        startActivity(intent1);
        finish();
        return;
_L2:
        if (com.roidapp.cloudlib.common.a.z(this) == 3)
        {
            intent1.setClass(this, com/roidapp/photogrid/cloud/FlickrSelectorActivity);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 1)
        {
            intent1.setClass(this, com/roidapp/photogrid/cloud/FbPhotoSelectorActivity);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 5)
        {
            intent1.setClass(this, com/roidapp/photogrid/cloud/DropBoxSelectorActivity);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 4)
        {
            intent1.setClass(this, com/roidapp/photogrid/cloud/GoogleSearchSelectorActivity);
        } else
        if (com.roidapp.cloudlib.common.a.z(this) == 2)
        {
            intent1.setClass(this, com/roidapp/photogrid/cloud/InstagramSelectorActivity);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        h.setVisibility(8);
    }

    public final void a(String s, float f1, float af[])
    {
        s = new ig(s);
        s.v = f1;
        s.c = g;
        ih.C().a(new ig[] {
            s
        });
        ih.C().j(1);
        ih.C().i(0);
        ih.C().F();
        s = new Intent();
        s.setClass(this, com/roidapp/photogrid/release/PhotoGridActivity);
        s.putExtra("entryType", d);
        s.putExtra("entryFrom", e);
        s.putExtra("faceMatrix", af);
        startActivity(s);
        finish();
    }

    public final void a(Throwable throwable, String s)
    {
        h.setVisibility(8);
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
        if (throwable != null)
        {
            Toast.makeText(this, (new StringBuilder()).append(throwable.getMessage()).toString(), 1).show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        d();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!an.b(bundle)) goto _L2; else goto _L1
_L1:
        Log.w("CameraPreviewActivity", "new process, go to home");
        c();
_L4:
        return;
_L2:
        Bundle bundle1;
        int i;
        try
        {
            setContentView(0x7f03009b);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            b = true;
            (new cc(this)).a();
        }
        if (b) goto _L4; else goto _L3
_L3:
        i = bi.b;
        d = getIntent().getIntExtra("entryType", -1);
        e = getIntent().getIntExtra("entryFrom", -1);
        f = getIntent().getFloatArrayExtra("faceMatrix");
        bundle = getSupportFragmentManager().beginTransaction();
        if (com.roidapp.photogrid.release.bi.a == i || bi.b != i) goto _L6; else goto _L5
_L5:
        bundle1 = new Bundle();
        if (e != 0 && e != 2) goto _L8; else goto _L7
_L7:
        g = getIntent().getStringExtra("path");
_L10:
        ig aig[];
        if (getSupportFragmentManager().findFragmentByTag("ImagePreviewFragment") == null)
        {
            a = new com.roidapp.imagelib.facedetector.a();
            bundle1.putString("edit_image_path", g);
            bundle1.putFloatArray("edit_face_matrix", f);
            a.setArguments(bundle1);
            bundle.add(0x7f0d005e, a, "ImagePreviewFragment");
            bundle.commitAllowingStateLoss();
        } else
        {
            a = (com.roidapp.imagelib.facedetector.a)getSupportFragmentManager().findFragmentByTag("ImagePreviewFragment");
        }
_L6:
        h = (RelativeLayout)findViewById(0x7f0d040d);
        h.setVisibility(0);
        return;
_L8:
        if (e != 1) goto _L10; else goto _L9
_L9:
label0:
        {
            aig = ih.C().M();
            if (aig != null)
            {
                break label0;
            }
            Log.e("CameraPreviewActivity", "selectImages is null, go to main page.");
            c();
        }
          goto _L6
        g = aig[0].n;
          goto _L10
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (c)
            {
                return true;
            } else
            {
                d();
                return true;
            }
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("entryType"))
        {
            d = bundle.getInt("entryType");
        }
        if (bundle.containsKey("entryFrom"))
        {
            e = bundle.getInt("entryFrom");
        }
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        an.a(bundle);
        bundle.putInt("entryType", d);
        bundle.putInt("entryFrom", e);
    }
}
