// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.o;
import java.util.TimerTask;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            am, Camera2InputPopup

final class al extends TimerTask
{

    final Camera2InputPopup a;
    private final o b;
    private OfflinePackage c;

    public al(Camera2InputPopup camera2inputpopup, OfflinePackage offlinepackage)
    {
        a = camera2inputpopup;
        super();
        b = (o)Singleton.c.b();
        c = offlinepackage;
    }

    public final void run()
    {
        try
        {
            OfflinePackage offlinepackage = b.b(c);
            b.f(offlinepackage);
            int i = (int)((offlinepackage.c() * 360L) / offlinepackage.b());
            a.a(new am(this, i));
            return;
        }
        catch (OfflineTranslationException offlinetranslationexception)
        {
            offlinetranslationexception.getLocalizedMessage();
        }
    }
}
