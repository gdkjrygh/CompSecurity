// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

class eb
{

    eb()
    {
    }

    public Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, im im1)
    {
        if (im1 != null && im1.a())
        {
            throw new in();
        } else
        {
            return contentresolver.query(uri, as, s, as1, s1);
        }
    }
}
