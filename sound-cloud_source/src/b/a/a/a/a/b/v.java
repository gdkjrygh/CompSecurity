// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import android.content.Context;
import android.content.pm.PackageManager;
import b.a.a.a.a.a.d;

// Referenced classes of package b.a.a.a.a.b:
//            u

final class v
    implements d
{

    final u a;

    v(u u)
    {
        a = u;
        super();
    }

    public final Object a(Context context)
        throws Exception
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
