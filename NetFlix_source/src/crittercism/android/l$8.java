// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.DialogInterface;
import android.util.Log;

// Referenced classes of package crittercism.android:
//            l

final class a
    implements android.content.ogInterface.OnClickListener
{

    final l a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            l.i();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            Log.w("CrittercismInstance", "MAYBE LATER button failed.  Email support@crittercism.com.");
        }
    }

    terface(l l1)
    {
        a = l1;
        super();
    }
}
