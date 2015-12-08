// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.util.Selector;

// Referenced classes of package org.bouncycastle.x509:
//            ExtendedPKIXParameters, X509CertStoreSelector

public class ExtendedPKIXBuilderParameters extends ExtendedPKIXParameters
{

    private Set excludedCerts;
    private int maxPathLength;

    public ExtendedPKIXBuilderParameters(Set set, Selector selector)
        throws InvalidAlgorithmParameterException
    {
        super(set);
        maxPathLength = 5;
        excludedCerts = Collections.EMPTY_SET;
        setTargetConstraints(selector);
    }

    public static ExtendedPKIXParameters getInstance(PKIXParameters pkixparameters)
    {
        ExtendedPKIXBuilderParameters extendedpkixbuilderparameters;
        try
        {
            extendedpkixbuilderparameters = new ExtendedPKIXBuilderParameters(pkixparameters.getTrustAnchors(), X509CertStoreSelector.getInstance((X509CertSelector)pkixparameters.getTargetCertConstraints()));
        }
        // Misplaced declaration of an exception variable
        catch (PKIXParameters pkixparameters)
        {
            throw new RuntimeException(pkixparameters.getMessage());
        }
        extendedpkixbuilderparameters.setParams(pkixparameters);
        return extendedpkixbuilderparameters;
    }

    public Object clone()
    {
        ExtendedPKIXBuilderParameters extendedpkixbuilderparameters;
        try
        {
            extendedpkixbuilderparameters = new ExtendedPKIXBuilderParameters(getTrustAnchors(), getTargetConstraints());
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        extendedpkixbuilderparameters.setParams(this);
        return extendedpkixbuilderparameters;
    }

    public Set getExcludedCerts()
    {
        return Collections.unmodifiableSet(excludedCerts);
    }

    public int getMaxPathLength()
    {
        return maxPathLength;
    }

    public void setExcludedCerts(Set set)
    {
        if (set == null)
        {
            set = Collections.EMPTY_SET;
            return;
        } else
        {
            excludedCerts = new HashSet(set);
            return;
        }
    }

    public void setMaxPathLength(int i)
    {
        if (i < -1)
        {
            throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
        } else
        {
            maxPathLength = i;
            return;
        }
    }

    protected void setParams(PKIXParameters pkixparameters)
    {
        super.setParams(pkixparameters);
        if (pkixparameters instanceof ExtendedPKIXBuilderParameters)
        {
            ExtendedPKIXBuilderParameters extendedpkixbuilderparameters = (ExtendedPKIXBuilderParameters)pkixparameters;
            maxPathLength = extendedpkixbuilderparameters.maxPathLength;
            excludedCerts = new HashSet(extendedpkixbuilderparameters.excludedCerts);
        }
        if (pkixparameters instanceof PKIXBuilderParameters)
        {
            maxPathLength = ((PKIXBuilderParameters)pkixparameters).getMaxPathLength();
        }
    }
}
