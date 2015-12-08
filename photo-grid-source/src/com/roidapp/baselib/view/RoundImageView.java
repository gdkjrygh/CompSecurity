// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.baselib.view:
//            v

public class RoundImageView extends ImageView
{

    public RoundImageView(Context context)
    {
        super(context);
    }

    public RoundImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0);
    }

    public RoundImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        v v1 = new v(getResources(), bitmap);
        v1.a(bitmap.getWidth() / 2);
        v1.a();
        setImageDrawable(v1);
    }
}
