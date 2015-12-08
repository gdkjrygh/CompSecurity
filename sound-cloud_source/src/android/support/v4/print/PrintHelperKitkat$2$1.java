// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import java.io.FileNotFoundException;

// Referenced classes of package android.support.v4.print:
//            PrintHelperKitkat

class Callback extends AsyncTask
{

    final _cls1 this$1;
    final CancellationSignal val$cancellationSignal;
    final android.print.ayoutResultCallback val$layoutResultCallback;
    final PrintAttributes val$newPrintAttributes;
    final PrintAttributes val$oldPrintAttributes;

    protected transient Bitmap doInBackground(Uri auri[])
    {
        try
        {
            auri = PrintHelperKitkat.access$200(_fld0, imageFile, 3500);
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            return null;
        }
        return auri;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Uri[])aobj);
    }

    protected void onCancelled(Bitmap bitmap)
    {
        val$layoutResultCallback.onLayoutCancelled();
        oadBitmap = null;
    }

    protected volatile void onCancelled(Object obj)
    {
        onCancelled((Bitmap)obj);
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        boolean flag = true;
        super.onPostExecute(bitmap);
        itmap = bitmap;
        if (bitmap != null)
        {
            bitmap = (new android.print.der(jobName)).setContentType(1).setPageCount(1).build();
            if (val$newPrintAttributes.equals(val$oldPrintAttributes))
            {
                flag = false;
            }
            val$layoutResultCallback.onLayoutFinished(bitmap, flag);
        } else
        {
            val$layoutResultCallback.onLayoutFailed(null);
        }
        oadBitmap = null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    protected void onPreExecute()
    {
        class _cls1
            implements android.os.CancellationSignal.OnCancelListener
        {

            final PrintHelperKitkat._cls2._cls1 this$2;

            public void onCancel()
            {
                PrintHelperKitkat._cls2.access$100(this$1);
                cancel(false);
            }

            _cls1()
            {
                this$2 = PrintHelperKitkat._cls2._cls1.this;
                super();
            }
        }

        val$cancellationSignal.setOnCancelListener(new _cls1());
    }

    Callback()
    {
        this$1 = final_callback;
        val$cancellationSignal = cancellationsignal;
        val$newPrintAttributes = printattributes;
        val$oldPrintAttributes = printattributes1;
        val$layoutResultCallback = android.print.ayoutResultCallback.this;
        super();
    }
}
