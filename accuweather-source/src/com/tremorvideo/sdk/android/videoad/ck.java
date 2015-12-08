// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            cm, ct

final class ck
    implements Runnable
{

    final String a;
    final String b;

    ck(String s, String s1)
    {
        a = s;
        b = s1;
        super();
    }

    public void run()
    {
        try
        {
            (new cm(b, a)).execute(new String[0]);
            return;
        }
        catch (Exception exception)
        {
            ct.a("Error sending response: ", exception);
        }
    }
}
