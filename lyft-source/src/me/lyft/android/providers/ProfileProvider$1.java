// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import me.lyft.android.common.Closeables;
import me.lyft.android.common.Strings;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.providers:
//            ProfileProvider

class this._cls0
    implements rx.ribe
{

    final ProfileProvider this$0;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Cursor cursor1 = ProfileProvider.access$100(ProfileProvider.this).query(Uri.withAppendedPath(android.provider.rofile.CONTENT_URI, "data"), ProfileProvider.access$000(), null, null, "is_primary DESC LIMIT 1");
        Cursor cursor;
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        cursor = cursor1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_198;
        }
        cursor = cursor1;
        oneProfile oneprofile = new oneProfile();
        cursor = cursor1;
        String s = cursor1.getString(cursor1.getColumnIndex("data2"));
        cursor = cursor1;
        if (Strings.isNullOrEmpty(s))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        cursor = cursor1;
        if (!s.matches("^[\\p{L}\\s'.-]+$"))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        cursor = cursor1;
        oneprofile.setFirstName(s);
        cursor = cursor1;
        s = cursor1.getString(cursor1.getColumnIndex("data3"));
        cursor = cursor1;
        if (Strings.isNullOrEmpty(s))
        {
            break MISSING_BLOCK_LABEL_150;
        }
        cursor = cursor1;
        if (!s.matches("^[\\p{L}\\s'.-]+$"))
        {
            break MISSING_BLOCK_LABEL_150;
        }
        cursor = cursor1;
        oneprofile.setLastName(s);
        cursor = cursor1;
        s = cursor1.getString(cursor1.getColumnIndex("photo_uri"));
        cursor = cursor1;
        if (Strings.isNullOrEmpty(s))
        {
            break MISSING_BLOCK_LABEL_190;
        }
        cursor = cursor1;
        oneprofile.setPhotoUri(Uri.parse(s));
        cursor = cursor1;
        subscriber.onNext(oneprofile);
        cursor = cursor1;
        subscriber.onCompleted();
        Closeables.closeQuietly(cursor1);
        return;
        Exception exception;
        exception;
        cursor1 = null;
_L4:
        cursor = cursor1;
        subscriber.onError(exception);
        Closeables.closeQuietly(cursor1);
        return;
        subscriber;
        cursor = null;
_L2:
        Closeables.closeQuietly(cursor);
        throw subscriber;
        subscriber;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    oneProfile()
    {
        this$0 = ProfileProvider.this;
        super();
    }
}
