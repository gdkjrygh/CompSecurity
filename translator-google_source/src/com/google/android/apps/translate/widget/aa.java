// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.o;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.widget:
//            LangSpinner, ac, ab

final class aa extends k
{

    final LangSpinner a;

    aa(LangSpinner langspinner)
    {
        a = langspinner;
        super();
    }

    private static transient Void a()
    {
        OfflinePackage offlinepackage;
        for (Iterator iterator = ((o)Singleton.c.b()).d(PackageType.TRANSLATE).iterator(); iterator.hasNext(); LangSpinner.b().put(offlinepackage.a, offlinepackage))
        {
            offlinepackage = (OfflinePackage)iterator.next();
            LangSpinner.a().put(offlinepackage.a, Integer.valueOf(1));
        }

          goto _L1
        OfflineTranslationException offlinetranslationexception;
        offlinetranslationexception;
        LangSpinner.b().clear();
_L4:
        return null;
_L1:
        Iterator iterator1 = ((o)Singleton.c.b()).c(PackageType.TRANSLATE).iterator();
_L2:
        OfflinePackage offlinepackage1;
        Map map;
        String s;
        if (!iterator1.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        offlinepackage1 = (OfflinePackage)iterator1.next();
        map = LangSpinner.a();
        s = offlinepackage1.a;
        byte byte0;
        if (offlinepackage1.f())
        {
            byte0 = 2;
        } else
        {
            byte0 = 3;
        }
        map.put(s, Integer.valueOf(byte0));
        LangSpinner.b().put(offlinepackage1.a, offlinepackage1);
          goto _L2
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        if (LangSpinner.a(a).isShowing())
        {
            LangSpinner.b(a).notifyDataSetChanged();
        }
    }
}
