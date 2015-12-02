// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.view.View;

// Referenced classes of package com.facebook.orca.camera:
//            CropImage

class e
    implements android.view.View.OnClickListener
{

    final CropImage a;

    e(CropImage cropimage)
    {
        a = cropimage;
        super();
    }

    public void onClick(View view)
    {
        a.setResult(0);
        a.finish();
    }
}
