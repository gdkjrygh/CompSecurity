// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.generators.ElGamalParametersGenerator;
import org.bouncycastle.crypto.generators.GOST3410ParametersGenerator;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BouncyCastleProvider

public abstract class JDKAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi
{
    public static class DES extends JDKAlgorithmParameterGenerator
    {

        protected AlgorithmParameters engineGenerateParameters()
        {
            byte abyte0[] = new byte[8];
            if (a == null)
            {
                a = new SecureRandom();
            }
            a.nextBytes(abyte0);
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("DES", BouncyCastleProvider.a);
                algorithmparameters.init(new IvParameterSpec(abyte0));
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }

        public DES()
        {
        }
    }

    public static class DH extends JDKAlgorithmParameterGenerator
    {

        private int c;

        protected AlgorithmParameters engineGenerateParameters()
        {
            Object obj = new DHParametersGenerator();
            AlgorithmParameters algorithmparameters;
            if (a != null)
            {
                ((DHParametersGenerator) (obj)).init(b, 20, a);
            } else
            {
                ((DHParametersGenerator) (obj)).init(b, 20, new SecureRandom());
            }
            obj = ((DHParametersGenerator) (obj)).generateParameters();
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("DH", BouncyCastleProvider.a);
                algorithmparameters.init(new DHParameterSpec(((DHParameters) (obj)).getP(), ((DHParameters) (obj)).getG(), c));
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            if (!(algorithmparameterspec instanceof DHGenParameterSpec))
            {
                throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
            } else
            {
                algorithmparameterspec = (DHGenParameterSpec)algorithmparameterspec;
                b = algorithmparameterspec.getPrimeSize();
                c = algorithmparameterspec.getExponentSize();
                a = securerandom;
                return;
            }
        }

        public DH()
        {
            c = 0;
        }
    }

    public static class DSA extends JDKAlgorithmParameterGenerator
    {

        protected AlgorithmParameters engineGenerateParameters()
        {
            Object obj = new DSAParametersGenerator();
            AlgorithmParameters algorithmparameters;
            if (a != null)
            {
                ((DSAParametersGenerator) (obj)).init(b, 20, a);
            } else
            {
                ((DSAParametersGenerator) (obj)).init(b, 20, new SecureRandom());
            }
            obj = ((DSAParametersGenerator) (obj)).generateParameters();
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("DSA", BouncyCastleProvider.a);
                algorithmparameters.init(new DSAParameterSpec(((DSAParameters) (obj)).getP(), ((DSAParameters) (obj)).getQ(), ((DSAParameters) (obj)).getG()));
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(int i, SecureRandom securerandom)
        {
            if (i < 512 || i > 1024 || i % 64 != 0)
            {
                throw new InvalidParameterException("strength must be from 512 - 1024 and a multiple of 64");
            } else
            {
                b = i;
                a = securerandom;
                return;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
        }

        public DSA()
        {
        }
    }

    public static class ElGamal extends JDKAlgorithmParameterGenerator
    {

        private int c;

        protected AlgorithmParameters engineGenerateParameters()
        {
            Object obj = new ElGamalParametersGenerator();
            AlgorithmParameters algorithmparameters;
            if (a != null)
            {
                ((ElGamalParametersGenerator) (obj)).init(b, 20, a);
            } else
            {
                ((ElGamalParametersGenerator) (obj)).init(b, 20, new SecureRandom());
            }
            obj = ((ElGamalParametersGenerator) (obj)).generateParameters();
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("ElGamal", BouncyCastleProvider.a);
                algorithmparameters.init(new DHParameterSpec(((ElGamalParameters) (obj)).getP(), ((ElGamalParameters) (obj)).getG(), c));
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            if (!(algorithmparameterspec instanceof DHGenParameterSpec))
            {
                throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
            } else
            {
                algorithmparameterspec = (DHGenParameterSpec)algorithmparameterspec;
                b = algorithmparameterspec.getPrimeSize();
                c = algorithmparameterspec.getExponentSize();
                a = securerandom;
                return;
            }
        }

        public ElGamal()
        {
            c = 0;
        }
    }

    public static class GOST3410 extends JDKAlgorithmParameterGenerator
    {

        protected AlgorithmParameters engineGenerateParameters()
        {
            Object obj = new GOST3410ParametersGenerator();
            AlgorithmParameters algorithmparameters;
            if (a != null)
            {
                ((GOST3410ParametersGenerator) (obj)).init(b, 2, a);
            } else
            {
                ((GOST3410ParametersGenerator) (obj)).init(b, 2, new SecureRandom());
            }
            obj = ((GOST3410ParametersGenerator) (obj)).generateParameters();
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("GOST3410", BouncyCastleProvider.a);
                algorithmparameters.init(new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(((GOST3410Parameters) (obj)).getP(), ((GOST3410Parameters) (obj)).getQ(), ((GOST3410Parameters) (obj)).getA())));
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for GOST3410 parameter generation.");
        }

        public GOST3410()
        {
        }
    }

    public static class RC2 extends JDKAlgorithmParameterGenerator
    {

        RC2ParameterSpec c;

        protected AlgorithmParameters engineGenerateParameters()
        {
            if (c == null)
            {
                byte abyte0[] = new byte[8];
                if (a == null)
                {
                    a = new SecureRandom();
                }
                a.nextBytes(abyte0);
                AlgorithmParameters algorithmparameters1;
                try
                {
                    algorithmparameters1 = AlgorithmParameters.getInstance("RC2", BouncyCastleProvider.a);
                    algorithmparameters1.init(new IvParameterSpec(abyte0));
                }
                catch (Exception exception)
                {
                    throw new RuntimeException(exception.getMessage());
                }
                return algorithmparameters1;
            }
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("RC2", BouncyCastleProvider.a);
                algorithmparameters.init(c);
            }
            catch (Exception exception1)
            {
                throw new RuntimeException(exception1.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            if (algorithmparameterspec instanceof RC2ParameterSpec)
            {
                c = (RC2ParameterSpec)algorithmparameterspec;
                return;
            } else
            {
                throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
            }
        }

        public RC2()
        {
            c = null;
        }
    }


    protected SecureRandom a;
    protected int b;

    public JDKAlgorithmParameterGenerator()
    {
        b = 1024;
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        b = i;
        a = securerandom;
    }
}
