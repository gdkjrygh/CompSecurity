// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class BundleCompatDonut
{

    private static final String TAG = "BundleCompatDonut";
    private static Method sGetIBinderMethod;
    private static boolean sGetIBinderMethodFetched;
    private static Method sPutIBinderMethod;
    private static boolean sPutIBinderMethodFetched;

    BundleCompatDonut()
    {
    }

    public static IBinder getBinder(Bundle bundle, String s)
    {
        if (!sGetIBinderMethodFetched)
        {
            try
            {
                sGetIBinderMethod = android/os/Bundle.getMethod("getIBinder", new Class[] {
                    java/lang/String
                });
                sGetIBinderMethod.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.i("BundleCompatDonut", "Failed to retrieve getIBinder method", nosuchmethodexception);
            }
            sGetIBinderMethodFetched = true;
        }
        if (sGetIBinderMethod == null) goto _L2; else goto _L1
_L1:
        bundle = (IBinder)sGetIBinderMethod.invoke(bundle, new Object[] {
            s
        });
        return bundle;
        bundle;
_L4:
        Log.i("BundleCompatDonut", "Failed to invoke getIBinder via reflection", bundle);
        sGetIBinderMethod = null;
_L2:
        return null;
        bundle;
        continue; /* Loop/switch isn't completed */
        bundle;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void putBinder(Bundle bundle, String s, IBinder ibinder)
    {
        if (!sPutIBinderMethodFetched)
        {
            try
            {
                sPutIBinderMethod = android/os/Bundle.getMethod("putIBinder", new Class[] {
                    java/lang/String, android/os/IBinder
                });
                sPutIBinderMethod.setAccessible(true);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.i("BundleCompatDonut", "Failed to retrieve putIBinder method", nosuchmethodexception);
            }
            sPutIBinderMethodFetched = true;
        }
        if (sPutIBinderMethod == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        sPutIBinderMethod.invoke(bundle, new Object[] {
            s, ibinder
        });
        return;
        bundle;
_L2:
        Log.i("BundleCompatDonut", "Failed to invoke putIBinder via reflection", bundle);
        sPutIBinderMethod = null;
        return;
        bundle;
        continue; /* Loop/switch isn't completed */
        bundle;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
