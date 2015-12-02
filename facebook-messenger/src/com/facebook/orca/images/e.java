// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.view.View;

// Referenced classes of package com.facebook.orca.images:
//            ImageSearchActivity

class e
    implements android.view.View.OnClickListener
{

    final ImageSearchActivity a;

    e(ImageSearchActivity imagesearchactivity)
    {
        a = imagesearchactivity;
        super();
    }

    public void onClick(View view)
    {
        ImageSearchActivity.a(a, false);
    }
}
