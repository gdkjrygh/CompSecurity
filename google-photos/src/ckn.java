// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ckn
{

    private static final String a = ckn.getSimpleName();

    public ckn()
    {
    }

    public static String a(Uri uri, Context context)
    {
        uri = c(uri, context);
        if (!uri.exists())
        {
            return null;
        } else
        {
            return uri.getAbsolutePath();
        }
    }

    public static void a(Uri uri, cko cko1, Context context)
    {
        Object obj;
        obj = c(uri, context);
        if (((File) (obj)).exists())
        {
            return;
        }
        String s;
        try
        {
            uri = cko1.a(uri, context.getContentResolver(), 0xe1000);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.w(a, "Error loading photo bitmap", uri);
            return;
        }
        context = Bitmap.createScaledBitmap(uri, 960, 960, true);
        cko1 = new FileOutputStream(((File) (obj)));
        uri = cko1;
        if (context.compress(android.graphics.Bitmap.CompressFormat.JPEG, 80, cko1))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        uri = cko1;
        context = a;
        uri = cko1;
        s = String.valueOf(obj);
        uri = cko1;
        Log.w(context, (new StringBuilder(String.valueOf(s).length() + 21)).append("Cannot compress file ").append(s).toString());
        b.a(cko1);
        return;
        context;
        cko1 = null;
_L4:
        uri = cko1;
        String s1 = a;
        uri = cko1;
        obj = String.valueOf(obj);
        uri = cko1;
        Log.w(s1, (new StringBuilder(String.valueOf(obj).length() + 19)).append("Cannot create file ").append(((String) (obj))).toString(), context);
        b.a(cko1);
        return;
        cko1;
        uri = null;
_L2:
        b.a(uri);
        throw cko1;
        cko1;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean b(Uri uri, Context context)
    {
        return c(uri, context).exists();
    }

    private static File c(Uri uri, Context context)
    {
        uri = String.valueOf(uri.toString().replaceAll("[/:]", "_"));
        String s = String.valueOf("-resized.jpg");
        if (s.length() != 0)
        {
            uri = uri.concat(s);
        } else
        {
            uri = new String(uri);
        }
        return new File(context.getCacheDir(), uri);
    }

}
