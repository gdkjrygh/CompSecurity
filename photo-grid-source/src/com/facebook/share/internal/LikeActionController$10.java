// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class this._cls0
    implements com.facebook.internal.mpletedListener
{

    final LikeActionController this$0;

    public void completed(Bundle bundle)
    {
        if (bundle == null || !bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED"))
        {
            return;
        }
        boolean flag = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
        String s;
        String s1;
        String s2;
        String s3;
        if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"))
        {
            s = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
        } else
        {
            s = LikeActionController.access$700(LikeActionController.this);
        }
        if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"))
        {
            s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
        } else
        {
            s1 = LikeActionController.access$800(LikeActionController.this);
        }
        if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"))
        {
            s2 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
        } else
        {
            s2 = LikeActionController.access$900(LikeActionController.this);
        }
        if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"))
        {
            s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
        } else
        {
            s3 = LikeActionController.access$1000(LikeActionController.this);
        }
        if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN"))
        {
            bundle = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
        } else
        {
            bundle = LikeActionController.access$1100(LikeActionController.this);
        }
        LikeActionController.access$1300(LikeActionController.this, flag, s, s1, s2, s3, bundle);
    }

    dListener()
    {
        this$0 = LikeActionController.this;
        super();
    }
}
