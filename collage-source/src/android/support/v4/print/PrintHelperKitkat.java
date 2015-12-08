// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

class PrintHelperKitkat
{
    public static interface OnPrintFinishCallback
    {

        public abstract void onFinish();
    }


    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    private static final String LOG_TAG = "PrintHelperKitkat";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    int mColorMode;
    final Context mContext;
    android.graphics.BitmapFactory.Options mDecodeOptions;
    private final Object mLock = new Object();
    int mOrientation;
    int mScaleMode;

    PrintHelperKitkat(Context context)
    {
        mDecodeOptions = null;
        mScaleMode = 2;
        mColorMode = 2;
        mOrientation = 1;
        mContext = context;
    }

    private Bitmap convertBitmapForColorMode(Bitmap bitmap, int i)
    {
        if (i != 1)
        {
            return bitmap;
        } else
        {
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            Paint paint = new Paint();
            ColorMatrix colormatrix = new ColorMatrix();
            colormatrix.setSaturation(0.0F);
            paint.setColorFilter(new ColorMatrixColorFilter(colormatrix));
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
            canvas.setBitmap(null);
            return bitmap1;
        }
    }

    private Matrix getMatrix(int i, int j, RectF rectf, int k)
    {
        Matrix matrix = new Matrix();
        float f = rectf.width() / (float)i;
        if (k == 2)
        {
            f = Math.max(f, rectf.height() / (float)j);
        } else
        {
            f = Math.min(f, rectf.height() / (float)j);
        }
        matrix.postScale(f, f);
        matrix.postTranslate((rectf.width() - (float)i * f) / 2.0F, (rectf.height() - f * (float)j) / 2.0F);
        return matrix;
    }

    private Bitmap loadBitmap(Uri uri, android.graphics.BitmapFactory.Options options)
        throws FileNotFoundException
    {
        Uri uri1;
        uri1 = null;
        if (uri == null || mContext == null)
        {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
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
        int j;
        int l;
        int i1;
        j = 1;
        if (i <= 0 || uri == null || mContext == null)
        {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        loadBitmap(uri, options);
        l = options.outWidth;
        i1 = options.outHeight;
        if (l > 0 && i1 > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        for (int k = Math.max(l, i1); k > i;)
        {
            k >>>= 1;
            j <<= 1;
        }

        if (j <= 0 || Math.min(l, i1) / j <= 0) goto _L1; else goto _L3
_L3:
        android.graphics.BitmapFactory.Options options1;
        synchronized (mLock)
        {
            mDecodeOptions = new android.graphics.BitmapFactory.Options();
            mDecodeOptions.inMutable = true;
            mDecodeOptions.inSampleSize = j;
            options1 = mDecodeOptions;
        }
        obj = loadBitmap(uri, options1);
        synchronized (mLock)
        {
            mDecodeOptions = null;
        }
        return ((Bitmap) (obj));
        obj;
        uri;
        JVM INSTR monitorexit ;
        throw obj;
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        Exception exception;
        exception;
        synchronized (mLock)
        {
            mDecodeOptions = null;
        }
        throw exception;
        exception1;
        uri;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public int getColorMode()
    {
        return mColorMode;
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    public int getScaleMode()
    {
        return mScaleMode;
    }

    public void printBitmap(final String jobName, final Bitmap bitmap, final OnPrintFinishCallback callback)
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
            final OnPrintFinishCallback val$callback;
            final int val$fittingMode;
            final String val$jobName;

            public void onFinish()
            {
                if (callback != null)
                {
                    callback.onFinish();
                }
            }

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
                cancellationsignal = new PrintedPdfDocument(mContext, mAttributes);
                apagerange = convertBitmapForColorMode(bitmap, mAttributes.getColorMode());
                android.graphics.pdf.PdfDocument.Page page = cancellationsignal.startPage(1);
                Object obj1 = new RectF(page.getInfo().getContentRect());
                obj1 = getMatrix(apagerange.getWidth(), apagerange.getHeight(), ((RectF) (obj1)), fittingMode);
                page.getCanvas().drawBitmap(apagerange, ((Matrix) (obj1)), null);
                cancellationsignal.finishPage(page);
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
                if (apagerange != bitmap)
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
                if (apagerange != bitmap)
                {
                    apagerange.recycle();
                }
                throw writeresultcallback;
            }

            
            {
                this$0 = PrintHelperKitkat.this;
                jobName = s;
                bitmap = bitmap1;
                fittingMode = i;
                callback = onprintfinishcallback;
                super();
            }
        }, ((PrintAttributes) (obj)));
    }

    public void printBitmap(final String jobName, final Uri imageFile, final OnPrintFinishCallback callback)
        throws FileNotFoundException
    {
        android.print.PrintAttributes.Builder builder;
        imageFile = new PrintDocumentAdapter() {

            private PrintAttributes mAttributes;
            Bitmap mBitmap;
            AsyncTask mLoadBitmap;
            final PrintHelperKitkat this$0;
            final OnPrintFinishCallback val$callback;
            final int val$fittingMode;
            final Uri val$imageFile;
            final String val$jobName;

            private void cancelLoad()
            {
                synchronized (mLock)
                {
                    if (mDecodeOptions != null)
                    {
                        mDecodeOptions.requestCancelDecode();
                        mDecodeOptions = null;
                    }
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public void onFinish()
            {
                super.onFinish();
                cancelLoad();
                if (mLoadBitmap != null)
                {
                    mLoadBitmap.cancel(true);
                }
                if (callback != null)
                {
                    callback.onFinish();
                }
                if (mBitmap != null)
                {
                    mBitmap.recycle();
                    mBitmap = null;
                }
            }

            public void onLayout(final PrintAttributes oldPrintAttributes, final PrintAttributes newPrintAttributes, final CancellationSignal cancellationSignal, android.print.PrintDocumentAdapter.LayoutResultCallback layoutresultcallback, Bundle bundle)
            {
                boolean flag = true;
                mAttributes = newPrintAttributes;
                if (cancellationSignal.isCanceled())
                {
                    layoutresultcallback.onLayoutCancelled();
                    return;
                }
                if (mBitmap != null)
                {
                    cancellationSignal = (new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build();
                    if (newPrintAttributes.equals(oldPrintAttributes))
                    {
                        flag = false;
                    }
                    layoutresultcallback.onLayoutFinished(cancellationSignal, flag);
                    return;
                } else
                {
                    mLoadBitmap = (layoutresultcallback. new AsyncTask() {

                        final _cls2 this$1;
                        final CancellationSignal val$cancellationSignal;
                        final android.print.PrintDocumentAdapter.LayoutResultCallback val$layoutResultCallback;
                        final PrintAttributes val$newPrintAttributes;
                        final PrintAttributes val$oldPrintAttributes;

                        protected transient Bitmap doInBackground(Uri auri[])
                        {
                            try
                            {
                                auri = loadConstrainedBitmap(imageFile, 3500);
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
                            layoutResultCallback.onLayoutCancelled();
                            mLoadBitmap = null;
                        }

                        protected volatile void onCancelled(Object obj)
                        {
                            onCancelled((Bitmap)obj);
                        }

                        protected void onPostExecute(Bitmap bitmap)
                        {
                            boolean flag = true;
                            super.onPostExecute(bitmap);
                            mBitmap = bitmap;
                            if (bitmap != null)
                            {
                                bitmap = (new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build();
                                if (newPrintAttributes.equals(oldPrintAttributes))
                                {
                                    flag = false;
                                }
                                layoutResultCallback.onLayoutFinished(bitmap, flag);
                            } else
                            {
                                layoutResultCallback.onLayoutFailed(null);
                            }
                            mLoadBitmap = null;
                        }

                        protected volatile void onPostExecute(Object obj)
                        {
                            onPostExecute((Bitmap)obj);
                        }

                        protected void onPreExecute()
                        {
                            cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

                                final _cls1 this$2;

                                public void onCancel()
                                {
                                    cancelLoad();
                                    cancel(false);
                                }

            
            {
                this$2 = _cls1.this;
                super();
            }
                            });
                        }

            
            {
                this$1 = final__pcls2;
                cancellationSignal = cancellationsignal;
                newPrintAttributes = printattributes;
                oldPrintAttributes = printattributes1;
                layoutResultCallback = android.print.PrintDocumentAdapter.LayoutResultCallback.this;
                super();
            }
                    }).execute(new Uri[0]);
                    return;
                }
            }

            public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
            {
                cancellationsignal = new PrintedPdfDocument(mContext, mAttributes);
                apagerange = convertBitmapForColorMode(mBitmap, mAttributes.getColorMode());
                android.graphics.pdf.PdfDocument.Page page = cancellationsignal.startPage(1);
                Object obj = new RectF(page.getInfo().getContentRect());
                obj = getMatrix(mBitmap.getWidth(), mBitmap.getHeight(), ((RectF) (obj)), fittingMode);
                page.getCanvas().drawBitmap(apagerange, ((Matrix) (obj)), null);
                cancellationsignal.finishPage(page);
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
                if (apagerange != mBitmap)
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
                if (apagerange != mBitmap)
                {
                    apagerange.recycle();
                }
                throw writeresultcallback;
            }


            
            {
                this$0 = PrintHelperKitkat.this;
                jobName = s;
                imageFile = uri;
                callback = onprintfinishcallback;
                fittingMode = i;
                super();
                mBitmap = null;
            }
        };
        callback = (PrintManager)mContext.getSystemService("print");
        builder = new android.print.PrintAttributes.Builder();
        builder.setColorMode(mColorMode);
        if (mOrientation != 1) goto _L2; else goto _L1
_L1:
        builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
_L4:
        callback.print(jobName, imageFile, builder.build());
        return;
_L2:
        if (mOrientation == 2)
        {
            builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setColorMode(int i)
    {
        mColorMode = i;
    }

    public void setOrientation(int i)
    {
        mOrientation = i;
    }

    public void setScaleMode(int i)
    {
        mScaleMode = i;
    }




}
