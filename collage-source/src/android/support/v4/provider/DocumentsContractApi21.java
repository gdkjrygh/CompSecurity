// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

class DocumentsContractApi21
{

    private static final String TAG = "DocumentFile";

    DocumentsContractApi21()
    {
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

    public static Uri createDirectory(Context context, Uri uri, String s)
    {
        return createFile(context, uri, "vnd.android.document/directory", s);
    }

    public static Uri createFile(Context context, Uri uri, String s, String s1)
    {
        return DocumentsContract.createDocument(context.getContentResolver(), uri, s, s1);
    }

    public static Uri[] listFiles(Context context, Uri uri)
    {
        Object obj;
        ArrayList arraylist;
        context = context.getContentResolver();
        obj = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        arraylist = new ArrayList();
        obj = context.query(((Uri) (obj)), new String[] {
            "document_id"
        }, null, null, null);
_L2:
        context = ((Context) (obj));
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj));
        arraylist.add(DocumentsContract.buildDocumentUriUsingTree(uri, ((Cursor) (obj)).getString(0)));
        if (true) goto _L2; else goto _L1
        uri;
_L8:
        context = ((Context) (obj));
        Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(uri).toString());
        closeQuietly(((AutoCloseable) (obj)));
_L4:
        return (Uri[])arraylist.toArray(new Uri[arraylist.size()]);
_L1:
        closeQuietly(((AutoCloseable) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        uri;
        context = null;
_L6:
        closeQuietly(context);
        throw uri;
        uri;
        if (true) goto _L6; else goto _L5
_L5:
        uri;
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Uri prepareTreeUri(Uri uri)
    {
        return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
    }

    public static Uri renameTo(Context context, Uri uri, String s)
    {
        return DocumentsContract.renameDocument(context.getContentResolver(), uri, s);
    }
}
