// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import java.util.Iterator;
import java.util.Set;

final class gta
    implements gss
{

    gta()
    {
    }

    public final boolean a(Context context, Set set)
    {
        Iterator iterator;
        if (android.os.Build.VERSION.SDK_INT < 23)
        {
            return true;
        }
        iterator = set.iterator();
_L2:
        String s;
        int i;
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        s = (String)iterator.next();
        i = Process.myPid();
        j = Process.myUid();
        set = context.getPackageName();
        if (context.checkPermission(s, i, j) != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = -1;
_L3:
        if (i != 0)
        {
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            s = y.a(s);
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_138;
            }
            if (set != null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            set = context.getPackageManager().getPackagesForUid(j);
            if (set != null && set.length > 0)
            {
                break label0;
            }
            i = -1;
        }
          goto _L3
        set = set[0];
        if (y.a(context, s, set) == 0)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        i = -2;
          goto _L3
        i = 0;
          goto _L3
        return true;
    }
}
