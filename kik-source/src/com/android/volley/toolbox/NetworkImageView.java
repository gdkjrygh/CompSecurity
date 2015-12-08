// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.android.volley.toolbox:
//            q, i

public class NetworkImageView extends ImageView
{

    private String a;
    private int b;
    private int c;
    private i d;
    private i.c e;
    private int f;
    private int g;

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
            e.a();
            setImageBitmap(null);
            e = null;
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        k = getWidth();
        l = getHeight();
        if (getLayoutParams().height == -2 && getLayoutParams().width == -2)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (k == 0 && l == 0 && j == 0) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(a)) goto _L4; else goto _L3
_L3:
        if (e != null)
        {
            e.a();
            e = null;
        }
        setImageBitmap(null);
_L2:
        return;
_L4:
        if (e == null || e.c() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (e.c().equals(a))
        {
            continue; /* Loop/switch isn't completed */
        }
        e.a();
        setImageBitmap(null);
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L5
_L5:
        e = d.a(a, new q(this), f, g);
        return;
    }
}
