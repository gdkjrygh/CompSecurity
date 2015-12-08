// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import java.util.Collection;
import org.spongycastle.util.Selector;

// Referenced classes of package org.spongycastle.x509:
//            X509StoreParameters

public abstract class X509StoreSpi
{

    public X509StoreSpi()
    {
    }

    public abstract Collection a(Selector selector);

    public abstract void a(X509StoreParameters x509storeparameters);
}
