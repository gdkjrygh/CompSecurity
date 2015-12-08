// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.util;

import java.io.IOException;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.BERApplicationSpecific;
import org.spongycastle.asn1.BERConstructedOctetString;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.BERSet;
import org.spongycastle.asn1.BERTaggedObject;
import org.spongycastle.asn1.DERApplicationSpecific;
import org.spongycastle.asn1.DERBMPString;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERBoolean;
import org.spongycastle.asn1.DEREnumerated;
import org.spongycastle.asn1.DERExternal;
import org.spongycastle.asn1.DERGeneralizedTime;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.DERT61String;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.DERUTCTime;
import org.spongycastle.asn1.DERUTF8String;
import org.spongycastle.asn1.DERVisibleString;
import org.spongycastle.util.encoders.Hex;

public class ASN1Dump
{

    public ASN1Dump()
    {
    }

    public static String a(Object obj)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (obj instanceof ASN1Primitive)
        {
            a("", false, (ASN1Primitive)obj, stringbuffer);
        } else
        if (obj instanceof ASN1Encodable)
        {
            a("", false, ((ASN1Encodable)obj).a(), stringbuffer);
        } else
        {
            return (new StringBuilder("unknown object type ")).append(obj.toString()).toString();
        }
        return stringbuffer.toString();
    }

    private static String a(String s, String s1, boolean flag, ASN1Primitive asn1primitive, String s2)
    {
        DERApplicationSpecific derapplicationspecific = (DERApplicationSpecific)asn1primitive;
        asn1primitive = new StringBuffer();
        if (derapplicationspecific.h())
        {
            try
            {
                ASN1Sequence asn1sequence = ASN1Sequence.a(derapplicationspecific.e());
                asn1primitive.append((new StringBuilder()).append(s1).append(s).append(" ApplicationSpecific[").append(derapplicationspecific.d()).append("]").append(s2).toString());
                for (s = asn1sequence.d(); s.hasMoreElements(); a((new StringBuilder()).append(s1).append("    ").toString(), flag, (ASN1Primitive)s.nextElement(), ((StringBuffer) (asn1primitive)))) { }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                asn1primitive.append(s);
            }
            return asn1primitive.toString();
        } else
        {
            return (new StringBuilder()).append(s1).append(s).append(" ApplicationSpecific[").append(derapplicationspecific.d()).append("] (").append(new String(Hex.a(derapplicationspecific.c()))).append(")").append(s2).toString();
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

    private static void a(String s, boolean flag, ASN1Primitive asn1primitive, StringBuffer stringbuffer)
    {
_L10:
        String s4 = System.getProperty("line.separator");
        if (!(asn1primitive instanceof ASN1Sequence)) goto _L2; else goto _L1
_L1:
        Enumeration enumeration = ((ASN1Sequence)asn1primitive).d();
        String s5 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        if (asn1primitive instanceof BERSequence)
        {
            stringbuffer.append("BER Sequence");
        } else
        if (asn1primitive instanceof DERSequence)
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
            if (s instanceof ASN1Primitive)
            {
                a(s5, flag, (ASN1Primitive)s, stringbuffer);
            } else
            {
                a(s5, flag, ((ASN1Encodable)s).a(), stringbuffer);
            }
        }
          goto _L3
_L2:
        if (!(asn1primitive instanceof DERTaggedObject)) goto _L5; else goto _L4
_L4:
        String s1;
        s1 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        if (asn1primitive instanceof BERTaggedObject)
        {
            stringbuffer.append("BER Tagged [");
        } else
        {
            stringbuffer.append("Tagged [");
        }
        s = (DERTaggedObject)asn1primitive;
        stringbuffer.append(Integer.toString(s.c()));
        stringbuffer.append(']');
        if (!s.d())
        {
            stringbuffer.append(" IMPLICIT ");
        }
        stringbuffer.append(s4);
        if (!s.j()) goto _L7; else goto _L6
_L6:
        stringbuffer.append(s1);
        stringbuffer.append("EMPTY");
        stringbuffer.append(s4);
_L3:
        return;
_L7:
        asn1primitive = s.k();
        s = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        if (asn1primitive instanceof BERSet)
        {
            asn1primitive = ((ASN1Set)asn1primitive).c();
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            stringbuffer.append(s);
            stringbuffer.append("BER Set");
            stringbuffer.append(s4);
            while (asn1primitive.hasMoreElements()) 
            {
                s = ((String) (asn1primitive.nextElement()));
                if (s == null)
                {
                    stringbuffer.append(s2);
                    stringbuffer.append("NULL");
                    stringbuffer.append(s4);
                } else
                if (s instanceof ASN1Primitive)
                {
                    a(s2, flag, (ASN1Primitive)s, stringbuffer);
                } else
                {
                    a(s2, flag, ((ASN1Encodable)s).a(), stringbuffer);
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!(asn1primitive instanceof DERSet))
        {
            break; /* Loop/switch isn't completed */
        }
        asn1primitive = ((ASN1Set)asn1primitive).c();
        String s3 = (new StringBuilder()).append(s).append("    ").toString();
        stringbuffer.append(s);
        stringbuffer.append("DER Set");
        stringbuffer.append(s4);
        while (asn1primitive.hasMoreElements()) 
        {
            s = ((String) (asn1primitive.nextElement()));
            if (s == null)
            {
                stringbuffer.append(s3);
                stringbuffer.append("NULL");
                stringbuffer.append(s4);
            } else
            if (s instanceof ASN1Primitive)
            {
                a(s3, flag, (ASN1Primitive)s, stringbuffer);
            } else
            {
                a(s3, flag, ((ASN1Encodable)s).a(), stringbuffer);
            }
        }
        if (true) goto _L3; else goto _L8
_L8:
        if (asn1primitive instanceof ASN1ObjectIdentifier)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("ObjectIdentifier(").append(((ASN1ObjectIdentifier)asn1primitive).c()).append(")").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERBoolean)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("Boolean(").append(((DERBoolean)asn1primitive).d()).append(")").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof ASN1Integer)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("Integer(").append(((ASN1Integer)asn1primitive).c()).append(")").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof BERConstructedOctetString)
        {
            asn1primitive = (ASN1OctetString)asn1primitive;
            stringbuffer.append((new StringBuilder()).append(s).append("BER Constructed Octet String[").append(asn1primitive.d().length).append("] ").toString());
            if (flag)
            {
                stringbuffer.append(a(s, asn1primitive.d()));
                return;
            } else
            {
                stringbuffer.append(s4);
                return;
            }
        }
        if (asn1primitive instanceof DEROctetString)
        {
            asn1primitive = (ASN1OctetString)asn1primitive;
            stringbuffer.append((new StringBuilder()).append(s).append("DER Octet String[").append(asn1primitive.d().length).append("] ").toString());
            if (flag)
            {
                stringbuffer.append(a(s, asn1primitive.d()));
                return;
            } else
            {
                stringbuffer.append(s4);
                return;
            }
        }
        if (asn1primitive instanceof DERBitString)
        {
            asn1primitive = (DERBitString)asn1primitive;
            stringbuffer.append((new StringBuilder()).append(s).append("DER Bit String[").append(asn1primitive.c().length).append(", ").append(asn1primitive.d()).append("] ").toString());
            if (flag)
            {
                stringbuffer.append(a(s, asn1primitive.c()));
                return;
            } else
            {
                stringbuffer.append(s4);
                return;
            }
        }
        if (asn1primitive instanceof DERIA5String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("IA5String(").append(((DERIA5String)asn1primitive).o_()).append(") ").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERUTF8String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("UTF8String(").append(((DERUTF8String)asn1primitive).o_()).append(") ").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERPrintableString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("PrintableString(").append(((DERPrintableString)asn1primitive).o_()).append(") ").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERVisibleString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("VisibleString(").append(((DERVisibleString)asn1primitive).o_()).append(") ").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERBMPString)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("BMPString(").append(((DERBMPString)asn1primitive).o_()).append(") ").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERT61String)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("T61String(").append(((DERT61String)asn1primitive).o_()).append(") ").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERUTCTime)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("UTCTime(").append(((DERUTCTime)asn1primitive).c()).append(") ").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERGeneralizedTime)
        {
            stringbuffer.append((new StringBuilder()).append(s).append("GeneralizedTime(").append(((DERGeneralizedTime)asn1primitive).c()).append(") ").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof BERApplicationSpecific)
        {
            stringbuffer.append(a("BER", s, flag, asn1primitive, s4));
            return;
        }
        if (asn1primitive instanceof DERApplicationSpecific)
        {
            stringbuffer.append(a("DER", s, flag, asn1primitive, s4));
            return;
        }
        if (asn1primitive instanceof DEREnumerated)
        {
            asn1primitive = (DEREnumerated)asn1primitive;
            stringbuffer.append((new StringBuilder()).append(s).append("DER Enumerated(").append(asn1primitive.c()).append(")").append(s4).toString());
            return;
        }
        if (asn1primitive instanceof DERExternal)
        {
            asn1primitive = (DERExternal)asn1primitive;
            stringbuffer.append((new StringBuilder()).append(s).append("External ").append(s4).toString());
            s = (new StringBuilder()).append(s).append("    ").toString();
            if (asn1primitive.d() != null)
            {
                stringbuffer.append((new StringBuilder()).append(s).append("Direct Reference: ").append(asn1primitive.d().c()).append(s4).toString());
            }
            if (asn1primitive.k() != null)
            {
                stringbuffer.append((new StringBuilder()).append(s).append("Indirect Reference: ").append(asn1primitive.k().toString()).append(s4).toString());
            }
            if (asn1primitive.c() != null)
            {
                a(s, flag, asn1primitive.c(), stringbuffer);
            }
            stringbuffer.append((new StringBuilder()).append(s).append("Encoding: ").append(asn1primitive.e()).append(s4).toString());
            asn1primitive = asn1primitive.j();
        } else
        {
            stringbuffer.append((new StringBuilder()).append(s).append(asn1primitive.toString()).append(s4).toString());
            return;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }
}
