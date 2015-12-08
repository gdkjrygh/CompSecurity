// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
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

class val.fittingMode extends PrintDocumentAdapter
{

    private PrintAttributes mAttributes;
    final PrintHelperKitkat this$0;
    final Bitmap val$bitmap;
    final int val$fittingMode;
    final String val$jobName;

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
        float f;
        RectF rectf;
        Matrix matrix;
        cancellationsignal = apagerange.startPage(1);
        rectf = new RectF(cancellationsignal.Info().getContentRect());
        matrix = new Matrix();
        f = rectf.width() / (float)val$bitmap.getWidth();
        if (val$fittingMode != 2) goto _L2; else goto _L1
_L1:
        f = Math.max(f, rectf.height() / (float)val$bitmap.getHeight());
_L6:
        matrix.postScale(f, f);
        matrix.postTranslate((rectf.width() - (float)val$bitmap.getWidth() * f) / 2.0F, (rectf.height() - (float)val$bitmap.getHeight() * f) / 2.0F);
        cancellationsignal.Canvas().drawBitmap(val$bitmap, matrix, null);
        apagerange.finishPage(cancellationsignal);
        apagerange.writeTo(new FileOutputStream(parcelfiledescriptor.getFileDescriptor()));
        writeresultcallback.onWriteFinished(new PageRange[] {
            PageRange.ALL_PAGES
        });
_L4:
        if (apagerange != null)
        {
            apagerange.close();
        }
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        parcelfiledescriptor.close();
        return;
_L2:
        f = Math.min(f, rectf.height() / (float)val$bitmap.getHeight());
        continue; /* Loop/switch isn't completed */
        cancellationsignal;
        Log.e("PrintHelperKitkat", "Error writing printed content", cancellationsignal);
        writeresultcallback.onWriteFailed(null);
        if (true) goto _L4; else goto _L3
_L3:
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
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    tCallback()
    {
        this$0 = final_printhelperkitkat;
        val$jobName = s;
        val$bitmap = bitmap1;
        val$fittingMode = I.this;
        super();
    }
}
