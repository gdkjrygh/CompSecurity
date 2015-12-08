// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.spongycastle.util.Selector;

// Referenced classes of package org.spongycastle.x509:
//            ExtendedPKIXParameters, X509CertStoreSelector

public class ExtendedPKIXBuilderParameters extends ExtendedPKIXParameters
{

    private int a;
    private Set b;

    private ExtendedPKIXBuilderParameters(Set set, Selector selector)
    {
        super(set);
        a = 5;
        b = Collections.EMPTY_SET;
        a(selector);
    }

    public static ExtendedPKIXParameters b(PKIXParameters pkixparameters)
    {
        ExtendedPKIXBuilderParameters extendedpkixbuilderparameters;
        try
        {
            extendedpkixbuilderparameters = new ExtendedPKIXBuilderParameters(pkixparameters.getTrustAnchors(), X509CertStoreSelector.a((X509CertSelector)pkixparameters.getTargetCertConstraints()));
        }
        // Misplaced declaration of an exception variable
        catch (PKIXParameters pkixparameters)
        {
            throw new RuntimeException(pkixparameters.getMessage());
        }
        extendedpkixbuilderparameters.a(pkixparameters);
        return extendedpkixbuilderparameters;
    }

    public final Set a()
    {
        return Collections.unmodifiableSet(b);
    }

    protected final void a(PKIXParameters pkixparameters)
    {
        super.a(pkixparameters);
        if (pkixparameters instanceof ExtendedPKIXBuilderParameters)
        {
            ExtendedPKIXBuilderParameters extendedpkixbuilderparameters = (ExtendedPKIXBuilderParameters)pkixparameters;
            a = extendedpkixbuilderparameters.a;
            b = new HashSet(extendedpkixbuilderparameters.b);
        }
        if (pkixparameters instanceof PKIXBuilderParameters)
        {
            a = ((PKIXBuilderParameters)pkixparameters).getMaxPathLength();
        }
    }

    public final int b()
    {
        return a;
    }

    public Object clone()
    {
        ExtendedPKIXBuilderParameters extendedpkixbuilderparameters;
        try
        {
            extendedpkixbuilderparameters = new ExtendedPKIXBuilderParameters(getTrustAnchors(), h());
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        extendedpkixbuilderparameters.a(this);
        return extendedpkixbuilderparameters;
    }
}
