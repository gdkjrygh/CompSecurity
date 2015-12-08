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
        Object obj;
        ContentResolver contentresolver = resolver;
        obj = android.provider.ta.CONTENT_URI;
        String s = (new StringBuilder()).append("display_name").append(" COLLATE NOCASE ASC").toString();
        obj = contentresolver.query(((android.net.Uri) (obj)), new String[] {
            "display_name", "data1"
        }, "mimetype LIKE ?", new String[] {
            "%organization%"
        }, s);
        Cursor cursor = ((Cursor) (obj));
        int i = ((Cursor) (obj)).getColumnIndex("display_name");
        cursor = ((Cursor) (obj));
        int j = ((Cursor) (obj)).getColumnIndex("data1");
_L2:
        cursor = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = ((Cursor) (obj));
        subscriber.onNext((new UserContact(((Cursor) (obj)).getString(i))).setCompany(((Cursor) (obj)).getString(j)));
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
_L6:
        cursor = ((Cursor) (obj));
        subscriber.onError(exception);
        Closeables.closeQuietly(((java.io.Closeable) (obj)));
        return;
_L1:
        cursor = ((Cursor) (obj));
        subscriber.onCompleted();
        Closeables.closeQuietly(((java.io.Closeable) (obj)));
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
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    ()
    {
        this$0 = ContactsProvider.this;
        super();
    }
}
