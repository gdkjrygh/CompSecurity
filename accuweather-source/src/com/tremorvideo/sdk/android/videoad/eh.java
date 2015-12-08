// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            co, ec, eb, ei

class eh
    implements Runnable
{

    final ec a;

    eh(ec ec1)
    {
        a = ec1;
        super();
    }

    public void run()
    {
        co co1 = new co(a.a.b, a.a.d, co.a.a, new ei(this));
        co1.setTitle("Facebook");
        co1.a("Posted to Facebook successfully.");
        co1.a("Ok", "");
        co1.show();
    }
}
