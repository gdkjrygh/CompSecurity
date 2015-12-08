// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.people.PeopleClientUtil;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            OwnersImageManager, ImageUtils

private final class mTargetWidth extends AsyncTask
{

    final ParcelFileDescriptor mPfd;
    final int mRawHeight;
    final int mRawWidth;
    final Request mRequest;
    final int mTargetWidth;
    final OwnersImageManager this$0;

    private transient Bitmap doInBackground$2d4c763b()
    {
        if (!OwnersImageManager.access$000(OwnersImageManager.this)) goto _L2; else goto _L1
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
        OwnersImageManager.access$300(OwnersImageManager.this).put(mRequest.accountName, bitmap);
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
        bitmap = OwnersImageManager.decodeFileDescriptor(mPfd, mRawWidth, mRawHeight, mTargetWidth, (int)(((float)mRawWidth * OwnersImageManager.access$100(OwnersImageManager.this)) / OwnersImageManager.access$200(OwnersImageManager.this)));
        if (bitmap == null)
        {
            bitmap = null;
            continue; /* Loop/switch isn't completed */
        }
        bitmap = OwnersImageManager.centerCrop(bitmap, mRawWidth, OwnersImageManager.access$100(OwnersImageManager.this) / OwnersImageManager.access$200(OwnersImageManager.this));
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

    Request(Request request, ParcelFileDescriptor parcelfiledescriptor, int i, int j, int k)
    {
        this$0 = OwnersImageManager.this;
        super();
        mRequest = request;
        mPfd = parcelfiledescriptor;
        mRawWidth = i;
        mRawHeight = j;
        mTargetWidth = k;
    }
}
