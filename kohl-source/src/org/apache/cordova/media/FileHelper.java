// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.media;

import android.net.Uri;

public class FileHelper
{

    public FileHelper()
    {
    }

    public static String stripFileProtocol(String s)
    {
        String s1 = s;
        if (s.startsWith("file://"))
        {
            s1 = Uri.parse(s).getPath();
        }
        return s1;
    }
}
