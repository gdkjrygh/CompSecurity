// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Context;
import com.tremorvideo.a.b;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            fa, fc, ea

public class ez
{

    private static b a;

    static b a(b b1)
    {
        a = b1;
        return b1;
    }

    public static void a(Activity activity, ea ea, com.tremorvideo.a.b.a a1)
    {
        b b1 = new b("231434140219582");
        a = b1;
        ea = new fa(activity, b1, a1, ea);
        b1.a(activity, new String[] {
            "publish_stream"
        }, -1, ea);
    }

    static void a(Context context, b b1)
    {
        b(context, b1);
    }

    private static void b(Context context, b b1)
    {
        (new Thread(new fc(b1, context))).start();
    }
}
