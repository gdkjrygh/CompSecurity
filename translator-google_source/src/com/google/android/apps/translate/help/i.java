// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.translate.help:
//            g

final class i extends AsyncTask
{

    final g a;
    private final WeakReference b;
    private int c;

    public i(g g1, ImageView imageview)
    {
        a = g1;
        super();
        c = 0;
        b = new WeakReference(imageview);
    }

    static int a(i j)
    {
        return j.c;
    }

    protected final Object doInBackground(Object aobj[])
    {
        c = ((Integer[])aobj)[0].intValue();
        if (!a.b())
        {
            return null;
        } else
        {
            return BitmapFactory.decodeResource(a.a(), c);
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (isCancelled())
        {
            obj = null;
        }
        break MISSING_BLOCK_LABEL_14;
        if (b != null && obj != null && a.b())
        {
            ImageView imageview = (ImageView)b.get();
            if (this == g.a(imageview) && imageview != null)
            {
                imageview.setImageBitmap(((Bitmap) (obj)));
                g.a(a).setVisibility(8);
                g.b(a).setVisibility(0);
                return;
            }
        }
        return;
    }
}
