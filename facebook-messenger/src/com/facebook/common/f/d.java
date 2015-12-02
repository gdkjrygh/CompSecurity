// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.f;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.jar.JarFile;

public class d
{

    public d()
    {
    }

    public File a(Context context, ParcelFileDescriptor parcelfiledescriptor, String s)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (context == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (parcelfiledescriptor == null) goto _L2; else goto _L3
_L3:
        obj = obj1;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L4
_L4:
        obj = new File(context.getFilesDir(), s);
        parcelfiledescriptor = new BufferedInputStream(new FileInputStream(parcelfiledescriptor.getFileDescriptor()), 1024);
        context = new BufferedOutputStream(context.openFileOutput(s, 1), 1024);
_L7:
        int i = parcelfiledescriptor.read();
        if (i == -1) goto _L6; else goto _L5
_L5:
        context.write(i);
          goto _L7
        context;
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        context = null;
_L9:
        obj = context;
_L2:
        return ((File) (obj));
_L6:
        parcelfiledescriptor.close();
        context.flush();
        context.close();
        context = ((Context) (obj));
        if (true) goto _L9; else goto _L8
_L8:
    }

    public File a(String s)
    {
        return new File(s);
    }

    public File a(URI uri)
    {
        return new File(uri);
    }

    public JarFile a(File file)
    {
        return new JarFile(file);
    }

    public boolean a(Uri uri)
    {
        if (uri != null && "file".equals(uri.getScheme()))
        {
            String s = Uri.withAppendedPath(Uri.fromFile(Environment.getExternalStorageDirectory()), "").toString();
            return uri.toString().startsWith(s);
        } else
        {
            return false;
        }
    }
}
