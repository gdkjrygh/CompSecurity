// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.Iterator;
import java.util.List;

public final class imh
    implements dhf, omb, opv
{

    private Context a;
    private grn b;
    private ejn c;
    private Intent d;

    public imh()
    {
    }

    private static ResolveInfo a(List list, String s)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            ResolveInfo resolveinfo = (ResolveInfo)list.next();
            if (s.equals(resolveinfo.activityInfo.packageName))
            {
                return resolveinfo;
            }
        }

        return null;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        b = (grn)olm1.a(grn);
        c = (ejn)olm1.a(ejn);
        context = new Intent("android.intent.action.EDIT");
        context.setDataAndType(Uri.EMPTY, "image/jpeg");
        olm1 = a.getPackageManager().queryIntentActivities(context, 0x10000);
        context = a(((List) (olm1)), "com.google.android.apps.snapseed");
        if (context == null)
        {
            context = a(((List) (olm1)), "com.niksoftware.snapseed");
        }
        if (context != null)
        {
            olm1 = new Intent("android.intent.action.EDIT");
            olm1.setComponent(new ComponentName(((ResolveInfo) (context)).activityInfo.packageName, ((ResolveInfo) (context)).activityInfo.name));
            context = olm1;
        } else
        {
            context = null;
        }
        d = context;
    }

    public final void a(MenuItem menuitem)
    {
        ekp ekp1;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        ekp1 = b.b;
        if (ekp1 == null) goto _L2; else goto _L1
_L1:
        gtg gtg1 = (gtg)ekp1.b(gtg);
        if (ekp1.c() != euv.b || gtg1 == null || !gtg1.j()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L4:
        boolean flag1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        flag1 = true;
_L5:
        menuitem.setVisible(flag1);
        return;
_L2:
        flag = false;
          goto _L4
        flag1 = false;
          goto _L5
    }

    public final void b(MenuItem menuitem)
    {
        menuitem = b.b;
        Uri uri = c.a(menuitem, ejm.c);
        Intent intent = new Intent(d);
        intent.addFlags(0x10000001);
        intent.setDataAndType(uri, ejv.a(menuitem.c()));
        a.startActivity(intent);
    }
}
