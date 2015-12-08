// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x9;


// Referenced classes of package org.spongycastle.asn1.x9:
//            X9ECParameters

public abstract class X9ECParametersHolder
{

    private X9ECParameters a;

    public X9ECParametersHolder()
    {
    }

    protected abstract X9ECParameters a();

    public final X9ECParameters b()
    {
        if (a == null)
        {
            a = a();
        }
        return a;
    }
}
