// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

// Referenced classes of package com.facebook.internal:
//            aw

abstract class ap
{

    private static final HashSet a;

    private ap()
    {
    }

    ap(byte byte0)
    {
        this();
    }

    public static boolean a(Context context, String s)
    {
        String s1;
        int i;
        s1 = Build.BRAND;
        i = context.getApplicationInfo().flags;
        if (!s1.startsWith("generic") || (i & 2) == 0) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j;
        int k;
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        context = ((PackageInfo) (context)).signatures;
        k = context.length;
        j = 0;
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                s = aw.a(context[j].toByteArray());
                if (a.contains(s))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    protected abstract String a();

    static 
    {
        HashSet hashset = new HashSet();
        hashset.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
        hashset.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
        hashset.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
        a = hashset;
    }
}
