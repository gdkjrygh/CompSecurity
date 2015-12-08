// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class crr
{

    private static String a = crr.getSimpleName();

    public crr()
    {
    }

    public static ds a(ContentResolver contentresolver)
    {
        return new crs(contentresolver);
    }

    public static InputStream a(Uri uri, ContentResolver contentresolver)
    {
        String s = uri.getScheme();
        boolean flag;
        if ("http".equals(s) || "https".equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            uri = String.valueOf(uri);
            b.a((new StringBuilder(String.valueOf(uri).length() + 31)).append("Unsupported URI format (http): ").append(uri).toString());
            return null;
        }
        try
        {
            contentresolver = contentresolver.openInputStream(uri);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            String s1 = a;
            uri = String.valueOf(uri);
            Log.w(s1, (new StringBuilder(String.valueOf(uri).length() + 29)).append("Cannot open input stream for ").append(uri).toString(), contentresolver);
            return null;
        }
        return contentresolver;
    }

}
