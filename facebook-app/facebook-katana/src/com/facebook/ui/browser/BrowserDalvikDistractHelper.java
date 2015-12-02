// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.browser;

import com.facebook.dalvikdistract.DalvikDistract;

public class BrowserDalvikDistractHelper
{

    private static boolean a = false;

    public BrowserDalvikDistractHelper()
    {
    }

    public static void a()
    {
        if (a || android.os.Build.VERSION.SDK_INT < 14 || android.os.Build.VERSION.SDK_INT > 18)
        {
            return;
        }
        a = true;
        try
        {
            Object obj = Class.forName("android.webkit.JniUtil");
            Class aclass[] = new Class[1];
            aclass[0] = Long.TYPE;
            obj = ((Class) (obj)).getDeclaredMethod("canSatisfyMemoryAllocation", aclass);
            java.lang.reflect.Method method = com/facebook/ui/browser/BrowserDalvikDistractHelper.getDeclaredMethod("alwaysCanSatisfyMemoryAllocation", aclass);
            (new DalvikDistract()).hook(obj, method).commit();
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException(classnotfoundexception);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new RuntimeException(nosuchmethodexception);
        }
        catch (com.facebook.dalvikdistract.DalvikDistract.IncompatibleSignatureError incompatiblesignatureerror)
        {
            throw new RuntimeException(incompatiblesignatureerror);
        }
    }

}
