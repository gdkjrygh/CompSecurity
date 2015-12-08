// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

final class cs extends cr
{

    cs()
    {
    }

    public final Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String s1, gm gm1)
    {
        Object obj;
        obj = null;
        if (gm1 == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        obj = gm1.b();
        contentresolver = contentresolver.query(uri, as, s, null, s1, (CancellationSignal)obj);
        return contentresolver;
        contentresolver;
        if (contentresolver instanceof OperationCanceledException)
        {
            throw new android.support.v4.os.OperationCanceledException();
        } else
        {
            throw contentresolver;
        }
    }
}
