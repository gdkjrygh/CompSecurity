// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.gcm.GCMReceiver;
import com.pandora.android.util.s;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.pandora.android.inbox:
//            f, InboxNotification, b

public class InboxNotificationProcessor extends IntentService
{

    public InboxNotificationProcessor()
    {
        super(com/pandora/android/inbox/InboxNotificationProcessor.getSimpleName());
    }

    public static transient void a(Context context, long al[])
    {
        Intent intent = new Intent(context, com/pandora/android/inbox/InboxNotificationProcessor);
        intent.setAction("mark_seen");
        intent.putExtra("inbox_ids", al);
        GCMReceiver.a(context, intent);
    }

    public static transient void a(Context context, InboxNotification ainboxnotification[])
    {
        Intent intent = new Intent(context, com/pandora/android/inbox/InboxNotificationProcessor);
        intent.setAction("update_inbox_notifications");
        intent.putExtra("inbox_notifications", ainboxnotification);
        GCMReceiver.a(context, intent);
    }

    private static transient void a(p.cx.x.d d1, long al[])
    {
        Long along[] = new Long[al.length];
        for (int i = 0; i < along.length; i++)
        {
            along[i] = Long.valueOf(al[i]);
        }

        (new f(d1)).a_(along);
    }

    public static transient void b(Context context, long al[])
    {
        a(p.cx.x.d.c, al);
        a(context, al);
    }

    public static transient void c(Context context, long al[])
    {
        Intent intent = new Intent(context, com/pandora/android/inbox/InboxNotificationProcessor);
        intent.setAction("mark_dismissed");
        intent.putExtra("inbox_ids", al);
        GCMReceiver.a(context, intent);
    }

    public static transient void d(Context context, long al[])
    {
        a(p.cx.x.d.d, al);
        c(context, al);
    }

    transient void a(long al[])
    {
        ContentValues acontentvalues[] = new ContentValues[al.length];
        for (int i = 0; i < al.length; i++)
        {
            long l = al[i];
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("_id", Long.valueOf(l));
            contentvalues.put("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE", Boolean.valueOf(true));
            acontentvalues[i] = contentvalues;
        }

        getContentResolver().bulkInsert(b.a.a, acontentvalues);
    }

    transient void a(InboxNotification ainboxnotification[])
    {
        ContentValues acontentvalues[] = new ContentValues[ainboxnotification.length];
        for (int i = 0; i < ainboxnotification.length; i++)
        {
            ContentValues contentvalues = ainboxnotification[i].a();
            contentvalues.put("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE", Boolean.valueOf(true));
            acontentvalues[i] = contentvalues;
        }

        getContentResolver().bulkInsert(b.a, acontentvalues);
    }

    transient void b(long al[])
    {
        al = (new StringBuilder()).append("%s IN (").append(s.a(", ", al)).append(")").toString();
        getContentResolver().delete(b.a, String.format(Locale.US, al, new Object[] {
            "_id"
        }), null);
        getContentResolver().delete(b.a.a, String.format(Locale.US, al, new Object[] {
            "_id"
        }), null);
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        Object obj = intent.getAction();
        if (!"update_inbox_notifications".equals(obj)) goto _L4; else goto _L3
_L3:
        obj = intent.getParcelableArrayExtra("inbox_notifications");
        a((InboxNotification[])Arrays.copyOf(((Object []) (obj)), obj.length, [Lcom/pandora/android/inbox/InboxNotification;));
_L6:
        GCMReceiver.a(intent);
_L2:
        return;
_L4:
        if ("mark_seen".equals(obj))
        {
            a(intent.getLongArrayExtra("inbox_ids"));
        } else
        if ("mark_dismissed".equals(obj))
        {
            b(intent.getLongArrayExtra("inbox_ids"));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
