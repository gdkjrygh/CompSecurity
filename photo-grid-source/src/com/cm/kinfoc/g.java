// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public final class g
{

    private Context a;

    public g(Context context)
    {
        a = null;
        a = context;
    }

    public static byte[] a(File file)
    {
        int i = 1024;
        file = new FileInputStream(file);
        int j = file.available();
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        if (j <= 1024)
        {
            i = j;
        }
        if (i <= 0)
        {
            file.close();
            return null;
        }
        abyte0 = new byte[i];
        bytearrayoutputstream = new ByteArrayOutputStream();
        for (; file.read(abyte0) != -1; bytearrayoutputstream.write(abyte0)) { }
        file.close();
        return bytearrayoutputstream.toByteArray();
    }
}
