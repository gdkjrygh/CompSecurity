// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.content.Context;
import android.content.pm.PackageManager;

public class InstalledAppVerifier
{

    public InstalledAppVerifier()
    {
    }

    public static boolean customPackageExists(Context context, String s)
    {
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }
}
