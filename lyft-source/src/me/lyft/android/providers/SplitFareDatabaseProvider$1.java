// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import me.lyft.android.common.Closeables;
import me.lyft.android.data.ContactsDatabaseHelper;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.providers:
//            SplitFareDatabaseProvider, ContactPhone, UserContact

class this._cls0
    implements rx.FareDatabaseProvider._cls1
{

    final SplitFareDatabaseProvider this$0;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj1;
        Object obj2;
        String s;
        obj2 = null;
        s = null;
        obj1 = null;
        Object obj = SplitFareDatabaseProvider.access$000(SplitFareDatabaseProvider.this).getReadableDatabase();
        obj1 = s;
        obj2 = ((SQLiteDatabase) (obj)).query(true, "Contacts", SplitFareDatabaseProvider.access$100(), null, null, null, null, String.format("%s DESC", new Object[] {
            "times_splitted"
        }), null);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToFirst()) goto _L2; else goto _L3
_L3:
        obj1 = obj2;
        int i = ((Cursor) (obj2)).getColumnIndex("name");
        obj1 = obj2;
        int j = ((Cursor) (obj2)).getColumnIndex("phone");
_L4:
        obj1 = obj2;
        s = ((Cursor) (obj2)).getString(i);
        obj1 = obj2;
        ContactPhone contactphone = new ContactPhone(((Cursor) (obj2)).getString(j));
        obj1 = obj2;
        subscriber.onNext((new UserContact(s)).setContactPhone(contactphone));
        obj1 = obj2;
        if (((Cursor) (obj2)).moveToNext()) goto _L4; else goto _L2
_L2:
        obj1 = obj2;
        subscriber.onCompleted();
        Closeables.closeQuietly(((java.io.Closeable) (obj)));
        Closeables.closeQuietly(((java.io.Closeable) (obj2)));
        return;
        obj2;
        obj = null;
_L8:
        subscriber.onError(((Throwable) (obj2)));
        Closeables.closeQuietly(((java.io.Closeable) (obj)));
        Closeables.closeQuietly(((java.io.Closeable) (obj1)));
        return;
        subscriber;
        obj = null;
        obj1 = obj2;
_L6:
        Closeables.closeQuietly(((java.io.Closeable) (obj1)));
        Closeables.closeQuietly(((java.io.Closeable) (obj)));
        throw subscriber;
        subscriber;
        obj2 = null;
        obj1 = obj;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        subscriber;
        obj1 = obj;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        subscriber;
        obj2 = obj;
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    ()
    {
        this$0 = SplitFareDatabaseProvider.this;
        super();
    }
}
