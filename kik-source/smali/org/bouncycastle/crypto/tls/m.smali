.class final Lorg/bouncycastle/crypto/tls/m;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsKeyExchange;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

.field protected b:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

.field protected c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

.field protected d:[B


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->b:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/m;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    return-void
.end method


# virtual methods
.method public final generateClientKeyExchange(Ljava/io/OutputStream;)V
    .locals 5

    const/4 v2, 0x0

    const/16 v0, 0x30

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->d:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/m;->d:[B

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->d:[B

    invoke-static {v0, v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeVersion([BI)V

    new-instance v0, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;

    new-instance v1, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;

    invoke-direct {v1}, Lorg/bouncycastle/crypto/engines/RSABlindedEngine;-><init>()V

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;-><init>(Lorg/bouncycastle/crypto/AsymmetricBlockCipher;)V

    const/4 v1, 0x1

    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    iget-object v3, p0, Lorg/bouncycastle/crypto/tls/m;->c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/m;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-interface {v4}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;-><init>(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V

    invoke-virtual {v0, v1, v2}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/m;->d:[B

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/bouncycastle/crypto/tls/m;->d:[B

    array-length v3, v3

    invoke-virtual {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;->processBlock([BII)[B

    move-result-object v0

    array-length v1, v0

    add-int/lit8 v1, v1, 0x2

    invoke-static {v1, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint24(ILjava/io/OutputStream;)V

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque16([BLjava/io/OutputStream;)V
    :try_end_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public final generatePremasterSecret()[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->d:[B

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/m;->d:[B

    return-object v0
.end method

.method public final processClientCredentials(Lorg/bouncycastle/crypto/tls/TlsCredentials;)V
    .locals 2

    instance-of v0, p1, Lorg/bouncycastle/crypto/tls/TlsSignerCredentials;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    return-void
.end method

.method public final processServerCertificate(Lorg/bouncycastle/crypto/tls/Certificate;)V
    .locals 2

    iget-object v0, p1, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    const/4 v1, 0x0

    aget-object v1, v0, v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->l()Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lorg/bouncycastle/crypto/util/PublicKeyFactory;->createKey(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->b:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->b:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;->isPrivate()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2b

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->b:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    check-cast v0, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/m;->validateRSAPublicKey(Lorg/bouncycastle/crypto/params/RSAKeyParameters;)Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/m;->c:Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    const/16 v0, 0x20

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->validateKeyUsage(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;I)V

    return-void
.end method

.method public final processServerKeyExchange(Ljava/io/InputStream;)V
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public final skipClientCredentials()V
    .locals 0

    return-void
.end method

.method public final skipServerCertificate()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public final skipServerKeyExchange()V
    .locals 0

    return-void
.end method

.method public final validateCertificateRequest(Lorg/bouncycastle/crypto/tls/CertificateRequest;)V
    .locals 3

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/tls/CertificateRequest;->getCertificateTypes()[S

    move-result-object v1

    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-short v2, v1, v0

    sparse-switch v2, :sswitch_data_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2f

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :sswitch_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
        0x40 -> :sswitch_0
    .end sparse-switch
.end method

.method protected final validateRSAPublicKey(Lorg/bouncycastle/crypto/params/RSAKeyParameters;)Lorg/bouncycastle/crypto/params/RSAKeyParameters;
    .locals 2

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/RSAKeyParameters;->getExponent()Ljava/math/BigInteger;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2f

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    return-object p1
.end method
