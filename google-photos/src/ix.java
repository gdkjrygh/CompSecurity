// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import java.io.FileNotFoundException;

final class ix extends AsyncTask
{

    final iw a;
    private CancellationSignal b;
    private PrintAttributes c;
    private PrintAttributes d;
    private android.print.PrintDocumentAdapter.LayoutResultCallback e;

    ix(iw iw1, CancellationSignal cancellationsignal, PrintAttributes printattributes, PrintAttributes printattributes1, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback)
    {
        a = iw1;
        b = cancellationsignal;
        c = printattributes;
        d = printattributes1;
        e = layoutresultcallback;
        super();
    }

    private transient Bitmap a()
    {
        Bitmap bitmap;
        try
        {
            bitmap = a.e.a(a.d, 3500);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return null;
        }
        return bitmap;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onCancelled(Object obj)
    {
        e.onLayoutCancelled();
        a.a = null;
    }

    protected final void onPostExecute(Object obj)
    {
        boolean flag = true;
        obj = (Bitmap)obj;
        super.onPostExecute(obj);
        a.b = ((Bitmap) (obj));
        if (obj != null)
        {
            obj = (new android.print.PrintDocumentInfo.Builder(a.c)).setContentType(1).setPageCount(1).build();
            if (c.equals(d))
            {
                flag = false;
            }
            e.onLayoutFinished(((android.print.PrintDocumentInfo) (obj)), flag);
        } else
        {
            e.onLayoutFailed(null);
        }
        a.a = null;
    }

    protected final void onPreExecute()
    {
        b.setOnCancelListener(new iy(this));
    }
}
