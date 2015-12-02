// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera.a;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.debug.log.b;
import com.facebook.orca.camera.aa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.facebook.orca.camera.a:
//            c, d

class m
    implements c
{

    private static final Class a = com/facebook/orca/camera/a/m;
    private final Uri b;
    private final d c;
    private final ContentResolver d;

    m(d d1, ContentResolver contentresolver, Uri uri)
    {
        c = d1;
        d = contentresolver;
        b = uri;
    }

    private ParcelFileDescriptor e()
    {
        ParcelFileDescriptor parcelfiledescriptor;
        try
        {
            if (b.getScheme().equals("file"))
            {
                return ParcelFileDescriptor.open(new File(b.getPath()), 0x10000000);
            }
            parcelfiledescriptor = d.openFileDescriptor(b, "r");
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return null;
        }
        return parcelfiledescriptor;
    }

    public Bitmap a(int i, int j)
    {
        return a(i, j, true, false);
    }

    public Bitmap a(int i, int j, boolean flag)
    {
        return a(i, j, flag, false);
    }

    public Bitmap a(int i, int j, boolean flag, boolean flag1)
    {
        Bitmap bitmap;
        Bitmap bitmap1;
        try
        {
            bitmap1 = aa.a(i, j, e(), flag1);
        }
        catch (Exception exception)
        {
            com.facebook.debug.log.b.e(a, "got exception decoding bitmap ", exception);
            return null;
        }
        bitmap = bitmap1;
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        bitmap = bitmap1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        bitmap = aa.a(bitmap1, c());
        return bitmap;
    }

    public Bitmap a(boolean flag)
    {
        return a(320, 0x30000, flag);
    }

    public String a()
    {
        return b.getPath();
    }

    public long b()
    {
        return 0L;
    }

    public int c()
    {
label0:
        {
            boolean flag = false;
            char c1 = flag;
            int i;
            try
            {
                if (!b.getScheme().equals("file"))
                {
                    break label0;
                }
                i = (new ExifInterface(b.getPath())).getAttributeInt("Orientation", 1);
            }
            catch (IOException ioexception)
            {
                return 0;
            }
            if (i == 3)
            {
                c1 = '\264';
            } else
            {
                if (i == 6)
                {
                    return 90;
                }
                c1 = flag;
                if (i == 8)
                {
                    return 270;
                }
            }
        }
        return c1;
    }

    public String d()
    {
        return b.toString();
    }

}
