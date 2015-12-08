// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;

public final class oql
{

    private static final String a[] = {
        "_data"
    };

    public static String a(ContentResolver contentresolver, Uri uri)
    {
        contentresolver = contentresolver.query(uri, new String[] {
            "_data"
        }, null, null, null);
        if (contentresolver == null)
        {
            if (Log.isLoggable("ContentUriUtils", 5))
            {
                contentresolver = String.valueOf(uri);
                Log.w("ContentUriUtils", (new StringBuilder(String.valueOf(contentresolver).length() + 48)).append("getFilePath: query returned null cursor for uri=").append(contentresolver).toString());
            }
            return null;
        }
        if (contentresolver.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (Log.isLoggable("ContentUriUtils", 5))
        {
            uri = String.valueOf(uri);
            Log.w("ContentUriUtils", (new StringBuilder(String.valueOf(uri).length() + 49)).append("getFilePath: query returned empty cursor for uri=").append(uri).toString());
        }
        contentresolver.close();
        return null;
        String s;
        s = contentresolver.getString(0);
        if (!TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_211;
        }
        if (Log.isLoggable("ContentUriUtils", 5))
        {
            uri = String.valueOf(uri);
            Log.w("ContentUriUtils", (new StringBuilder(String.valueOf(uri).length() + 49)).append("getFilePath: MediaColumns.DATA was empty for uri=").append(uri).toString());
        }
        contentresolver.close();
        return null;
        contentresolver.close();
        return s;
        uri;
        contentresolver.close();
        throw uri;
    }

    public static boolean a(Uri uri)
    {
        return uri != null && "file".equals(uri.getScheme());
    }

    public static boolean a(String s)
    {
        return "image/gif".equals(s);
    }

    public static String b(ContentResolver contentresolver, Uri uri)
    {
        Object obj = d(contentresolver, uri);
        Object obj1;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
        obj = obj1;
        obj1 = obj;
        if (!"*/*".equals(obj))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj1 = obj;
        if (b(uri))
        {
            obj1 = c(contentresolver, uri);
        }
_L2:
        return ((String) (obj1));
        obj;
        contentresolver = null;
_L3:
        obj1 = contentresolver;
        if (!Log.isLoggable("ContentUriUtils", 5)) goto _L2; else goto _L1
_L1:
        uri = String.valueOf(uri);
        Log.w("ContentUriUtils", (new StringBuilder(String.valueOf(uri).length() + 27)).append("getMimeType failed for uri=").append(uri).toString(), ((Throwable) (obj)));
        return contentresolver;
        Exception exception;
        exception;
        contentresolver = ((ContentResolver) (obj));
        obj = exception;
          goto _L3
        exception;
        contentresolver = ((ContentResolver) (obj));
        obj = exception;
          goto _L3
    }

    public static boolean b(Uri uri)
    {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean b(String s)
    {
        return s != null && s.startsWith("image/");
    }

    private static String c(ContentResolver contentresolver, Uri uri)
    {
        Object obj = contentresolver.query(uri, a, null, null, null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L3
_L3:
        contentresolver = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(((Cursor) (obj)).getString(0)));
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = contentresolver;
        if (TextUtils.isEmpty(contentresolver))
        {
            if (!c(uri))
            {
                break MISSING_BLOCK_LABEL_86;
            }
            obj = "video/*";
        }
        return ((String) (obj));
        contentresolver;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw contentresolver;
        return "image/*";
_L2:
        contentresolver = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean c(Uri uri)
    {
        return b(uri) && uri.toString().contains("/video/");
    }

    public static boolean c(String s)
    {
        return s != null && s.startsWith("video/");
    }

    private static String d(ContentResolver contentresolver, Uri uri)
    {
        Object obj = null;
        try
        {
            contentresolver = contentresolver.getType(uri);
        }
        catch (Exception exception)
        {
            contentresolver = obj;
            if (Log.isLoggable("ContentUriUtils", 5))
            {
                contentresolver = String.valueOf(uri);
                Log.w("ContentUriUtils", (new StringBuilder(String.valueOf(contentresolver).length() + 31)).append("safeGetMimeType failed for uri=").append(contentresolver).toString(), exception);
                return null;
            }
        }
        return contentresolver;
    }

}
