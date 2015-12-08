// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.security.cert.CertStoreParameters;
import java.security.cert.LDAPCertStoreParameters;
import org.bouncycastle.x509.X509StoreParameters;

public class X509LDAPCertStoreParameters
    implements X509StoreParameters, CertStoreParameters
{
    public static class Builder
    {

        private String aACertificateAttribute;
        private String aACertificateSubjectAttributeName;
        private String attributeAuthorityRevocationListAttribute;
        private String attributeAuthorityRevocationListIssuerAttributeName;
        private String attributeCertificateAttributeAttribute;
        private String attributeCertificateAttributeSubjectAttributeName;
        private String attributeCertificateRevocationListAttribute;
        private String attributeCertificateRevocationListIssuerAttributeName;
        private String attributeDescriptorCertificateAttribute;
        private String attributeDescriptorCertificateSubjectAttributeName;
        private String authorityRevocationListAttribute;
        private String authorityRevocationListIssuerAttributeName;
        private String baseDN;
        private String cACertificateAttribute;
        private String cACertificateSubjectAttributeName;
        private String certificateRevocationListAttribute;
        private String certificateRevocationListIssuerAttributeName;
        private String crossCertificateAttribute;
        private String crossCertificateSubjectAttributeName;
        private String deltaRevocationListAttribute;
        private String deltaRevocationListIssuerAttributeName;
        private String ldapAACertificateAttributeName;
        private String ldapAttributeAuthorityRevocationListAttributeName;
        private String ldapAttributeCertificateAttributeAttributeName;
        private String ldapAttributeCertificateRevocationListAttributeName;
        private String ldapAttributeDescriptorCertificateAttributeName;
        private String ldapAuthorityRevocationListAttributeName;
        private String ldapCACertificateAttributeName;
        private String ldapCertificateRevocationListAttributeName;
        private String ldapCrossCertificateAttributeName;
        private String ldapDeltaRevocationListAttributeName;
        private String ldapURL;
        private String ldapUserCertificateAttributeName;
        private String searchForSerialNumberIn;
        private String userCertificateAttribute;
        private String userCertificateSubjectAttributeName;

        public X509LDAPCertStoreParameters build()
        {
            if (ldapUserCertificateAttributeName == null || ldapCACertificateAttributeName == null || ldapCrossCertificateAttributeName == null || ldapCertificateRevocationListAttributeName == null || ldapDeltaRevocationListAttributeName == null || ldapAuthorityRevocationListAttributeName == null || ldapAttributeCertificateAttributeAttributeName == null || ldapAACertificateAttributeName == null || ldapAttributeDescriptorCertificateAttributeName == null || ldapAttributeCertificateRevocationListAttributeName == null || ldapAttributeAuthorityRevocationListAttributeName == null || userCertificateSubjectAttributeName == null || cACertificateSubjectAttributeName == null || crossCertificateSubjectAttributeName == null || certificateRevocationListIssuerAttributeName == null || deltaRevocationListIssuerAttributeName == null || authorityRevocationListIssuerAttributeName == null || attributeCertificateAttributeSubjectAttributeName == null || aACertificateSubjectAttributeName == null || attributeDescriptorCertificateSubjectAttributeName == null || attributeCertificateRevocationListIssuerAttributeName == null || attributeAuthorityRevocationListIssuerAttributeName == null)
            {
                throw new IllegalArgumentException("Necessary parameters not specified.");
            } else
            {
                return new X509LDAPCertStoreParameters(this);
            }
        }

        public Builder setAACertificateAttribute(String s)
        {
            aACertificateAttribute = s;
            return this;
        }

        public Builder setAACertificateSubjectAttributeName(String s)
        {
            aACertificateSubjectAttributeName = s;
            return this;
        }

        public Builder setAttributeAuthorityRevocationListAttribute(String s)
        {
            attributeAuthorityRevocationListAttribute = s;
            return this;
        }

        public Builder setAttributeAuthorityRevocationListIssuerAttributeName(String s)
        {
            attributeAuthorityRevocationListIssuerAttributeName = s;
            return this;
        }

        public Builder setAttributeCertificateAttributeAttribute(String s)
        {
            attributeCertificateAttributeAttribute = s;
            return this;
        }

        public Builder setAttributeCertificateAttributeSubjectAttributeName(String s)
        {
            attributeCertificateAttributeSubjectAttributeName = s;
            return this;
        }

        public Builder setAttributeCertificateRevocationListAttribute(String s)
        {
            attributeCertificateRevocationListAttribute = s;
            return this;
        }

        public Builder setAttributeCertificateRevocationListIssuerAttributeName(String s)
        {
            attributeCertificateRevocationListIssuerAttributeName = s;
            return this;
        }

        public Builder setAttributeDescriptorCertificateAttribute(String s)
        {
            attributeDescriptorCertificateAttribute = s;
            return this;
        }

        public Builder setAttributeDescriptorCertificateSubjectAttributeName(String s)
        {
            attributeDescriptorCertificateSubjectAttributeName = s;
            return this;
        }

        public Builder setAuthorityRevocationListAttribute(String s)
        {
            authorityRevocationListAttribute = s;
            return this;
        }

        public Builder setAuthorityRevocationListIssuerAttributeName(String s)
        {
            authorityRevocationListIssuerAttributeName = s;
            return this;
        }

        public Builder setCACertificateAttribute(String s)
        {
            cACertificateAttribute = s;
            return this;
        }

        public Builder setCACertificateSubjectAttributeName(String s)
        {
            cACertificateSubjectAttributeName = s;
            return this;
        }

        public Builder setCertificateRevocationListAttribute(String s)
        {
            certificateRevocationListAttribute = s;
            return this;
        }

        public Builder setCertificateRevocationListIssuerAttributeName(String s)
        {
            certificateRevocationListIssuerAttributeName = s;
            return this;
        }

        public Builder setCrossCertificateAttribute(String s)
        {
            crossCertificateAttribute = s;
            return this;
        }

        public Builder setCrossCertificateSubjectAttributeName(String s)
        {
            crossCertificateSubjectAttributeName = s;
            return this;
        }

        public Builder setDeltaRevocationListAttribute(String s)
        {
            deltaRevocationListAttribute = s;
            return this;
        }

        public Builder setDeltaRevocationListIssuerAttributeName(String s)
        {
            deltaRevocationListIssuerAttributeName = s;
            return this;
        }

        public Builder setLdapAACertificateAttributeName(String s)
        {
            ldapAACertificateAttributeName = s;
            return this;
        }

        public Builder setLdapAttributeAuthorityRevocationListAttributeName(String s)
        {
            ldapAttributeAuthorityRevocationListAttributeName = s;
            return this;
        }

        public Builder setLdapAttributeCertificateAttributeAttributeName(String s)
        {
            ldapAttributeCertificateAttributeAttributeName = s;
            return this;
        }

        public Builder setLdapAttributeCertificateRevocationListAttributeName(String s)
        {
            ldapAttributeCertificateRevocationListAttributeName = s;
            return this;
        }

        public Builder setLdapAttributeDescriptorCertificateAttributeName(String s)
        {
            ldapAttributeDescriptorCertificateAttributeName = s;
            return this;
        }

        public Builder setLdapAuthorityRevocationListAttributeName(String s)
        {
            ldapAuthorityRevocationListAttributeName = s;
            return this;
        }

        public Builder setLdapCACertificateAttributeName(String s)
        {
            ldapCACertificateAttributeName = s;
            return this;
        }

        public Builder setLdapCertificateRevocationListAttributeName(String s)
        {
            ldapCertificateRevocationListAttributeName = s;
            return this;
        }

        public Builder setLdapCrossCertificateAttributeName(String s)
        {
            ldapCrossCertificateAttributeName = s;
            return this;
        }

        public Builder setLdapDeltaRevocationListAttributeName(String s)
        {
            ldapDeltaRevocationListAttributeName = s;
            return this;
        }

        public Builder setLdapUserCertificateAttributeName(String s)
        {
            ldapUserCertificateAttributeName = s;
            return this;
        }

        public Builder setSearchForSerialNumberIn(String s)
        {
            searchForSerialNumberIn = s;
            return this;
        }

        public Builder setUserCertificateAttribute(String s)
        {
            userCertificateAttribute = s;
            return this;
        }

        public Builder setUserCertificateSubjectAttributeName(String s)
        {
            userCertificateSubjectAttributeName = s;
            return this;
        }





































        public Builder()
        {
            this("ldap://localhost:389", "");
        }

        public Builder(String s, String s1)
        {
            ldapURL = s;
            if (s1 == null)
            {
                baseDN = "";
            } else
            {
                baseDN = s1;
            }
            userCertificateAttribute = "userCertificate";
            cACertificateAttribute = "cACertificate";
            crossCertificateAttribute = "crossCertificatePair";
            certificateRevocationListAttribute = "certificateRevocationList";
            deltaRevocationListAttribute = "deltaRevocationList";
            authorityRevocationListAttribute = "authorityRevocationList";
            attributeCertificateAttributeAttribute = "attributeCertificateAttribute";
            aACertificateAttribute = "aACertificate";
            attributeDescriptorCertificateAttribute = "attributeDescriptorCertificate";
            attributeCertificateRevocationListAttribute = "attributeCertificateRevocationList";
            attributeAuthorityRevocationListAttribute = "attributeAuthorityRevocationList";
            ldapUserCertificateAttributeName = "cn";
            ldapCACertificateAttributeName = "cn ou o";
            ldapCrossCertificateAttributeName = "cn ou o";
            ldapCertificateRevocationListAttributeName = "cn ou o";
            ldapDeltaRevocationListAttributeName = "cn ou o";
            ldapAuthorityRevocationListAttributeName = "cn ou o";
            ldapAttributeCertificateAttributeAttributeName = "cn";
            ldapAACertificateAttributeName = "cn o ou";
            ldapAttributeDescriptorCertificateAttributeName = "cn o ou";
            ldapAttributeCertificateRevocationListAttributeName = "cn o ou";
            ldapAttributeAuthorityRevocationListAttributeName = "cn o ou";
            userCertificateSubjectAttributeName = "cn";
            cACertificateSubjectAttributeName = "o ou";
            crossCertificateSubjectAttributeName = "o ou";
            certificateRevocationListIssuerAttributeName = "o ou";
            deltaRevocationListIssuerAttributeName = "o ou";
            authorityRevocationListIssuerAttributeName = "o ou";
            attributeCertificateAttributeSubjectAttributeName = "cn";
            aACertificateSubjectAttributeName = "o ou";
            attributeDescriptorCertificateSubjectAttributeName = "o ou";
            attributeCertificateRevocationListIssuerAttributeName = "o ou";
            attributeAuthorityRevocationListIssuerAttributeName = "o ou";
            searchForSerialNumberIn = "uid serialNumber cn";
        }
    }


    private String aACertificateAttribute;
    private String aACertificateSubjectAttributeName;
    private String attributeAuthorityRevocationListAttribute;
    private String attributeAuthorityRevocationListIssuerAttributeName;
    private String attributeCertificateAttributeAttribute;
    private String attributeCertificateAttributeSubjectAttributeName;
    private String attributeCertificateRevocationListAttribute;
    private String attributeCertificateRevocationListIssuerAttributeName;
    private String attributeDescriptorCertificateAttribute;
    private String attributeDescriptorCertificateSubjectAttributeName;
    private String authorityRevocationListAttribute;
    private String authorityRevocationListIssuerAttributeName;
    private String baseDN;
    private String cACertificateAttribute;
    private String cACertificateSubjectAttributeName;
    private String certificateRevocationListAttribute;
    private String certificateRevocationListIssuerAttributeName;
    private String crossCertificateAttribute;
    private String crossCertificateSubjectAttributeName;
    private String deltaRevocationListAttribute;
    private String deltaRevocationListIssuerAttributeName;
    private String ldapAACertificateAttributeName;
    private String ldapAttributeAuthorityRevocationListAttributeName;
    private String ldapAttributeCertificateAttributeAttributeName;
    private String ldapAttributeCertificateRevocationListAttributeName;
    private String ldapAttributeDescriptorCertificateAttributeName;
    private String ldapAuthorityRevocationListAttributeName;
    private String ldapCACertificateAttributeName;
    private String ldapCertificateRevocationListAttributeName;
    private String ldapCrossCertificateAttributeName;
    private String ldapDeltaRevocationListAttributeName;
    private String ldapURL;
    private String ldapUserCertificateAttributeName;
    private String searchForSerialNumberIn;
    private String userCertificateAttribute;
    private String userCertificateSubjectAttributeName;

    private X509LDAPCertStoreParameters(Builder builder)
    {
        ldapURL = builder.ldapURL;
        baseDN = builder.baseDN;
        userCertificateAttribute = builder.userCertificateAttribute;
        cACertificateAttribute = builder.cACertificateAttribute;
        crossCertificateAttribute = builder.crossCertificateAttribute;
        certificateRevocationListAttribute = builder.certificateRevocationListAttribute;
        deltaRevocationListAttribute = builder.deltaRevocationListAttribute;
        authorityRevocationListAttribute = builder.authorityRevocationListAttribute;
        attributeCertificateAttributeAttribute = builder.attributeCertificateAttributeAttribute;
        aACertificateAttribute = builder.aACertificateAttribute;
        attributeDescriptorCertificateAttribute = builder.attributeDescriptorCertificateAttribute;
        attributeCertificateRevocationListAttribute = builder.attributeCertificateRevocationListAttribute;
        attributeAuthorityRevocationListAttribute = builder.attributeAuthorityRevocationListAttribute;
        ldapUserCertificateAttributeName = builder.ldapUserCertificateAttributeName;
        ldapCACertificateAttributeName = builder.ldapCACertificateAttributeName;
        ldapCrossCertificateAttributeName = builder.ldapCrossCertificateAttributeName;
        ldapCertificateRevocationListAttributeName = builder.ldapCertificateRevocationListAttributeName;
        ldapDeltaRevocationListAttributeName = builder.ldapDeltaRevocationListAttributeName;
        ldapAuthorityRevocationListAttributeName = builder.ldapAuthorityRevocationListAttributeName;
        ldapAttributeCertificateAttributeAttributeName = builder.ldapAttributeCertificateAttributeAttributeName;
        ldapAACertificateAttributeName = builder.ldapAACertificateAttributeName;
        ldapAttributeDescriptorCertificateAttributeName = builder.ldapAttributeDescriptorCertificateAttributeName;
        ldapAttributeCertificateRevocationListAttributeName = builder.ldapAttributeCertificateRevocationListAttributeName;
        ldapAttributeAuthorityRevocationListAttributeName = builder.ldapAttributeAuthorityRevocationListAttributeName;
        userCertificateSubjectAttributeName = builder.userCertificateSubjectAttributeName;
        cACertificateSubjectAttributeName = builder.cACertificateSubjectAttributeName;
        crossCertificateSubjectAttributeName = builder.crossCertificateSubjectAttributeName;
        certificateRevocationListIssuerAttributeName = builder.certificateRevocationListIssuerAttributeName;
        deltaRevocationListIssuerAttributeName = builder.deltaRevocationListIssuerAttributeName;
        authorityRevocationListIssuerAttributeName = builder.authorityRevocationListIssuerAttributeName;
        attributeCertificateAttributeSubjectAttributeName = builder.attributeCertificateAttributeSubjectAttributeName;
        aACertificateSubjectAttributeName = builder.aACertificateSubjectAttributeName;
        attributeDescriptorCertificateSubjectAttributeName = builder.attributeDescriptorCertificateSubjectAttributeName;
        attributeCertificateRevocationListIssuerAttributeName = builder.attributeCertificateRevocationListIssuerAttributeName;
        attributeAuthorityRevocationListIssuerAttributeName = builder.attributeAuthorityRevocationListIssuerAttributeName;
        searchForSerialNumberIn = builder.searchForSerialNumberIn;
    }


    private int addHashCode(int i, Object obj)
    {
        int j;
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        return j + i * 29;
    }

    private boolean checkField(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static X509LDAPCertStoreParameters getInstance(LDAPCertStoreParameters ldapcertstoreparameters)
    {
        return (new Builder((new StringBuilder()).append("ldap://").append(ldapcertstoreparameters.getServerName()).append(":").append(ldapcertstoreparameters.getPort()).toString(), "")).build();
    }

    public Object clone()
    {
        return this;
    }

    public boolean equal(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof X509LDAPCertStoreParameters))
            {
                return false;
            }
            obj = (X509LDAPCertStoreParameters)obj;
            if (!checkField(ldapURL, ((X509LDAPCertStoreParameters) (obj)).ldapURL) || !checkField(baseDN, ((X509LDAPCertStoreParameters) (obj)).baseDN) || !checkField(userCertificateAttribute, ((X509LDAPCertStoreParameters) (obj)).userCertificateAttribute) || !checkField(cACertificateAttribute, ((X509LDAPCertStoreParameters) (obj)).cACertificateAttribute) || !checkField(crossCertificateAttribute, ((X509LDAPCertStoreParameters) (obj)).crossCertificateAttribute) || !checkField(certificateRevocationListAttribute, ((X509LDAPCertStoreParameters) (obj)).certificateRevocationListAttribute) || !checkField(deltaRevocationListAttribute, ((X509LDAPCertStoreParameters) (obj)).deltaRevocationListAttribute) || !checkField(authorityRevocationListAttribute, ((X509LDAPCertStoreParameters) (obj)).authorityRevocationListAttribute) || !checkField(attributeCertificateAttributeAttribute, ((X509LDAPCertStoreParameters) (obj)).attributeCertificateAttributeAttribute) || !checkField(aACertificateAttribute, ((X509LDAPCertStoreParameters) (obj)).aACertificateAttribute) || !checkField(attributeDescriptorCertificateAttribute, ((X509LDAPCertStoreParameters) (obj)).attributeDescriptorCertificateAttribute) || !checkField(attributeCertificateRevocationListAttribute, ((X509LDAPCertStoreParameters) (obj)).attributeCertificateRevocationListAttribute) || !checkField(attributeAuthorityRevocationListAttribute, ((X509LDAPCertStoreParameters) (obj)).attributeAuthorityRevocationListAttribute) || !checkField(ldapUserCertificateAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapUserCertificateAttributeName) || !checkField(ldapCACertificateAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapCACertificateAttributeName) || !checkField(ldapCrossCertificateAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapCrossCertificateAttributeName) || !checkField(ldapCertificateRevocationListAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapCertificateRevocationListAttributeName) || !checkField(ldapDeltaRevocationListAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapDeltaRevocationListAttributeName) || !checkField(ldapAuthorityRevocationListAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapAuthorityRevocationListAttributeName) || !checkField(ldapAttributeCertificateAttributeAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapAttributeCertificateAttributeAttributeName) || !checkField(ldapAACertificateAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapAACertificateAttributeName) || !checkField(ldapAttributeDescriptorCertificateAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapAttributeDescriptorCertificateAttributeName) || !checkField(ldapAttributeCertificateRevocationListAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapAttributeCertificateRevocationListAttributeName) || !checkField(ldapAttributeAuthorityRevocationListAttributeName, ((X509LDAPCertStoreParameters) (obj)).ldapAttributeAuthorityRevocationListAttributeName) || !checkField(userCertificateSubjectAttributeName, ((X509LDAPCertStoreParameters) (obj)).userCertificateSubjectAttributeName) || !checkField(cACertificateSubjectAttributeName, ((X509LDAPCertStoreParameters) (obj)).cACertificateSubjectAttributeName) || !checkField(crossCertificateSubjectAttributeName, ((X509LDAPCertStoreParameters) (obj)).crossCertificateSubjectAttributeName) || !checkField(certificateRevocationListIssuerAttributeName, ((X509LDAPCertStoreParameters) (obj)).certificateRevocationListIssuerAttributeName) || !checkField(deltaRevocationListIssuerAttributeName, ((X509LDAPCertStoreParameters) (obj)).deltaRevocationListIssuerAttributeName) || !checkField(authorityRevocationListIssuerAttributeName, ((X509LDAPCertStoreParameters) (obj)).authorityRevocationListIssuerAttributeName) || !checkField(attributeCertificateAttributeSubjectAttributeName, ((X509LDAPCertStoreParameters) (obj)).attributeCertificateAttributeSubjectAttributeName) || !checkField(aACertificateSubjectAttributeName, ((X509LDAPCertStoreParameters) (obj)).aACertificateSubjectAttributeName) || !checkField(attributeDescriptorCertificateSubjectAttributeName, ((X509LDAPCertStoreParameters) (obj)).attributeDescriptorCertificateSubjectAttributeName) || !checkField(attributeCertificateRevocationListIssuerAttributeName, ((X509LDAPCertStoreParameters) (obj)).attributeCertificateRevocationListIssuerAttributeName) || !checkField(attributeAuthorityRevocationListIssuerAttributeName, ((X509LDAPCertStoreParameters) (obj)).attributeAuthorityRevocationListIssuerAttributeName) || !checkField(searchForSerialNumberIn, ((X509LDAPCertStoreParameters) (obj)).searchForSerialNumberIn))
            {
                return false;
            }
        }
        return true;
    }

    public String getAACertificateAttribute()
    {
        return aACertificateAttribute;
    }

    public String getAACertificateSubjectAttributeName()
    {
        return aACertificateSubjectAttributeName;
    }

    public String getAttributeAuthorityRevocationListAttribute()
    {
        return attributeAuthorityRevocationListAttribute;
    }

    public String getAttributeAuthorityRevocationListIssuerAttributeName()
    {
        return attributeAuthorityRevocationListIssuerAttributeName;
    }

    public String getAttributeCertificateAttributeAttribute()
    {
        return attributeCertificateAttributeAttribute;
    }

    public String getAttributeCertificateAttributeSubjectAttributeName()
    {
        return attributeCertificateAttributeSubjectAttributeName;
    }

    public String getAttributeCertificateRevocationListAttribute()
    {
        return attributeCertificateRevocationListAttribute;
    }

    public String getAttributeCertificateRevocationListIssuerAttributeName()
    {
        return attributeCertificateRevocationListIssuerAttributeName;
    }

    public String getAttributeDescriptorCertificateAttribute()
    {
        return attributeDescriptorCertificateAttribute;
    }

    public String getAttributeDescriptorCertificateSubjectAttributeName()
    {
        return attributeDescriptorCertificateSubjectAttributeName;
    }

    public String getAuthorityRevocationListAttribute()
    {
        return authorityRevocationListAttribute;
    }

    public String getAuthorityRevocationListIssuerAttributeName()
    {
        return authorityRevocationListIssuerAttributeName;
    }

    public String getBaseDN()
    {
        return baseDN;
    }

    public String getCACertificateAttribute()
    {
        return cACertificateAttribute;
    }

    public String getCACertificateSubjectAttributeName()
    {
        return cACertificateSubjectAttributeName;
    }

    public String getCertificateRevocationListAttribute()
    {
        return certificateRevocationListAttribute;
    }

    public String getCertificateRevocationListIssuerAttributeName()
    {
        return certificateRevocationListIssuerAttributeName;
    }

    public String getCrossCertificateAttribute()
    {
        return crossCertificateAttribute;
    }

    public String getCrossCertificateSubjectAttributeName()
    {
        return crossCertificateSubjectAttributeName;
    }

    public String getDeltaRevocationListAttribute()
    {
        return deltaRevocationListAttribute;
    }

    public String getDeltaRevocationListIssuerAttributeName()
    {
        return deltaRevocationListIssuerAttributeName;
    }

    public String getLdapAACertificateAttributeName()
    {
        return ldapAACertificateAttributeName;
    }

    public String getLdapAttributeAuthorityRevocationListAttributeName()
    {
        return ldapAttributeAuthorityRevocationListAttributeName;
    }

    public String getLdapAttributeCertificateAttributeAttributeName()
    {
        return ldapAttributeCertificateAttributeAttributeName;
    }

    public String getLdapAttributeCertificateRevocationListAttributeName()
    {
        return ldapAttributeCertificateRevocationListAttributeName;
    }

    public String getLdapAttributeDescriptorCertificateAttributeName()
    {
        return ldapAttributeDescriptorCertificateAttributeName;
    }

    public String getLdapAuthorityRevocationListAttributeName()
    {
        return ldapAuthorityRevocationListAttributeName;
    }

    public String getLdapCACertificateAttributeName()
    {
        return ldapCACertificateAttributeName;
    }

    public String getLdapCertificateRevocationListAttributeName()
    {
        return ldapCertificateRevocationListAttributeName;
    }

    public String getLdapCrossCertificateAttributeName()
    {
        return ldapCrossCertificateAttributeName;
    }

    public String getLdapDeltaRevocationListAttributeName()
    {
        return ldapDeltaRevocationListAttributeName;
    }

    public String getLdapURL()
    {
        return ldapURL;
    }

    public String getLdapUserCertificateAttributeName()
    {
        return ldapUserCertificateAttributeName;
    }

    public String getSearchForSerialNumberIn()
    {
        return searchForSerialNumberIn;
    }

    public String getUserCertificateAttribute()
    {
        return userCertificateAttribute;
    }

    public String getUserCertificateSubjectAttributeName()
    {
        return userCertificateSubjectAttributeName;
    }

    public int hashCode()
    {
        return addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(addHashCode(0, userCertificateAttribute), cACertificateAttribute), crossCertificateAttribute), certificateRevocationListAttribute), deltaRevocationListAttribute), authorityRevocationListAttribute), attributeCertificateAttributeAttribute), aACertificateAttribute), attributeDescriptorCertificateAttribute), attributeCertificateRevocationListAttribute), attributeAuthorityRevocationListAttribute), ldapUserCertificateAttributeName), ldapCACertificateAttributeName), ldapCrossCertificateAttributeName), ldapCertificateRevocationListAttributeName), ldapDeltaRevocationListAttributeName), ldapAuthorityRevocationListAttributeName), ldapAttributeCertificateAttributeAttributeName), ldapAACertificateAttributeName), ldapAttributeDescriptorCertificateAttributeName), ldapAttributeCertificateRevocationListAttributeName), ldapAttributeAuthorityRevocationListAttributeName), userCertificateSubjectAttributeName), cACertificateSubjectAttributeName), crossCertificateSubjectAttributeName), certificateRevocationListIssuerAttributeName), deltaRevocationListIssuerAttributeName), authorityRevocationListIssuerAttributeName), attributeCertificateAttributeSubjectAttributeName), aACertificateSubjectAttributeName), attributeDescriptorCertificateSubjectAttributeName), attributeCertificateRevocationListIssuerAttributeName), attributeAuthorityRevocationListIssuerAttributeName), searchForSerialNumberIn);
    }
}
