.class public Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsSignerCredentials;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

.field protected b:Lorg/bouncycastle/crypto/tls/Certificate;

.field protected c:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

.field protected d:Lorg/bouncycastle/crypto/tls/p;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;Lorg/bouncycastle/crypto/tls/Certificate;Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'clientCertificate\' cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p2, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    array-length v0, v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'clientCertificate\' cannot be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-nez p3, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'clientPrivateKey\' cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p3}, Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;->isPrivate()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'clientPrivateKey\' must be private"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v0, p3, Lorg/bouncycastle/crypto/params/RSAKeyParameters;

    if-eqz v0, :cond_4

    new-instance v0, Lorg/bouncycastle/crypto/tls/n;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/n;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->d:Lorg/bouncycastle/crypto/tls/p;

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    iput-object p2, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->b:Lorg/bouncycastle/crypto/tls/Certificate;

    iput-object p3, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->c:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    return-void

    :cond_4
    instance-of v0, p3, Lorg/bouncycastle/crypto/params/DSAPrivateKeyParameters;

    if-eqz v0, :cond_5

    new-instance v0, Lorg/bouncycastle/crypto/tls/g;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/g;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->d:Lorg/bouncycastle/crypto/tls/p;

    goto :goto_0

    :cond_5
    instance-of v0, p3, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    if-eqz v0, :cond_6

    new-instance v0, Lorg/bouncycastle/crypto/tls/j;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/j;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->d:Lorg/bouncycastle/crypto/tls/p;

    goto :goto_0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\'clientPrivateKey\' type not supported: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
.method public generateCertificateSignature([B)[B
    .locals 3

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->d:Lorg/bouncycastle/crypto/tls/p;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->c:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    invoke-interface {v0, v1, v2, p1}, Lorg/bouncycastle/crypto/tls/p;->calculateRawSignature(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;[B)[B
    :try_end_0
    .catch Lorg/bouncycastle/crypto/CryptoException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public getCertificate()Lorg/bouncycastle/crypto/tls/Certificate;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DefaultTlsSignerCredentials;->b:Lorg/bouncycastle/crypto/tls/Certificate;

    return-object v0
.end method
