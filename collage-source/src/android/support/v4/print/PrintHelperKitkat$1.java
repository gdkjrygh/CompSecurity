// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package android.support.v4.print:
//            PrintHelperKitkat

class PrintFinishCallback extends PrintDocumentAdapter
{

    private PrintAttributes mAttributes;
    final PrintHelperKitkat this$0;
    final Bitmap val$bitmap;
    final PrintFinishCallback val$callback;
    final int val$fittingMode;
    final String val$jobName;

    public void onFinish()
    {
        if (val$callback != null)
        {
            val$callback.onFinish();
        }
    }

    public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print..LayoutResultCallback layoutresultcallback, Bundle bundle)
    {
        boolean flag = true;
        mAttributes = printattributes1;
        cancellationsignal = (new android.print.ilder(val$jobName)).setContentType(1).setPageCount(1).build();
        if (printattributes1.equals(printattributes))
        {
            flag = false;
        }
        layoutresultcallback.onLayoutFinished(cancellationsignal, flag);
    }

    public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print..WriteResultCallback writeresultcallback)
    {
        cancellationsignal = new PrintedPdfDocument(mContext, mAttributes);
        apagerange = PrintHelperKitkat.access$000(PrintHelperKitkat.this, val$bitmap, mAttributes.getColorMode());
        android.graphics.pdf.t t = cancellationsignal.startPage(1);
        Object obj = new RectF(t.Info().getContentRect());
        obj = PrintHelperKitkat.access$100(PrintHelperKitkat.this, apagerange.getWidth(), apagerange.getHeight(), ((RectF) (obj)), val$fittingMode);
        t.Canvas().drawBitmap(apagerange, ((android.graphics.Matrix) (obj)), null);
        cancellationsignal.finishPage(t);
        cancellationsignal.writeTo(new FileOutputStream(parcelfiledescriptor.getFileDescriptor()));
        writeresultcallback.onWriteFinished(new PageRange[] {
            PageRange.ALL_PAGES
        });
_L1:
        if (cancellationsignal != null)
        {
            cancellationsignal.close();
        }
        IOException ioexception;
        if (parcelfiledescriptor != null)
        {
            try
            {
                parcelfiledescriptor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ParcelFileDescriptor parcelfiledescriptor) { }
        }
        if (apagerange != val$bitmap)
        {
            apagerange.recycle();
        }
        return;
        ioexception;
        Log.e("PrintHelperKitkat", "Error writing printed content", ioexception);
        writeresultcallback.onWriteFailed(null);
          goto _L1
        writeresultcallback;
        if (cancellationsignal != null)
        {
            cancellationsignal.close();
        }
        if (parcelfiledescriptor != null)
        {
            try
            {
                parcelfiledescriptor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ParcelFileDescriptor parcelfiledescriptor) { }
        }
        if (apagerange != val$bitmap)
        {
            apagerange.recycle();
        }
        throw writeresultcallback;
    }

    PrintFinishCallback()
    {
        this$0 = final_printhelperkitkat;
        val$jobName = s;
        val$bitmap = bitmap1;
        val$fittingMode = i;
        val$callback = PrintFinishCallback.this;
        super();
    }
}
