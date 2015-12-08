// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.kik.android.a;
import com.kik.cache.ad;
import com.kik.view.adapters.bc;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kik.a.d.aa;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.util:
//            cd, e, bx

public final class cc
{

    private static final List a = Arrays.asList(new String[] {
        "kik.android", "com.android.bluetooth"
    });
    private a b;
    private Context c;
    private Bitmap d;
    private aa e;

    private cc(Context context, Bitmap bitmap, a a1, aa aa1)
    {
        c = context;
        d = bitmap;
        b = a1;
        e = aa1;
    }

    private static Uri a(Bitmap bitmap, String s)
    {
        if (bitmap == null)
        {
            return null;
        }
        String s1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append(File.separator).append(s).append(".png").toString();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
        bitmap = new File(s1);
        try
        {
            bitmap.createNewFile();
            (new FileOutputStream(bitmap)).write(bytearrayoutputstream.toByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
        }
        return Uri.parse((new StringBuilder("file:///sdcard/")).append(s).append(".png").toString());
    }

    static a a(cc cc1)
    {
        return cc1.b;
    }

    private static void a(List list, List list1)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (list1.contains(((ResolveInfo)list.next()).activityInfo.packageName))
            {
                list.remove();
            }
        } while (true);
    }

    public static void a(aa aa1, Context context, a a1, Bitmap bitmap, String s, String s1, String s2, String s3)
    {
        if (aa1 == null || aa1.c == null)
        {
            Toast.makeText(context, 0x7f090266, 0).show();
            return;
        }
        context = new cc(context, bitmap, a1, aa1);
        if (s3 == null)
        {
            ((cc) (context)).b.b("Share Profile Clicked").b();
        }
        a1 = ((cc) (context)).e.c;
        if (s1 != null)
        {
            aa1 = (new StringBuilder()).append(s).append(" ").append(s1).toString();
        } else
        {
            aa1 = s;
        }
        a1 = a(((cc) (context)).d, ((String) (a1)));
        bitmap = new Intent("android.intent.action.SEND");
        bitmap.setType("image/*");
        s = ((cc) (context)).c.getPackageManager().queryIntentActivities(bitmap, 0);
        a(((List) (s)), a);
        bitmap = new android.app.AlertDialog.Builder(new ContextThemeWrapper(((cc) (context)).c, 0x7f10000d));
        bitmap.setTitle(KikApplication.f(0x7f090241));
        s = new bc((Activity)((cc) (context)).c, s);
        bitmap.setAdapter(s, new cd(context, s, s3, a1, s2, s1, aa1));
        bitmap.create().show();
    }

    public static void a(aa aa1, Context context, a a1, ad ad)
    {
        if (aa1 == null || aa1.c == null)
        {
            Toast.makeText(context, 0x7f090266, 0).show();
            return;
        }
        String s;
        try
        {
            ad = kik.android.util.e.a(aa1, context, ad);
            ad = kik.android.util.e.a(context, aa1.c, ad.copy(ad.getConfig(), true));
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            kik.android.util.bx.a(aa1);
            Toast.makeText(context, 0x7f0901a1, 0).show();
            return;
        }
        s = aa1.c;
        a(aa1, context, a1, ((Bitmap) (ad)), KikApplication.a(0x7f09023f, new Object[] {
            s
        }), KikApplication.a(0x7f0900c7, new Object[] {
            s
        }), KikApplication.f(0x7f090242), null);
    }

    static Context b(cc cc1)
    {
        return cc1.c;
    }

}
