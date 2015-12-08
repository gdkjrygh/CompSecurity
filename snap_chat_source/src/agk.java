// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class agk
{

    public static int a(Context context, Uri uri)
    {
        Context context1 = null;
        context = context.getContentResolver().openInputStream(uri);
        context1 = context;
        int i = a(((InputStream) (context)));
        if (context != null)
        {
            context.close();
        }
        return i;
        context;
        if (context1 != null)
        {
            context1.close();
        }
        throw context;
    }

    public static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int i1 = options.outHeight;
        int j1 = options.outWidth;
        int l = 1;
        int k = 1;
        if (i1 > j || j1 > i)
        {
            i1 /= 2;
            j1 /= 2;
            do
            {
                l = k;
                if (i1 / k <= j)
                {
                    break;
                }
                l = k;
                if (j1 / k <= i)
                {
                    break;
                }
                k <<= 1;
            } while (true);
        }
        return l;
    }

    public static int a(File file)
    {
        FileInputStream fileinputstream = new FileInputStream(file);
        int i = a(((InputStream) (fileinputstream)));
        fileinputstream.close();
        return i;
        file;
        fileinputstream = null;
_L2:
        if (fileinputstream != null)
        {
            fileinputstream.close();
        }
        throw file;
        file;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(InputStream inputstream)
    {
        int i = 1;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputstream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1)
        {
            i = 0;
        } else
        if ((float)options.outWidth / (float)options.outHeight <= 1.0F)
        {
            return 0;
        }
        return i;
    }
}
