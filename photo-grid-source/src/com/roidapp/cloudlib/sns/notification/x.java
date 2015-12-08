// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.roidapp.baselib.a.b;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.f.a;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.push.GcmBroadcastReceiver;
import com.roidapp.cloudlib.push.f;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.c;
import com.roidapp.cloudlib.sns.b.h;
import com.roidapp.cloudlib.sns.b.i;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            y

public final class x
{

    public static f[] a(Context context, JSONObject jsonobject, Bundle bundle)
    {
        if (!a.b) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (flag)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        Object obj = (ActivityManager)context.getSystemService("activity");
        if (obj != null)
        {
            obj = ((ActivityManager) (obj)).getRunningTasks(1);
            if (obj != null && !((List) (obj)).isEmpty())
            {
                obj = (android.app.ActivityManager.RunningTaskInfo)((List) (obj)).get(0);
                if (obj != null && (((android.app.ActivityManager.RunningTaskInfo) (obj)).baseActivity != null && "com.roidapp.photogrid".equals(((android.app.ActivityManager.RunningTaskInfo) (obj)).baseActivity.getPackageName()) || ((android.app.ActivityManager.RunningTaskInfo) (obj)).topActivity != null && "com.roidapp.photogrid".equals(((android.app.ActivityManager.RunningTaskInfo) (obj)).topActivity.getPackageName())))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1;
        if (!af.a(context))
        {
            return null;
        }
        long l1 = n.a(jsonobject, "sns_uid");
        if (q.a(context).c().b.a != l1)
        {
            return null;
        }
        obj1 = new c();
        ((c) (obj1)).a(jsonobject, false);
        if (((c) (obj1)).isEmpty()) goto _L6; else goto _L5
_L5:
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList(((c) (obj1)).size());
        iterator = ((c) (obj1)).iterator();
_L10:
        if (!iterator.hasNext()) goto _L8; else goto _L7
_L7:
        h h1 = (h)iterator.next();
        if (h1 == null || h1.a == null || h1.c == null || h1.c.b == null) goto _L10; else goto _L9
_L9:
        String s;
        Object obj2;
        s = null;
        obj1 = null;
        obj2 = null;
        com.roidapp.cloudlib.sns.notification.y.a[h1.a.ordinal()];
        JVM INSTR tableswitch 1 5: default 312
    //                   1 315
    //                   2 577
    //                   3 619
    //                   4 654
    //                   5 696;
           goto _L10 _L11 _L12 _L13 _L14 _L15
_L11:
        int j;
        int k;
        int l;
        jsonobject = context.getString(at.aJ, new Object[] {
            h1.c.b
        });
        l = 0;
        k = 0;
        j = 1;
_L20:
        if (k == 0)
        {
            bundle.putInt("snsPid", h1.e);
        }
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            break MISSING_BLOCK_LABEL_467;
        }
        obj1 = com.roidapp.cloudlib.sns.c.a(h1.c.h);
        k = context.getResources().getDimensionPixelSize(0x1050005);
        int i1 = context.getResources().getDimensionPixelSize(0x1050006);
        long l2;
        if (obj1 != null && ((File) (obj1)).exists())
        {
            try
            {
                com.roidapp.baselib.a.a.a();
                obj1 = com.roidapp.baselib.a.a.a(((File) (obj1)).getAbsolutePath(), k);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((OutOfMemoryError) (obj1)).printStackTrace();
                obj1 = obj2;
            }
        } else
        {
            try
            {
                obj1 = BitmapFactory.decodeResource(context.getResources(), aq.w);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
                outofmemoryerror = ((OutOfMemoryError) (obj2));
            }
        }
        if (obj1 == null) goto _L17; else goto _L16
_L16:
        obj2 = com.roidapp.baselib.a.a.a().a(((android.graphics.Bitmap) (obj1)), k, i1, false);
        obj1 = obj2;
_L17:
        obj2 = obj1;
        if (obj1 == null) goto _L19; else goto _L18
_L18:
        obj2 = b.a(((android.graphics.Bitmap) (obj1)));
_L19:
        obj1 = obj2;
_L21:
        OutOfMemoryError outofmemoryerror1;
        if (l != 0)
        {
            k = 6;
        } else
        {
            k = 4;
        }
        if (j != 0)
        {
            j = h1.e;
        } else
        {
            j = GcmBroadcastReceiver.a;
            GcmBroadcastReceiver.a = j + 1;
        }
        l = h1.e;
        l2 = h1.f;
        arraylist.add(new f(k, j, "PGSns", (new StringBuilder("PGSns")).append(n.b((new StringBuilder()).append(s).append(jsonobject).append(l).append(l2).toString())).toString(), jsonobject, s, bundle, ((android.graphics.Bitmap) (obj1)), false));
          goto _L10
_L12:
        jsonobject = context.getString(at.aH, new Object[] {
            h1.c.b
        });
        s = h1.b;
        l = 1;
        k = 0;
        j = 0;
          goto _L20
_L13:
        jsonobject = context.getString(at.aI, new Object[] {
            h1.c.b
        });
        l = 0;
        k = 1;
        j = 0;
          goto _L20
_L14:
        jsonobject = context.getString(at.aK, new Object[] {
            h1.c.b
        });
        s = h1.b;
        l = 0;
        k = 0;
        j = 1;
          goto _L20
_L15:
        jsonobject = context.getString(at.aK, new Object[] {
            h1.c.b
        });
        s = h1.b;
        l = 0;
        k = 0;
        j = 1;
          goto _L20
        outofmemoryerror1;
_L22:
        outofmemoryerror1.printStackTrace();
          goto _L21
_L8:
        return (f[])arraylist.toArray(new f[arraylist.size()]);
_L6:
        return null;
        outofmemoryerror1;
          goto _L22
    }
}
