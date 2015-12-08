.class Lorg/bouncycastle/crypto/tls/i;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsKeyExchange;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

.field protected b:I

.field protected c:Lorg/bouncycastle/crypto/tls/p;

.field protected d:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

.field protected e:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

.field protected f:Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;

.field protected g:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->g:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    packed-switch p2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unsupported key exchange algorithm"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Lorg/bouncycastle/crypto/tls/n;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/n;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->c:Lorg/bouncycastle/crypto/tls/p;

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/i;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    iput p2, p0, Lorg/bouncycastle/crypto/tls/i;->b:I

    return-void

    :pswitch_1
    new-instance v0, Lorg/bouncycastle/crypto/tls/j;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/j;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->c:Lorg/bouncycastle/crypto/tls/p;

    goto :goto_0

    :pswitch_2
    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->c:Lorg/bouncycastle/crypto/tls/p;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected areOnSameCurve(Lorg/bouncycastle/crypto/params/ECDomainParameters;Lorg/bouncycastle/crypto/params/ECDomainParameters;)Z
    .locals 2

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/bouncycastle/math/ec/ECPoint;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getN()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getN()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getH()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getH()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected calculateECDHBasicAgreement(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;)[B
    .locals 1

    new-instance v0, Lorg/bouncycastle/crypto/agreement/ECDHBasicAgreement;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/agreement/ECDHBasicAgreement;-><init>()V

    invoke-virtual {v0, p2}, Lorg/bouncycastle/crypto/agreement/ECDHBasicAgreement;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    invoke-virtual {v0, p1}, Lorg/bouncycastle/crypto/agreement/ECDHBasicAgreement;->calculateAgreement(Lorg/bouncycastle/crypto/CipherParameters;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/BigIntegers;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0
.end method

.method protected externalizeKey(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)[B
    .locals 1

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;->getQ()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECPoint;->f()[B

    move-result-object v0

    return-object v0
.end method

.method public generateClientKeyExchange(Ljava/io/OutputStream;)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->f:Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint24(ILjava/io/OutputStream;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->e:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;->getParameters()Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lorg/bouncycastle/crypto/tls/i;->generateEphemeralClientKeyExchange(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/io/OutputStream;)V

    goto :goto_0
.end method

.method protected generateECKeyPair(Lorg/bouncycastle/crypto/params/ECDomainParameters;)Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;
    .locals 3

    new-instance v0, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;-><init>()V

    new-instance v1, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/i;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lorg/bouncycastle/crypto/params/ECKeyGenerationParameters;-><init>(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/security/SecureRandom;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;->init(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/generators/ECKeyPairGenerator;->generateKeyPair()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v0

    return-object v0
.end method

.method protected generateEphemeralClientKeyExchange(Lorg/bouncycastle/crypto/params/ECDomainParameters;Ljava/io/OutputStream;)V
    .locals 2

    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/tls/i;->generateECKeyPair(Lorg/bouncycastle/crypto/params/ECDomainParameters;)Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPrivate()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->g:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;->getPublic()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/i;->externalizeKey(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)[B

    move-result-object v0

    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1, p2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint24(ILjava/io/OutputStream;)V

    invoke-static {v0, p2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque8([BLjava/io/OutputStream;)V

    return-void
.end method

.method public generatePremasterSecret()[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->f:Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->f:Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/i;->e:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;->generateAgreement(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->e:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/i;->g:Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/crypto/tls/i;->calculateECDHBasicAgreement(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;)[B

    move-result-object v0

    goto :goto_0
.end method

.method public processClientCredentials(Lorg/bouncycastle/crypto/tls/TlsCredentials;)V
    .locals 2

    instance-of v0, p1, Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;

    if-eqz v0, :cond_1

    check-cast p1, Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/i;->f:Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;

    :cond_0
    return-void

    :cond_1
    instance-of v0, p1, Lorg/bouncycastle/crypto/tls/TlsSignerCredentials;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public processServerCertificate(Lorg/bouncycastle/crypto/tls/Certificate;)V
    .locals 4

    const/16 v3, 0x2e

    iget-object v0, p1, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    const/4 v1, 0x0

    aget-object v1, v0, v1

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->l()Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lorg/bouncycastle/crypto/util/PublicKeyFactory;->createKey(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->d:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->c:Lorg/bouncycastle/crypto/tls/p;

    if-nez v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->d:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    check-cast v0, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-virtual {p0, v0}, Lorg/bouncycastle/crypto/tls/i;->validateECPublicKey(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->e:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v0, 0x8

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->validateKeyUsage(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;I)V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2b

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :catch_1
    move-exception v0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {v0, v3}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->c:Lorg/bouncycastle/crypto/tls/p;

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/i;->d:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    invoke-interface {v0, v2}, Lorg/bouncycastle/crypto/tls/p;->isValidPublicKey(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {v0, v3}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_1
    const/16 v0, 0x80

    invoke-static {v1, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->validateKeyUsage(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;I)V

    goto :goto_0
.end method

.method public processServerKeyExchange(Ljava/io/InputStream;)V
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public skipClientCredentials()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/i;->f:Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;

    return-void
.end method

.method public skipServerCertificate()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public skipServerKeyExchange()V
    .locals 0

    return-void
.end method

.method public validateCertificateRequest(Lorg/bouncycastle/crypto/tls/CertificateRequest;)V
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
        0x41 -> :sswitch_0
        0x42 -> :sswitch_0
    .end sparse-switch
.end method

.method protected validateECPublicKey(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;
    .locals 0

    return-object p1
.end method
