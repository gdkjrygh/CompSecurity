.class public Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;
.super Ljava/security/SignatureSpi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA512withRSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA384withRSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA256withRSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA224withRSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$SHA1withRSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$PSSwithRSA;,
        Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$nonePSS;
    }
.end annotation


# instance fields
.field private a:Ljava/security/AlgorithmParameters;

.field private b:Ljava/security/spec/PSSParameterSpec;

.field private c:Ljava/security/spec/PSSParameterSpec;

.field private d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

.field private e:Lorg/spongycastle/crypto/Digest;

.field private f:Lorg/spongycastle/crypto/Digest;

.field private g:I

.field private h:B

.field private i:Z

.field private j:Lorg/spongycastle/crypto/signers/PSSSigner;


# direct methods
.method protected constructor <init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Ljava/security/spec/PSSParameterSpec;)V
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Ljava/security/spec/PSSParameterSpec;Z)V

    .line 71
    return-void
.end method

.method protected constructor <init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Ljava/security/spec/PSSParameterSpec;Z)V
    .locals 1

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/security/SignatureSpi;-><init>()V

    .line 79
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    .line 80
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->c:Ljava/security/spec/PSSParameterSpec;

    .line 82
    if-nez p2, :cond_0

    .line 84
    sget-object v0, Ljava/security/spec/PSSParameterSpec;->DEFAULT:Ljava/security/spec/PSSParameterSpec;

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    .line 91
    :goto_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/PSSParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/util/DigestFactory;->a(Ljava/lang/String;)Lorg/spongycastle/crypto/Digest;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->f:Lorg/spongycastle/crypto/Digest;

    .line 92
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/PSSParameterSpec;->getSaltLength()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->g:I

    .line 93
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/PSSParameterSpec;->getTrailerField()I

    move-result v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a(I)B

    move-result v0

    iput-byte v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->h:B

    .line 94
    iput-boolean p3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->i:Z

    .line 96
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a()V

    .line 97
    return-void

    .line 88
    :cond_0
    iput-object p2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    goto :goto_0
.end method

.method private static a(I)B
    .locals 2

    .prologue
    .line 45
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    .line 47
    const/16 v0, -0x44

    return v0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown trailer field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 55
    iget-boolean v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->i:Z

    if-eqz v0, :cond_0

    .line 57
    new-instance v0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->f:Lorg/spongycastle/crypto/Digest;

    invoke-direct {v0, p0, v1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi$a;-><init>(Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;Lorg/spongycastle/crypto/Digest;)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->e:Lorg/spongycastle/crypto/Digest;

    .line 63
    :goto_0
    return-void

    .line 61
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->f:Lorg/spongycastle/crypto/Digest;

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->e:Lorg/spongycastle/crypto/Digest;

    goto :goto_0
.end method


# virtual methods
.method protected engineGetParameter(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 263
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineGetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineGetParameters()Ljava/security/AlgorithmParameters;
    .locals 2

    .prologue
    .line 231
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a:Ljava/security/AlgorithmParameters;

    if-nez v0, :cond_0

    .line 233
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    if-eqz v0, :cond_0

    .line 237
    :try_start_0
    const-string v0, "PSS"

    sget-object v1, Lorg/spongycastle/jce/provider/BouncyCastleProvider;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a:Ljava/security/AlgorithmParameters;

    .line 238
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a:Ljava/security/AlgorithmParameters;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a:Ljava/security/AlgorithmParameters;

    return-object v0

    .line 240
    :catch_0
    move-exception v0

    .line 242
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;)V
    .locals 6

    .prologue
    .line 131
    instance-of v0, p1, Ljava/security/interfaces/RSAPrivateKey;

    if-nez v0, :cond_0

    .line 133
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "Supplied key is not a RSAPrivateKey instance"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 136
    :cond_0
    new-instance v0, Lorg/spongycastle/crypto/signers/PSSSigner;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->e:Lorg/spongycastle/crypto/Digest;

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->f:Lorg/spongycastle/crypto/Digest;

    iget v4, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->g:I

    iget-byte v5, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->h:B

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/signers/PSSSigner;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/Digest;IB)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    .line 137
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    const/4 v1, 0x1

    check-cast p1, Ljava/security/interfaces/RSAPrivateKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPrivateKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/spongycastle/crypto/signers/PSSSigner;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 138
    return-void
.end method

.method protected engineInitSign(Ljava/security/PrivateKey;Ljava/security/SecureRandom;)V
    .locals 6

    .prologue
    .line 118
    instance-of v0, p1, Ljava/security/interfaces/RSAPrivateKey;

    if-nez v0, :cond_0

    .line 120
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "Supplied key is not a RSAPrivateKey instance"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 123
    :cond_0
    new-instance v0, Lorg/spongycastle/crypto/signers/PSSSigner;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->e:Lorg/spongycastle/crypto/Digest;

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->f:Lorg/spongycastle/crypto/Digest;

    iget v4, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->g:I

    iget-byte v5, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->h:B

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/signers/PSSSigner;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/Digest;IB)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    .line 124
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    const/4 v1, 0x1

    new-instance v2, Lorg/spongycastle/crypto/params/ParametersWithRandom;

    check-cast p1, Ljava/security/interfaces/RSAPrivateKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPrivateKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v3

    invoke-direct {v2, v3, p2}, Lorg/spongycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/spongycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    invoke-virtual {v0, v1, v2}, Lorg/spongycastle/crypto/signers/PSSSigner;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 125
    return-void
.end method

.method protected engineInitVerify(Ljava/security/PublicKey;)V
    .locals 6

    .prologue
    .line 103
    instance-of v0, p1, Ljava/security/interfaces/RSAPublicKey;

    if-nez v0, :cond_0

    .line 105
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "Supplied key is not a RSAPublicKey instance"

    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :cond_0
    new-instance v0, Lorg/spongycastle/crypto/signers/PSSSigner;

    iget-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->d:Lorg/spongycastle/crypto/AsymmetricBlockCipher;

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->e:Lorg/spongycastle/crypto/Digest;

    iget-object v3, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->f:Lorg/spongycastle/crypto/Digest;

    iget v4, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->g:I

    iget-byte v5, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->h:B

    invoke-direct/range {v0 .. v5}, Lorg/spongycastle/crypto/signers/PSSSigner;-><init>(Lorg/spongycastle/crypto/AsymmetricBlockCipher;Lorg/spongycastle/crypto/Digest;Lorg/spongycastle/crypto/Digest;IB)V

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    .line 109
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    const/4 v1, 0x0

    check-cast p1, Ljava/security/interfaces/RSAPublicKey;

    invoke-static {p1}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/RSAUtil;->a(Ljava/security/interfaces/RSAPublicKey;)Lorg/spongycastle/crypto/params/RSAKeyParameters;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/spongycastle/crypto/signers/PSSSigner;->a(ZLorg/spongycastle/crypto/CipherParameters;)V

    .line 111
    return-void
.end method

.method protected engineSetParameter(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 257
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "engineSetParameter unsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSetParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 4

    .prologue
    .line 180
    instance-of v0, p1, Ljava/security/spec/PSSParameterSpec;

    if-eqz v0, :cond_5

    .line 182
    check-cast p1, Ljava/security/spec/PSSParameterSpec;

    .line 184
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->c:Ljava/security/spec/PSSParameterSpec;

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->c:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/PSSParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/security/spec/PSSParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/spongycastle/jcajce/provider/util/DigestFactory;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 188
    new-instance v0, Ljava/security/InvalidParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "parameter must be using "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->c:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v2}, Ljava/security/spec/PSSParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_0
    invoke-virtual {p1}, Ljava/security/spec/PSSParameterSpec;->getMGFAlgorithm()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MGF1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/security/spec/PSSParameterSpec;->getMGFAlgorithm()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lorg/spongycastle/asn1/pkcs/PKCSObjectIdentifiers;->H_:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 193
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "unknown mask generation function specified"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 196
    :cond_1
    invoke-virtual {p1}, Ljava/security/spec/PSSParameterSpec;->getMGFParameters()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    instance-of v0, v0, Ljava/security/spec/MGF1ParameterSpec;

    if-nez v0, :cond_2

    .line 198
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "unkown MGF parameters"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 201
    :cond_2
    invoke-virtual {p1}, Ljava/security/spec/PSSParameterSpec;->getMGFParameters()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v0

    check-cast v0, Ljava/security/spec/MGF1ParameterSpec;

    .line 203
    invoke-virtual {v0}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/security/spec/PSSParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/spongycastle/jcajce/provider/util/DigestFactory;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 205
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "digest algorithm for MGF should be the same as for PSS parameters."

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_3
    invoke-virtual {v0}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/jcajce/provider/util/DigestFactory;->a(Ljava/lang/String;)Lorg/spongycastle/crypto/Digest;

    move-result-object v1

    .line 210
    if-nez v1, :cond_4

    .line 212
    new-instance v1, Ljava/security/InvalidParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no match on MGF digest algorithm: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/security/spec/MGF1ParameterSpec;->getDigestAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 215
    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a:Ljava/security/AlgorithmParameters;

    .line 216
    iput-object p1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    .line 217
    iput-object v1, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->f:Lorg/spongycastle/crypto/Digest;

    .line 218
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/PSSParameterSpec;->getSaltLength()I

    move-result v0

    iput v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->g:I

    .line 219
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->b:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0}, Ljava/security/spec/PSSParameterSpec;->getTrailerField()I

    move-result v0

    invoke-static {v0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a(I)B

    move-result v0

    iput-byte v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->h:B

    .line 221
    invoke-direct {p0}, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->a()V

    .line 222
    return-void

    .line 225
    :cond_5
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "Only PSSParameterSpec supported"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected engineSign()[B
    .locals 2

    .prologue
    .line 161
    :try_start_0
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/signers/PSSSigner;->a()[B
    :try_end_0
    .catch Lorg/spongycastle/crypto/CryptoException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 163
    :catch_0
    move-exception v0

    .line 165
    new-instance v1, Ljava/security/SignatureException;

    invoke-virtual {v0}, Lorg/spongycastle/crypto/CryptoException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected engineUpdate(B)V
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    invoke-virtual {v0, p1}, Lorg/spongycastle/crypto/signers/PSSSigner;->a(B)V

    .line 145
    return-void
.end method

.method protected engineUpdate([BII)V
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    invoke-virtual {v0, p1, p2, p3}, Lorg/spongycastle/crypto/signers/PSSSigner;->a([BII)V

    .line 154
    return-void
.end method

.method protected engineVerify([B)Z
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lorg/spongycastle/jcajce/provider/asymmetric/rsa/PSSSignatureSpi;->j:Lorg/spongycastle/crypto/signers/PSSSigner;

    invoke-virtual {v0, p1}, Lorg/spongycastle/crypto/signers/PSSSigner;->a([B)Z

    move-result v0

    return v0
.end method
