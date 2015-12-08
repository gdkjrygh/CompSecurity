// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

public final class ep
{

    public static boolean a(Context context, Class class1)
    {
        return context.getPackageManager().queryIntentServices((new Intent()).setClass(context, class1), 0x10000).size() > 0;
    }
}
