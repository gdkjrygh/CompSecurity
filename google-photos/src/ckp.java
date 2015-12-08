// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileDescriptor;
import java.io.IOException;

class ckp
{

    final FileDescriptor a;

    public ckp(FileDescriptor filedescriptor)
    {
        a = (FileDescriptor)b.a(filedescriptor, "fileDescriptor", null);
    }

    public Bitmap a(android.graphics.BitmapFactory.Options options)
    {
        Bitmap bitmap = BitmapFactory.decodeFileDescriptor(a, null, options);
        if (bitmap == null && !options.inJustDecodeBounds)
        {
            options = String.valueOf(a);
            throw new IOException((new StringBuilder(String.valueOf(options).length() + 27)).append("File ").append(options).append(" could not be decoded.").toString());
        } else
        {
            return bitmap;
        }
    }
}
