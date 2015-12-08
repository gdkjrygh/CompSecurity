// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.Dialog;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements i
{

    final Dialog a;
    final PhotoProtoActivity b;

    public Void a(j j1)
        throws Exception
    {
        a.dismiss();
        if (j1.d() || j1.c())
        {
            j1 = j1.f();
            f.a(j1);
            PhotoProtoActivity.b(b, j1);
            return null;
        } else
        {
            PhotoProtoActivity.n(b);
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    I(PhotoProtoActivity photoprotoactivity, Dialog dialog)
    {
        b = photoprotoactivity;
        a = dialog;
        super();
    }
}
