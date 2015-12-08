// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.at;

// Referenced classes of package com.facebook.share.internal:
//            a

final class b
    implements at
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void a(Bundle bundle)
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
            s = com.facebook.share.internal.a.b(a);
        }
        if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"))
        {
            s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
        } else
        {
            s1 = com.facebook.share.internal.a.c(a);
        }
        if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"))
        {
            s2 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
        } else
        {
            s2 = com.facebook.share.internal.a.d(a);
        }
        if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"))
        {
            s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
        } else
        {
            s3 = com.facebook.share.internal.a.e(a);
        }
        if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN"))
        {
            bundle = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
        } else
        {
            bundle = com.facebook.share.internal.a.f(a);
        }
        com.facebook.share.internal.a.a(a, flag, s, s1, s2, s3, bundle);
    }
}
