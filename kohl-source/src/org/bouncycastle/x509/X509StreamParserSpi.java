// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.io.InputStream;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParsingException;

public abstract class X509StreamParserSpi
{

    public X509StreamParserSpi()
    {
    }

    public abstract void engineInit(InputStream inputstream);

    public abstract Object engineRead()
        throws StreamParsingException;

    public abstract Collection engineReadAll()
        throws StreamParsingException;
}
