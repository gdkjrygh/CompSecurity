// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Handler;
import android.widget.ImageButton;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Runnable
{

    final PhotoProtoActivity a;

    public void run()
    {
        PhotoProtoActivity.i(a).setVisibility(4);
        PhotoProtoActivity.i(a).setImageResource(0x7f02011b);
        PhotoProtoActivity.b(a).removeCallbacks(PhotoProtoActivity.j(a));
    }

    (PhotoProtoActivity photoprotoactivity)
    {
        a = photoprotoactivity;
        super();
    }
}
