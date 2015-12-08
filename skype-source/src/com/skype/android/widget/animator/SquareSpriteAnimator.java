// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.animator;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;

// Referenced classes of package com.skype.android.widget.animator:
//            SpriteAnimator

public class SquareSpriteAnimator extends SpriteAnimator
{

    public SquareSpriteAnimator(Handler handler, ImageView imageview)
    {
        super(handler, imageview, (byte)0);
    }

    public SquareSpriteAnimator(Handler handler, ImageView imageview, byte byte0)
    {
        super(handler, imageview);
    }

    protected final void a(Bitmap bitmap)
    {
        int i = bitmap.getHeight();
        int j = bitmap.getWidth();
        boolean flag;
        if (i >= j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (d)
        {
            b = j;
            c = j;
            a = i / j;
            return;
        } else
        {
            b = i;
            c = i;
            a = j / i;
            return;
        }
    }
}
