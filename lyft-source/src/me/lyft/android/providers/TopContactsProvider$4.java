// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.content.ContentResolver;
import android.database.Cursor;
import me.lyft.android.common.Closeables;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.providers:
//            TopContactsProvider, UserContact

class val.limit
    implements rx.
{

    final TopContactsProvider this$0;
    final int val$limit;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj1 = null;
        Object obj;
        obj = TopContactsProvider.access$200(TopContactsProvider.this);
        android.net.Uri uri = android.provider.cts.CONTENT_URI;
        String s1 = String.format("%s=? OR %s=?", new Object[] {
            "display_name_source", "display_name_source"
        });
        String s3 = String.format("%s DESC LIMIT %d", new Object[] {
            "times_contacted", Integer.valueOf(val$limit)
        });
        obj = ((ContentResolver) (obj)).query(uri, new String[] {
            "_id", "last_time_contacted", "times_contacted", "photo_uri", "display_name", "display_name_source"
        }, s1, new String[] {
            String.valueOf(40), String.valueOf(35)
        }, s3);
        obj1 = obj;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L3
_L3:
        obj = obj1;
        String s = TopContactsProvider.access$300(((Cursor) (obj1)), "display_name");
        obj = obj1;
        String s2 = TopContactsProvider.access$300(((Cursor) (obj1)), "photo_uri");
        obj = obj1;
        subscriber.onNext((new UserContact(s)).setPhotoUri(s2));
        obj = obj1;
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        Closeables.closeQuietly(((java.io.Closeable) (obj1)));
        subscriber.onCompleted();
        return;
        Object obj2;
        obj2;
        obj1 = null;
_L7:
        obj = obj1;
        subscriber.onError(((Throwable) (obj2)));
        Closeables.closeQuietly(((java.io.Closeable) (obj1)));
        subscriber.onCompleted();
        return;
        obj;
_L5:
        Closeables.closeQuietly(((java.io.Closeable) (obj1)));
        subscriber.onCompleted();
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
        if (true) goto _L7; else goto _L6
_L6:
    }

    ()
    {
        this$0 = final_topcontactsprovider;
        val$limit = I.this;
        super();
    }
}
