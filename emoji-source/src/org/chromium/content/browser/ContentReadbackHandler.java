// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseArray;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.base.WindowAndroid;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore

public abstract class ContentReadbackHandler
{
    public static interface GetBitmapCallback
    {

        public abstract void onFinishGetBitmap(Bitmap bitmap);
    }


    static final boolean $assertionsDisabled;
    private SparseArray mGetBitmapRequests;
    private long mNativeContentReadbackHandler;
    private int mNextReadbackId;

    public ContentReadbackHandler()
    {
        mNextReadbackId = 1;
        mGetBitmapRequests = new SparseArray();
    }

    private native void nativeDestroy(long l);

    private native void nativeGetCompositorBitmap(long l, int i, long l1);

    private native void nativeGetContentBitmap(long l, int i, float f, android.graphics.Bitmap.Config config, float f1, float f2, 
            float f3, float f4, Object obj);

    private native long nativeInit();

    private void notifyGetBitmapFinished(int i, Bitmap bitmap)
    {
        GetBitmapCallback getbitmapcallback = (GetBitmapCallback)mGetBitmapRequests.get(i);
        if (getbitmapcallback != null)
        {
            mGetBitmapRequests.delete(i);
            getbitmapcallback.onFinishGetBitmap(bitmap);
        } else
        if (!$assertionsDisabled)
        {
            throw new AssertionError((new StringBuilder()).append("Readback finished for unregistered Id: ").append(i).toString());
        }
    }

    public void destroy()
    {
        if (mNativeContentReadbackHandler != 0L)
        {
            nativeDestroy(mNativeContentReadbackHandler);
        }
        mNativeContentReadbackHandler = 0L;
    }

    public void getCompositorBitmapAsync(WindowAndroid windowandroid, GetBitmapCallback getbitmapcallback)
    {
        if (!readyForReadback())
        {
            getbitmapcallback.onFinishGetBitmap(null);
            return;
        } else
        {
            ThreadUtils.assertOnUiThread();
            int i = mNextReadbackId;
            mNextReadbackId = i + 1;
            mGetBitmapRequests.put(i, getbitmapcallback);
            nativeGetCompositorBitmap(mNativeContentReadbackHandler, i, windowandroid.getNativePointer());
            return;
        }
    }

    public void getContentBitmapAsync(float f, Rect rect, ContentViewCore contentviewcore, GetBitmapCallback getbitmapcallback)
    {
        if (!readyForReadback())
        {
            getbitmapcallback.onFinishGetBitmap(null);
            return;
        } else
        {
            ThreadUtils.assertOnUiThread();
            int i = mNextReadbackId;
            mNextReadbackId = i + 1;
            mGetBitmapRequests.put(i, getbitmapcallback);
            nativeGetContentBitmap(mNativeContentReadbackHandler, i, f, android.graphics.Bitmap.Config.ARGB_8888, rect.top, rect.left, rect.width(), rect.height(), contentviewcore);
            return;
        }
    }

    public void initNativeContentReadbackHandler()
    {
        mNativeContentReadbackHandler = nativeInit();
    }

    protected abstract boolean readyForReadback();

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ContentReadbackHandler.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
