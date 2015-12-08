// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.OperationCanceledException;

class cr
    implements cq
{

    cr()
    {
    }

    public Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String s1, gm gm1)
    {
        if (gm1 != null && gm1.a())
        {
            throw new OperationCanceledException();
        } else
        {
            return contentresolver.query(uri, as, s, null, s1);
        }
    }
}
