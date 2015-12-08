// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;

public class TlsFatalAlert extends IOException
{

    private short a;

    public TlsFatalAlert(short word0)
    {
        a = word0;
    }

    public short getAlertDescription()
    {
        return a;
    }
}
