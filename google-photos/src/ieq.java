// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;

final class ieq
    implements ier
{

    ieq(ien ien)
    {
    }

    public final boolean a(ifc ifc1)
    {
        if (ifc1.b())
        {
            if ((ifc1 = ifc1.c.getComponent()).getPackageName().equals("com.google.android.apps.plus") && (ifc1.getClassName().equals("com.google.android.apps.photos.phone.SendContentActivity") || ifc1.getClassName().equals("com.google.android.apps.photos.phone.SendContentActivityAlias")))
            {
                return true;
            }
        }
        return false;
    }
}
