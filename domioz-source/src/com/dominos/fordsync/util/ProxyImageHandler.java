// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.ford.syncV4.a.a;
import com.ford.syncV4.e.c.a.d;
import com.ford.syncV4.e.c.av;
import com.ford.syncV4.e.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.dominos.fordsync.util:
//            ProxyUtil

public class ProxyImageHandler
{

    private static final String ASSET_IMAGE_FORMAT = "fordsync/ic_fordsync_%s.png";
    public static final int CORRELATION_NOT_FOUND = -1;
    public static final String DEFAULT_IMAGES[] = {
        "HOME_185", "YES_70", "NO_70", "CALL_STORE_35", "RECENT_ORDER_35", "EASY_ORDER_35", "START_OVER_35", "TRACKER_35", "CALL_STORE_70", "RECENT_ORDER_70", 
        "EASY_ORDER_70", "START_OVER_70", "TRACKER_70"
    };
    public static final String IMG_CALL_STORE_35 = "CALL_STORE_35";
    public static final String IMG_CALL_STORE_70 = "CALL_STORE_70";
    public static final String IMG_EASY_ORDER_35 = "EASY_ORDER_35";
    public static final String IMG_EASY_ORDER_70 = "EASY_ORDER_70";
    public static final String IMG_HOME = "HOME_185";
    public static final String IMG_LOGO = "LOGO_70";
    public static final String IMG_NO = "NO_70";
    public static final String IMG_RECENT_ORDER_35 = "RECENT_ORDER_35";
    public static final String IMG_RECENT_ORDER_70 = "RECENT_ORDER_70";
    public static final String IMG_START_OVER_35 = "START_OVER_35";
    public static final String IMG_START_OVER_70 = "START_OVER_70";
    public static final String IMG_TRACKER_35 = "TRACKER_35";
    public static final String IMG_TRACKER_70 = "TRACKER_70";
    public static final String IMG_YES = "YES_70";
    public static final int SOFTBUTTON_EASY_ORDER = 1;
    public static final int SOFTBUTTON_RECENT_ORDER = 2;
    public static final int SOFTBUTTON_TRACKER = 3;
    private Context mContext;
    private Map mImageCorrelation;
    private volatile CountDownLatch mLoadingLatch;
    private Vector mSoftButtons;

    public ProxyImageHandler(Context context)
    {
        mLoadingLatch = new CountDownLatch(1);
        mContext = context;
        mImageCorrelation = new HashMap();
    }

    private Bitmap getBitmapFromAsset(String s)
    {
        if (StringHelper.isNotEmpty(s))
        {
            s = String.format("fordsync/ic_fordsync_%s.png", new Object[] {
                s.toLowerCase()
            });
            LogUtil.d("FORDSYNC_AppLinkManager", "getBitmapFromAsset() asset: %s", new Object[] {
                s
            });
            return BitmapFactory.decodeStream(mContext.getAssets().open(s));
        } else
        {
            return null;
        }
    }

    private void loadSoftButtons()
    {
        mSoftButtons = new Vector();
        mSoftButtons.add(ProxyUtil.createSoftButton(1, "Easy Order", ProxyUtil.getImage("EASY_ORDER_35")));
        mSoftButtons.add(ProxyUtil.createSoftButton(2, "Recent Order", ProxyUtil.getImage("RECENT_ORDER_35")));
        mSoftButtons.add(ProxyUtil.createSoftButton(3, "Track Order", ProxyUtil.getImage("TRACKER_35")));
    }

    private void putImage(i j, int k, String s, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bytearrayoutputstream);
            bytearrayoutputstream.toByteArray();
            byte abyte0[] = bytearrayoutputstream.toByteArray();
            av av1 = new av();
            av1.a(s);
            av1.a(d.c);
            av1.a(Integer.valueOf(k));
            av1.a(abyte0);
            LogUtil.d("FORDSYNC_AppLinkManager", "putImage() corr: %d fileName: %s image: %s", new Object[] {
                Integer.valueOf(k), s, bitmap.toString()
            });
            j.a(av1);
            mImageCorrelation.put(s, Integer.valueOf(k));
            return;
        } else
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "putImage() image was null", new Object[0]);
            return;
        }
    }

    public void continueLoadingDefaultImages()
    {
        mLoadingLatch.countDown();
    }

    public int getCorrelationForImage(String s)
    {
        if (StringHelper.isEmpty(s) || !mImageCorrelation.containsKey(s))
        {
            return -1;
        } else
        {
            return ((Integer)mImageCorrelation.get(s)).intValue();
        }
    }

    public Vector getSoftButtons()
    {
        return mSoftButtons;
    }

    public boolean isCorrelationFromDefaultLoader(int j)
    {
        return mImageCorrelation.values().contains(Integer.valueOf(j));
    }

    public void loadDefaultImages(i j, AtomicInteger atomicinteger, LoadDefaultImageCallback loaddefaultimagecallback)
    {
        if (loaddefaultimagecallback == null)
        {
            return;
        }
        loaddefaultimagecallback.onBegin();
        if (!ProxyUtil.isProxyGraphicSupported(j))
        {
            loaddefaultimagecallback.onDefaultImagesLoadFailure();
            return;
        }
          goto _L1
        j;
_L6:
        loaddefaultimagecallback.onDefaultImagesLoadFailure();
_L4:
        loaddefaultimagecallback.onFinish();
        return;
_L1:
        String as[];
        int l;
        as = DEFAULT_IMAGES;
        l = as.length;
        int k = 0;
_L3:
        String s;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[k];
        putImage(j, atomicinteger.incrementAndGet(), s, getBitmapFromAsset(s));
        mLoadingLatch.await();
        mLoadingLatch = new CountDownLatch(1);
        k++;
        if (true) goto _L3; else goto _L2
_L2:
        loadSoftButtons();
        loaddefaultimagecallback.onDefaultImagesLoaded();
          goto _L4
        j;
        continue; /* Loop/switch isn't completed */
        j;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void loadImage(i j, AtomicInteger atomicinteger, String s)
    {
        try
        {
            if (ProxyUtil.isProxyGraphicSupported(j))
            {
                putImage(j, atomicinteger.incrementAndGet(), s, getBitmapFromAsset(s));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (i j)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (i j)
        {
            return;
        }
    }


    private class LoadDefaultImageCallback extends BaseCallback
    {

        public abstract void onDefaultImagesLoadFailure();

        public abstract void onDefaultImagesLoaded();

        public LoadDefaultImageCallback()
        {
        }
    }

}
