// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.os.Handler;
import com.roidapp.baselib.c.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImage

class mListener extends c
{

    private final Bitmap mBitmap;
    private final String mFileName;
    private final String mFolderName;
    private final Handler mHandler = new Handler();
    private final SavedListener mListener;
    final GPUImage this$0;

    private void saveImage(String s, String s1, Bitmap bitmap)
    {
        s1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), (new StringBuilder()).append(s).append("/").append(s1).toString());
        try
        {
            s1.getParentFile().mkdirs();
            bitmap.compress(android.graphics.mat.JPEG, 100, new FileOutputStream(s1));
            s = GPUImage.access$100(GPUImage.this);
            s1 = s1.toString();
            class _cls1
                implements android.media.MediaScannerConnection.OnScanCompletedListener
            {

                final GPUImage.SaveTask this$1;

                public void onScanCompleted(String s2, final Uri uri)
                {
                    class _cls1
                        implements Runnable
                    {

                        final _cls1 this$2;
                        final Uri val$uri;

                        public void run()
                        {
                            mListener.onPictureSaved(uri);
                        }

                            _cls1()
                            {
                                this$2 = _cls1.this;
                                uri = uri1;
                                super();
                            }
                    }

                    if (mListener != null)
                    {
                        mHandler.post(new _cls1());
                    }
                }

            _cls1()
            {
                this$1 = GPUImage.SaveTask.this;
                super();
            }
            }

            bitmap = new _cls1();
            MediaScannerConnection.scanFile(s, new String[] {
                s1
            }, null, bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        avoid = getBitmapWithFilterApplied(mBitmap);
        saveImage(mFolderName, mFileName, avoid);
        return null;
    }



    public SavedListener(Bitmap bitmap, String s, String s1, SavedListener savedlistener)
    {
        this$0 = GPUImage.this;
        super();
        mBitmap = bitmap;
        mFolderName = s;
        mFileName = s1;
        mListener = savedlistener;
    }
}
