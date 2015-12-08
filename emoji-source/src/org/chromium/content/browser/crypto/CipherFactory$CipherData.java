// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.crypto;

import java.security.Key;

// Referenced classes of package org.chromium.content.browser.crypto:
//            CipherFactory

private static class iv
{

    public final byte iv[];
    public final Key key;

    public (Key key1, byte abyte0[])
    {
        key = key1;
        iv = abyte0;
    }
}
