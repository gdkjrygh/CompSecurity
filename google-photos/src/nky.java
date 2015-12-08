// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class nky
    implements nkz
{

    private static final String a = c.e("datetaken");
    private static final String b = c.e("date_added");
    private static final String c = c.e("date_modified");
    private static final String d[] = {
        "_data"
    };
    private Uri e;

    public nky(Uri uri)
    {
        e = uri;
    }

    public final String a()
    {
        return "_id = ?";
    }

    public final Uri b()
    {
        return e;
    }

    public final String[] c()
    {
        return d;
    }

    static 
    {
        String s = a;
        (new StringBuilder(String.valueOf(s).length() + 5)).append("MAX(").append(s).append(")").toString();
        s = b;
        (new StringBuilder(String.valueOf(s).length() + 5)).append("MAX(").append(s).append(")").toString();
        s = c;
        (new StringBuilder(String.valueOf(s).length() + 5)).append("MAX(").append(s).append(")").toString();
        s = a;
        String s1 = String.valueOf("corrected_date_taken");
        (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append(s).append(" as ").append(s1).toString();
        s = String.valueOf(c.a(b, c));
        s1 = String.valueOf("corrected_added_modified");
        (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append(s).append(" as ").append(s1).toString();
    }
}
