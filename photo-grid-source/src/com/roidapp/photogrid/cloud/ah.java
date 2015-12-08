// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            FlickrSelectorActivity

final class ah
    implements android.view.View.OnClickListener
{

    final FlickrSelectorActivity a;

    ah(FlickrSelectorActivity flickrselectoractivity)
    {
        a = flickrselectoractivity;
        super();
    }

    public final void onClick(View view)
    {
        FlickrSelectorActivity.a(a);
    }
}
