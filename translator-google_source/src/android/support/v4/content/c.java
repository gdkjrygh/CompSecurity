// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.os.a;

// Referenced classes of package android.support.v4.content:
//            f, e, d

public final class c
{

    private static final d a;

    public static Cursor a(ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1, a a1)
    {
        return a.a(contentresolver, uri, as, s, as1, s1, a1);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new f();
        } else
        {
            a = new e();
        }
    }
}
