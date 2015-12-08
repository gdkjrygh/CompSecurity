// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import com.google.android.apps.translate.offline.OfflineDownloadReceiver;
import com.google.android.libraries.translate.offline.PackageType;

// Referenced classes of package com.google.android.apps.translate.cards:
//            TranslateErrorCard

final class c
    implements Runnable
{

    final TranslateErrorCard a;

    c(TranslateErrorCard translateerrorcard)
    {
        a = translateerrorcard;
        super();
    }

    public final void run()
    {
        OfflineDownloadReceiver.a(a.getContext(), PackageType.TRANSLATE);
    }
}
