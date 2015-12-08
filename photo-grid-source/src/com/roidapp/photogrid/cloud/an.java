// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            InstagramSelectorActivity

final class an
    implements android.view.View.OnClickListener
{

    final InstagramSelectorActivity a;

    an(InstagramSelectorActivity instagramselectoractivity)
    {
        a = instagramselectoractivity;
        super();
    }

    public final void onClick(View view)
    {
        InstagramSelectorActivity.a(a);
    }
}
