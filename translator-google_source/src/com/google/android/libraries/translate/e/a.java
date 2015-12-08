// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import com.google.userfeedback.android.api.ah;
import com.google.userfeedback.android.api.m;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.e:
//            b, o

public final class a
{

    private static final Intent a = new Intent("android.intent.action.BUG_REPORT");

    private static Intent a(Context context, Intent intent)
    {
label0:
        {
            context = context.getPackageManager().queryIntentServices(intent, 0);
            if (context == null)
            {
                break label0;
            }
            context = context.iterator();
            String s;
            Object obj;
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                obj = (ResolveInfo)context.next();
                s = ((ResolveInfo) (obj)).serviceInfo.packageName;
                obj = ((ResolveInfo) (obj)).serviceInfo.name;
            } while (!s.startsWith("com.google.android"));
            context = new ComponentName(s, ((String) (obj)));
            intent = new Intent(intent);
            intent.setComponent(context);
            return intent;
        }
        return null;
    }

    public static Bitmap a(Activity activity)
    {
        Bitmap bitmap;
        View view;
        int i;
        int j;
        boolean flag;
        try
        {
            view = activity.getWindow().getDecorView().getRootView();
            flag = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            bitmap = view.getDrawingCache();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return null;
        }
        activity = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        bitmap = bitmap.copy(android.graphics.Bitmap.Config.RGB_565, false);
        j = bitmap.getWidth();
        i = bitmap.getHeight();
_L2:
        if (j * i << 1 <= 0x40000)
        {
            break; /* Loop/switch isn't completed */
        }
        j /= 2;
        i /= 2;
        if (true) goto _L2; else goto _L1
_L1:
        activity = bitmap;
        if (j != bitmap.getWidth())
        {
            activity = Bitmap.createScaledBitmap(bitmap, j, i, true);
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return activity;
    }

    public static void a(Activity activity, Bitmap bitmap)
    {
        boolean flag2 = false;
        Intent intent = a;
        boolean flag;
        boolean flag1;
        if (!activity.getPackageManager().queryIntentServices(intent, 0x10000).isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (flag)
        {
            flag1 = flag2;
            if (a(((Context) (activity)), a) != null)
            {
                flag1 = true;
            }
        }
        if (flag1)
        {
            b b1 = new b(bitmap);
            if (o.f)
            {
                bitmap = a(((Context) (activity)), a);
            } else
            {
                bitmap = a;
            }
            activity.bindService(bitmap, b1, 1);
            return;
        } else
        {
            activity = new ah(activity, activity.getWindow().getDecorView(), "AndroidRuntime:V *:S", "com.google.android.apps.translate.USER_INITIATED_FEEDBACK_REPORT");
            activity.a(bitmap);
            (new m()).a(activity);
            return;
        }
    }

}
