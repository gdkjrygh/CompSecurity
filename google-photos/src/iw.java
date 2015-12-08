// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
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

final class iw extends PrintDocumentAdapter
{

    AsyncTask a;
    Bitmap b;
    final String c;
    final Uri d;
    final iv e;
    private PrintAttributes f;
    private iz g;
    private int h;

    iw(iv iv1, String s, Uri uri, iz iz, int i)
    {
        e = iv1;
        c = s;
        d = uri;
        g = iz;
        h = i;
        super();
        b = null;
    }

    private void a()
    {
        synchronized (e.c)
        {
            if (e.b != null)
            {
                e.b.requestCancelDecode();
                e.b = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(iw iw1)
    {
        iw1.a();
    }

    public final void onFinish()
    {
        super.onFinish();
        a();
        if (a != null)
        {
            a.cancel(true);
        }
        if (b != null)
        {
            b.recycle();
            b = null;
        }
    }

    public final void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback, Bundle bundle)
    {
        boolean flag = true;
        f = printattributes1;
        if (cancellationsignal.isCanceled())
        {
            layoutresultcallback.onLayoutCancelled();
            return;
        }
        if (b != null)
        {
            cancellationsignal = (new android.print.PrintDocumentInfo.Builder(c)).setContentType(1).setPageCount(1).build();
            if (printattributes1.equals(printattributes))
            {
                flag = false;
            }
            layoutresultcallback.onLayoutFinished(cancellationsignal, flag);
            return;
        } else
        {
            a = (new ix(this, cancellationsignal, printattributes1, printattributes, layoutresultcallback)).execute(new Uri[0]);
            return;
        }
    }

    public final void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
    {
        float f1;
        PrintedPdfDocument printedpdfdocument;
        Object obj;
        int j;
        printedpdfdocument = new PrintedPdfDocument(e.a, f);
        apagerange = e;
        apagerange = b;
        Object obj1;
        int i;
        int k;
        if (f.getColorMode() == 1)
        {
            cancellationsignal = Bitmap.createBitmap(apagerange.getWidth(), apagerange.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            obj = new Canvas(cancellationsignal);
            Paint paint = new Paint();
            ColorMatrix colormatrix = new ColorMatrix();
            colormatrix.setSaturation(0.0F);
            paint.setColorFilter(new ColorMatrixColorFilter(colormatrix));
            ((Canvas) (obj)).drawBitmap(apagerange, 0.0F, 0.0F, paint);
            ((Canvas) (obj)).setBitmap(null);
            apagerange = cancellationsignal;
        }
        cancellationsignal = printedpdfdocument.startPage(1);
        obj = new RectF(cancellationsignal.getInfo().getContentRect());
        obj1 = e;
        i = b.getWidth();
        j = b.getHeight();
        k = h;
        obj1 = new Matrix();
        f1 = ((RectF) (obj)).width() / (float)i;
        if (k != 2) goto _L2; else goto _L1
_L1:
        f1 = Math.max(f1, ((RectF) (obj)).height() / (float)j);
_L3:
        ((Matrix) (obj1)).postScale(f1, f1);
        ((Matrix) (obj1)).postTranslate((((RectF) (obj)).width() - (float)i * f1) / 2.0F, (((RectF) (obj)).height() - f1 * (float)j) / 2.0F);
        cancellationsignal.getCanvas().drawBitmap(apagerange, ((Matrix) (obj1)), null);
        printedpdfdocument.finishPage(cancellationsignal);
        printedpdfdocument.writeTo(new FileOutputStream(parcelfiledescriptor.getFileDescriptor()));
        writeresultcallback.onWriteFinished(new PageRange[] {
            PageRange.ALL_PAGES
        });
_L4:
        printedpdfdocument.close();
        if (parcelfiledescriptor != null)
        {
            try
            {
                parcelfiledescriptor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ParcelFileDescriptor parcelfiledescriptor) { }
        }
        if (apagerange != b)
        {
            apagerange.recycle();
        }
        return;
_L2:
        f1 = Math.min(f1, ((RectF) (obj)).height() / (float)j);
          goto _L3
        cancellationsignal;
        Log.e("PrintHelperKitkat", "Error writing printed content", cancellationsignal);
        writeresultcallback.onWriteFailed(null);
          goto _L4
        cancellationsignal;
        printedpdfdocument.close();
        if (parcelfiledescriptor != null)
        {
            try
            {
                parcelfiledescriptor.close();
            }
            // Misplaced declaration of an exception variable
            catch (ParcelFileDescriptor parcelfiledescriptor) { }
        }
        if (apagerange != b)
        {
            apagerange.recycle();
        }
        throw cancellationsignal;
          goto _L3
    }
}
