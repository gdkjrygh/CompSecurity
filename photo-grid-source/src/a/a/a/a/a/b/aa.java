// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.a.a.d;
import android.content.Context;
import android.content.pm.PackageManager;

// Referenced classes of package a.a.a.a.a.b:
//            z

final class aa
    implements d
{

    final z a;

    aa(z z)
    {
        a = z;
        super();
    }

    public final Object a(Context context)
    {
        String s = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        context = s;
        if (s == null)
        {
            context = "";
        }
        return context;
    }
}
