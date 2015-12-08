// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.OperationCanceledException;
import android.support.v4.os.a;

// Referenced classes of package android.support.v4.content:
//            d

class e
    implements d
{

    e()
    {
    }

    public Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, a a1)
    {
        if (a1 != null && a1.a())
        {
            throw new OperationCanceledException();
        } else
        {
            return contentresolver.query(uri, as, s, as1, s1);
        }
    }
}
