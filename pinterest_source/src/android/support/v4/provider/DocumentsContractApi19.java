// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;

class DocumentsContractApi19
{

    private static final String TAG = "DocumentFile";

    DocumentsContractApi19()
    {
    }

    public static boolean canRead(Context context, Uri uri)
    {
        while (context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(getRawType(context, uri))) 
        {
            return false;
        }
        return true;
    }

    public static boolean canWrite(Context context, Uri uri)
    {
        if (context.checkCallingOrSelfUriPermission(uri, 2) == 0)
        {
            String s = getRawType(context, uri);
            int i = queryForInt(context, uri, "flags", 0);
            if (!TextUtils.isEmpty(s))
            {
                if ((i & 4) != 0)
                {
                    return true;
                }
                if ("vnd.android.document/directory".equals(s) && (i & 8) != 0)
                {
                    return true;
                }
                if (!TextUtils.isEmpty(s) && (i & 2) != 0)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private static void closeQuietly(AutoCloseable autocloseable)
    {
        if (autocloseable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        autocloseable.close();
        return;
        autocloseable;
        throw autocloseable;
        autocloseable;
    }

    public static boolean delete(Context context, Uri uri)
    {
        return DocumentsContract.deleteDocument(context.getContentResolver(), uri);
    }

    public static boolean exists(Context context, Uri uri)
    {
        context = context.getContentResolver();
        uri = context.query(uri, new String[] {
            "document_id"
        }, null, null, null);
        context = uri;
        int i = uri.getCount();
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        closeQuietly(uri);
        return flag;
        Exception exception;
        exception;
        uri = null;
_L4:
        context = uri;
        Log.w("DocumentFile", (new StringBuilder("Failed query: ")).append(exception).toString());
        closeQuietly(uri);
        return false;
        uri;
        context = null;
_L2:
        closeQuietly(context);
        throw uri;
        uri;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String getName(Context context, Uri uri)
    {
        return queryForString(context, uri, "_display_name", null);
    }

    private static String getRawType(Context context, Uri uri)
    {
        return queryForString(context, uri, "mime_type", null);
    }

    public static String getType(Context context, Uri uri)
    {
        uri = getRawType(context, uri);
        context = uri;
        if ("vnd.android.document/directory".equals(uri))
        {
            context = null;
        }
        return context;
    }

    public static boolean isDirectory(Context context, Uri uri)
    {
        return "vnd.android.document/directory".equals(getRawType(context, uri));
    }

    public static boolean isDocumentUri(Context context, Uri uri)
    {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public static boolean isFile(Context context, Uri uri)
    {
        context = getRawType(context, uri);
        return !"vnd.android.document/directory".equals(context) && !TextUtils.isEmpty(context);
    }

    public static long lastModified(Context context, Uri uri)
    {
        return queryForLong(context, uri, "last_modified", 0L);
    }

    public static long length(Context context, Uri uri)
    {
        return queryForLong(context, uri, "_size", 0L);
    }

    private static int queryForInt(Context context, Uri uri, String s, int i)
    {
        return (int)queryForLong(context, uri, s, i);
    }

    private static long queryForLong(Context context, Uri uri, String s, long l)
    {
        context = context.getContentResolver();
        uri = context.query(uri, new String[] {
            s
        }, null, null, null);
        context = uri;
        if (!uri.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        context = uri;
        if (uri.isNull(0))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        context = uri;
        long l1 = uri.getLong(0);
        closeQuietly(uri);
        return l1;
        closeQuietly(uri);
        return l;
        s;
        uri = null;
_L4:
        context = uri;
        Log.w("DocumentFile", (new StringBuilder("Failed query: ")).append(s).toString());
        closeQuietly(uri);
        return l;
        uri;
        context = null;
_L2:
        closeQuietly(context);
        throw uri;
        uri;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String queryForString(Context context, Uri uri, String s, String s1)
    {
        context = context.getContentResolver();
        uri = context.query(uri, new String[] {
            s
        }, null, null, null);
        context = uri;
        if (!uri.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_61;
        }
        context = uri;
        if (uri.isNull(0))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        context = uri;
        s = uri.getString(0);
        closeQuietly(uri);
        return s;
        closeQuietly(uri);
        return s1;
        s;
        uri = null;
_L4:
        context = uri;
        Log.w("DocumentFile", (new StringBuilder("Failed query: ")).append(s).toString());
        closeQuietly(uri);
        return s1;
        uri;
        context = null;
_L2:
        closeQuietly(context);
        throw uri;
        uri;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
