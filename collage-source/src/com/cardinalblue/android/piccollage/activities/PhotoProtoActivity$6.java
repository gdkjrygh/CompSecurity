// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final PhotoProtoActivity a;

    public Boolean a()
        throws Exception
    {
        return Boolean.valueOf(PhotoProtoActivity.c(a));
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    I(PhotoProtoActivity photoprotoactivity)
    {
        a = photoprotoactivity;
        super();
    }
}
