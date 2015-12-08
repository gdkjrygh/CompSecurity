// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import hcz;
import hda;
import java.util.Locale;

public final class ClientIdentity
{

    public final String a;
    public final String b;

    private ClientIdentity(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public static ClientIdentity a(Context context, ComponentName componentname)
    {
        if (componentname == null)
        {
            throw new ValidationException("Calling activity can't be null");
        }
        componentname = componentname.getPackageName();
        context = context.getPackageManager();
        try
        {
            context = context.getPackageInfo(componentname, 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new ValidationException("Can't find caller's package");
        }
        if (((PackageInfo) (context)).signatures.length != 1)
        {
            throw new ValidationException("Multiple certificates found");
        } else
        {
            return new ClientIdentity(componentname, (new String(hcz.a(hda.b(((PackageInfo) (context)).signatures[0].toByteArray())))).toUpperCase(Locale.US));
        }
    }

    private class ValidationException extends Exception
    {

        private static final long serialVersionUID = 0L;

        public ValidationException(String s)
        {
            super(s);
        }
    }

}
