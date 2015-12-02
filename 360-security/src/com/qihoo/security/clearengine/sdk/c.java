// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashClearCategory;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.opti.i.whitelist.UserBWRecord;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.clearengine.sdk:
//            b

public class c
{

    public static NumberFormat a;
    public static Comparator b = new Comparator() {

        public int a(TrashInfo trashinfo, TrashInfo trashinfo1)
        {
            if (trashinfo != null && trashinfo1 != null)
            {
                if (trashinfo.size > trashinfo1.size)
                {
                    return -1;
                }
                if (trashinfo.size < trashinfo1.size)
                {
                    return 1;
                }
            }
            return 0;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((TrashInfo)obj, (TrashInfo)obj1);
        }

    };
    private static final String c = com/qihoo/security/clearengine/sdk/c.getSimpleName();

    public c()
    {
    }

    public static final String a(String s, PackageManager packagemanager)
    {
        ApplicationInfo applicationinfo = packagemanager.getApplicationInfo(s, 128);
        if (applicationinfo == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        packagemanager = applicationinfo.loadLabel(packagemanager).toString();
        s = packagemanager;
_L2:
        packagemanager = s;
        if (s == null)
        {
            packagemanager = "";
        }
        return packagemanager;
        packagemanager;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Context context, Class class1, String s, ServiceConnection serviceconnection, int i)
    {
        try
        {
            class1 = (new Intent(context, class1)).setAction(s);
            context.getApplicationContext().bindService(class1, serviceconnection, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(TrashClearCategory trashclearcategory)
    {
        if (trashclearcategory == null || trashclearcategory.trashInfoList == null)
        {
            return;
        }
        Iterator iterator = (new ArrayList(trashclearcategory.trashInfoList)).iterator();
        long l = 0L;
        long l4 = 0L;
        long l1 = 0L;
        long l2 = 0L;
        long l3 = 0L;
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    trashclearcategory.count = l;
                    trashclearcategory.size = l4;
                    trashclearcategory.selectedCount = l1;
                    trashclearcategory.selectedSize = l2;
                    TrashInfo trashinfo;
                    Object obj;
                    b b1;
                    if (l > 0L && l3 == l)
                    {
                        trashclearcategory.isSelectedAll = true;
                        return;
                    } else
                    {
                        trashclearcategory.isSelectedAll = false;
                        return;
                    }
                }
                trashinfo = (TrashInfo)iterator.next();
            } while (trashinfo == null);
            trashinfo.bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
            obj = trashinfo.bundle.getParcelableArrayList("subList");
            if (obj != null && ((ArrayList) (obj)).size() > 0)
            {
                b1 = c(trashinfo);
                l1 += b1.d;
                l3 += b1.g;
                l2 += b1.c;
                trashinfo.count = b1.b;
                trashinfo.size = b1.a;
                if (321 == trashinfo.type || 322 == trashinfo.type || 33 == trashinfo.type)
                {
                    trashinfo.bundle.putInt("cautiousClearCount", b1.f);
                    if (trashinfo.count > 0L && trashinfo.count == b1.g)
                    {
                        trashinfo.isSelected = true;
                    } else
                    {
                        trashinfo.isSelected = false;
                    }
                }
                l += ((ArrayList) (obj)).size();
            } else
            {
                obj = d(trashinfo);
                l1 += ((b) (obj)).d;
                l3 += ((b) (obj)).g;
                l2 += ((b) (obj)).c;
                l++;
            }
            l4 = trashinfo.size + l4;
        } while (true);
    }

    public static void a(TrashInfo trashinfo)
    {
        boolean flag;
        if (trashinfo.clearType == 2 && !trashinfo.isInWhiteList)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        trashinfo.isSelected = flag;
    }

    public static void a(String s, Context context, ServiceConnection serviceconnection)
    {
        try
        {
            context.getApplicationContext().unbindService(serviceconnection);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(s, "unbindService", context);
        }
    }

    public static void a(List list)
    {
        if (list == null)
        {
            return;
        }
        Iterator iterator = list.iterator();
        do
        {
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    Collections.sort(list, b);
                    return;
                }
                obj = (TrashInfo)iterator.next();
                ((TrashInfo) (obj)).bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
                obj = ((TrashInfo) (obj)).bundle.getParcelableArrayList("subList");
            } while (obj == null);
            a(((List) (obj)));
        } while (true);
    }

    public static UserBWRecord b(TrashInfo trashinfo)
    {
        UserBWRecord userbwrecord = new UserBWRecord();
        userbwrecord.value = trashinfo.path;
        userbwrecord.type = trashinfo.type;
        int i;
        if (trashinfo.isInWhiteList)
        {
            i = 0;
        } else
        {
            i = -1;
        }
        userbwrecord.flag = i;
        userbwrecord.desc = trashinfo.desc;
        userbwrecord.packageName = trashinfo.packageName;
        if (TextUtils.isEmpty(userbwrecord.packageName))
        {
            userbwrecord.packageName = "";
        }
        trashinfo = trashinfo.bundle.getStringArrayList("pkgList");
        if (trashinfo != null)
        {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("pkgList", trashinfo);
            userbwrecord.bundle = bundle;
        }
        return userbwrecord;
    }

    private static final b c(TrashInfo trashinfo)
    {
        b b1 = new b();
        trashinfo.bundle.setClassLoader(com/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo.getClassLoader());
        trashinfo = trashinfo.bundle.getParcelableArrayList("subList").iterator();
        do
        {
            TrashInfo trashinfo1;
            do
            {
                if (!trashinfo.hasNext())
                {
                    return b1;
                }
                trashinfo1 = (TrashInfo)trashinfo.next();
            } while (trashinfo1 == null);
            b b2 = d(trashinfo1);
            b2.e = b2.e + 1;
            if (1 == trashinfo1.clearType)
            {
                b2.f = b2.f + 1;
            }
            b1.b = b1.b + b2.b;
            b1.a = b1.a + b2.a;
            b1.d = b1.d + b2.d;
            b1.c = b1.c + b2.c;
            b1.e = b1.e + b2.e;
            b1.f = b1.f + b2.f;
            b1.g = b1.g + b2.g;
        } while (true);
    }

    private static final b d(TrashInfo trashinfo)
    {
        b b1 = new b();
        if (!trashinfo.isSelected) goto _L2; else goto _L1
_L1:
        b1.g = b1.g + 1L;
        if (31 != trashinfo.type) goto _L4; else goto _L3
_L3:
        b1.d = b1.d + 1L;
        b1.c = b1.c + trashinfo.size;
_L2:
        b1.b = b1.b + 1L;
        b1.a = b1.a + trashinfo.size;
        return b1;
_L4:
        if (!trashinfo.isInWhiteList)
        {
            b1.d = b1.d + 1L;
            b1.c = b1.c + trashinfo.size;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static 
    {
        a = NumberFormat.getInstance();
        a.setMaximumFractionDigits(2);
    }
}
