// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.trash.purger;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import eto;
import jae;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jaz;
import mmv;
import muz;
import olm;

// Referenced classes of package com.google.android.apps.photos.trash.purger:
//            PurgeTrashRegisterReceiver

public class PurgeTrashService extends IntentService
{

    public PurgeTrashService()
    {
        super("PurgeTrashService");
    }

    static Intent a(Context context)
    {
        context = new Intent(context, com/google/android/apps/photos/trash/purger/PurgeTrashService);
        context.putExtra("service_type", "register_alarm_type");
        return context;
    }

    public static Intent b(Context context)
    {
        context = new Intent(context, com/google/android/apps/photos/trash/purger/PurgeTrashService);
        context.putExtra("service_type", "execute_purge_type");
        return context;
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        Object obj;
        Object obj1;
        long l;
        obj = (jaz)olm.a(getApplicationContext(), jaz);
        obj1 = intent.getStringExtra("service_type");
        if (!"execute_purge_type".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_172;
        }
        l = ((jaz) (obj)).f.a() - jaz.a;
        obj1 = ((jaz) (obj)).c.b(l);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        jaz.a(((jaz) (obj)).b, ((Long) (obj1)).longValue() + jaz.a);
        obj1 = ((jaz) (obj)).c.a(l);
        if (!((List) (obj1)).isEmpty())
        {
            int i;
            for (Iterator iterator = ((jaz) (obj)).e.a(new String[] {
    "logged_in"
}).iterator(); iterator.hasNext(); ((jaz) (obj)).d.a(i, Collections.emptyList(), ((Iterable) (obj1)), true))
            {
                i = ((Integer)iterator.next()).intValue();
            }

        }
        break MISSING_BLOCK_LABEL_185;
        obj;
        PurgeTrashRegisterReceiver.a(intent);
        throw obj;
        if (!"register_alarm_type".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_191;
        }
        ((jaz) (obj)).b();
        PurgeTrashRegisterReceiver.a(intent);
        return;
        String s = String.valueOf(obj1);
        if (s.length() != 0)
        {
            s = "Not recognizable type: ".concat(s);
        } else
        {
            s = new String("Not recognizable type: ");
        }
        throw new IllegalArgumentException(s);
    }
}
