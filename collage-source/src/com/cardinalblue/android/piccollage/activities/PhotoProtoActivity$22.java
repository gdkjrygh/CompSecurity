// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import com.cardinalblue.android.piccollage.controller.CollageController;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final Intent a;
    final PhotoProtoActivity b;

    public Void a()
        throws Exception
    {
        com.cardinalblue.android.piccollage.view.k k = PhotoProtoActivity.a(b, a);
        PhotoProtoActivity.e(b).i(k);
        b.a(k);
        PhotoProtoActivity.a(b, k);
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PhotoProtoActivity photoprotoactivity, Intent intent)
    {
        b = photoprotoactivity;
        a = intent;
        super();
    }
}
