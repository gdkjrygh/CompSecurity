// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import arj;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

final class a
    implements arj
{

    private LikeActionController a;

    public final void a(Bundle bundle)
    {
        if (bundle == null || !bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED"))
        {
            return;
        } else
        {
            boolean flag = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
            String s = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
            String s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
            String s2 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
            String s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
            bundle = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
            LikeActionController.a(a, flag, s, s1, s2, s3, bundle);
            return;
        }
    }

    (LikeActionController likeactioncontroller)
    {
        a = likeactioncontroller;
        super();
    }
}
