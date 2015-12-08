.class public Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/tls/Certificate;

.field protected b:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

.field protected c:Lorg/bouncycastle/crypto/BasicAgreement;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/tls/Certificate;Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'clientCertificate\' cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p1, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    array-length v0, v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'clientCertificate\' cannot be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-nez p2, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'clientPrivateKey\' cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;->isPrivate()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'clientPrivateKey\' must be private"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;

    if-eqz v0, :cond_4

    new-instance v0, Lorg/bouncycastle/crypto/agreement/DHBasicAgreement;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/agreement/DHBasicAgreement;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;->c:Lorg/bouncycastle/crypto/BasicAgreement;

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;->a:Lorg/bouncycastle/crypto/tls/Certificate;

    iput-object p2, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;->b:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    return-void

    :cond_4
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    if-eqz v0, :cond_5

    new-instance v0, Lorg/bouncycastle/crypto/agreement/ECDHBasicAgreement;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/agreement/ECDHBasicAgreement;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;->c:Lorg/bouncycastle/crypto/BasicAgreement;

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\'clientPrivateKey\' type not supported: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public generateAgreement(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)[B
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;->c:Lorg/bouncycastle/crypto/BasicAgreement;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;->b:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/BasicAgreement;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;->c:Lorg/bouncycastle/crypto/BasicAgreement;

    invoke-interface {v0, p1}, Lorg/bouncycastle/crypto/BasicAgreement;->calculateAgreement(Lorg/bouncycastle/crypto/CipherParameters;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/BigIntegers;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    return-object v0
.end method

.method public getCertificate()Lorg/bouncycastle/crypto/tls/Certificate;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsAgreementCredentials;->a:Lorg/bouncycastle/crypto/tls/Certificate;

    return-object v0
.end method
