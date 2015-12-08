// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Build;

final class ono
    implements omm
{

    ono()
    {
    }

    public final void a(Activity activity, opd opd)
    {
        if ("LGE".equalsIgnoreCase(Build.BRAND))
        {
            new onn(activity, opd);
        }
    }
}
