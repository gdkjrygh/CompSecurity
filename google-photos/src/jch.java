// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

final class jch
{

    final Context a;
    private final noz b;
    private final noz c;

    jch(Context context)
    {
        a = context;
        b = noz.a(context, 3, "UpdateAppData", new String[0]);
        c = noz.a(context, "UpdateAppData", new String[0]);
    }

    private boolean a(String s, String s1)
    {
_L2:
        return false;
        if (TextUtils.isEmpty(s) || s.equals(s1)) goto _L2; else goto _L1
_L1:
        Object obj;
        String as[];
        int i;
        int j;
        obj = s.split("\\.");
        as = s1.split("\\.");
        j = Math.min(obj.length, as.length);
        i = 0;
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        long l;
        long l1;
        l = Long.parseLong(obj[i]);
        l1 = Long.parseLong(as[i]);
        if (l < l1)
        {
            return true;
        }
        if (l > l1) goto _L2; else goto _L3
_L3:
        i++;
          goto _L4
        obj;
        if (!c.a()) goto _L2; else goto _L5
_L5:
        noy.a("currentVersionCode", s);
        noy.a("minimumVersionCode", s1);
        return false;
        if (as.length <= obj.length) goto _L2; else goto _L6
_L6:
        if (b.a())
        {
            noy.a("currentVersionCode", s);
            noy.a("minimumVersionCode", s1);
        }
        return true;
    }

    final boolean a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a(a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }
}
