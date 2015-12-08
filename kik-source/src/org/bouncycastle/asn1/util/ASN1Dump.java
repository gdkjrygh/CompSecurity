// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.util;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERApplicationSpecific;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERExternal;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERUnknownTag;
import org.bouncycastle.asn1.DERVisibleString;
import org.bouncycastle.util.encoders.Hex;

public class ASN1Dump
{

    public ASN1Dump()
    {
    }

    public static String a(Object obj)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (obj instanceof DERObject)
        {
            a("", false, (DERObject)obj, stringbuffer);
        } else
        if (obj instanceof DEREncodable)
        {
            a("", false, ((DEREncodable)obj).c(), stringbuffer);
        } else
        {
            return (new StringBuilder("unknown object type ")).append(obj.toString()).toString();
        }
        return stringbuffer.toString();
    }

    private static String a(String s, String s1, boolean flag, DERObject derobject, String s2)
    {
        DERApplicationSpecific derapplicationspecific = (DERApplicationSpecific)derobject;
        derobject = new StringBuffer();
        if (derapplicationspecific.e())
        {
            try
            {
                ASN1Sequence asn1sequence = ASN1Sequence.a(derapplicationspecific.h());
                derobject.append((new StringBuilder()).append(s1).append(s).append(" ApplicationSpecific[").append(derapplicationspecific.g()).append("]").append(s2).toString());
                for (s = asn1sequence.e(); s.hasMoreElements(); a((new StringBuilder()).append(s1).append("    ").toString(), flag, (DERObject)s.nextElement(), ((StringBuffer) (derobject)))) { }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                derobject.append(s);
            }
            return derobject.toString();
        } else
        {
            return (new StringBuilder()).append(s1).append(s).append(" ApplicationSpecific[").append(derapplicationspecific.g()).append("] (").append(new String(Hex.a(derapplicationspecific.f()))).append(")").append(s2).toString();
        }
    }

    private static String a(String s, byte abyte0[])
    {
        String s1 = System.getProperty("line.separator");
        StringBuffer stringbuffer = new StringBuffer();
        s = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s1);
        int i = 0;
        while (i < abyte0.length) 
        {
            if (abyte0.length - i > 32)
            {
                stringbuffer.append(s);
                stringbuffer.append(new String(Hex.a(abyte0, i, 32)));
                stringbuffer.append("    ");
                stringbuffer.append(a(abyte0, i, 32));
                stringbuffer.append(s1);
            } else
            {
                stringbuffer.append(s);
                stringbuffer.append(new String(Hex.a(abyte0, i, abyte0.length - i)));
                for (int j = abyte0.length - i; j != 32; j++)
                {
                    stringbuffer.append("  ");
                }

                stringbuffer.append("    ");
                stringbuffer.append(a(abyte0, i, abyte0.length - i));
                stringbuffer.append(s1);
            }
            i += 32;
        }
        return stringbuffer.toString();
    }

    private static String a(byte abyte0[], int i, int j)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int k = i; k != i + j; k++)
        {
            if (abyte0[k] >= 32 && abyte0[k] <= 126)
            {
                stringbuffer.append((char)abyte0[k]);
            }
        }

        return stringbuffer.toString();
    }

    private static void a(String s, boolean flag, DERObject derobject, StringBuffer stringbuffer)
    {
_L10:
        String s4 = System.getProperty("line.separator");
        if (!(derobject instanceof ASN1Sequence)) goto _L2; else goto _L1
_L1:
        Enumeration enumeration = ((ASN1Sequence)derobject).e();
        String s5 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        if (derobject instanceof BERSequence)
        {
            stringbuffer.append("BER Sequence");
        } else
        if (derobject instanceof DERSequence)
        {
            stringbuffer.append("DER Sequence");
        } else
        {
            stringbuffer.append("Sequence");
        }
        stringbuffer.append(s4);
        while (enumeration.hasMoreElements()) 
        {
            s = ((String) (enumeration.nextElement()));
            if (s == null || s.equals(new DERNull()))
            {
                stringbuffer.append(s5);
                stringbuffer.append("NULL");
                stringbuffer.append(s4);
            } else
            if (s instanceof DERObject)
            {
                a(s5, flag, (DERObject)s, stringbuffer);
            } else
            {
                a(s5, flag, ((DEREncodable)s).c(), stringbuffer);
            }
        }
          goto _L3
_L2:
        if (!(derobject instanceof DERTaggedObject)) goto _L5; else goto _L4
_L4:
        String s1;
        s1 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        if (derobject instanceof BERTaggedObject)
        {
            stringbuffer.append("BER Tagged [");
        } else
        {
            stringbuffer.append("Tagged [");
        }
        s = (DERTaggedObject)derobject;
        stringbuffer.append(Integer.toString(s.e()));
        stringbuffer.append(']');
        if (!s.f())
        {
            stringbuffer.append(" IMPLICIT ");
        }
        stringbuffer.append(s4);
        if (!s.h()) goto _L7; else goto _L6
_L6:
        stringbuffer.append(s1);
        stringbuffer.append("EMPTY");
        stringbuffer.append(s4);
_L3:
        return;
_L7:
        derobject = s.i();
        s = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        if (derobject instanceof BERSet)
        {
            derobject = ((ASN1Set)derobject).e();
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            stringbuffer.append(s);
            stringbuffer.append("BER Set");
            stringbuffer.append(s4);
            while (derobject.hasMoreElements()) 
            {
                s = ((String) (derobject.nextElement()));
                if (s == null)
                {
                    stringbuffer.append(s2);
                    stringbuffer.append("NULL");
                    stringbuffer.append(s4);
                } else
                if (s instanceof DERObject)
                {
                    a(s2, flag, (DERObject)s, stringbuffer);
                } else
                {
                    a(s2, flag, ((DEREncodable)s).c(), stringbuffer);
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!(derobject instanceof DERSet))
        {
            break; /* Loop/switch isn't completed */
        }
        derobject = ((ASN1Set)derobject).e();
        String s3 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        stringbuffer.append("DER Set");
        stringbuffer.append(s4);
        while (derobject.hasMoreElements()) 
        {
            s = ((String) (derobject.nextElement()));
            if (s == null)
            {
                stringbuffer.append(s3);
                stringbuffer.append("NULL");
                stringbuffer.append(s4);
            } else
            if (s instanceof DERObject)
            {
                a(s3, flag, (DERObject)s, stringbuffer);
            } else
            {
                a(s3, flag, ((DEREncodable)s).c(), stringbuffer);
            }
        }
        if (true) goto _L3; else goto _L8
_L8:
        if (derobject instanceof DERObjectIdentifier)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("ObjectIdentifier(").append(((DERObjectIdentifier)derobject).e()).append(")").append(s4).toString());
            return;
        }
        if (derobject instanceof DERBoolean)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("Boolean(").append(((DERBoolean)derobject).e()).append(")").append(s4).toString());
            return;
        }
        if (derobject instanceof DERInteger)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("Integer(").append(((DERInteger)derobject).e()).append(")").append(s4).toString());
            return;
        }
        if (derobject instanceof BERConstructedOctetString)
        {
            derobject = (ASN1OctetString)derobject;
            stringbuffer.append((new StringBuilder()).append(s).append("BER Constructed Octet String[").append(derobject.f().length).append("] ").toString());
            if (flag)
            {
                stringbuffer.append(a(s, derobject.f()));
                return;
            } else
            {
                stringbuffer.append(s4);
                return;
            }
        }
        if (derobject instanceof DEROctetString)
        {
            derobject = (ASN1OctetString)derobject;
            stringbuffer.append((new StringBuilder()).append(s).append("DER Octet String[").append(derobject.f().length).append("] ").toString());
            if (flag)
            {
                stringbuffer.append(a(s, derobject.f()));
                return;
            } else
            {
                stringbuffer.append(s4);
                return;
            }
        }
        if (derobject instanceof DERBitString)
        {
            derobject = (DERBitString)derobject;
            stringbuffer.append((new StringBuilder()).append(s).append("DER Bit String[").append(derobject.e().length).append(", ").append(derobject.f()).append("] ").toString());
            if (flag)
            {
                stringbuffer.append(a(s, derobject.e()));
                return;
            } else
            {
                stringbuffer.append(s4);
                return;
            }
        }
        if (derobject instanceof DERIA5String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("IA5String(").append(((DERIA5String)derobject).n_()).append(") ").append(s4).toString());
            return;
        }
        if (derobject instanceof DERUTF8String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("UTF8String(").append(((DERUTF8String)derobject).n_()).append(") ").append(s4).toString());
            return;
        }
        if (derobject instanceof DERPrintableString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("PrintableString(").append(((DERPrintableString)derobject).n_()).append(") ").append(s4).toString());
            return;
        }
        if (derobject instanceof DERVisibleString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("VisibleString(").append(((DERVisibleString)derobject).n_()).append(") ").append(s4).toString());
            return;
        }
        if (derobject instanceof DERBMPString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("BMPString(").append(((DERBMPString)derobject).n_()).append(") ").append(s4).toString());
            return;
        }
        if (derobject instanceof DERT61String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("T61String(").append(((DERT61String)derobject).n_()).append(") ").append(s4).toString());
            return;
        }
        if (derobject instanceof DERUTCTime)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("UTCTime(").append(((DERUTCTime)derobject).e()).append(") ").append(s4).toString());
            return;
        }
        if (derobject instanceof DERGeneralizedTime)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("GeneralizedTime(").append(((DERGeneralizedTime)derobject).e()).append(") ").append(s4).toString());
            return;
        }
        if (derobject instanceof DERUnknownTag)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("Unknown ").append(Integer.toString(((DERUnknownTag)derobject).e(), 16)).append(" ").append(new String(Hex.a(((DERUnknownTag)derobject).f()))).append(s4).toString());
            return;
        }
        if (derobject instanceof BERApplicationSpecific)
        {
            stringbuffer.append(a("BER", s, flag, derobject, s4));
            return;
        }
        if (derobject instanceof DERApplicationSpecific)
        {
            stringbuffer.append(a("DER", s, flag, derobject, s4));
            return;
        }
        if (derobject instanceof DEREnumerated)
        {
            derobject = (DEREnumerated)derobject;
            stringbuffer.append((new StringBuilder()).append(s).append("DER Enumerated(").append(derobject.e()).append(")").append(s4).toString());
            return;
        }
        if (derobject instanceof DERExternal)
        {
            derobject = (DERExternal)derobject;
            stringbuffer.append((new StringBuilder()).append(s).append("External ").append(s4).toString());
            s = (new StringBuilder()).append(s).append("    ").toString();
            if (derobject.f() != null)
            {
                stringbuffer.append((new StringBuilder()).append(s).append("Direct Reference: ").append(derobject.f().e()).append(s4).toString());
            }
            if (derobject.i() != null)
            {
                stringbuffer.append((new StringBuilder()).append(s).append("Indirect Reference: ").append(derobject.i().toString()).append(s4).toString());
            }
            if (derobject.e() != null)
            {
                a(s, flag, ((DERObject) (derobject.e())), stringbuffer);
            }
            stringbuffer.append((new StringBuilder()).append(s).append("Encoding: ").append(derobject.g()).append(s4).toString());
            derobject = derobject.h();
        } else
        {
            stringbuffer.append((new StringBuilder()).append(s).append(derobject.toString()).append(s4).toString());
            return;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }
}
