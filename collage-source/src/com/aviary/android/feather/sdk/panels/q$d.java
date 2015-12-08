// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.aviary.android.feather.library.c.b;
import java.util.concurrent.Callable;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            q

static class a
    implements Callable
{

    int a;
    String b;

    public Bitmap a()
        throws Exception
    {
        Object obj = new android.graphics.apFactory.Options();
        obj.inPreferredConfig = android.graphics.ap.Config.ARGB_8888;
        obj = BitmapFactory.decodeFile(b, ((android.graphics.apFactory.Options) (obj)));
        if (a > 0 && obj != null)
        {
            Bitmap bitmap = com.aviary.android.feather.library.c.b.a(((Bitmap) (obj)), a, a);
            if (bitmap != obj)
            {
                ((Bitmap) (obj)).recycle();
                return bitmap;
            }
        }
        return ((Bitmap) (obj));
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    public (String s, int i)
    {
        b = s;
        a = i;
    }
}
