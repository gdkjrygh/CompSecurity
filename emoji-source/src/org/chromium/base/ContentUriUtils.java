// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package org.chromium.base:
//            ThreadUtils

public abstract class ContentUriUtils
{
    public static interface FileProviderUtil
    {

        public abstract Uri getContentUriFromFile(Context context, File file);
    }


    private static final String TAG = "ContentUriUtils";
    private static FileProviderUtil sFileProviderUtil;

    private ContentUriUtils()
    {
    }

    public static boolean contentUriExists(Context context, String s)
    {
        return getParcelFileDescriptor(context, s) != null;
    }

    public static Uri getContentUriFromFile(Context context, File file)
    {
        ThreadUtils.assertOnUiThread();
        if (sFileProviderUtil != null)
        {
            return sFileProviderUtil.getContentUriFromFile(context, file);
        } else
        {
            return null;
        }
    }

    public static String getDisplayName(Uri uri, ContentResolver contentresolver, String s)
    {
        if (contentresolver != null && uri != null) goto _L2; else goto _L1
_L1:
        uri = "";
_L4:
        return uri;
_L2:
        ContentResolver contentresolver1;
        ContentResolver contentresolver2;
        contentresolver2 = null;
        contentresolver1 = null;
        contentresolver = contentresolver.query(uri, null, null, null, null);
        if (contentresolver == null)
        {
            break; /* Loop/switch isn't completed */
        }
        contentresolver1 = contentresolver;
        contentresolver2 = contentresolver;
        if (contentresolver.getCount() < 1)
        {
            break; /* Loop/switch isn't completed */
        }
        contentresolver1 = contentresolver;
        contentresolver2 = contentresolver;
        contentresolver.moveToFirst();
        contentresolver1 = contentresolver;
        contentresolver2 = contentresolver;
        int i = contentresolver.getColumnIndex(s);
        if (i <= -1)
        {
            break; /* Loop/switch isn't completed */
        }
        contentresolver1 = contentresolver;
        contentresolver2 = contentresolver;
        s = contentresolver.getString(i);
        uri = s;
        if (contentresolver != null)
        {
            contentresolver.close();
            return s;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        return "";
        uri;
        uri = "";
        if (contentresolver1 == null) goto _L4; else goto _L5
_L5:
        contentresolver1.close();
        return "";
        uri;
        if (contentresolver2 != null)
        {
            contentresolver2.close();
        }
        throw uri;
    }

    private static ParcelFileDescriptor getParcelFileDescriptor(Context context, String s)
    {
        context = context.getContentResolver();
        Uri uri = Uri.parse(s);
        try
        {
            context = context.openFileDescriptor(uri, "r");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("ContentUriUtils", (new StringBuilder()).append("Cannot find content uri: ").append(s).toString(), context);
            return null;
        }
        return context;
    }

    public static int openContentUriForRead(Context context, String s)
    {
        context = getParcelFileDescriptor(context, s);
        if (context != null)
        {
            return context.detachFd();
        } else
        {
            return -1;
        }
    }

    public static void setFileProviderUtil(FileProviderUtil fileproviderutil)
    {
        sFileProviderUtil = fileproviderutil;
    }
}
