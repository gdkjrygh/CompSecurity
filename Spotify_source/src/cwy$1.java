// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class ang.Object
    implements cxl
{

    private String a;

    public final void a(cxk cxk1)
    {
        if (cxi.a)
        {
            Log.v("MixpanelAPI.Messages", (new StringBuilder("Using existing pushId ")).append(a).toString());
        }
        cxk1.b.b(a);
    }

    (String s)
    {
        a = s;
        super();
    }
}
