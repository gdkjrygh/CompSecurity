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

final class mTargetWidth extends AsyncTask
{

    final ParcelFileDescriptor mPfd;
    final int mRawHeight;
    final int mRawWidth;
    final Request mRequest;
    final int mTargetWidth;
    final OwnersImageManager this$0;

    private transient Bitmap doInBackground(Void avoid[])
    {
        if (!OwnersImageManager.access$000(OwnersImageManager.this)) goto _L2; else goto _L1
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
        OwnersImageManager.access$300(OwnersImageManager.this).put(mRequest.accountName, avoid);
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
        avoid = OwnersImageManager.decodeFileDescriptor(mPfd, mRawWidth, mRawHeight, mTargetWidth, (int)(((float)mRawWidth * OwnersImageManager.access$100(OwnersImageManager.this)) / OwnersImageManager.access$200(OwnersImageManager.this)));
        if (avoid == null)
        {
            avoid = null;
            continue; /* Loop/switch isn't completed */
        }
        avoid = OwnersImageManager.centerCrop(avoid, mRawWidth, OwnersImageManager.access$100(OwnersImageManager.this) / OwnersImageManager.access$200(OwnersImageManager.this));
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
