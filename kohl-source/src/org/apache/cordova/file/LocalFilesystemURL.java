// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import android.net.Uri;
import java.util.List;

public class LocalFilesystemURL
{

    public static final String FILESYSTEM_PROTOCOL = "cdvfile";
    Uri URL;
    String filesystemName;
    String fullPath;

    public LocalFilesystemURL(Uri uri)
    {
        URL = uri;
        filesystemName = filesystemNameForLocalURL(uri);
        fullPath = fullPathForLocalURL(uri);
    }

    public LocalFilesystemURL(String s)
    {
        this(Uri.parse(s));
    }

    private String filesystemNameForLocalURL(Uri uri)
    {
        Object obj = null;
        String s;
        if ("cdvfile".equals(uri.getScheme()) && "localhost".equals(uri.getHost()))
        {
            uri = uri.getPathSegments();
            s = obj;
            if (uri != null)
            {
                s = obj;
                if (uri.size() > 0)
                {
                    s = (String)uri.get(0);
                }
            }
        } else
        {
            s = obj;
            if ("content".equals(uri.getScheme()))
            {
                return "content";
            }
        }
        return s;
    }

    private String fullPathForLocalURL(Uri uri)
    {
        if ("cdvfile".equals(uri.getScheme()) && "localhost".equals(uri.getHost()))
        {
            String s1 = uri.getPath();
            String s = s1;
            if (uri.getQuery() != null)
            {
                s = (new StringBuilder()).append(s1).append("?").append(uri.getQuery()).toString();
            }
            return s.substring(s.indexOf('/', 1));
        }
        if ("content".equals(uri.getScheme()))
        {
            return Uri.encode((new StringBuilder()).append('/').append(uri.getHost()).append(uri.getPath()).toString(), "/");
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("cdvfile://localhost/").append(filesystemName).append(fullPath).toString();
    }
}
