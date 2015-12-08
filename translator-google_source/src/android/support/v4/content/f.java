// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.support.v4.os.a;

// Referenced classes of package android.support.v4.content:
//            e

final class f extends e
{

    f()
    {
    }

    public final Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        a1 = ((a) (a1.b()));
_L1:
        contentresolver = contentresolver.query(uri, as, s, as1, s1, (CancellationSignal)a1);
        return contentresolver;
        a1 = null;
          goto _L1
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
