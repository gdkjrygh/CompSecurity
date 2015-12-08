// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageRequest

public static final class  extends ImageRequest
{

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof ))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        } else
        {
            obj = ()obj;
            throw new NullPointerException();
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mImageData
        });
    }

    protected final void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        if (!flag1)
        {
            throw new NullPointerException();
        } else
        {
            return;
        }
    }
}
