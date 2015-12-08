// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.microsoft.onlineid.internal.a.f;
import com.microsoft.onlineid.sts.e;
import com.microsoft.onlineid.sts.n;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class d
{

    private final Context a;
    private final PackageManager b;
    private final n c;

    public d()
    {
        a = null;
        b = null;
        c = null;
    }

    public d(Context context)
    {
        a = context;
        b = context.getPackageManager();
        c = new n(context);
        f.a(context);
    }

    public final boolean a(int i, String s)
    {
        String as[] = b.getPackagesForUid(i);
        if (as == null || as.length == 0)
        {
            return false;
        } else
        {
            return Arrays.asList(as).contains(s);
        }
    }

    public final boolean a(String s)
    {
        if (!a.getPackageName().equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Object obj;
        ArrayList arraylist;
        f.a();
        MessageDigest messagedigest;
        PackageInfo packageinfo;
        Signature asignature[];
        int i;
        int j;
        try
        {
            packageinfo = b.getPackageInfo(s, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.microsoft.onlineid.internal.c.d.c((new StringBuilder("Cannot check trust state of missing package: ")).append(s).toString(), ((Throwable) (obj)));
            com.microsoft.onlineid.internal.e.a(false);
            return false;
        }
        obj = c.c(n.e);
        arraylist = new ArrayList();
        messagedigest = e.a();
        asignature = packageinfo.signatures;
        j = asignature.length;
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                String s1 = Base64.encodeToString(messagedigest.digest(asignature[i].toByteArray()), 2);
                if (((Set) (obj)).contains(s1))
                {
                    break label0;
                }
                arraylist.add(s1);
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        com.microsoft.onlineid.internal.c.d.b((new StringBuilder("Not trusting ")).append(s).append(" because no matching hash was found in the whitelist.").toString());
        com.microsoft.onlineid.internal.c.d.b((new StringBuilder("Hashes for ")).append(s).append(" are: ").append(Arrays.toString(arraylist.toArray())).toString());
        com.microsoft.onlineid.internal.c.d.b((new StringBuilder("Whitelist is: ")).append(Arrays.toString(((Set) (obj)).toArray())).toString());
        return false;
    }
}
