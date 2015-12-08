// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.DialogInterface;

// Referenced classes of package kik.android.widget.preferences:
//            LicensePreference

final class am
    implements android.content.DialogInterface.OnClickListener
{

    final LicensePreference a;

    am(LicensePreference licensepreference)
    {
        a = licensepreference;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
