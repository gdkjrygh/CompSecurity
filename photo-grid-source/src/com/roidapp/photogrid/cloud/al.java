// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            GoogleSearchSelectorActivity

final class al
    implements android.view.View.OnClickListener
{

    final GoogleSearchSelectorActivity a;

    al(GoogleSearchSelectorActivity googlesearchselectoractivity)
    {
        a = googlesearchselectoractivity;
        super();
    }

    public final void onClick(View view)
    {
        GoogleSearchSelectorActivity.a(a);
    }
}
