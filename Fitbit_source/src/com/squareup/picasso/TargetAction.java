// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.squareup.picasso:
//            Action, Target, Picasso, Request

final class TargetAction extends Action
{

    TargetAction(Picasso picasso, Target target, Request request, boolean flag, int i, Drawable drawable, String s)
    {
        super(picasso, target, request, flag, false, i, drawable, s);
    }

    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
    {
        if (bitmap == null)
        {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] {
                this
            }));
        }
        Target target = (Target)getTarget();
        if (target != null)
        {
            target.onBitmapLoaded(bitmap, loadedfrom);
            if (bitmap.isRecycled())
            {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    void error()
    {
        Target target;
label0:
        {
            target = (Target)getTarget();
            if (target != null)
            {
                if (errorResId == 0)
                {
                    break label0;
                }
                target.onBitmapFailed(picasso.context.getResources().getDrawable(errorResId));
            }
            return;
        }
        target.onBitmapFailed(errorDrawable);
    }
}
