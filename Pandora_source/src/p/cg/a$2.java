// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cg;

import android.webkit.WebView;

// Referenced classes of package p.cg:
//            a

class .Object
    implements Runnable
{

    final String a;
    final a b;

    public void run()
    {
        p.cg.a.a(b).loadUrl((new StringBuilder()).append("javascript:").append(a).toString());
    }

    .String(a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }
}
