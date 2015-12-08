// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.x509;

import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
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
//            X509CertStoreSelector

public class ExtendedPKIXParameters extends PKIXParameters
{

    private List a;
    private Selector b;
    private boolean c;
    private List d;
    private Set e;
    private Set f;
    private Set g;
    private Set h;
    private int i;
    private boolean j;

    public ExtendedPKIXParameters(Set set)
    {
        super(set);
        i = 0;
        j = false;
        a = new ArrayList();
        d = new ArrayList();
        e = new HashSet();
        f = new HashSet();
        g = new HashSet();
        h = new HashSet();
    }

    public static ExtendedPKIXParameters c(PKIXParameters pkixparameters)
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
        extendedpkixparameters.a(pkixparameters);
        return extendedpkixparameters;
    }

    protected void a(PKIXParameters pkixparameters)
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
            i = extendedpkixparameters.i;
            j = extendedpkixparameters.j;
            c = extendedpkixparameters.c;
            if (extendedpkixparameters.b == null)
            {
                pkixparameters = null;
            } else
            {
                pkixparameters = (Selector)extendedpkixparameters.b.clone();
            }
            b = pkixparameters;
            a = new ArrayList(extendedpkixparameters.a);
            d = new ArrayList(extendedpkixparameters.d);
            e = new HashSet(extendedpkixparameters.e);
            g = new HashSet(extendedpkixparameters.g);
            f = new HashSet(extendedpkixparameters.f);
            h = new HashSet(extendedpkixparameters.h);
        }
    }

    public final void a(Selector selector)
    {
        if (selector != null)
        {
            b = (Selector)selector.clone();
            return;
        } else
        {
            b = null;
            return;
        }
    }

    public final void a(Store store)
    {
        if (store != null)
        {
            d.add(store);
        }
    }

    public final boolean c()
    {
        return j;
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
        extendedpkixparameters.a(this);
        return extendedpkixparameters;
    }

    public final int d()
    {
        return i;
    }

    public final List e()
    {
        return Collections.unmodifiableList(d);
    }

    public final List f()
    {
        return Collections.unmodifiableList(new ArrayList(a));
    }

    public final boolean g()
    {
        return c;
    }

    public final Selector h()
    {
        if (b != null)
        {
            return (Selector)b.clone();
        } else
        {
            return null;
        }
    }

    public final Set i()
    {
        return Collections.unmodifiableSet(e);
    }

    public final Set j()
    {
        return Collections.unmodifiableSet(f);
    }

    public final Set k()
    {
        return Collections.unmodifiableSet(g);
    }

    public final Set l()
    {
        return Collections.unmodifiableSet(h);
    }

    public void setCertStores(List list)
    {
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); addCertStore((CertStore)list.next())) { }
        }
    }

    public void setTargetCertConstraints(CertSelector certselector)
    {
        super.setTargetCertConstraints(certselector);
        if (certselector != null)
        {
            b = X509CertStoreSelector.a((X509CertSelector)certselector);
            return;
        } else
        {
            b = null;
            return;
        }
    }
}
