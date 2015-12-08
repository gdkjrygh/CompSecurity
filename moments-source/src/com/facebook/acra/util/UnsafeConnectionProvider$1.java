// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

// Referenced classes of package com.facebook.acra.util:
//            UnsafeConnectionProvider

class this._cls0
    implements HostnameVerifier
{

    final UnsafeConnectionProvider this$0;

    public boolean verify(String s, SSLSession sslsession)
    {
        return true;
    }

    ()
    {
        this$0 = UnsafeConnectionProvider.this;
        super();
    }
}
