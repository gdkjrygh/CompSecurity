// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.print.PrintManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

class PrintHelperKitkat
{

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
        printmanager.print(jobName, new _cls1(), ((PrintAttributes) (obj)));
    }

    public void printBitmap(final String jobName, final Uri imageFile, final OnPrintFinishCallback callback)
    {
        android.print.PrintAttributes.Builder builder;
        imageFile = new _cls2();
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




    private class _cls1 extends PrintDocumentAdapter
    {

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
            apagerange = new PrintedPdfDocument(mContext, mAttributes);
            cancellationsignal = apagerange.startPage(1);
            Object obj = new RectF(cancellationsignal.getInfo().getContentRect());
            obj = getMatrix(bitmap.getWidth(), bitmap.getHeight(), ((RectF) (obj)), fittingMode);
            cancellationsignal.getCanvas().drawBitmap(bitmap, ((Matrix) (obj)), null);
            apagerange.finishPage(cancellationsignal);
            apagerange.writeTo(new FileOutputStream(parcelfiledescriptor.getFileDescriptor()));
            writeresultcallback.onWriteFinished(new PageRange[] {
                PageRange.ALL_PAGES
            });
_L2:
            apagerange.close();
            if (parcelfiledescriptor == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            parcelfiledescriptor.close();
            return;
            cancellationsignal;
            Log.e("PrintHelperKitkat", "Error writing printed content", cancellationsignal);
            writeresultcallback.onWriteFailed(null);
            if (true) goto _L2; else goto _L1
_L1:
            cancellationsignal;
            apagerange.close();
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

        _cls1()
        {
            this$0 = PrintHelperKitkat.this;
            jobName = s;
            bitmap = bitmap1;
            fittingMode = i;
            callback = onprintfinishcallback;
            super();
        }

        private class OnPrintFinishCallback
        {

            public abstract void onFinish();
        }

    }


    private class _cls2 extends PrintDocumentAdapter
    {

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
        }

        public void onLayout(final PrintAttributes oldPrintAttributes, final PrintAttributes newPrintAttributes, final CancellationSignal cancellationSignal, final android.print.PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle)
        {
            boolean flag = true;
            mAttributes = newPrintAttributes;
            if (cancellationSignal.isCanceled())
            {
                layoutResultCallback.onLayoutCancelled();
                return;
            }
            if (mBitmap != null)
            {
                cancellationSignal = (new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build();
                if (newPrintAttributes.equals(oldPrintAttributes))
                {
                    flag = false;
                }
                layoutResultCallback.onLayoutFinished(cancellationSignal, flag);
                return;
            } else
            {
                class _cls1 extends AsyncTask
                {

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
                        boolean flag1 = true;
                        super.onPostExecute(bitmap);
                        mBitmap = bitmap;
                        if (bitmap != null)
                        {
                            bitmap = (new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build();
                            if (newPrintAttributes.equals(oldPrintAttributes))
                            {
                                flag1 = false;
                            }
                            layoutResultCallback.onLayoutFinished(bitmap, flag1);
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
                        class _cls1
                            implements android.os.CancellationSignal.OnCancelListener
                        {

                            final _cls1 this$2;

                            public void onCancel()
                            {
                                cancelLoad();
                                cancel(false);
                            }

                                _cls1()
                                {
                                    this$2 = _cls1.this;
                                    super();
                                }
                        }

                        cancellationSignal.setOnCancelListener(new _cls1());
                    }

                _cls1()
                {
                    this$1 = _cls2.this;
                    cancellationSignal = cancellationsignal;
                    newPrintAttributes = printattributes;
                    oldPrintAttributes = printattributes1;
                    layoutResultCallback = layoutresultcallback;
                    super();
                }
                }

                mLoadBitmap = (new _cls1()).execute(new Uri[0]);
                return;
            }
        }

        public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print.PrintDocumentAdapter.WriteResultCallback writeresultcallback)
        {
            apagerange = new PrintedPdfDocument(mContext, mAttributes);
            cancellationsignal = apagerange.startPage(1);
            Object obj = new RectF(cancellationsignal.getInfo().getContentRect());
            obj = getMatrix(mBitmap.getWidth(), mBitmap.getHeight(), ((RectF) (obj)), fittingMode);
            cancellationsignal.getCanvas().drawBitmap(mBitmap, ((Matrix) (obj)), null);
            apagerange.finishPage(cancellationsignal);
            apagerange.writeTo(new FileOutputStream(parcelfiledescriptor.getFileDescriptor()));
            writeresultcallback.onWriteFinished(new PageRange[] {
                PageRange.ALL_PAGES
            });
_L2:
            apagerange.close();
            if (parcelfiledescriptor == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            parcelfiledescriptor.close();
            return;
            cancellationsignal;
            Log.e("PrintHelperKitkat", "Error writing printed content", cancellationsignal);
            writeresultcallback.onWriteFailed(null);
            if (true) goto _L2; else goto _L1
_L1:
            cancellationsignal;
            apagerange.close();
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


        _cls2()
        {
            this$0 = PrintHelperKitkat.this;
            jobName = s;
            imageFile = uri;
            callback = onprintfinishcallback;
            fittingMode = i;
            super();
            mBitmap = null;
        }
    }

}
