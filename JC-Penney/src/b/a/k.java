// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.crittercism.app.CrittercismConfig;

public final class k
{

    public String a;
    public int b;

    public k(Context context, CrittercismConfig crittercismconfig)
    {
        a = "1.0";
        b = 0;
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            a = ((PackageInfo) (context)).versionName;
            b = ((PackageInfo) (context)).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        context = crittercismconfig.c();
        if (context != null && context.length() > 0)
        {
            a = context;
        }
        if (crittercismconfig.e())
        {
            a = (new StringBuilder()).append(a).append("-").append(Integer.toString(b)).toString();
        }
    }
}
