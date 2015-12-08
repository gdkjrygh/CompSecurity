// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            e

class d
    implements Callable
{

    final ActivityInfo a;
    final File b;
    final String c;
    final String d;
    final e e;

    public Void a()
        throws Exception
    {
        Intent intent = com.cardinalblue.android.piccollage.controller.e.a(a, b);
        if (!TextUtils.isEmpty(c))
        {
            intent.putExtra("android.intent.extra.TEXT", c);
        }
        if (!TextUtils.isEmpty(d))
        {
            intent.putExtra("android.intent.extra.SUBJECT", d);
        }
        if (com.cardinalblue.android.piccollage.controller.e.a(e) != null)
        {
            com.cardinalblue.android.piccollage.controller.e.a(e).startActivity(intent);
        }
        return null;
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (e e1, ActivityInfo activityinfo, File file, String s, String s1)
    {
        e = e1;
        a = activityinfo;
        b = file;
        c = s;
        d = s1;
        super();
    }
}
