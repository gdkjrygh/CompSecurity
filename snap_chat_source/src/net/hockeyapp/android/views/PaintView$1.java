// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;

// Referenced classes of package net.hockeyapp.android.views:
//            PaintView

final class a extends AsyncTask
{

    private PaintView a;

    private static transient Bitmap a(Object aobj[])
    {
        Context context = (Context)aobj[0];
        Uri uri = (Uri)aobj[1];
        Integer integer = (Integer)aobj[2];
        aobj = (Integer)aobj[3];
        try
        {
            aobj = PaintView.a(context.getContentResolver(), uri, integer.intValue(), ((Integer) (aobj)).intValue());
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            return null;
        }
        return ((Bitmap) (aobj));
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Bitmap)obj;
        if (obj != null)
        {
            a.setImageBitmap(((Bitmap) (obj)));
        }
    }

    protected final void onPreExecute()
    {
        a.setAdjustViewBounds(true);
    }

    (PaintView paintview)
    {
        a = paintview;
        super();
    }
}
