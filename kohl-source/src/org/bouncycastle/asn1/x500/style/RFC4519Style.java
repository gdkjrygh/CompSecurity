// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

// Referenced classes of package org.bouncycastle.asn1.x500.style:
//            IETFUtils

public class RFC4519Style
    implements X500NameStyle
{

    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE = new RFC4519Style();
    public static final ASN1ObjectIdentifier businessCategory;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier cn;
    public static final ASN1ObjectIdentifier dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;

    protected RFC4519Style()
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
        s = IETFUtils.rDNsFromString(s, this);
        RDN ardn[] = new RDN[s.length];
        for (int i = 0; i != s.length; i++)
        {
            ardn[ardn.length - i - 1] = s[i];
        }

        return ardn;
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
        if (asn1objectidentifier.equals(dc))
        {
            return new DERIA5String(s1);
        }
        if (asn1objectidentifier.equals(c) || asn1objectidentifier.equals(serialNumber) || asn1objectidentifier.equals(dnQualifier) || asn1objectidentifier.equals(telephoneNumber))
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
        int i = x500name.length - 1;
        boolean flag = true;
label0:
        for (; i >= 0; i--)
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
        businessCategory = new ASN1ObjectIdentifier("2.5.4.15");
        c = new ASN1ObjectIdentifier("2.5.4.6");
        cn = new ASN1ObjectIdentifier("2.5.4.3");
        dc = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        description = new ASN1ObjectIdentifier("2.5.4.13");
        destinationIndicator = new ASN1ObjectIdentifier("2.5.4.27");
        distinguishedName = new ASN1ObjectIdentifier("2.5.4.49");
        dnQualifier = new ASN1ObjectIdentifier("2.5.4.46");
        enhancedSearchGuide = new ASN1ObjectIdentifier("2.5.4.47");
        facsimileTelephoneNumber = new ASN1ObjectIdentifier("2.5.4.23");
        generationQualifier = new ASN1ObjectIdentifier("2.5.4.44");
        givenName = new ASN1ObjectIdentifier("2.5.4.42");
        houseIdentifier = new ASN1ObjectIdentifier("2.5.4.51");
        initials = new ASN1ObjectIdentifier("2.5.4.43");
        internationalISDNNumber = new ASN1ObjectIdentifier("2.5.4.25");
        l = new ASN1ObjectIdentifier("2.5.4.7");
        member = new ASN1ObjectIdentifier("2.5.4.31");
        name = new ASN1ObjectIdentifier("2.5.4.41");
        o = new ASN1ObjectIdentifier("2.5.4.10");
        ou = new ASN1ObjectIdentifier("2.5.4.11");
        owner = new ASN1ObjectIdentifier("2.5.4.32");
        physicalDeliveryOfficeName = new ASN1ObjectIdentifier("2.5.4.19");
        postalAddress = new ASN1ObjectIdentifier("2.5.4.16");
        postalCode = new ASN1ObjectIdentifier("2.5.4.17");
        postOfficeBox = new ASN1ObjectIdentifier("2.5.4.18");
        preferredDeliveryMethod = new ASN1ObjectIdentifier("2.5.4.28");
        registeredAddress = new ASN1ObjectIdentifier("2.5.4.26");
        roleOccupant = new ASN1ObjectIdentifier("2.5.4.33");
        searchGuide = new ASN1ObjectIdentifier("2.5.4.14");
        seeAlso = new ASN1ObjectIdentifier("2.5.4.34");
        serialNumber = new ASN1ObjectIdentifier("2.5.4.5");
        sn = new ASN1ObjectIdentifier("2.5.4.4");
        st = new ASN1ObjectIdentifier("2.5.4.8");
        street = new ASN1ObjectIdentifier("2.5.4.9");
        telephoneNumber = new ASN1ObjectIdentifier("2.5.4.20");
        teletexTerminalIdentifier = new ASN1ObjectIdentifier("2.5.4.22");
        telexNumber = new ASN1ObjectIdentifier("2.5.4.21");
        title = new ASN1ObjectIdentifier("2.5.4.12");
        uid = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        uniqueMember = new ASN1ObjectIdentifier("2.5.4.50");
        userPassword = new ASN1ObjectIdentifier("2.5.4.35");
        x121Address = new ASN1ObjectIdentifier("2.5.4.24");
        x500UniqueIdentifier = new ASN1ObjectIdentifier("2.5.4.45");
        DefaultSymbols = new Hashtable();
        DefaultLookUp = new Hashtable();
        DefaultSymbols.put(businessCategory, "businessCategory");
        DefaultSymbols.put(c, "c");
        DefaultSymbols.put(cn, "cn");
        DefaultSymbols.put(dc, "dc");
        DefaultSymbols.put(description, "description");
        DefaultSymbols.put(destinationIndicator, "destinationIndicator");
        DefaultSymbols.put(distinguishedName, "distinguishedName");
        DefaultSymbols.put(dnQualifier, "dnQualifier");
        DefaultSymbols.put(enhancedSearchGuide, "enhancedSearchGuide");
        DefaultSymbols.put(facsimileTelephoneNumber, "facsimileTelephoneNumber");
        DefaultSymbols.put(generationQualifier, "generationQualifier");
        DefaultSymbols.put(givenName, "givenName");
        DefaultSymbols.put(houseIdentifier, "houseIdentifier");
        DefaultSymbols.put(initials, "initials");
        DefaultSymbols.put(internationalISDNNumber, "internationalISDNNumber");
        DefaultSymbols.put(l, "l");
        DefaultSymbols.put(member, "member");
        DefaultSymbols.put(name, "name");
        DefaultSymbols.put(o, "o");
        DefaultSymbols.put(ou, "ou");
        DefaultSymbols.put(owner, "owner");
        DefaultSymbols.put(physicalDeliveryOfficeName, "physicalDeliveryOfficeName");
        DefaultSymbols.put(postalAddress, "postalAddress");
        DefaultSymbols.put(postalCode, "postalCode");
        DefaultSymbols.put(postOfficeBox, "postOfficeBox");
        DefaultSymbols.put(preferredDeliveryMethod, "preferredDeliveryMethod");
        DefaultSymbols.put(registeredAddress, "registeredAddress");
        DefaultSymbols.put(roleOccupant, "roleOccupant");
        DefaultSymbols.put(searchGuide, "searchGuide");
        DefaultSymbols.put(seeAlso, "seeAlso");
        DefaultSymbols.put(serialNumber, "serialNumber");
        DefaultSymbols.put(sn, "sn");
        DefaultSymbols.put(st, "st");
        DefaultSymbols.put(street, "street");
        DefaultSymbols.put(telephoneNumber, "telephoneNumber");
        DefaultSymbols.put(teletexTerminalIdentifier, "teletexTerminalIdentifier");
        DefaultSymbols.put(telexNumber, "telexNumber");
        DefaultSymbols.put(title, "title");
        DefaultSymbols.put(uid, "uid");
        DefaultSymbols.put(uniqueMember, "uniqueMember");
        DefaultSymbols.put(userPassword, "userPassword");
        DefaultSymbols.put(x121Address, "x121Address");
        DefaultSymbols.put(x500UniqueIdentifier, "x500UniqueIdentifier");
        DefaultLookUp.put("businesscategory", businessCategory);
        DefaultLookUp.put("c", c);
        DefaultLookUp.put("cn", cn);
        DefaultLookUp.put("dc", dc);
        DefaultLookUp.put("description", description);
        DefaultLookUp.put("destinationindicator", destinationIndicator);
        DefaultLookUp.put("distinguishedname", distinguishedName);
        DefaultLookUp.put("dnqualifier", dnQualifier);
        DefaultLookUp.put("enhancedsearchguide", enhancedSearchGuide);
        DefaultLookUp.put("facsimiletelephonenumber", facsimileTelephoneNumber);
        DefaultLookUp.put("generationqualifier", generationQualifier);
        DefaultLookUp.put("givenname", givenName);
        DefaultLookUp.put("houseidentifier", houseIdentifier);
        DefaultLookUp.put("initials", initials);
        DefaultLookUp.put("internationalisdnnumber", internationalISDNNumber);
        DefaultLookUp.put("l", l);
        DefaultLookUp.put("member", member);
        DefaultLookUp.put("name", name);
        DefaultLookUp.put("o", o);
        DefaultLookUp.put("ou", ou);
        DefaultLookUp.put("owner", owner);
        DefaultLookUp.put("physicaldeliveryofficename", physicalDeliveryOfficeName);
        DefaultLookUp.put("postaladdress", postalAddress);
        DefaultLookUp.put("postalcode", postalCode);
        DefaultLookUp.put("postofficebox", postOfficeBox);
        DefaultLookUp.put("preferreddeliverymethod", preferredDeliveryMethod);
        DefaultLookUp.put("registeredaddress", registeredAddress);
        DefaultLookUp.put("roleoccupant", roleOccupant);
        DefaultLookUp.put("searchguide", searchGuide);
        DefaultLookUp.put("seealso", seeAlso);
        DefaultLookUp.put("serialnumber", serialNumber);
        DefaultLookUp.put("sn", sn);
        DefaultLookUp.put("st", st);
        DefaultLookUp.put("street", street);
        DefaultLookUp.put("telephonenumber", telephoneNumber);
        DefaultLookUp.put("teletexterminalidentifier", teletexTerminalIdentifier);
        DefaultLookUp.put("telexnumber", telexNumber);
        DefaultLookUp.put("title", title);
        DefaultLookUp.put("uid", uid);
        DefaultLookUp.put("uniquemember", uniqueMember);
        DefaultLookUp.put("userpassword", userPassword);
        DefaultLookUp.put("x121address", x121Address);
        DefaultLookUp.put("x500uniqueidentifier", x500UniqueIdentifier);
    }
}
