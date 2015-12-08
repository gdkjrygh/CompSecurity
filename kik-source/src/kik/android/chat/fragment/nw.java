// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import kik.android.util.bf;

// Referenced classes of package kik.android.chat.fragment:
//            KikPreferenceLaunchpad

final class nw
    implements android.content.DialogInterface.OnCancelListener
{

    final bf a;
    final KikPreferenceLaunchpad b;

    nw(KikPreferenceLaunchpad kikpreferencelaunchpad, bf bf1)
    {
        b = kikpreferencelaunchpad;
        a = bf1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.cancel(true);
    }
}
