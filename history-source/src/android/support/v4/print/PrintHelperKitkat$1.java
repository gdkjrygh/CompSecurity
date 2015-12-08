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
        apagerange = new PrintedPdfDocument(mContext, mAttributes);
        cancellationsignal = apagerange.startPage(1);
        Object obj = new RectF(cancellationsignal.Info().getContentRect());
        obj = PrintHelperKitkat.access$000(PrintHelperKitkat.this, val$bitmap.getWidth(), val$bitmap.getHeight(), ((RectF) (obj)), val$fittingMode);
        cancellationsignal.Canvas().drawBitmap(val$bitmap, ((android.graphics.Matrix) (obj)), null);
        apagerange.finishPage(cancellationsignal);
        apagerange.writeTo(new FileOutputStream(parcelfiledescriptor.getFileDescriptor()));
        writeresultcallback.onWriteFinished(new PageRange[] {
            PageRange.ALL_PAGES
        });
_L2:
        if (apagerange != null)
        {
            apagerange.close();
        }
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        parcelfiledescriptor.close();
        return;
        cancellationsignal;
        Log.e("PrintHelperKitkat", "Error writing printed content", cancellationsignal);
        writeresultcallback.onWriteFailed(null);
        if (true) goto _L2; else goto _L1
_L1:
        cancellationsignal;
        if (apagerange != null)
        {
            apagerange.close();
        }
        if (parcelfiledescriptor != null)
        {
            try
            {
                parcelfiledescriptor.close();
            }
            // Misplaced declaration of an exception variable
            catch (PageRange apagerange[]) { }
        }
        throw cancellationsignal;
        apagerange;
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
