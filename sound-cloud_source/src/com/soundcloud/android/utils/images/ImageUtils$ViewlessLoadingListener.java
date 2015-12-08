// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils.images;

import android.view.View;
import com.soundcloud.android.image.ImageListener;

// Referenced classes of package com.soundcloud.android.utils.images:
//            ImageUtils

public static abstract class 
    implements ImageListener
{

    View hardViewRef;

    public void onLoadingStarted(String s, View view)
    {
        hardViewRef = view;
    }

    public ()
    {
    }
}
