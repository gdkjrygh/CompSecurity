// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.os.Parcelable;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            FeedAccessorFactory

public static abstract class 
    implements Parcelable
{

    public abstract CBCollagesResponse a()
        throws Exception;

    public CBCollagesResponse a(String s)
        throws Exception
    {
        return f.i(s);
    }

    public ()
    {
    }
}
