// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.mediacapture;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.Locale;
import org.apache.cordova.CordovaInterface;

public class FileHelper
{

    public FileHelper()
    {
    }

    public static String getMimeType(Uri uri, CordovaInterface cordovainterface)
    {
        if ("content".equals(uri.getScheme()))
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
}
