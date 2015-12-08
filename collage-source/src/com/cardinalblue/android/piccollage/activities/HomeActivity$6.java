// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import com.cardinalblue.android.piccollage.a.f;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

class a
    implements Callable
{

    final HomeActivity a;

    public Void a()
        throws Exception
    {
        File file = new File(a.getFilesDir(), "address_book");
        if (file.exists() && file.delete())
        {
            f.a(new Exception("deleted the address data because the proguard issue"));
        }
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }
}
