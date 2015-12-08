// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.map;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments.map:
//            MapWebViewFragment_, MapWebViewFragment

public class  extends d
{

    public MapWebViewFragment build()
    {
        MapWebViewFragment_ mapwebviewfragment_ = new MapWebViewFragment_();
        mapwebviewfragment_.setArguments(args);
        return mapwebviewfragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mAddress(String s)
    {
        args.putString("mAddress", s);
        return this;
    }

    public ()
    {
    }
}
