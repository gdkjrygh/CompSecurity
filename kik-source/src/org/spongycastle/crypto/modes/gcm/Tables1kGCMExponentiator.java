// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes.gcm;


// Referenced classes of package org.spongycastle.crypto.modes.gcm:
//            GCMExponentiator

public class Tables1kGCMExponentiator
    implements GCMExponentiator
{

    byte a[][];

    public Tables1kGCMExponentiator()
    {
        a = new byte[64][];
    }
}
