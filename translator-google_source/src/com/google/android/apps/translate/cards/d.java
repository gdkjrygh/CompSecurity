// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.a.i;
import com.google.android.libraries.translate.offline.ac;
import com.google.android.libraries.translate.offline.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.cards:
//            TranslateErrorCard, e

final class d
    implements Runnable
{

    final TranslateErrorCard a;

    d(TranslateErrorCard translateerrorcard)
    {
        a = translateerrorcard;
        super();
    }

    public final void run()
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = TranslateErrorCard.a(a).iterator();
_L2:
        OfflinePackage offlinepackage;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        offlinepackage = (OfflinePackage)iterator.next();
        offlinepackage = TranslateErrorCard.b(a).b(offlinepackage);
        if (offlinepackage != null)
        {
            try
            {
                if (TranslateErrorCard.b(a).b(PackageType.TRANSLATE).a(offlinepackage.a) == null)
                {
                    arraylist.add(offlinepackage);
                }
            }
            catch (OfflineTranslationException offlinetranslationexception) { }
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (!arraylist.isEmpty())
        {
            (new i((OfflinePackage[])arraylist.toArray(new OfflinePackage[arraylist.size()]), TranslateErrorCard.b(a), a.getContext(), Event.OFFLINE_DOWNLOAD_FROM_ERROR_CARD, new e(this), true, false)).onClick(null);
        }
        return;
    }
}
