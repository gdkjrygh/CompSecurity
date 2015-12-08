// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

// Referenced classes of package org.bouncycastle.x509:
//            PKIXAttrCertChecker, X509CertStoreSelector

public class ExtendedPKIXParameters extends PKIXParameters
{

    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private boolean additionalLocationsEnabled;
    private List additionalStores;
    private Set attrCertCheckers;
    private Set necessaryACAttributes;
    private Set prohibitedACAttributes;
    private Selector selector;
    private List stores;
    private Set trustedACIssuers;
    private boolean useDeltas;
    private int validityModel;

    public ExtendedPKIXParameters(Set set)
        throws InvalidAlgorithmParameterException
    {
        super(set);
        validityModel = 0;
        useDeltas = false;
        stores = new ArrayList();
        additionalStores = new ArrayList();
        trustedACIssuers = new HashSet();
        necessaryACAttributes = new HashSet();
        prohibitedACAttributes = new HashSet();
        attrCertCheckers = new HashSet();
    }

    public static ExtendedPKIXParameters getInstance(PKIXParameters pkixparameters)
    {
        ExtendedPKIXParameters extendedpkixparameters;
        try
        {
            extendedpkixparameters = new ExtendedPKIXParameters(pkixparameters.getTrustAnchors());
        }
        // Misplaced declaration of an exception variable
        catch (PKIXParameters pkixparameters)
        {
            throw new RuntimeException(pkixparameters.getMessage());
        }
        extendedpkixparameters.setParams(pkixparameters);
        return extendedpkixparameters;
    }

    public void addAddionalStore(Store store)
    {
        addAdditionalStore(store);
    }

    public void addAdditionalStore(Store store)
    {
        if (store != null)
        {
            additionalStores.add(store);
        }
    }

    public void addStore(Store store)
    {
        if (store != null)
        {
            stores.add(store);
        }
    }

    public Object clone()
    {
        ExtendedPKIXParameters extendedpkixparameters;
        try
        {
            extendedpkixparameters = new ExtendedPKIXParameters(getTrustAnchors());
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        extendedpkixparameters.setParams(this);
        return extendedpkixparameters;
    }

    public List getAdditionalStores()
    {
        return Collections.unmodifiableList(additionalStores);
    }

    public Set getAttrCertCheckers()
    {
        return Collections.unmodifiableSet(attrCertCheckers);
    }

    public Set getNecessaryACAttributes()
    {
        return Collections.unmodifiableSet(necessaryACAttributes);
    }

    public Set getProhibitedACAttributes()
    {
        return Collections.unmodifiableSet(prohibitedACAttributes);
    }

    public List getStores()
    {
        return Collections.unmodifiableList(new ArrayList(stores));
    }

    public Selector getTargetConstraints()
    {
        if (selector != null)
        {
            return (Selector)selector.clone();
        } else
        {
            return null;
        }
    }

    public Set getTrustedACIssuers()
    {
        return Collections.unmodifiableSet(trustedACIssuers);
    }

    public int getValidityModel()
    {
        return validityModel;
    }

    public boolean isAdditionalLocationsEnabled()
    {
        return additionalLocationsEnabled;
    }

    public boolean isUseDeltasEnabled()
    {
        return useDeltas;
    }

    public void setAdditionalLocationsEnabled(boolean flag)
    {
        additionalLocationsEnabled = flag;
    }

    public void setAttrCertCheckers(Set set)
    {
        if (set == null)
        {
            attrCertCheckers.clear();
            return;
        }
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            if (!(iterator.next() instanceof PKIXAttrCertChecker))
            {
                throw new ClassCastException((new StringBuilder()).append("All elements of set must be of type ").append(org/bouncycastle/x509/PKIXAttrCertChecker.getName()).append(".").toString());
            }
        }

        attrCertCheckers.clear();
        attrCertCheckers.addAll(set);
    }

    public void setCertStores(List list)
    {
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); addCertStore((CertStore)list.next())) { }
        }
    }

    public void setNecessaryACAttributes(Set set)
    {
        if (set == null)
        {
            necessaryACAttributes.clear();
            return;
        }
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            if (!(iterator.next() instanceof String))
            {
                throw new ClassCastException("All elements of set must be of type String.");
            }
        }

        necessaryACAttributes.clear();
        necessaryACAttributes.addAll(set);
    }

    protected void setParams(PKIXParameters pkixparameters)
    {
        setDate(pkixparameters.getDate());
        setCertPathCheckers(pkixparameters.getCertPathCheckers());
        setCertStores(pkixparameters.getCertStores());
        setAnyPolicyInhibited(pkixparameters.isAnyPolicyInhibited());
        setExplicitPolicyRequired(pkixparameters.isExplicitPolicyRequired());
        setPolicyMappingInhibited(pkixparameters.isPolicyMappingInhibited());
        setRevocationEnabled(pkixparameters.isRevocationEnabled());
        setInitialPolicies(pkixparameters.getInitialPolicies());
        setPolicyQualifiersRejected(pkixparameters.getPolicyQualifiersRejected());
        setSigProvider(pkixparameters.getSigProvider());
        setTargetCertConstraints(pkixparameters.getTargetCertConstraints());
        try
        {
            setTrustAnchors(pkixparameters.getTrustAnchors());
        }
        // Misplaced declaration of an exception variable
        catch (PKIXParameters pkixparameters)
        {
            throw new RuntimeException(pkixparameters.getMessage());
        }
        if (pkixparameters instanceof ExtendedPKIXParameters)
        {
            ExtendedPKIXParameters extendedpkixparameters = (ExtendedPKIXParameters)pkixparameters;
            validityModel = extendedpkixparameters.validityModel;
            useDeltas = extendedpkixparameters.useDeltas;
            additionalLocationsEnabled = extendedpkixparameters.additionalLocationsEnabled;
            if (extendedpkixparameters.selector == null)
            {
                pkixparameters = null;
            } else
            {
                pkixparameters = (Selector)extendedpkixparameters.selector.clone();
            }
            selector = pkixparameters;
            stores = new ArrayList(extendedpkixparameters.stores);
            additionalStores = new ArrayList(extendedpkixparameters.additionalStores);
            trustedACIssuers = new HashSet(extendedpkixparameters.trustedACIssuers);
            prohibitedACAttributes = new HashSet(extendedpkixparameters.prohibitedACAttributes);
            necessaryACAttributes = new HashSet(extendedpkixparameters.necessaryACAttributes);
            attrCertCheckers = new HashSet(extendedpkixparameters.attrCertCheckers);
        }
    }

    public void setProhibitedACAttributes(Set set)
    {
        if (set == null)
        {
            prohibitedACAttributes.clear();
            return;
        }
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            if (!(iterator.next() instanceof String))
            {
                throw new ClassCastException("All elements of set must be of type String.");
            }
        }

        prohibitedACAttributes.clear();
        prohibitedACAttributes.addAll(set);
    }

    public void setStores(List list)
    {
        if (list == null)
        {
            stores = new ArrayList();
            return;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            if (!(iterator.next() instanceof Store))
            {
                throw new ClassCastException("All elements of list must be of type org.bouncycastle.util.Store.");
            }
        }

        stores = new ArrayList(list);
    }

    public void setTargetCertConstraints(CertSelector certselector)
    {
        super.setTargetCertConstraints(certselector);
        if (certselector != null)
        {
            selector = X509CertStoreSelector.getInstance((X509CertSelector)certselector);
            return;
        } else
        {
            selector = null;
            return;
        }
    }

    public void setTargetConstraints(Selector selector1)
    {
        if (selector1 != null)
        {
            selector = (Selector)selector1.clone();
            return;
        } else
        {
            selector = null;
            return;
        }
    }

    public void setTrustedACIssuers(Set set)
    {
        if (set == null)
        {
            trustedACIssuers.clear();
            return;
        }
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            if (!(iterator.next() instanceof TrustAnchor))
            {
                throw new ClassCastException((new StringBuilder()).append("All elements of set must be of type ").append(java/security/cert/TrustAnchor.getName()).append(".").toString());
            }
        }

        trustedACIssuers.clear();
        trustedACIssuers.addAll(set);
    }

    public void setUseDeltasEnabled(boolean flag)
    {
        useDeltas = flag;
    }

    public void setValidityModel(int i)
    {
        validityModel = i;
    }
}
