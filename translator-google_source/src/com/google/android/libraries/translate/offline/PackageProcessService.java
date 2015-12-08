// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            y, OfflineTranslationException, o, OfflinePackage, 
//            j, ac, z, b

public class PackageProcessService extends IntentService
{

    private final Set a = new HashSet();
    private final z b = new y(this);

    public PackageProcessService()
    {
        super("PackageProcessService");
    }

    public static void a(Context context, long l)
    {
        Intent intent = new Intent(context, com/google/android/libraries/translate/offline/PackageProcessService);
        intent.putExtra("download_id", l);
        context.startService(intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        j j1;
        Context context;
        o o1;
        z z1;
        Object obj;
        long l;
        long l1;
        l = intent.getLongExtra("download_id", 0L);
        if (l <= 0L)
        {
            return;
        }
        if (a.contains(Long.valueOf(l)))
        {
            return;
        }
        context = getApplicationContext();
        o1 = (o)Singleton.c.b();
        z1 = b;
        l1 = System.currentTimeMillis();
        obj = new ArrayList();
        Iterator iterator = o1.c().iterator();
        intent = null;
        j1 = null;
label0:
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            OfflinePackage offlinepackage1 = (OfflinePackage)iterator.next();
            if (offlinepackage1.c == OfflinePackage.Status.DOWNLOADED_POST_PROCESSED)
            {
                continue;
            }
            Iterator iterator2 = offlinepackage1.d.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    continue label0;
                }
                j j2 = (j)iterator2.next();
                String s = String.valueOf(j2.c);
                if (s.length() != 0)
                {
                    "restoring file:".concat(s);
                } else
                {
                    new String("restoring file:");
                }
                j2.d();
            } while (j2.e == OfflinePackage.Status.DOWNLOADED_POST_PROCESSED || !j2.b() || j2.j != l);
            ((List) (obj)).add(offlinepackage1);
            intent = offlinepackage1.a;
            j1 = j2;
        } while (true);
        if (j1 != null) goto _L2; else goto _L1
_L1:
        a.add(Long.valueOf(l));
        Singleton.b().b();
        h.a(20);
        stopForeground(true);
        return;
_L2:
        OfflinePackage offlinepackage;
        boolean flag;
        flag = j1.a.c(j1);
        if (flag)
        {
            intent = "en";
        }
        ac ac1 = j1.a;
        z1.a();
        if (!ac1.a(j1))
        {
            OfflinePackage offlinepackage2;
            for (Iterator iterator1 = ((List) (obj)).iterator(); iterator1.hasNext(); offlinepackage2.a(false))
            {
                offlinepackage2 = (OfflinePackage)iterator1.next();
                offlinepackage2.c = OfflinePackage.Status.ERROR;
                offlinepackage2.e = j1.a();
            }

            Singleton.b().a(Event.OFFLINE_FILE_INSTALL_FAILED, l1, intent, null);
        }
        OfflineTranslationException offlinetranslationexception;
        if (j1.e == OfflinePackage.Status.ERROR)
        {
            Singleton.b().a(Event.OFFLINE_FILE_INSTALL_FAILED, l1, intent, null);
            if (flag)
            {
                com.google.android.libraries.translate.offline.b.a(context).c();
            }
        } else
        if (flag)
        {
            new com.google.android.libraries.translate.tts.a.k(intent);
            Singleton.b().a("installed", j1.a.g(), null);
        } else
        if (((List) (obj)).size() == 1)
        {
            new com.google.android.libraries.translate.tts.a.k(intent);
            Singleton.b().a("installed", (OfflinePackage)((List) (obj)).get(0), null);
        }
        obj = ((List) (obj)).iterator();
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_616;
        }
        offlinepackage = (OfflinePackage)((Iterator) (obj)).next();
        if (!ac1.b(offlinepackage))
        {
            break MISSING_BLOCK_LABEL_606;
        }
        ac1.c(offlinepackage);
_L4:
        o1.e(offlinepackage);
        break MISSING_BLOCK_LABEL_437;
        try
        {
            o1.f(offlinepackage);
        }
        // Misplaced declaration of an exception variable
        catch (OfflineTranslationException offlinetranslationexception)
        {
            offlinepackage.c = OfflinePackage.Status.ERROR;
            offlinepackage.e = offlinetranslationexception.getErrorMessage(context);
            offlinepackage.a(false);
            offlinepackage.a(context, false);
            break MISSING_BLOCK_LABEL_437;
        }
        if (true) goto _L4; else goto _L3
_L3:
        o1.d();
        Singleton.b().a(Event.OFFLINE_FILE_INSTALL_COMPLETE, l1, intent, null);
        z1.b();
        if (!flag || j1.e != OfflinePackage.Status.ERROR)
        {
            com.google.android.libraries.translate.offline.b.a(context).b();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
