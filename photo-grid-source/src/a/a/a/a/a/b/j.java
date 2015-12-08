// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.f;
import a.a.a.a.s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

// Referenced classes of package a.a.a.a.a.b:
//            l

public final class j
{

    public j()
    {
    }

    public static String a(Context context)
    {
        String s2 = b(context);
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = null;
            int k = l.a(context, "io.fabric.ApiKey", "string");
            int i = k;
            if (k == 0)
            {
                f.d();
                i = l.a(context, "com.crashlytics.ApiKey", "string");
            }
            if (i != 0)
            {
                s1 = context.getResources().getString(i);
            }
        }
        if (TextUtils.isEmpty(s1))
        {
            if (f.e() || l.i(context))
            {
                throw new IllegalArgumentException("Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>");
            }
            f.d().c("Fabric", "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>");
        }
        return s1;
    }

    private static String b(Context context)
    {
        String s2 = null;
        Object obj = null;
        String s1 = s2;
        Object obj1;
        try
        {
            obj1 = context.getPackageName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            f.d();
            (new StringBuilder("Caught non-fatal exception while retrieving apiKey: ")).append(context);
            return s1;
        }
        s1 = s2;
        obj1 = context.getPackageManager().getApplicationInfo(((String) (obj1)), 128).metaData;
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        s1 = s2;
        s2 = ((Bundle) (obj1)).getString("io.fabric.ApiKey");
        context = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        s1 = s2;
        f.d();
        s1 = s2;
        context = ((Bundle) (obj1)).getString("com.crashlytics.ApiKey");
        return context;
    }
}
