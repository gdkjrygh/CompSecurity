// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

// Referenced classes of package org.apache.cordova:
//            CordovaInterface, LOG

public class FileHelper
{

    private static final String LOG_TAG = "FileUtils";
    private static final String _DATA = "_data";

    public FileHelper()
    {
    }

    public static InputStream getInputStreamFromUriString(String s, CordovaInterface cordovainterface)
        throws IOException
    {
        if (s.startsWith("content"))
        {
            s = Uri.parse(s);
            return cordovainterface.getActivity().getContentResolver().openInputStream(s);
        }
        if (s.startsWith("file://"))
        {
            int i = s.indexOf("?");
            String s1 = s;
            if (i > -1)
            {
                s1 = s.substring(0, i);
            }
            if (s1.startsWith("file:///android_asset/"))
            {
                s = Uri.parse(s1).getPath().substring(15);
                return cordovainterface.getActivity().getAssets().open(s);
            } else
            {
                return new FileInputStream(getRealPath(s1, cordovainterface));
            }
        } else
        {
            return new FileInputStream(getRealPath(s, cordovainterface));
        }
    }

    public static String getMimeType(String s, CordovaInterface cordovainterface)
    {
        Uri uri = Uri.parse(s);
        if (s.startsWith("content://"))
        {
            return cordovainterface.getActivity().getContentResolver().getType(uri);
        } else
        {
            return getMimeTypeForExtension(uri.getPath());
        }
    }

    public static String getMimeTypeForExtension(String s)
    {
        int i = s.lastIndexOf('.');
        String s1 = s;
        if (i != -1)
        {
            s1 = s.substring(i + 1);
        }
        s = s1.toLowerCase(Locale.getDefault());
        if (s.equals("3ga"))
        {
            return "audio/3gpp";
        } else
        {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
        }
    }

    public static String getRealPath(Uri uri, CordovaInterface cordovainterface)
    {
        return getRealPath(uri.toString(), cordovainterface);
    }

    public static String getRealPath(String s, CordovaInterface cordovainterface)
    {
        if (s.startsWith("content://"))
        {
            cordovainterface = cordovainterface.getActivity().managedQuery(Uri.parse(s), new String[] {
                "_data"
            }, null, null, null);
            int i = cordovainterface.getColumnIndexOrThrow("_data");
            cordovainterface.moveToFirst();
            String s1 = cordovainterface.getString(i);
            cordovainterface = s1;
            if (s1 == null)
            {
                LOG.e("FileUtils", "Could get real path for URI string %s", new Object[] {
                    s
                });
                cordovainterface = s1;
            }
        } else
        if (s.startsWith("file://"))
        {
            String s2 = s.substring(7);
            cordovainterface = s2;
            if (s2.startsWith("/android_asset/"))
            {
                LOG.e("FileUtils", "Cannot get real path for URI string %s because it is a file:///android_asset/ URI.", new Object[] {
                    s
                });
                return null;
            }
        } else
        {
            return s;
        }
        return cordovainterface;
    }

    public static String stripFileProtocol(String s)
    {
        String s1 = s;
        if (s.startsWith("file://"))
        {
            s1 = s.substring(7);
        }
        return s1;
    }
}
