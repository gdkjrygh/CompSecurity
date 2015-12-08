// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;

// Referenced classes of package kik.android.chat.fragment:
//            KikPreferenceLaunchpad

final class nu
    implements android.content.DialogInterface.OnClickListener
{

    final KikPreferenceLaunchpad a;

    nu(KikPreferenceLaunchpad kikpreferencelaunchpad)
    {
        a = kikpreferencelaunchpad;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
