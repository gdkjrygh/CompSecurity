// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.common.a;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.cloud.DropBoxSelectorActivity;
import com.roidapp.photogrid.cloud.FbPhotoSelectorActivity;
import com.roidapp.photogrid.cloud.FlickrSelectorActivity;
import com.roidapp.photogrid.cloud.GoogleSearchSelectorActivity;
import com.roidapp.photogrid.cloud.InstagramSelectorActivity;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ImageSelector;
import com.roidapp.photogrid.release.ih;

// Referenced classes of package com.roidapp.photogrid.video:
//            bn, bo, bp

public class VideoPictureEditActivity extends FragmentActivity
{

    public VideoPictureEditActivity()
    {
    }

    static void a(VideoPictureEditActivity videopictureeditactivity)
    {
        videopictureeditactivity.b();
    }

    private void b()
    {
        for (com.roidapp.photogrid.release.ig aig[] = ih.C().M(); aig == null || aig.length > 2;)
        {
            return;
        }

        Toast.makeText(this, 0x7f07019d, 0).show();
    }

    public final void a()
    {
        if (isFinishing()) goto _L2; else goto _L1
_L1:
        Intent intent = new Intent();
        if (com.roidapp.cloudlib.common.a.z(this) != 0) goto _L4; else goto _L3
_L3:
        intent.setClass(this, com/roidapp/photogrid/release/ImageSelector);
        f.a("CartPage_View", "Edit_Cart");
_L6:
        intent.putExtra("folder_path", ih.C().L());
        ih.C().n(0);
        ih.C().g(null);
        ih.C().f(null);
        ih.C().o(0);
        ih.C().al();
        ih.C().k(false);
        startActivity(intent);
        finish();
_L2:
        return;
_L4:
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
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj;
        AnimationDrawable animationdrawable;
        ImageView imageview;
        try
        {
            setContentView(0x7f030135);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            (new cc(this)).a();
            return;
        }
        bundle = getSupportFragmentManager();
        obj = PreferenceManager.getDefaultSharedPreferences(this);
        if (!((SharedPreferences) (obj)).getBoolean("video_new_select_4.84", true))
        {
            break MISSING_BLOCK_LABEL_218;
        }
        ((SharedPreferences) (obj)).edit().putBoolean("video_new_select_4.84", false).apply();
        if (isFinishing())
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj = new Dialog(this, 0x7f0b001d);
        ((Dialog) (obj)).setContentView(0x7f0300c4);
        animationdrawable = (AnimationDrawable)getResources().getDrawable(0x7f020601);
        imageview = (ImageView)((Dialog) (obj)).findViewById(0x7f0d0321);
        imageview.setImageDrawable(animationdrawable);
        imageview.post(new bn(this, animationdrawable));
        ((Dialog) (obj)).findViewById(0x7f0d0279).setOnClickListener(new bo(this, ((Dialog) (obj))));
        ((Dialog) (obj)).show();
_L1:
        Object obj1 = bundle.findFragmentByTag("key_picture_fragment");
        if (obj1 == null)
        {
            bundle.beginTransaction().add(0x7f0d04e3, new bp(), "key_picture_fragment").commit();
            return;
        } else
        {
            bundle.beginTransaction().attach(((Fragment) (obj1))).commit();
            return;
        }
        obj1;
        ((OutOfMemoryError) (obj1)).printStackTrace();
          goto _L1
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L1
        obj1;
        ((OutOfMemoryError) (obj1)).printStackTrace();
          goto _L1
        b();
          goto _L1
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            keyevent = getSupportFragmentManager();
            if (keyevent != null)
            {
                keyevent = keyevent.findFragmentById(0x7f0d04e3);
                if ((keyevent instanceof bp) && keyevent.isAdded())
                {
                    ((bp)keyevent).b();
                }
            } else
            {
                a();
            }
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        an.a(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        com.roidapp.baselib.c.b.b(this);
    }

    protected void onStop()
    {
        super.onStop();
        com.roidapp.baselib.c.b.c(this);
    }
}
