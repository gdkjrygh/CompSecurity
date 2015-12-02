// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.qihoo.security.locale.d;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo360.mobilesafe.b:
//            o, q

public class m
{

    public static Intent a(Context context, Class class1)
    {
        return b(context, class1, null);
    }

    private static String a(Context context)
    {
        Object obj1 = new Intent("android.intent.action.MAIN");
        ((Intent) (obj1)).addCategory("android.intent.category.HOME");
        Object obj = null;
        try
        {
            obj1 = context.getPackageManager().resolveActivity(((Intent) (obj1)), 0x10000);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        context = obj;
        if (((ResolveInfo) (obj1)).activityInfo != null)
        {
            context = ((ResolveInfo) (obj1)).activityInfo.packageName;
        }
        return context;
    }

    private static String a(Context context, String s)
    {
        Object obj = context.getPackageManager().getInstalledPackages(8);
        context = a(context);
        if (obj != null && !TextUtils.isEmpty(context) && !TextUtils.isEmpty(s))
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ProviderInfo aproviderinfo[] = ((PackageInfo)((Iterator) (obj)).next()).providers;
                if (aproviderinfo != null)
                {
                    int j = aproviderinfo.length;
                    int i = 0;
                    while (i < j) 
                    {
                        ProviderInfo providerinfo = aproviderinfo[i];
                        if (providerinfo != null && s.equals(providerinfo.readPermission) && context.equalsIgnoreCase(providerinfo.packageName))
                        {
                            return providerinfo.authority;
                        }
                        i++;
                    }
                }
            } while (true);
        }
        return null;
    }

    public static void a(Context context, Class class1, int i)
    {
        Intent intent = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", d.a().a(i));
        intent.putExtra("android.intent.extra.shortcut.INTENT", a(context, class1));
        context.sendBroadcast(intent);
    }

    public static void a(Context context, Class class1, int i, int j, Bitmap bitmap)
    {
        a(context, class1, i, j, bitmap, null);
    }

    public static void a(Context context, Class class1, int i, int j, Bitmap bitmap, String as[])
    {
        Intent intent;
        if (a(context, class1, as))
        {
            return;
        }
        if (!o.c(context))
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                (new Handler(Looper.getMainLooper())).post(new Runnable() {

                    public void run()
                    {
                        q.a().a(0x7f0c018e, 0x7f020143);
                    }

                });
                return;
            } else
            {
                q.a().a(0x7f0c018e, 0x7f020143);
                return;
            }
        }
        intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("duplicate", false);
        intent.putExtra("android.intent.extra.shortcut.NAME", d.a().a(j));
        if (i == 0) goto _L2; else goto _L1
_L1:
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(context, i));
_L4:
        intent.putExtra("android.intent.extra.shortcut.INTENT", b(context, class1, as));
        context.sendBroadcast(intent);
        return;
_L2:
        if (bitmap != null)
        {
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(Context context, int i)
    {
        Object obj;
        obj = a(context, "com.android.launcher.permission.READ_SETTINGS");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return false;
        }
        obj = Uri.parse((new StringBuilder()).append("content://").append(((String) (obj))).append("/favorites?notify=true").toString());
        context = context.getContentResolver();
        String s = d.a().a(i);
        context = context.query(((Uri) (obj)), new String[] {
            "title", "iconResource", "intent"
        }, "title=?", new String[] {
            s
        }, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_119;
        }
        context.close();
        return true;
        context;
        context.printStackTrace();
        return false;
    }

    public static boolean a(Context context, Class class1, String as[])
    {
        class1 = b(context, class1, as);
        as = a(context, "com.android.launcher.permission.READ_SETTINGS");
        if (TextUtils.isEmpty(as))
        {
            return false;
        }
        as = Uri.parse((new StringBuilder()).append("content://").append(as).append("/favorites?notify=true").toString());
        context = context.getContentResolver();
        class1 = class1.toUri(0);
        context = context.query(as, new String[] {
            "title", "iconResource", "intent"
        }, "intent=?", new String[] {
            class1
        }, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_125;
        }
        context.close();
        return true;
        context;
        context.printStackTrace();
        return false;
    }

    public static Intent b(Context context, Class class1, String as[])
    {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addFlags(0x10000000);
        intent.addFlags(0x200000);
        intent.setClassName(context, class1.getName());
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                context = as[i];
                if (context != null)
                {
                    intent.addCategory(context);
                }
            }

        }
        return intent;
    }
}
