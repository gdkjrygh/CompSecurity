// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.ImageView;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package com.qihoo.security.widget.ImageView:
//            RemoteImageView

public class ColorFilterImageView extends RemoteImageView
{

    public static final PorterDuffColorFilter a;

    public ColorFilterImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setPressed(boolean flag)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            drawable.clearColorFilter();
            if (flag)
            {
                drawable.setColorFilter(a);
            }
        }
        super.setPressed(flag);
    }

    static 
    {
        a = new PorterDuffColorFilter(0xff888888, android.graphics.PorterDuff.Mode.MULTIPLY);
    }
}
