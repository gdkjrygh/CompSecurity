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

    final az a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            az.A().C();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            dx.c("CrittercismInstance", "NO button failed.  Email support@crittercism.com.");
        }
    }

    rface(az az1)
    {
        a = az1;
        super();
    }
}
