// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity, VideoScrapPreviewActivity

class a
    implements i
{

    final String a;
    final PhotoProtoActivity b;

    public Object then(j j1)
        throws Exception
    {
        if (b.isFinishing())
        {
            return null;
        }
        if (((Integer)j1.e()).intValue() == 403)
        {
            k.a(b, 0x7f0702bf, 0);
            return null;
        } else
        {
            j1 = new Intent(b, com/cardinalblue/android/piccollage/activities/VideoScrapPreviewActivity);
            j1.putExtra("extra_video_stream_url", a);
            b.startActivity(j1);
            return null;
        }
    }

    ity(PhotoProtoActivity photoprotoactivity, String s)
    {
        b = photoprotoactivity;
        a = s;
        super();
    }
}
