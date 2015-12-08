// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.content.DialogInterface;
import kik.android.f.a.f;

// Referenced classes of package kik.android.chat.activity:
//            KikPlatformLanding

final class ak
    implements android.content.DialogInterface.OnClickListener
{

    final KikPlatformLanding a;

    ak(KikPlatformLanding kikplatformlanding)
    {
        a = kikplatformlanding;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        KikPlatformLanding.a(a).a(null, false, null);
        a.finish();
    }
}
