// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//            ImageLoader

public class NetworkImageView extends ImageView
{

    private int mDefaultImageId;
    private int mErrorImageId;
    private ImageLoader.ImageContainer mImageContainer;
    private ImageLoader mImageLoader;
    private String mUrl;

    public NetworkImageView(Context context)
    {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void loadImageIfNecessary(final boolean isInLayoutPass)
    {
        int i = getWidth();
        int j = getHeight();
        boolean flag;
        if (getLayoutParams().height == -2 && getLayoutParams().width == -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i != 0 || j != 0 || flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (TextUtils.isEmpty(mUrl))
        {
            if (mImageContainer != null)
            {
                mImageContainer.cancelRequest();
                mImageContainer = null;
            }
            setImageBitmap(null);
            return;
        }
        if (mImageContainer == null || mImageContainer.getRequestUrl() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mImageContainer.getRequestUrl().equals(mUrl))
        {
            continue; /* Loop/switch isn't completed */
        }
        mImageContainer.cancelRequest();
        setImageBitmap(null);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        mImageContainer = mImageLoader.get(mUrl, new ImageLoader.ImageListener() {

            final NetworkImageView this$0;
            final boolean val$isInLayoutPass;

            public void onErrorResponse(VolleyError volleyerror)
            {
                if (mErrorImageId != 0)
                {
                    setImageResource(mErrorImageId);
                }
            }

            public void onResponse(ImageLoader.ImageContainer imagecontainer, boolean flag1)
            {
                if (flag1 && isInLayoutPass)
                {
                    post(imagecontainer. new Runnable() {

                        final _cls1 this$1;
                        final ImageLoader.ImageContainer val$response;

                        public void run()
                        {
                            onResponse(response, false);
                        }

            
            {
                this$1 = final__pcls1;
                response = ImageLoader.ImageContainer.this;
                super();
            }
                    });
                } else
                {
                    if (imagecontainer.getBitmap() != null)
                    {
                        setImageBitmap(imagecontainer.getBitmap());
                        return;
                    }
                    if (mDefaultImageId != 0)
                    {
                        setImageResource(mDefaultImageId);
                        return;
                    }
                }
            }

            
            {
                this$0 = NetworkImageView.this;
                isInLayoutPass = flag;
                super();
            }
        });
        return;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    protected void onDetachedFromWindow()
    {
        if (mImageContainer != null)
        {
            mImageContainer.cancelRequest();
            setImageBitmap(null);
            mImageContainer = null;
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        loadImageIfNecessary(true);
    }

    public void setDefaultImageResId(int i)
    {
        mDefaultImageId = i;
    }

    public void setErrorImageResId(int i)
    {
        mErrorImageId = i;
    }

    public void setImageUrl(String s, ImageLoader imageloader)
    {
        mUrl = s;
        mImageLoader = imageloader;
        loadImageIfNecessary(false);
    }


}
