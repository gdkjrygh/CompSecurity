// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.ocsp;

import java.io.IOException;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.ocsp.OCSPResponseStatus;
import org.bouncycastle.asn1.ocsp.ResponseBytes;

// Referenced classes of package org.bouncycastle.ocsp:
//            OCSPException, OCSPResp, BasicOCSPResp

public class OCSPRespGenerator
{

    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;

    public OCSPRespGenerator()
    {
    }

    public OCSPResp generate(int i, Object obj)
        throws OCSPException
    {
        if (obj == null)
        {
            return new OCSPResp(new OCSPResponse(new OCSPResponseStatus(i), null));
        }
        if (obj instanceof BasicOCSPResp)
        {
            obj = (BasicOCSPResp)obj;
            try
            {
                obj = new DEROctetString(((BasicOCSPResp) (obj)).getEncoded());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new OCSPException("can't encode object.", ((Exception) (obj)));
            }
            obj = new ResponseBytes(OCSPObjectIdentifiers.id_pkix_ocsp_basic, ((org.bouncycastle.asn1.ASN1OctetString) (obj)));
            return new OCSPResp(new OCSPResponse(new OCSPResponseStatus(i), ((ResponseBytes) (obj))));
        } else
        {
            throw new OCSPException("unknown response object");
        }
    }
}
