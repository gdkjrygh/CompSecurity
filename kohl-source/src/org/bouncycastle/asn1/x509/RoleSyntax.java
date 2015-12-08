// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralName, GeneralNames

public class RoleSyntax extends ASN1Object
{

    private GeneralNames roleAuthority;
    private GeneralName roleName;

    public RoleSyntax(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        this(new GeneralName(6, s1));
    }

    private RoleSyntax(ASN1Sequence asn1sequence)
    {
        int i;
        if (asn1sequence.size() < 1 || asn1sequence.size() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        i = 0;
_L8:
        if (i == asn1sequence.size()) goto _L2; else goto _L1
_L1:
        ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.getObjectAt(i));
        asn1taggedobject.getTagNo();
        JVM INSTR tableswitch 0 1: default 96
    //                   0 106
    //                   1 122;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException("Unknown tag in RoleSyntax");
_L4:
        roleAuthority = GeneralNames.getInstance(asn1taggedobject, false);
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        roleName = GeneralName.getInstance(asn1taggedobject, true);
        if (true) goto _L6; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public RoleSyntax(GeneralName generalname)
    {
        this(null, generalname);
    }

    public RoleSyntax(GeneralNames generalnames, GeneralName generalname)
    {
        if (generalname == null || generalname.getTagNo() != 6 || ((ASN1String)generalname.getName()).getString().equals(""))
        {
            throw new IllegalArgumentException("the role name MUST be non empty and MUST use the URI option of GeneralName");
        } else
        {
            roleAuthority = generalnames;
            roleName = generalname;
            return;
        }
    }

    public static RoleSyntax getInstance(Object obj)
    {
        if (obj instanceof RoleSyntax)
        {
            return (RoleSyntax)obj;
        }
        if (obj != null)
        {
            return new RoleSyntax(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public GeneralNames getRoleAuthority()
    {
        return roleAuthority;
    }

    public String[] getRoleAuthorityAsString()
    {
        if (roleAuthority == null)
        {
            return new String[0];
        }
        GeneralName ageneralname[] = roleAuthority.getNames();
        String as[] = new String[ageneralname.length];
        int i = 0;
        while (i < ageneralname.length) 
        {
            org.bouncycastle.asn1.ASN1Encodable asn1encodable = ageneralname[i].getName();
            if (asn1encodable instanceof ASN1String)
            {
                as[i] = ((ASN1String)asn1encodable).getString();
            } else
            {
                as[i] = asn1encodable.toString();
            }
            i++;
        }
        return as;
    }

    public GeneralName getRoleName()
    {
        return roleName;
    }

    public String getRoleNameAsString()
    {
        return ((ASN1String)roleName.getName()).getString();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (roleAuthority != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, roleAuthority));
        }
        asn1encodablevector.add(new DERTaggedObject(true, 1, roleName));
        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer((new StringBuilder()).append("Name: ").append(getRoleNameAsString()).append(" - Auth: ").toString());
        if (roleAuthority == null || roleAuthority.getNames().length == 0)
        {
            stringbuffer.append("N/A");
        } else
        {
            String as[] = getRoleAuthorityAsString();
            stringbuffer.append('[').append(as[0]);
            for (int i = 1; i < as.length; i++)
            {
                stringbuffer.append(", ").append(as[i]);
            }

            stringbuffer.append(']');
        }
        return stringbuffer.toString();
    }
}
