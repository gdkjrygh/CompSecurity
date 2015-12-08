// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.DialogInterface;

// Referenced classes of package crittercism.android:
//            az, dx

final class a
    implements android.content.Interface.OnClickListener
{

    final String a;
    final az b;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            az.A().a(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            dx.c("CrittercismInstance", "YES button failed.  Email support@crittercism.com.");
        }
    }

    rface(az az1, String s)
    {
        b = az1;
        a = s;
        super();
    }
}
