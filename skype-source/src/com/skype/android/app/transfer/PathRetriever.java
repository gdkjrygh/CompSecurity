// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import com.skype.android.config.FileUtil;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Calendar;

public class PathRetriever
{

    private static final String projection[] = {
        "_data"
    };

    public PathRetriever()
    {
    }

    public static String getDataColumn(Context context, Uri uri, String s, String as[])
    {
        Context context1;
        Context context2;
        context2 = null;
        context1 = null;
        context = context.getContentResolver().query(uri, projection, s, as, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        context1 = context;
        context2 = context;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        context1 = context;
        context2 = context;
        int i = context.getColumnIndex(projection[0]);
        if (i >= 0) goto _L2; else goto _L1
_L1:
        if (context != null)
        {
            context.close();
        }
        uri = null;
_L4:
        return uri;
_L2:
        context1 = context;
        context2 = context;
        s = context.getString(i);
        uri = s;
        if (context == null) goto _L4; else goto _L3
_L3:
        context.close();
        return s;
        if (context != null)
        {
            context.close();
        }
_L6:
        return null;
        context;
        context2 = context1;
        context.printStackTrace();
        if (context1 != null)
        {
            context1.close();
        }
        if (true) goto _L6; else goto _L5
_L5:
        context;
        if (context2 != null)
        {
            context2.close();
        }
        throw context;
    }

    public static String getPath(Context context, Uri uri, boolean flag)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        InputStream inputstream;
        Object obj9;
        Object obj14;
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = uri.getScheme();
        obj = null;
        if (i != 0 && DocumentsContract.isDocumentUri(context, uri))
        {
            if (isExternalStorageDocument(uri))
            {
                obj1 = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(obj1[0]))
                {
                    obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/").append(obj1[1]).toString();
                }
            } else
            if (isDownloadsDocument(uri))
            {
                obj = DocumentsContract.getDocumentId(uri);
                obj = getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(((String) (obj)))), null, null);
            } else
            if (isMediaDocument(uri))
            {
                obj1 = DocumentsContract.getDocumentId(uri).split(":");
                obj2 = obj1[0];
                obj = null;
                if ("image".equals(obj2))
                {
                    obj = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else
                if ("video".equals(obj2))
                {
                    obj = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else
                if ("audio".equals(obj2))
                {
                    obj = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                obj = getDataColumn(context, ((Uri) (obj)), "_id=?", new String[] {
                    obj1[1]
                });
            }
        } else
        if ("content".equalsIgnoreCase(((String) (obj1))))
        {
            obj = getDataColumn(context, uri, null, null);
        } else
        if ("file".equalsIgnoreCase(((String) (obj1))))
        {
            obj = uri.getPath();
        }
        obj9 = obj;
        if (flag) goto _L2; else goto _L1
_L1:
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj9 = obj;
        if ((new File(((String) (obj)))).exists()) goto _L2; else goto _L4
_L4:
        obj5 = null;
        obj1 = null;
        obj6 = null;
        obj4 = null;
        obj13 = null;
        obj10 = null;
        obj11 = null;
        obj14 = null;
        obj12 = null;
        obj7 = obj;
        obj8 = obj;
        obj2 = obj14;
        obj9 = obj;
        inputstream = context.getContentResolver().openInputStream(uri);
        uri = inputstream;
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        uri = inputstream;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        uri = inputstream;
        obj4 = inputstream;
        obj7 = obj;
        obj5 = inputstream;
        obj8 = obj;
        obj1 = inputstream;
        obj2 = obj14;
        obj6 = inputstream;
        obj9 = obj;
        if (!((String) (obj)).startsWith("http"))
        {
            break MISSING_BLOCK_LABEL_266;
        }
        obj4 = inputstream;
        obj7 = obj;
        obj5 = inputstream;
        obj8 = obj;
        obj1 = inputstream;
        obj2 = obj14;
        obj6 = inputstream;
        obj9 = obj;
        uri = (new URL(((String) (obj)))).openStream();
        if (uri == null) goto _L6; else goto _L5
_L5:
        obj4 = uri;
        obj7 = obj;
        obj5 = uri;
        obj8 = obj;
        obj1 = uri;
        obj2 = obj14;
        obj6 = uri;
        obj9 = obj;
        context = (new StringBuilder()).append(context.getExternalCacheDir()).append(File.separator).append(Calendar.getInstance().getTimeInMillis()).toString();
        obj4 = uri;
        obj7 = context;
        obj5 = uri;
        obj8 = context;
        obj1 = uri;
        obj2 = obj14;
        obj6 = uri;
        obj9 = context;
        obj = new BufferedOutputStream(new FileOutputStream(context));
        obj1 = new byte[2048];
_L9:
        i = uri.read(((byte []) (obj1)));
        if (i <= 0) goto _L8; else goto _L7
_L7:
        ((BufferedOutputStream) (obj)).write(((byte []) (obj1)), 0, i);
          goto _L9
        obj2;
        obj1 = obj;
        obj = obj2;
        obj9 = context;
        context = ((Context) (obj1));
_L18:
        obj1 = uri;
        obj2 = context;
        ((FileNotFoundException) (obj)).printStackTrace();
        FileUtil.closeStream(uri);
        FileUtil.closeStream(context);
_L2:
        return ((String) (obj9));
_L8:
        FileUtil.closeStream(uri);
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        return context;
_L6:
        context = null;
        obj = obj13;
        if (true) goto _L8; else goto _L10
_L10:
        Object obj3;
        obj3;
        context = ((Context) (obj7));
        obj = obj10;
        uri = ((Uri) (obj4));
_L16:
        obj1 = uri;
        obj2 = obj;
        ((IOException) (obj3)).printStackTrace();
        FileUtil.closeStream(uri);
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        return context;
        obj3;
        context = ((Context) (obj8));
        obj = obj11;
        uri = ((Uri) (obj5));
_L14:
        obj1 = uri;
        obj2 = obj;
        ((SecurityException) (obj3)).printStackTrace();
        FileUtil.closeStream(uri);
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        return context;
        context;
        uri = ((Uri) (obj1));
_L12:
        FileUtil.closeStream(uri);
        FileUtil.closeStream(((java.io.Closeable) (obj2)));
        throw context;
        context;
        obj2 = obj;
        if (true) goto _L12; else goto _L11
_L11:
        obj3;
        if (true) goto _L14; else goto _L13
_L13:
        obj3;
        if (true) goto _L16; else goto _L15
_L15:
        obj;
        uri = ((Uri) (obj6));
        context = obj12;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public static boolean isDownloadsDocument(Uri uri)
    {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExternalStorageDocument(Uri uri)
    {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri)
    {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

}
