// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

// Referenced classes of package org.apache.cordova.filetransfer:
//            FileTransfer

static final class 
    implements HostnameVerifier
{

    public boolean verify(String s, SSLSession sslsession)
    {
        return true;
    }

    ()
    {
    }
}
