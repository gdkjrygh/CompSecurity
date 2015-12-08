// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.enums;

import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.util.Util;

public final class RsaPadding extends Enum
{

    private static final RsaPadding $VALUES[];
    public static final RsaPadding OAEP;
    public static final RsaPadding PKCS;
    private final String cryptAlgorithm;

    private RsaPadding(String s, int i, String s1)
    {
        super(s, i);
        cryptAlgorithm = s1;
    }

    public static RsaPadding valueOf(String s)
    {
        return (RsaPadding)Enum.valueOf(org/keyczar/enums/RsaPadding, s);
    }

    public static RsaPadding[] values()
    {
        return (RsaPadding[])$VALUES.clone();
    }

    public final byte[] computeFullHash(RSAPublicKey rsapublickey)
        throws KeyczarException
    {
        static final class _cls1
        {

            static final int $SwitchMap$org$keyczar$enums$RsaPadding[];

            static 
            {
                $SwitchMap$org$keyczar$enums$RsaPadding = new int[RsaPadding.values().length];
                try
                {
                    $SwitchMap$org$keyczar$enums$RsaPadding[RsaPadding.OAEP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$keyczar$enums$RsaPadding[RsaPadding.PKCS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.org.keyczar.enums.RsaPadding[ordinal()])
        {
        default:
            throw new KeyczarException("Bug! Unknown padding type");

        case 1: // '\001'
            return Util.prefixHash(new byte[][] {
                Util.stripLeadingZeros(rsapublickey.getModulus().toByteArray()), Util.stripLeadingZeros(rsapublickey.getPublicExponent().toByteArray())
            });

        case 2: // '\002'
            return Util.prefixHash(new byte[][] {
                rsapublickey.getModulus().toByteArray(), rsapublickey.getPublicExponent().toByteArray()
            });
        }
    }

    public final String getCryptAlgorithm()
    {
        return cryptAlgorithm;
    }

    static 
    {
        OAEP = new RsaPadding("OAEP", 0, "RSA/ECB/OAEPWITHSHA1ANDMGF1PADDING");
        PKCS = new RsaPadding("PKCS", 1, "RSA/ECB/PKCS1PADDING");
        $VALUES = (new RsaPadding[] {
            OAEP, PKCS
        });
    }
}
