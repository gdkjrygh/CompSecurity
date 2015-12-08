// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.content.DialogInterface;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.o;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class d
    implements android.content.DialogInterface.OnClickListener
{

    final OfflinePackage a[];
    final Camera2InputPopup b;

    d(Camera2InputPopup camera2inputpopup, OfflinePackage aofflinepackage[])
    {
        b = camera2inputpopup;
        a = aofflinepackage;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        Camera2InputPopup.j(b);
        Camera2InputPopup.a(b, a, (o)Singleton.c.b());
    }
}
