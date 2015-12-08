// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.java.functions.Function;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            PlaylistGridRenderer

class this._cls0
    implements Function
{

    final PlaylistGridRenderer this$0;

    public volatile Object apply(Object obj)
    {
        return apply((String)obj);
    }

    public String apply(String s)
    {
        return (new StringBuilder("#")).append(s).toString();
    }

    A()
    {
        this$0 = PlaylistGridRenderer.this;
        super();
    }
}
