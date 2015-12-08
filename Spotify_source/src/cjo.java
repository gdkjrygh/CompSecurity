// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.http.SslError;
import android.webkit.WebChromeClient;

public class cjo extends cjn
{

    public cjo()
    {
    }

    public final WebChromeClient a(ckw ckw)
    {
        return new clj(ckw);
    }

    public final String a(SslError sslerror)
    {
        return sslerror.getUrl();
    }
}
