// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.gl.c;
import com.roidapp.cloudlib.ads.l;
import com.roidapp.cloudlib.aj;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.facebook.a;
import com.roidapp.cloudlib.facebook.al;
import com.roidapp.cloudlib.flickr.j;
import com.roidapp.imagelib.a.h;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.a.m;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.cmid.LoginService;
import com.roidapp.photogrid.common.Eula;
import com.roidapp.photogrid.common.PrivacyPolicy;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.b;
import com.roidapp.photogrid.filter.ImageEditGLESActivity;
import com.roidapp.photogrid.release.CameraPreviewActivity;
import com.roidapp.photogrid.release.ImageSelector;
import com.roidapp.photogrid.release.rf;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            FbPhotoSelectorActivity, InstagramSelectorActivity, FlickrSelectorActivity, DropBoxSelectorActivity, 
//            GoogleSearchSelectorActivity, a

public final class s
    implements aj
{

    private ArrayList a;
    private Boolean b;

    public s()
    {
        a = null;
        b = null;
    }

    public final Intent a(Context context, String s1, String s2)
    {
        File file;
        if (s1 != null && s2 != null)
        {
            if ((file = new File(s1)).exists() || file.mkdirs())
            {
                com.roidapp.baselib.gl.c.a();
                if (!com.roidapp.baselib.gl.c.f(context))
                {
                    context = new Intent("android.media.action.IMAGE_CAPTURE");
                    context.putExtra("output", Uri.fromFile(new File(file, s2)));
                    context.putExtra("android.intent.extra.videoQuality", 0);
                    return context;
                } else
                {
                    Object obj = PreferenceManager.getDefaultSharedPreferences(context);
                    boolean flag = ((SharedPreferences) (obj)).getBoolean("cameraFilterDarkCorner", false);
                    h.a(context, ((SharedPreferences) (obj)).getInt("cameraFilterGroupId", 0), ((SharedPreferences) (obj)).getInt("cameraFilterFilterId", 7), flag, ((SharedPreferences) (obj)).getBoolean("cameraFilterIsCloudFilter", false), ((SharedPreferences) (obj)).getString("cameraFilterCloudFilterPkgName", ""));
                    context = new Intent(context, com/roidapp/photogrid/release/CameraPreviewActivity);
                    obj = new Bundle();
                    ((Bundle) (obj)).putString("current_mode", "ImageSelector");
                    ((Bundle) (obj)).putString("camera_image_dir", s1);
                    ((Bundle) (obj)).putString("camera_image_name", s2);
                    context.putExtras(((Bundle) (obj)));
                    return context;
                }
            }
        }
        return null;
    }

    public final InputStream a(Context context, int i)
    {
        return context.getAssets().open((new StringBuilder("nativetemplates/")).append(i).append("/info").toString());
    }

    public final InputStream a(Context context, String s1, int i)
    {
        return context.getAssets().open((new StringBuilder("nativetemplates/")).append(i).append("/").append(s1).toString());
    }

    public final Class a()
    {
        return com/roidapp/photogrid/MainPage;
    }

    public final void a(Activity activity)
    {
        Intent intent = new Intent(activity.getApplicationContext(), com/roidapp/photogrid/cmid/LoginService);
        intent.setAction("ACTION_LOGIN_BY_FACEBOOK");
        activity.getApplicationContext().startService(intent);
    }

    public final void a(Activity activity, Bundle bundle)
    {
        bundle = new Intent(activity.getApplicationContext(), com/roidapp/photogrid/cmid/LoginService);
        bundle.setAction("ACTION_LOGIN_BY_INSTAGRAM");
        activity.getApplicationContext().startService(bundle);
    }

    public final void a(Context context)
    {
        Log.i("ClientProxyImplement", "init ClientProxyImplement");
        a = new ArrayList();
        if (!al.d()) goto _L2; else goto _L1
_L1:
        Object obj = "393746364042772";
        String s1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.facebook.sdk.ApplicationId").toString();
        obj = s1;
_L4:
        obj = new a(com/roidapp/photogrid/cloud/FbPhotoSelectorActivity, context, ((String) (obj)));
        a.add(obj);
_L2:
        Object obj1 = new com.roidapp.cloudlib.instagram.h(com/roidapp/photogrid/cloud/InstagramSelectorActivity, context, "49ce12ab3ddc4569879308a589402ce3", "dbe30f60a83b4f81855d0a5a48231646", "instagram-photogrid-oauth");
        a.add(obj1);
        obj1 = new j(com/roidapp/photogrid/cloud/FlickrSelectorActivity, context, "2b648660edac9af3893a7efdce0e3a7a", "59366f3548cdede2", "flickrj-sketchguru-oauth");
        a.add(obj1);
        obj1 = new com.roidapp.cloudlib.dropbox.a(com/roidapp/photogrid/cloud/DropBoxSelectorActivity, context, "5tjilag14iugj2j", "cum7xl4lfwklnl3", com.dropbox.client2.session.Session.AccessType.DROPBOX);
        a.add(obj1);
        obj1 = new com.roidapp.cloudlib.google.h(com/roidapp/photogrid/cloud/GoogleSearchSelectorActivity, context);
        a.add(obj1);
        new com.roidapp.cloudlib.twitter.a(context, "VGFGmjpouSSSQoU36I7w", "NFzbR9ahrDVPQJYnu1tkdrhxt9LcE1NBJu2eqUNA", "photogrid-twitter", "photogrid-twitter:///");
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        namenotfoundexception.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Context context, int i, String s1)
    {
        Log.e("ClientProxyImplement", (new StringBuilder("handleException ")).append(i).toString());
        switch (i)
        {
        default:
            return;

        case 4352: 
            an.c(new WeakReference(context), context.getResources().getString(0x7f0702e3));
            return;

        case 4354: 
            an.c(new WeakReference(context), context.getResources().getString(0x7f07028d));
            return;

        case 4353: 
            an.c(new WeakReference(context), context.getResources().getString(0x7f07004e));
            return;
        }
    }

    public final void a(Context context, String s1)
    {
        af.b(context, s1);
    }

    public final void a(Context context, String s1, String s2, String s3, Long long1, Map map)
    {
        af.a(context, s1, s2, s3, long1, map);
    }

    public final void a(String s1)
    {
        com.roidapp.photogrid.common.b.a(s1);
    }

    public final void a(String s1, int i, int k)
    {
        com.roidapp.photogrid.b.f.a(s1, i, k);
    }

    public final boolean a(Bundle bundle)
    {
        return com.roidapp.photogrid.common.an.b(bundle);
    }

    public final String[] a(Context context, Uri uri, boolean flag)
    {
        rf.a();
        return rf.a(context, uri, flag);
    }

    public final ak b(String s1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ak ak1 = (ak)iterator.next();
            if (ak1.a.equalsIgnoreCase(s1))
            {
                return ak1;
            }
        }

        return null;
    }

    public final InputStream b(Context context)
    {
        return context.getAssets().open("templates/info");
    }

    public final Class b()
    {
        return com/roidapp/photogrid/common/PrivacyPolicy;
    }

    public final void b(Context context, String s1)
    {
        af.d(context, s1);
    }

    public final InputStream c(Context context, String s1)
    {
        return context.getAssets().open((new StringBuilder("templates/")).append(s1).toString());
    }

    public final Class c()
    {
        return com/roidapp/photogrid/common/Eula;
    }

    public final boolean c(Context context)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("SHOW_NOTIFICATION_FLAG", true);
    }

    public final l d(Context context, String s1)
    {
        if (!az.B && !TextUtils.isEmpty(s1))
        {
            com.roidapp.photogrid.common.a.a();
            if (com.roidapp.photogrid.common.a.a(context, s1, true) && !d(context))
            {
                return new com.roidapp.photogrid.cloud.a();
            }
        }
        return null;
    }

    public final Class d()
    {
        return com/roidapp/photogrid/release/ImageSelector;
    }

    public final boolean d(Context context)
    {
        return m.a(context) == 1;
    }

    public final Intent e(Context context, String s1)
    {
        context = new Intent(context, com/roidapp/photogrid/filter/ImageEditGLESActivity);
        context.putExtra("image_path", s1);
        context.putExtra("entry_from", 10);
        context.putExtra("entry_type", 1);
        context.putExtra("edit_suppot_filter", false);
        context.putExtra("edit_image_index", 0);
        return context;
    }

    public final ArrayList e()
    {
        return a;
    }

    public final boolean e(Context context)
    {
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        boolean flag;
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            b = Boolean.valueOf(flag);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b = Boolean.valueOf(false);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b = Boolean.valueOf(false);
        }
        return b.booleanValue();
    }

    public final boolean f()
    {
        return com.roidapp.baselib.gl.c.a().b();
    }
}
