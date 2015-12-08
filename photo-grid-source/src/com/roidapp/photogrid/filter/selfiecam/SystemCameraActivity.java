// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageEditGLESActivity

public class SystemCameraActivity extends Activity
{

    private String a;
    private String b;

    public SystemCameraActivity()
    {
    }

    private boolean a()
    {
        Intent intent;
        Object obj;
        intent = new Intent("android.media.action.IMAGE_CAPTURE");
        obj = getPackageManager().queryIntentActivities(intent, 0x10000);
        obj = ((List) (obj)).iterator();
        ResolveInfo resolveinfo;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_150;
            }
            resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
        } while ((resolveinfo.activityInfo.applicationInfo.flags & 0x81) != 1);
        intent.setClassName(resolveinfo.activityInfo.applicationInfo.packageName, resolveinfo.activityInfo.name);
        obj = Uri.fromFile(new File(a, (new StringBuilder("camera_")).append(System.currentTimeMillis()).append(".jpg").toString()));
        b = ((Uri) (obj)).getPath();
        intent.putExtra("output", ((android.os.Parcelable) (obj)));
        startActivityForResult(intent, 1);
        return true;
        Exception exception;
        exception;
        return false;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1 && b != null && (new File(b)).exists())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            az.q = 5;
            intent = new ig(b);
            String s = ImageLibrary.a().a(this);
            ih.C().a(new ig[] {
                intent
            });
            ih.C().j(1);
            ih.C().d(s);
            ih.C().i(0);
            ih.C().F();
            intent = new Intent(this, com/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity);
            intent.putExtra("edit_image_index", 0);
            intent.putExtra("entry_from", 3);
            intent.putExtra("entry_type", 0);
            intent.putExtra("edit_suppot_filter", true);
            intent.setFlags(0x4000000);
            startActivity(intent);
            finish();
            return;
        } else
        {
            intent = new Intent(this, com/roidapp/photogrid/MainPage);
            startActivity(intent);
            intent.setFlags(0x4000000);
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(getString(0x7f07002e)).append("/").toString();
        if (a())
        {
            break MISSING_BLOCK_LABEL_124;
        }
        bundle = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri uri = Uri.fromFile(new File(a, (new StringBuilder("camera_")).append(System.currentTimeMillis()).append(".jpg").toString()));
        b = uri.getPath();
        bundle.putExtra("output", uri);
        startActivityForResult(bundle, 1);
        return;
        bundle;
        finish();
        return;
    }
}
