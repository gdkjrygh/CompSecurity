// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

// Referenced classes of package org.bouncycastle.asn1.x500.style:
//            IETFUtils

public class BCStyle
    implements X500NameStyle
{

    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DMD_NAME = new ASN1ObjectIdentifier("2.5.4.54");
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE = new BCStyle();
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;

    protected BCStyle()
    {
    }

    private boolean atvAreEqual(AttributeTypeAndValue attributetypeandvalue, AttributeTypeAndValue attributetypeandvalue1)
    {
        if (attributetypeandvalue != attributetypeandvalue1)
        {
            if (attributetypeandvalue == null)
            {
                return false;
            }
            if (attributetypeandvalue1 == null)
            {
                return false;
            }
            if (!attributetypeandvalue.getType().equals(attributetypeandvalue1.getType()))
            {
                return false;
            }
            if (!IETFUtils.canonicalize(IETFUtils.valueToString(attributetypeandvalue.getValue())).equals(IETFUtils.canonicalize(IETFUtils.valueToString(attributetypeandvalue1.getValue()))))
            {
                return false;
            }
        }
        return true;
    }

    private int calcHashCode(ASN1Encodable asn1encodable)
    {
        return IETFUtils.canonicalize(IETFUtils.valueToString(asn1encodable)).hashCode();
    }

    private boolean foundMatch(boolean flag, RDN rdn, RDN ardn[])
    {
        boolean flag1 = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = ardn.length - 1;
_L7:
        flag = flag1;
        if (i < 0) goto _L4; else goto _L3
_L3:
        if (ardn[i] == null || !rdnAreEqual(rdn, ardn[i])) goto _L6; else goto _L5
_L5:
        ardn[i] = null;
        flag = true;
_L4:
        return flag;
_L6:
        i--;
          goto _L7
_L2:
        i = 0;
_L9:
        flag = flag1;
        if (i == ardn.length) goto _L4; else goto _L8
_L8:
        if (ardn[i] != null && rdnAreEqual(rdn, ardn[i]))
        {
            ardn[i] = null;
            return true;
        }
        i++;
          goto _L9
    }

    public boolean areEqual(X500Name x500name, X500Name x500name1)
    {
        x500name = x500name.getRDNs();
        x500name1 = x500name1.getRDNs();
        if (x500name.length == x500name1.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        boolean flag;
        if (x500name[0].getFirst() != null && x500name1[0].getFirst() != null)
        {
            if (!x500name[0].getFirst().getType().equals(x500name1[0].getFirst().getType()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        i = 0;
label0:
        do
        {
label1:
            {
                if (i == x500name.length)
                {
                    break label1;
                }
                if (!foundMatch(flag, x500name[i], x500name1))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public ASN1ObjectIdentifier attrNameToOID(String s)
    {
        return IETFUtils.decodeAttrName(s, DefaultLookUp);
    }

    public int calculateHashCode(X500Name x500name)
    {
        x500name = x500name.getRDNs();
        int j = 0;
        int i = 0;
        while (j != x500name.length) 
        {
            if (x500name[j].isMultiValued())
            {
                AttributeTypeAndValue aattributetypeandvalue[] = x500name[j].getTypesAndValues();
                for (int k = 0; k != aattributetypeandvalue.length; k++)
                {
                    i = i ^ aattributetypeandvalue[k].getType().hashCode() ^ calcHashCode(aattributetypeandvalue[k].getValue());
                }

            } else
            {
                i = i ^ x500name[j].getFirst().getType().hashCode() ^ calcHashCode(x500name[j].getFirst().getValue());
            }
            j++;
        }
        return i;
    }

    public RDN[] fromString(String s)
    {
        return IETFUtils.rDNsFromString(s, this);
    }

    protected boolean rdnAreEqual(RDN rdn, RDN rdn1)
    {
        if (!rdn.isMultiValued()) goto _L2; else goto _L1
_L1:
        if (!rdn1.isMultiValued()) goto _L4; else goto _L3
_L3:
        rdn = rdn.getTypesAndValues();
        rdn1 = rdn1.getTypesAndValues();
        if (rdn.length == rdn1.length) goto _L5; else goto _L4
_L4:
        return false;
_L5:
        int i = 0;
        do
        {
            if (i == rdn.length)
            {
                break;
            }
            if (!atvAreEqual(rdn[i], rdn1[i]))
            {
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        if (!rdn1.isMultiValued())
        {
            return atvAreEqual(rdn.getFirst(), rdn1.getFirst());
        }
        if (true) goto _L4; else goto _L6
_L6:
        return true;
    }

    public ASN1Encodable stringToValue(ASN1ObjectIdentifier asn1objectidentifier, String s)
    {
        if (s.length() != 0 && s.charAt(0) == '#')
        {
            try
            {
                s = IETFUtils.valueFromHexString(s, 1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException((new StringBuilder()).append("can't recode value for oid ").append(asn1objectidentifier.getId()).toString());
            }
            return s;
        }
        String s1 = s;
        if (s.length() != 0)
        {
            s1 = s;
            if (s.charAt(0) == '\\')
            {
                s1 = s.substring(1);
            }
        }
        if (asn1objectidentifier.equals(EmailAddress) || asn1objectidentifier.equals(DC))
        {
            return new DERIA5String(s1);
        }
        if (asn1objectidentifier.equals(DATE_OF_BIRTH))
        {
            return new DERGeneralizedTime(s1);
        }
        if (asn1objectidentifier.equals(C) || asn1objectidentifier.equals(SN) || asn1objectidentifier.equals(DN_QUALIFIER) || asn1objectidentifier.equals(TELEPHONE_NUMBER))
        {
            return new DERPrintableString(s1);
        } else
        {
            return new DERUTF8String(s1);
        }
    }

    public String toString(X500Name x500name)
    {
        StringBuffer stringbuffer = new StringBuffer();
        x500name = x500name.getRDNs();
        int i = 0;
        boolean flag = true;
label0:
        for (; i < x500name.length; i++)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuffer.append(',');
            }
            if (x500name[i].isMultiValued())
            {
                AttributeTypeAndValue aattributetypeandvalue[] = x500name[i].getTypesAndValues();
                int j = 0;
                boolean flag1 = true;
                do
                {
                    if (j == aattributetypeandvalue.length)
                    {
                        continue label0;
                    }
                    if (flag1)
                    {
                        flag1 = false;
                    } else
                    {
                        stringbuffer.append('+');
                    }
                    IETFUtils.appendTypeAndValue(stringbuffer, aattributetypeandvalue[j], DefaultSymbols);
                    j++;
                } while (true);
            }
            IETFUtils.appendTypeAndValue(stringbuffer, x500name[i].getFirst(), DefaultSymbols);
        }

        return stringbuffer.toString();
    }

    static 
    {
        C = new ASN1ObjectIdentifier("2.5.4.6");
        O = new ASN1ObjectIdentifier("2.5.4.10");
        OU = new ASN1ObjectIdentifier("2.5.4.11");
        T = new ASN1ObjectIdentifier("2.5.4.12");
        CN = new ASN1ObjectIdentifier("2.5.4.3");
        SN = new ASN1ObjectIdentifier("2.5.4.5");
        STREET = new ASN1ObjectIdentifier("2.5.4.9");
        SERIALNUMBER = SN;
        L = new ASN1ObjectIdentifier("2.5.4.7");
        ST = new ASN1ObjectIdentifier("2.5.4.8");
        SURNAME = new ASN1ObjectIdentifier("2.5.4.4");
        GIVENNAME = new ASN1ObjectIdentifier("2.5.4.42");
        INITIALS = new ASN1ObjectIdentifier("2.5.4.43");
        GENERATION = new ASN1ObjectIdentifier("2.5.4.44");
        UNIQUE_IDENTIFIER = new ASN1ObjectIdentifier("2.5.4.45");
        BUSINESS_CATEGORY = new ASN1ObjectIdentifier("2.5.4.15");
        POSTAL_CODE = new ASN1ObjectIdentifier("2.5.4.17");
        DN_QUALIFIER = new ASN1ObjectIdentifier("2.5.4.46");
        PSEUDONYM = new ASN1ObjectIdentifier("2.5.4.65");
        DATE_OF_BIRTH = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1");
        PLACE_OF_BIRTH = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2");
        GENDER = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3");
        COUNTRY_OF_CITIZENSHIP = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_RESIDENCE = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5");
        NAME_AT_BIRTH = new ASN1ObjectIdentifier("1.3.36.8.3.14");
        POSTAL_ADDRESS = new ASN1ObjectIdentifier("2.5.4.16");
        TELEPHONE_NUMBER = X509ObjectIdentifiers.id_at_telephoneNumber;
        NAME = X509ObjectIdentifiers.id_at_name;
        EmailAddress = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        UnstructuredName = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredAddress = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        E = EmailAddress;
        DC = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        UID = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        DefaultSymbols = new Hashtable();
        DefaultLookUp = new Hashtable();
        DefaultSymbols.put(C, "C");
        DefaultSymbols.put(O, "O");
        DefaultSymbols.put(T, "T");
        DefaultSymbols.put(OU, "OU");
        DefaultSymbols.put(CN, "CN");
        DefaultSymbols.put(L, "L");
        DefaultSymbols.put(ST, "ST");
        DefaultSymbols.put(SN, "SERIALNUMBER");
        DefaultSymbols.put(EmailAddress, "E");
        DefaultSymbols.put(DC, "DC");
        DefaultSymbols.put(UID, "UID");
        DefaultSymbols.put(STREET, "STREET");
        DefaultSymbols.put(SURNAME, "SURNAME");
        DefaultSymbols.put(GIVENNAME, "GIVENNAME");
        DefaultSymbols.put(INITIALS, "INITIALS");
        DefaultSymbols.put(GENERATION, "GENERATION");
        DefaultSymbols.put(UnstructuredAddress, "unstructuredAddress");
        DefaultSymbols.put(UnstructuredName, "unstructuredName");
        DefaultSymbols.put(UNIQUE_IDENTIFIER, "UniqueIdentifier");
        DefaultSymbols.put(DN_QUALIFIER, "DN");
        DefaultSymbols.put(PSEUDONYM, "Pseudonym");
        DefaultSymbols.put(POSTAL_ADDRESS, "PostalAddress");
        DefaultSymbols.put(NAME_AT_BIRTH, "NameAtBirth");
        DefaultSymbols.put(COUNTRY_OF_CITIZENSHIP, "CountryOfCitizenship");
        DefaultSymbols.put(COUNTRY_OF_RESIDENCE, "CountryOfResidence");
        DefaultSymbols.put(GENDER, "Gender");
        DefaultSymbols.put(PLACE_OF_BIRTH, "PlaceOfBirth");
        DefaultSymbols.put(DATE_OF_BIRTH, "DateOfBirth");
        DefaultSymbols.put(POSTAL_CODE, "PostalCode");
        DefaultSymbols.put(BUSINESS_CATEGORY, "BusinessCategory");
        DefaultSymbols.put(TELEPHONE_NUMBER, "TelephoneNumber");
        DefaultSymbols.put(NAME, "Name");
        DefaultLookUp.put("c", C);
        DefaultLookUp.put("o", O);
        DefaultLookUp.put("t", T);
        DefaultLookUp.put("ou", OU);
        DefaultLookUp.put("cn", CN);
        DefaultLookUp.put("l", L);
        DefaultLookUp.put("st", ST);
        DefaultLookUp.put("sn", SN);
        DefaultLookUp.put("serialnumber", SN);
        DefaultLookUp.put("street", STREET);
        DefaultLookUp.put("emailaddress", E);
        DefaultLookUp.put("dc", DC);
        DefaultLookUp.put("e", E);
        DefaultLookUp.put("uid", UID);
        DefaultLookUp.put("surname", SURNAME);
        DefaultLookUp.put("givenname", GIVENNAME);
        DefaultLookUp.put("initials", INITIALS);
        DefaultLookUp.put("generation", GENERATION);
        DefaultLookUp.put("unstructuredaddress", UnstructuredAddress);
        DefaultLookUp.put("unstructuredname", UnstructuredName);
        DefaultLookUp.put("uniqueidentifier", UNIQUE_IDENTIFIER);
        DefaultLookUp.put("dn", DN_QUALIFIER);
        DefaultLookUp.put("pseudonym", PSEUDONYM);
        DefaultLookUp.put("postaladdress", POSTAL_ADDRESS);
        DefaultLookUp.put("nameofbirth", NAME_AT_BIRTH);
        DefaultLookUp.put("countryofcitizenship", COUNTRY_OF_CITIZENSHIP);
        DefaultLookUp.put("countryofresidence", COUNTRY_OF_RESIDENCE);
        DefaultLookUp.put("gender", GENDER);
        DefaultLookUp.put("placeofbirth", PLACE_OF_BIRTH);
        DefaultLookUp.put("dateofbirth", DATE_OF_BIRTH);
        DefaultLookUp.put("postalcode", POSTAL_CODE);
        DefaultLookUp.put("businesscategory", BUSINESS_CATEGORY);
        DefaultLookUp.put("telephonenumber", TELEPHONE_NUMBER);
        DefaultLookUp.put("name", NAME);
    }
}
