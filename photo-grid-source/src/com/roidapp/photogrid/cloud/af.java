// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            FbPhotoSelectorActivity

final class af
    implements android.view.View.OnClickListener
{

    final FbPhotoSelectorActivity a;

    af(FbPhotoSelectorActivity fbphotoselectoractivity)
    {
        a = fbphotoselectoractivity;
        super();
    }

    public final void onClick(View view)
    {
        FbPhotoSelectorActivity.a(a);
    }
}
