// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.PeopleClientUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            ImageUtils

public class OwnersImageManager
{
    protected abstract class OwnerImageRequest
    {

        public String accountName;
        public boolean canceled;
        final OwnersImageManager this$0;
        public ImageView view;

        public abstract void load();

        protected OwnerImageRequest()
        {
            this$0 = OwnersImageManager.this;
            super();
        }
    }

    private final class PfdLoader extends AsyncTask
    {

        final ParcelFileDescriptor mPfd;
        final int mRawHeight;
        final int mRawWidth;
        final OwnerImageRequest mRequest;
        final int mTargetWidth;
        final OwnersImageManager this$0;

        private transient Bitmap doInBackground$2d4c763b()
        {
            if (!mUseCircularAvatar) goto _L2; else goto _L1
_L1:
            Bitmap bitmap = PeopleClientUtil.decodeFileDescriptor(mPfd);
            if (bitmap != null) goto _L4; else goto _L3
_L3:
            bitmap = null;
_L6:
            if (bitmap == null)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            mImages.put(mRequest.accountName, bitmap);
            if (mPfd != null)
            {
                try
                {
                    mPfd.close();
                }
                catch (IOException ioexception)
                {
                    Log.d("OwnersImageManager", ioexception.getMessage());
                    return bitmap;
                }
            }
            return bitmap;
_L4:
            bitmap = ImageUtils.frameBitmapInCircle(bitmap);
            continue; /* Loop/switch isn't completed */
_L2:
            bitmap = OwnersImageManager.decodeFileDescriptor(mPfd, mRawWidth, mRawHeight, mTargetWidth, (int)(((float)mRawWidth * mRatioHeight) / mRatioWidth));
            if (bitmap == null)
            {
                bitmap = null;
                continue; /* Loop/switch isn't completed */
            }
            bitmap = OwnersImageManager.centerCrop(bitmap, mRawWidth, mRatioHeight / mRatioWidth);
            if (true) goto _L6; else goto _L5
_L5:
            Exception exception;
            exception;
            if (mPfd != null)
            {
                try
                {
                    mPfd.close();
                }
                catch (IOException ioexception1)
                {
                    Log.d("OwnersImageManager", ioexception1.getMessage());
                }
            }
            throw exception;
        }

        protected final volatile Object doInBackground(Object aobj[])
        {
            return doInBackground$2d4c763b();
        }

        protected final volatile void onPostExecute(Object obj)
        {
            obj = (Bitmap)obj;
            if (mRequest.view.getTag() == mRequest)
            {
                setImageBitmap(mRequest, ((Bitmap) (obj)));
            }
        }

        PfdLoader(OwnerImageRequest ownerimagerequest, ParcelFileDescriptor parcelfiledescriptor, int i, int j, int k)
        {
            this$0 = OwnersImageManager.this;
            super();
            mRequest = ownerimagerequest;
            mPfd = parcelfiledescriptor;
            mRawWidth = i;
            mRawHeight = j;
            mTargetWidth = k;
        }
    }


    public static volatile Executor IMAGE_LOAD_TASK_EXECUTOR = null;
    private static int sAvatarFadeDuration = -1;
    private static boolean sIsLowMemoryDevice;
    public final GoogleApiClient mClient;
    public boolean mClosed;
    public final Context mContext;
    private final ConcurrentHashMap mImages = new ConcurrentHashMap();
    public final LinkedList mPendingRequests = new LinkedList();
    private float mRatioHeight;
    private float mRatioWidth;
    public OwnerImageRequest mRunningRequest;
    private boolean mUseCircularAvatar;

    public OwnersImageManager(Context context, GoogleApiClient googleapiclient, boolean flag)
    {
        mContext = context;
        mClient = googleapiclient;
        mUseCircularAvatar = flag;
        googleapiclient = context.getResources();
        mRatioWidth = googleapiclient.getInteger(0x7f0e0006);
        mRatioHeight = googleapiclient.getInteger(0x7f0e0005);
        context = (ActivityManager)context.getSystemService("activity");
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = context.isLowRamDevice();
        } else
        {
            flag = false;
        }
        sIsLowMemoryDevice = flag;
    }

    private static int calculateInSampleSize(int i, int j, int k, int l)
    {
        if (!sIsLowMemoryDevice) goto _L2; else goto _L1
_L1:
        int i1 = 2;
_L4:
        return i1;
_L2:
        boolean flag;
        flag = true;
        i1 = 1;
        if (i <= l && j <= k) goto _L4; else goto _L3
_L3:
        int j1;
        j1 = i / 2;
        j /= 2;
        i = ((flag) ? 1 : 0);
_L7:
        i1 = i;
        if (j1 / i < l) goto _L4; else goto _L5
_L5:
        i1 = i;
        if (j / i < k) goto _L4; else goto _L6
_L6:
        i *= 2;
          goto _L7
    }

    public static Bitmap centerCrop(Bitmap bitmap, int i, float f)
    {
        int l = (int)((float)i * f);
        int j = bitmap.getWidth();
        int k = bitmap.getHeight();
        if (i == j && l == k)
        {
            return bitmap;
        } else
        {
            Matrix matrix = new Matrix();
            f = Math.max((float)i / (float)j, (float)l / (float)k);
            matrix.setScale(f, f);
            i = Math.round((float)i / f);
            l = Math.round((float)l / f);
            int i1 = (int)((float)j * 0.5F - (float)(i / 2));
            int j1 = (int)((float)k * 0.5F - (float)(l / 2));
            return Bitmap.createBitmap(bitmap, Math.max(Math.min(i1, j - i), 0), Math.max(Math.min(j1, k - l), 0), i, l, matrix, true);
        }
    }

    private static void closeQuietly(InputStream inputstream)
    {
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.d("AvatarManager", "Exception closing the cover photo input stream.");
        }
    }

    public static Bitmap decodeFileDescriptor(ParcelFileDescriptor parcelfiledescriptor, int i, int j, int k, int l)
    {
        Object obj;
        Object obj1;
        if (parcelfiledescriptor == null)
        {
            return null;
        }
        obj = new android.graphics.BitmapFactory.Options();
        obj.inSampleSize = calculateInSampleSize(i, j, k, l);
        obj.inJustDecodeBounds = false;
        obj.outWidth = i;
        obj.outHeight = j;
        if (sIsLowMemoryDevice)
        {
            obj.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        obj1 = null;
        parcelfiledescriptor = new FileInputStream(parcelfiledescriptor.getFileDescriptor());
        obj = BitmapFactory.decodeStream(parcelfiledescriptor, null, ((android.graphics.BitmapFactory.Options) (obj)));
        closeQuietly(parcelfiledescriptor);
        return ((Bitmap) (obj));
        Exception exception;
        exception;
        parcelfiledescriptor = obj1;
_L2:
        if (parcelfiledescriptor != null)
        {
            closeQuietly(parcelfiledescriptor);
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void processNextRequestIfIdle()
    {
        while (mPendingRequests.isEmpty() || mRunningRequest != null) 
        {
            return;
        }
        mRunningRequest = (OwnerImageRequest)mPendingRequests.remove();
        mRunningRequest.load();
    }

    public final void loadImageRequest(OwnerImageRequest ownerimagerequest)
    {
        if (mImages.containsKey(ownerimagerequest.accountName))
        {
            ownerimagerequest.view.setImageBitmap((Bitmap)mImages.get(ownerimagerequest.accountName));
            removePendingRequest(ownerimagerequest.view);
            return;
        }
        ImageView imageview = ownerimagerequest.view;
        removePendingRequest(imageview);
        if (!mClient.isConnected())
        {
            Log.d("AvatarManager", "Client not connected.");
            return;
        } else
        {
            imageview.setTag(ownerimagerequest);
            mPendingRequests.add(ownerimagerequest);
            processNextRequestIfIdle();
            return;
        }
    }

    public final void onImageLoaded(Status status, ParcelFileDescriptor parcelfiledescriptor, int i, int j, int k, OwnerImageRequest ownerimagerequest)
    {
        ParcelFileDescriptor parcelfiledescriptor1 = parcelfiledescriptor;
        if (mRunningRequest == ownerimagerequest) goto _L2; else goto _L1
_L1:
        Log.w("AvatarManager", "Got a different request than we're waiting for!");
        if (!mClosed)
        {
            processNextRequestIfIdle();
        }
        if (parcelfiledescriptor1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        parcelfiledescriptor1.close();
_L4:
        return;
_L2:
        boolean flag;
        mRunningRequest = null;
        flag = mClosed;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (!mClosed)
        {
            processNextRequestIfIdle();
        }
        if (parcelfiledescriptor1 == null) goto _L4; else goto _L3
_L3:
        try
        {
            parcelfiledescriptor1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            return;
        }
        if (ownerimagerequest.view.getTag() != ownerimagerequest)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag = ownerimagerequest.canceled;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (!mClosed)
        {
            processNextRequestIfIdle();
        }
        if (parcelfiledescriptor1 == null) goto _L4; else goto _L5
_L5:
        try
        {
            parcelfiledescriptor1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            return;
        }
        if (status.isSuccess() && parcelfiledescriptor != null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        Log.d("AvatarManager", (new StringBuilder("Avatar loaded: status=")).append(status).append("  pfd=").append(parcelfiledescriptor).toString());
        status = parcelfiledescriptor1;
        if (parcelfiledescriptor == null) goto _L7; else goto _L6
_L6:
        status = new PfdLoader(ownerimagerequest, parcelfiledescriptor, i, j, k);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        status.executeOnExecutor(IMAGE_LOAD_TASK_EXECUTOR, new Void[0]);
_L9:
        status = null;
_L7:
        if (!mClosed)
        {
            processNextRequestIfIdle();
        }
        if (status == null) goto _L4; else goto _L8
_L8:
        try
        {
            status.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            return;
        }
        status.execute(null);
          goto _L9
        status;
        if (!mClosed)
        {
            processNextRequestIfIdle();
        }
        if (parcelfiledescriptor1 != null)
        {
            try
            {
                parcelfiledescriptor1.close();
            }
            // Misplaced declaration of an exception variable
            catch (ParcelFileDescriptor parcelfiledescriptor) { }
        }
        throw status;
        status;
    }

    public final void removePendingRequest(ImageView imageview)
    {
        imageview.setTag(null);
        for (int i = 0; i < mPendingRequests.size();)
        {
            if (((OwnerImageRequest)mPendingRequests.get(i)).view == imageview)
            {
                mPendingRequests.remove(i);
            } else
            {
                i++;
            }
        }

        if (mRunningRequest != null && mRunningRequest.view == imageview)
        {
            mRunningRequest.canceled = true;
        }
    }

    protected void setImageBitmap(OwnerImageRequest ownerimagerequest, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            ownerimagerequest.view.setImageBitmap(bitmap);
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMAGE_LOAD_TASK_EXECUTOR = AsyncTask.THREAD_POOL_EXECUTOR;
        }
    }




}
