// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class PrintHelperKitkat
{

    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    private static final String LOG_TAG = "PrintHelperKitkat";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    int mColorMode;
    final Context mContext;
    int mScaleMode;

    PrintHelperKitkat(Context context)
    {
        mScaleMode = 2;
        mColorMode = 2;
        mContext = context;
    }

    private Bitmap loadBitmap(Uri uri, android.graphics.BitmapFactory.Options options)
        throws FileNotFoundException
    {
        Uri uri1;
        if (uri == null || mContext == null)
        {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        uri1 = null;
        uri = mContext.getContentResolver().openInputStream(uri);
        uri1 = uri;
        options = BitmapFactory.decodeStream(uri, null, options);
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                Log.w("PrintHelperKitkat", "close fail ", uri);
                return options;
            }
        }
        return options;
        uri;
        if (uri1 != null)
        {
            try
            {
                uri1.close();
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.BitmapFactory.Options options)
            {
                Log.w("PrintHelperKitkat", "close fail ", options);
            }
        }
        throw uri;
    }

    private Bitmap loadConstrainedBitmap(Uri uri, int i)
        throws FileNotFoundException
    {
        if (i <= 0 || uri == null || mContext == null)
        {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        loadBitmap(uri, options);
        int l = options.outWidth;
        int i1 = options.outHeight;
        if (l > 0 && i1 > 0)
        {
            int k = Math.max(l, i1);
            int j;
            for (j = 1; k > i; j <<= 1)
            {
                k >>>= 1;
            }

            if (j > 0 && Math.min(l, i1) / j > 0)
            {
                android.graphics.BitmapFactory.Options options1 = new android.graphics.BitmapFactory.Options();
                options1.inMutable = true;
                options1.inSampleSize = j;
                return loadBitmap(uri, options1);
            }
        }
        return null;
    }

    public int getColorMode()
    {
        return mColorMode;
    }

    public int getScaleMode()
    {
        return mScaleMode;
    }

    public void printBitmap(final String jobName, final Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        }
        final int fittingMode = mScaleMode;
        PrintManager printmanager = (PrintManager)mContext.getSystemService("print");
        Object obj = android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            obj = android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        }
        obj = (new android.print.PrintAttributes.Builder()).setMediaSize(((android.print.PrintAttributes.MediaSize) (obj))).setColorMode(mColorMode).build();
        printmanager.print(jobName, new PrintDocumentAdapter() {

            private PrintAttributes mAttributes;
            final PrintHelperKitkat this$0;
            final Bitmap val$bitmap;
            final int val$fittingMode;
            final String val$jobName;

            public void onLayout(PrintAttributes printattributes, PrintAttributes printattributes1, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback, Bundle bundle)
            {
                boolean flag = true;
                mAttributes = printattributes1;
                cancellationsignal = (new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build();
                if (printattributes1.equals(printattributes))
                {
                    flag = false;
                }
                layoutresultcallback.onLayoutFinished(cancellationsignal, flag);
            }

            public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
            {
                apagerange = new PrintedPdfDocument(mContext, mAttributes);
                float f;
                RectF rectf;
                Matrix matrix;
                cancellationsignal = apagerange.startPage(1);
                rectf = new RectF(cancellationsignal.getInfo().getContentRect());
                matrix = new Matrix();
                f = rectf.width() / (float)bitmap.getWidth();
                if (fittingMode != 2) goto _L2; else goto _L1
_L1:
                f = Math.max(f, rectf.height() / (float)bitmap.getHeight());
_L6:
                matrix.postScale(f, f);
                matrix.postTranslate((rectf.width() - (float)bitmap.getWidth() * f) / 2.0F, (rectf.height() - (float)bitmap.getHeight() * f) / 2.0F);
                cancellationsignal.getCanvas().drawBitmap(bitmap, matrix, null);
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
                f = Math.min(f, rectf.height() / (float)bitmap.getHeight());
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

            
            {
                this$0 = PrintHelperKitkat.this;
                jobName = s;
                bitmap = bitmap1;
                fittingMode = i;
                super();
            }
        }, ((PrintAttributes) (obj)));
    }

    public void printBitmap(String s, Uri uri)
        throws FileNotFoundException
    {
        printBitmap(s, loadConstrainedBitmap(uri, 3500));
    }

    public void setColorMode(int i)
    {
        mColorMode = i;
    }

    public void setScaleMode(int i)
    {
        mScaleMode = i;
    }
}
