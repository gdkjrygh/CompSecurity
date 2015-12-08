// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common:
//            ci, h

public class kb
{

    private static final kb a = new kb();

    private kb()
    {
    }

    public static kb a()
    {
        return a;
    }

    transient h a(PackageInfo packageinfo, h ah[])
    {
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        packageinfo = new ci(packageinfo.signatures[0].toByteArray());
        for (int i = 0; i < ah.length; i++)
        {
            if (ah[i].equals(packageinfo))
            {
                return ah[i];
            }
        }

        if (Log.isLoggable("GoogleSignatureVerifier", 2))
        {
            Log.v("GoogleSignatureVerifier", (new StringBuilder()).append("Signature not valid.  Found: \n").append(Base64.encodeToString(packageinfo.a(), 0)).toString());
        }
        return null;
    }

}
