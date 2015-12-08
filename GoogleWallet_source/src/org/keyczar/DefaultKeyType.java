// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.util.Arrays;
import java.util.List;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.UnsupportedTypeException;
import org.keyczar.interfaces.KeyType;
import org.keyczar.keyparams.AesKeyParameters;
import org.keyczar.keyparams.KeyParameters;
import org.keyczar.keyparams.RsaKeyParameters;

// Referenced classes of package org.keyczar:
//            AesKey, HmacKey, DsaPrivateKey, DsaPublicKey, 
//            RsaPrivateKey, RsaPublicKey, KeyczarKey

public final class DefaultKeyType extends Enum
    implements KeyType
{
    final class DefaultKeyBuilder
        implements org.keyczar.interfaces.KeyType.Builder
    {

        final DefaultKeyType this$0;

        public final KeyczarKey read(String s)
            throws KeyczarException
        {
            static final class _cls1
            {

                static final int $SwitchMap$org$keyczar$DefaultKeyType[];

                static 
                {
                    $SwitchMap$org$keyczar$DefaultKeyType = new int[DefaultKeyType.values().length];
                    try
                    {
                        $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.RSA_PRIV.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.AES.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.HMAC_SHA1.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.DSA_PRIV.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.DSA_PUB.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$org$keyczar$DefaultKeyType[DefaultKeyType.RSA_PUB.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.org.keyczar.DefaultKeyType[ordinal()])
            {
            default:
                throw new UnsupportedTypeException(DefaultKeyType.this);

            case 2: // '\002'
                return AesKey.read(s);

            case 3: // '\003'
                return HmacKey.read(s);

            case 4: // '\004'
                return DsaPrivateKey.read(s);

            case 5: // '\005'
                return DsaPublicKey.read(s);

            case 1: // '\001'
                return RsaPrivateKey.read(s);

            case 6: // '\006'
                return RsaPublicKey.read(s);
            }
        }

        private DefaultKeyBuilder()
        {
            this$0 = DefaultKeyType.this;
            super();
        }

    }

    final class DefaultingAesKeyParameters extends DefaultingKeyParameters
        implements AesKeyParameters
    {

        final DefaultKeyType this$0;

        public final HmacKey getHmacKey()
            throws KeyczarException
        {
            return HmacKey.generate(DefaultKeyType.HMAC_SHA1.applyDefaultParameters(null));
        }

        public DefaultingAesKeyParameters(KeyParameters keyparameters)
        {
            this$0 = DefaultKeyType.this;
            super(keyparameters);
        }
    }

    class DefaultingKeyParameters
        implements KeyParameters
    {

        protected final KeyParameters baseParameters;
        final DefaultKeyType this$0;

        public final int getKeySize()
            throws KeyczarException
        {
            if (baseParameters == null || baseParameters.getKeySize() == -1)
            {
                return ((Integer)acceptableSizes.get(0)).intValue();
            } else
            {
                return baseParameters.getKeySize();
            }
        }

        public DefaultingKeyParameters(KeyParameters keyparameters)
        {
            this$0 = DefaultKeyType.this;
            super();
            baseParameters = keyparameters;
        }
    }

    final class DefaultingRsaKeyParameters extends DefaultingKeyParameters
        implements RsaKeyParameters
    {

        final DefaultKeyType this$0;

        public DefaultingRsaKeyParameters(KeyParameters keyparameters)
        {
            this$0 = DefaultKeyType.this;
            super(keyparameters);
        }
    }


    private static final DefaultKeyType $VALUES[];
    public static final DefaultKeyType AES;
    public static final DefaultKeyType DSA_PRIV;
    public static final DefaultKeyType DSA_PUB;
    public static final DefaultKeyType EC_PRIV;
    public static final DefaultKeyType EC_PUB;
    public static final DefaultKeyType HMAC_SHA1;
    public static final DefaultKeyType RSA_PRIV;
    public static final DefaultKeyType RSA_PUB;
    public static final DefaultKeyType TEST;
    private final List acceptableSizes;

    private DefaultKeyType(String s, int i, List list)
    {
        super(s, i);
        acceptableSizes = list;
    }

    public static DefaultKeyType valueOf(String s)
    {
        return (DefaultKeyType)Enum.valueOf(org/keyczar/DefaultKeyType, s);
    }

    public static DefaultKeyType[] values()
    {
        return (DefaultKeyType[])$VALUES.clone();
    }

    public final KeyParameters applyDefaultParameters(KeyParameters keyparameters)
    {
        switch (_cls1..SwitchMap.org.keyczar.DefaultKeyType[ordinal()])
        {
        default:
            return new DefaultingKeyParameters(keyparameters);

        case 1: // '\001'
            return new DefaultingRsaKeyParameters(keyparameters);

        case 2: // '\002'
            return new DefaultingAesKeyParameters(keyparameters);
        }
    }

    public final org.keyczar.interfaces.KeyType.Builder getBuilder()
    {
        return new DefaultKeyBuilder(null);
    }

    public final String getName()
    {
        return name();
    }

    final boolean isAcceptableSize(int i)
    {
        return acceptableSizes.contains(Integer.valueOf(i));
    }

    static 
    {
        AES = new DefaultKeyType("AES", 0, Arrays.asList(new Integer[] {
            Integer.valueOf(128), Integer.valueOf(192), Integer.valueOf(256)
        }));
        HMAC_SHA1 = new DefaultKeyType("HMAC_SHA1", 1, Arrays.asList(new Integer[] {
            Integer.valueOf(256)
        }));
        DSA_PRIV = new DefaultKeyType("DSA_PRIV", 2, Arrays.asList(new Integer[] {
            Integer.valueOf(1024)
        }));
        DSA_PUB = new DefaultKeyType("DSA_PUB", 3, Arrays.asList(new Integer[] {
            Integer.valueOf(1024)
        }));
        RSA_PRIV = new DefaultKeyType("RSA_PRIV", 4, Arrays.asList(new Integer[] {
            Integer.valueOf(4096), Integer.valueOf(2048), Integer.valueOf(1024)
        }));
        RSA_PUB = new DefaultKeyType("RSA_PUB", 5, Arrays.asList(new Integer[] {
            Integer.valueOf(4096), Integer.valueOf(2048), Integer.valueOf(1024)
        }));
        EC_PRIV = new DefaultKeyType("EC_PRIV", 6, Arrays.asList(new Integer[] {
            Integer.valueOf(256), Integer.valueOf(384), Integer.valueOf(521), Integer.valueOf(192)
        }));
        EC_PUB = new DefaultKeyType("EC_PUB", 7, Arrays.asList(new Integer[] {
            Integer.valueOf(256), Integer.valueOf(384), Integer.valueOf(521), Integer.valueOf(192)
        }));
        TEST = new DefaultKeyType("TEST", 8, Arrays.asList(new Integer[] {
            Integer.valueOf(1)
        }));
        $VALUES = (new DefaultKeyType[] {
            AES, HMAC_SHA1, DSA_PRIV, DSA_PUB, RSA_PRIV, RSA_PUB, EC_PRIV, EC_PUB, TEST
        });
    }

}
