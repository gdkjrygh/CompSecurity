// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.setwallpaper;

import android.app.WallpaperManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import b;
import com.google.android.apps.photos.picker.external.ExternalPickerActivity;
import mry;
import msn;
import ogg;
import omr;
import pwo;

public class SetWallpaperActivity extends omr
{

    private int f;
    private Uri g;

    public SetWallpaperActivity()
    {
        f = 0;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j != -1 || intent.getData() == null)
        {
            setResult(j);
            finish();
        } else
        {
            f = i;
            if (f == 1)
            {
                g = intent.getData();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            f = bundle.getInt("activity-state");
            g = (Uri)bundle.getParcelable("picked-item");
        }
    }

    protected void onResume()
    {
        Object obj;
        Object obj2;
        int i;
        super.onResume();
        obj2 = getIntent();
        i = f;
        obj = g;
        i;
        JVM INSTR tableswitch 0 1: default 44
    //                   0 45
    //                   1 320;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_140;
_L1:
        return;
_L2:
        Uri uri = ((Intent) (obj2)).getData();
        if (uri == null)
        {
            obj = new Intent(this, com/google/android/apps/photos/picker/external/ExternalPickerActivity);
            ((Intent) (obj)).setAction(((Intent) (obj2)).getAction());
            startActivityForResult(((Intent) (obj)), 1);
            return;
        }
        obj2 = ((Intent) (obj2)).getAction();
        obj = uri;
        if (obj2 != null)
        {
            obj = new msn();
            msp msp = pwo.a;
            if ("android.intent.action.ATTACH_DATA".equals(obj2))
            {
                i = 11;
            } else
            {
                i = 10;
            }
            mry.a(this, 4, ((msn) (obj)).a(new ogg(msp, i)));
            obj = uri;
        }
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L5; else goto _L4
_L4:
        if (!"content".equals(((Uri) (obj)).getScheme())) goto _L5; else goto _L6
_L6:
        obj = WallpaperManager.getInstance(getApplicationContext()).getCropAndSetWallpaperIntent(((Uri) (obj)));
_L7:
        startActivity(((Intent) (obj)));
_L8:
        finish();
        return;
_L5:
        int j = getWallpaperDesiredMinimumWidth();
        int k = getWallpaperDesiredMinimumHeight();
        obj = (new Intent("com.android.camera.action.CROP")).setPackage(getPackageName()).setDataAndType(((Uri) (obj)), "image/*").addFlags(0x2000000).putExtra("outputX", j).putExtra("outputY", k).putExtra("aspectX", j).putExtra("aspectY", k).putExtra("scale", true).putExtra("scaleUpIfNeeded", true).putExtra("set-as-wallpaper", true);
          goto _L7
        Object obj1;
        obj1;
        Log.e("SetWallpaper", "Unable to set wallpaper", ((Throwable) (obj1)));
          goto _L8
        obj1;
        Toast.makeText(this, b.yE, 0).show();
          goto _L8
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("activity-state", f);
        if (g != null)
        {
            bundle.putParcelable("picked-item", g);
        }
    }
}
