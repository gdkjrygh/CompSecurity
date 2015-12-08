// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.content.ContentResolver;
import android.database.Cursor;
import me.lyft.android.common.Closeables;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.providers:
//            ContactsProvider, UserContact

class this._cls0
    implements rx.ibe
{

    final ContactsProvider this$0;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Cursor cursor1 = resolver.query(android.provider.mmonDataKinds.Email.CONTENT_URI, new String[] {
            "display_name", "data1"
        }, null, null, "display_name COLLATE NOCASE ASC");
        Cursor cursor = cursor1;
        int i = cursor1.getColumnIndex("display_name");
        cursor = cursor1;
        int j = cursor1.getColumnIndex("data1");
_L2:
        cursor = cursor1;
        if (!cursor1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        subscriber.onNext((new UserContact(cursor1.getString(i))).setEmail(cursor1.getString(j)));
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
_L6:
        cursor = cursor1;
        subscriber.onError(exception);
        Closeables.closeQuietly(cursor1);
        return;
_L1:
        cursor = cursor1;
        subscriber.onCompleted();
        Closeables.closeQuietly(cursor1);
        return;
        subscriber;
        cursor = null;
_L4:
        Closeables.closeQuietly(cursor);
        throw subscriber;
        subscriber;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        cursor1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    inds.Email()
    {
        this$0 = ContactsProvider.this;
        super();
    }
}
