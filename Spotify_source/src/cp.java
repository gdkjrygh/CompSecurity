// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

public final class cp
{

    private static final cq a;

    public static Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String s1, gm gm)
    {
        return a.a(contentresolver, uri, as, s, s1, gm);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new cs();
        } else
        {
            a = new cr();
        }
    }
}
