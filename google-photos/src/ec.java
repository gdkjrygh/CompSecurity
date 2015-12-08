// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

final class ec extends eb
{

    ec()
    {
    }

    public final Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, im im1)
    {
        if (im1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        im1 = ((im) (im1.b()));
_L1:
        contentresolver = contentresolver.query(uri, as, s, as1, s1, (CancellationSignal)im1);
        return contentresolver;
        im1 = null;
          goto _L1
        contentresolver;
        if (contentresolver instanceof OperationCanceledException)
        {
            throw new in();
        } else
        {
            throw contentresolver;
        }
    }
}
