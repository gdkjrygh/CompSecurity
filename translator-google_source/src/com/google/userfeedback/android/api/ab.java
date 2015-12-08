// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.userfeedback.android.api:
//            ac, aa

final class ab extends AsyncTask
{

    final aa a;
    private final WeakReference b;
    private int c;
    private int d;

    public ab(aa aa1, ImageView imageview)
    {
        a = aa1;
        super();
        c = 0;
        d = 0;
        b = new WeakReference(imageview);
        c = imageview.getHeight();
        d = imageview.getWidth();
    }

    protected final Object doInBackground(Object aobj[])
    {
        return aa.a(((ac[])aobj)[0].f, d, c);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (b != null && obj != null)
        {
            ImageView imageview = (ImageView)b.get();
            if (imageview != null)
            {
                imageview.setImageBitmap(((Bitmap) (obj)));
            }
        }
    }
}
