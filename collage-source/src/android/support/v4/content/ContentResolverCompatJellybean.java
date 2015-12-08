// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

class ContentResolverCompatJellybean
{

    ContentResolverCompatJellybean()
    {
    }

    static boolean isFrameworkOperationCanceledException(Exception exception)
    {
        return exception instanceof OperationCanceledException;
    }

    public static Cursor query(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, Object obj)
    {
        return contentresolver.query(uri, as, s, as1, s1, (CancellationSignal)obj);
    }
}
