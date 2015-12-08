// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            t

class a
    implements android.view..OnClickListener
{

    final CBYoutubeData a;
    final t b;

    public void onClick(View view)
    {
        t.a(b).a(a);
    }

    CBYoutubeData(t t1, CBYoutubeData cbyoutubedata)
    {
        b = t1;
        a = cbyoutubedata;
        super();
    }
}
