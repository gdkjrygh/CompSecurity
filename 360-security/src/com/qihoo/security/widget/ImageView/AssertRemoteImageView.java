// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.ImageView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package com.qihoo.security.widget.ImageView:
//            RemoteImageView

public class AssertRemoteImageView extends RemoteImageView
{

    private boolean a;
    private String b;

    public AssertRemoteImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
    }

    public void a(String s, int i)
    {
        if (i > 0)
        {
            throw new IllegalArgumentException("make sure defaultIcon<=0!");
        } else
        {
            super.a(s, i);
            b = s;
            return;
        }
    }

    public String getUrl()
    {
        return b;
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        setLoaded(true);
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        setLoaded(true);
    }

    public void setLoaded(boolean flag)
    {
        a = flag;
    }
}
