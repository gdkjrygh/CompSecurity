// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.view.View;

// Referenced classes of package com.android.slyce.crop:
//            CropImageActivity

class g
    implements android.view.View.OnClickListener
{

    final CropImageActivity a;

    g(CropImageActivity cropimageactivity)
    {
        a = cropimageactivity;
        super();
    }

    public void onClick(View view)
    {
        CropImageActivity.a(a);
    }
}
