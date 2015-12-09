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
import android.support.v4.app.ActivityManagerCompat;
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
    public abstract class OwnerImageRequest
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

    final class PfdLoader extends AsyncTask
    {

        final ParcelFileDescriptor mPfd;
        final int mRawHeight;
        final int mRawWidth;
        final OwnerImageRequest mRequest;
        final int mTargetWidth;
        final OwnersImageManager this$0;

        private transient Bitmap doInBackground(Void avoid[])
        {
            if (!mUseCircularAvatar) goto _L2; else goto _L1
_L1:
            avoid = PeopleClientUtil.decodeFileDescriptor(mPfd);
            if (avoid != null) goto _L4; else goto _L3
_L3:
            avoid = null;
_L6:
            if (avoid == null)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            mImages.put(mRequest.accountName, avoid);
            if (mPfd != null)
            {
                try
                {
                    mPfd.close();
                }
                catch (IOException ioexception)
                {
                    Log.d("OwnersImageManager", ioexception.getMessage());
                    return avoid;
                }
            }
            return avoid;
_L4:
            avoid = ImageUtils.frameBitmapInCircle(avoid);
            continue; /* Loop/switch isn't completed */
_L2:
            avoid = OwnersImageManager.decodeFileDescriptor(mPfd, mRawWidth, mRawHeight, mTargetWidth, (int)(((float)mRawWidth * mRatioHeight) / mRatioWidth));
            if (avoid == null)
            {
                avoid = null;
                continue; /* Loop/switch isn't completed */
            }
            avoid = OwnersImageManager.centerCrop(avoid, mRawWidth, mRatioHeight / mRatioWidth);
            if (true) goto _L6; else goto _L5
_L5:
            avoid;
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
            throw avoid;
        }

        private void onPostExecute(Bitmap bitmap)
        {
            if (mRequest.view.getTag() != mRequest)
            {
                return;
            } else
            {
                setImageBitmap(mRequest, bitmap);
                return;
            }
        }

        protected final volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected final volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
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
    private boolean mClosed;
    public final Context mContext;
    private final ConcurrentHashMap mImages = new ConcurrentHashMap();
    private final LinkedList mPendingRequests = new LinkedList();
    private float mRatioHeight;
    private float mRatioWidth;
    private OwnerImageRequest mRunningRequest;
    private boolean mUseCircularAvatar;

    public OwnersImageManager(Context context, GoogleApiClient googleapiclient, boolean flag)
    {
        mContext = context;
        mClient = googleapiclient;
        mUseCircularAvatar = flag;
        googleapiclient = context.getResources();
        mRatioWidth = googleapiclient.getInteger(R.integer.cover_photo_ratio_width);
        mRatioHeight = googleapiclient.getInteger(R.integer.cover_photo_ratio_height);
        sIsLowMemoryDevice = ActivityManagerCompat.isLowRamDevice((ActivityManager)context.getSystemService("activity"));
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
        i <<= 1;
          goto _L7
    }

    public static Bitmap centerCrop(Bitmap bitmap, int i, float f)
    {
        return crop(bitmap, i, (int)((float)i * f), 0.5F, 0.5F);
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

    private static Bitmap crop(Bitmap bitmap, int i, int j, float f, float f1)
    {
        if (f < 0.0F || f > 1.0F || f1 < 0.0F || f1 > 1.0F)
        {
            throw new IllegalArgumentException("horizontalCenterPercent and verticalCenterPercent must be between 0.0f and 1.0f, inclusive.");
        }
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        if (i == k && j == l)
        {
            return bitmap;
        } else
        {
            Matrix matrix = new Matrix();
            float f2 = Math.max((float)i / (float)k, (float)j / (float)l);
            matrix.setScale(f2, f2);
            i = Math.round((float)i / f2);
            j = Math.round((float)j / f2);
            int i1 = (int)((float)k * f - (float)(i / 2));
            int j1 = (int)((float)l * f1 - (float)(j / 2));
            return Bitmap.createBitmap(bitmap, Math.max(Math.min(i1, k - i), 0), Math.max(Math.min(j1, l - j), 0), i, j, matrix, true);
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

    private void enqueueRequest(ImageView imageview, OwnerImageRequest ownerimagerequest)
    {
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

    private static void executeLoader(PfdLoader pfdloader)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            pfdloader.executeOnExecutor(IMAGE_LOAD_TASK_EXECUTOR, new Void[0]);
            return;
        } else
        {
            pfdloader.execute(null);
            return;
        }
    }

    private static void initializeExecutor()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMAGE_LOAD_TASK_EXECUTOR = AsyncTask.THREAD_POOL_EXECUTOR;
        }
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

    public final void close()
    {
        if (mRunningRequest != null)
        {
            mRunningRequest.canceled = true;
        }
        mPendingRequests.clear();
        mClosed = true;
    }

    public final void loadImageRequest(OwnerImageRequest ownerimagerequest)
    {
        if (mImages.containsKey(ownerimagerequest.accountName))
        {
            ownerimagerequest.view.setImageBitmap((Bitmap)mImages.get(ownerimagerequest.accountName));
            removePendingRequest(ownerimagerequest.view);
            return;
        } else
        {
            enqueueRequest(ownerimagerequest.view, ownerimagerequest);
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
            break MISSING_BLOCK_LABEL_210;
        }
        status = String.valueOf(status);
        String s = String.valueOf(parcelfiledescriptor);
        Log.d("AvatarManager", (new StringBuilder(String.valueOf(status).length() + 28 + String.valueOf(s).length())).append("Avatar loaded: status=").append(status).append("  pfd=").append(s).toString());
        status = parcelfiledescriptor1;
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        executeLoader(new PfdLoader(ownerimagerequest, parcelfiledescriptor, i, j, k));
        status = null;
        if (!mClosed)
        {
            processNextRequestIfIdle();
        }
        if (status == null) goto _L4; else goto _L6
_L6:
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

    public final void onImageLoaded(Status status, ParcelFileDescriptor parcelfiledescriptor, OwnerImageRequest ownerimagerequest, int i)
    {
        onImageLoaded(status, parcelfiledescriptor, -1, -1, i, ownerimagerequest);
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
        initializeExecutor();
    }




}
