// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Intent;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

final class deOffset
    implements com.facebook.internal.lback
{

    public boolean onActivityResult(int i, Intent intent)
    {
        return LikeActionController.handleOnActivityResult(com.facebook.internal.uestCodeOffset.Like.toRequestCode(), i, intent);
    }

    deOffset()
    {
    }
}
