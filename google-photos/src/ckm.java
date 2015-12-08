// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;

final class ckm
    implements Callable
{

    private ckl a;

    ckm(ckl ckl1)
    {
        a = ckl1;
        super();
    }

    private Bitmap a()
    {
        android.net.Uri uri;
        Object obj;
        uri = ((cnq)ckl.b(a).get(ckl.a(a))).e.b;
        obj = (ParcelFileDescriptor)ckl.c(a).get(ckl.a(a));
        if (ckl.d(a) == uri)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj = ckl.a(a, ((ParcelFileDescriptor) (obj)));
        if (obj != null)
        {
            try
            {
                ckl.a(a, ((Bitmap) (obj)));
                ckl.a(a, uri);
            }
            catch (IOException ioexception)
            {
                String s = ckl.c();
                String s1 = String.valueOf(((cnq)ckl.b(a).get(ckl.a(a))).e.b);
                Log.w(s, (new StringBuilder(String.valueOf(s1).length() + 28)).append("Error loading photo for Uri ").append(s1).toString(), ioexception);
            }
        }
        return ckl.e(a);
    }

    public final Object call()
    {
        return a();
    }
}
