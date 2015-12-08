// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.mopub.volley.toolbox:
//            i, ImageLoader

public class NetworkImageView extends ImageView
{

    private String a;
    private int b;
    private int c;
    private ImageLoader d;
    private ImageLoader.ImageContainer e;

    public NetworkImageView(Context context)
    {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    static int a(NetworkImageView networkimageview)
    {
        return networkimageview.c;
    }

    private void a()
    {
        if (b != 0)
        {
            setImageResource(b);
            return;
        } else
        {
            setImageBitmap(null);
            return;
        }
    }

    private void a(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        int i1 = getWidth();
        int l = getHeight();
        int j;
        int k;
        if (getLayoutParams() != null)
        {
            if (getLayoutParams().width == -2)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (getLayoutParams().height == -2)
            {
                j = 1;
            } else
            {
                j = 0;
            }
        } else
        {
            j = 0;
            k = 0;
        }
        if (k == 0 || j == 0)
        {
            flag1 = false;
        }
        if (i1 != 0 || l != 0 || flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (TextUtils.isEmpty(a))
        {
            if (e != null)
            {
                e.cancelRequest();
                e = null;
            }
            a();
            return;
        }
        if (e == null || e.getRequestUrl() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (e.getRequestUrl().equals(a))
        {
            continue; /* Loop/switch isn't completed */
        }
        e.cancelRequest();
        a();
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        if (k != 0)
        {
            k = 0;
        } else
        {
            k = i1;
        }
        if (j != 0)
        {
            j = ((flag2) ? 1 : 0);
        } else
        {
            j = l;
        }
        e = d.get(a, new i(this, flag), k, j);
        return;
    }

    static int b(NetworkImageView networkimageview)
    {
        return networkimageview.b;
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    protected void onDetachedFromWindow()
    {
        if (e != null)
        {
            e.cancelRequest();
            setImageBitmap(null);
            e = null;
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        a(true);
    }

    public void setDefaultImageResId(int j)
    {
        b = j;
    }

    public void setErrorImageResId(int j)
    {
        c = j;
    }

    public void setImageUrl(String s, ImageLoader imageloader)
    {
        a = s;
        d = imageloader;
        a(false);
    }
}
