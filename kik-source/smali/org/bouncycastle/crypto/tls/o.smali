.class final Lorg/bouncycastle/crypto/tls/o;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsKeyExchange;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

.field protected b:I

.field protected c:Lorg/bouncycastle/crypto/tls/p;

.field protected d:[B

.field protected e:[B

.field protected f:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

.field protected g:[B

.field protected h:Ljava/math/BigInteger;

.field protected i:Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I[B[B)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->f:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->g:[B

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->h:Ljava/math/BigInteger;

    new-instance v0, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->i:Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;

    packed-switch p2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unsupported key exchange algorithm"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->c:Lorg/bouncycastle/crypto/tls/p;

    :goto_0
    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/o;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    iput p2, p0, Lorg/bouncycastle/crypto/tls/o;->b:I

    iput-object p3, p0, Lorg/bouncycastle/crypto/tls/o;->d:[B

    iput-object p4, p0, Lorg/bouncycastle/crypto/tls/o;->e:[B

    return-void

    :pswitch_1
    new-instance v0, Lorg/bouncycastle/crypto/tls/n;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/n;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->c:Lorg/bouncycastle/crypto/tls/p;

    goto :goto_0

    :pswitch_2
    new-instance v0, Lorg/bouncycastle/crypto/tls/g;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/g;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->c:Lorg/bouncycastle/crypto/tls/p;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final generateClientKeyExchange(Ljava/io/OutputStream;)V
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->i:Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->g:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/o;->d:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/tls/o;->e:[B

    invoke-virtual {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->generateClientCredentials([B[B[B)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/BigIntegers;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    array-length v1, v0

    add-int/lit8 v1, v1, 0x2

    invoke-static {v1, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint24(ILjava/io/OutputStream;)V

    invoke-static {v0, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeOpaque16([BLjava/io/OutputStream;)V

    return-void
.end method

.method public final generatePremasterSecret()[B
    .locals 2

    :try_start_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->i:Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->h:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->calculateSecret(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/util/BigIntegers;->a(Ljava/math/BigInteger;)[B
    :try_end_0
    .catch Lorg/bouncycastle/crypto/CryptoException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2f

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method protected final initSigner(Lorg/bouncycastle/crypto/tls/p;Lorg/bouncycastle/crypto/tls/SecurityParameters;)Lorg/bouncycastle/crypto/Signer;
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->f:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    invoke-interface {p1, v0}, Lorg/bouncycastle/crypto/tls/p;->createVerifyer(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Lorg/bouncycastle/crypto/Signer;

    move-result-object v0

    iget-object v1, p2, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    iget-object v2, p2, Lorg/bouncycastle/crypto/tls/SecurityParameters;->a:[B

    array-length v2, v2

    invoke-interface {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/Signer;->update([BII)V

    iget-object v1, p2, Lorg/bouncycastle/crypto/tls/SecurityParameters;->b:[B

    iget-object v2, p2, Lorg/bouncycastle/crypto/tls/SecurityParameters;->b:[B

    array-length v2, v2

    invoke-interface {v0, v1, v3, v2}, Lorg/bouncycastle/crypto/Signer;->update([BII)V

    return-object v0
.end method

.method public final processClientCredentials(Lorg/bouncycastle/crypto/tls/TlsCredentials;)V
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public final processServerCertificate(Lorg/bouncycastle/crypto/tls/Certificate;)V
    .locals 3

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->c:Lorg/bouncycastle/crypto/tls/p;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    iget-object v0, p1, Lorg/bouncycastle/crypto/tls/Certificate;->b:[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/X509CertificateStructure;->l()Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Lorg/bouncycastle/crypto/util/PublicKeyFactory;->createKey(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->f:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->c:Lorg/bouncycastle/crypto/tls/p;

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/o;->f:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/tls/p;->isValidPublicKey(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2e

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2b

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_1
    const/16 v1, 0x80

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->validateKeyUsage(Lorg/bouncycastle/asn1/x509/X509CertificateStructure;I)V

    return-void
.end method

.method public final processServerKeyExchange(Ljava/io/InputStream;)V
    .locals 7

    const/4 v6, 0x1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecurityParameters()Lorg/bouncycastle/crypto/tls/SecurityParameters;

    move-result-object v1

    const/4 v0, 0x0

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/o;->c:Lorg/bouncycastle/crypto/tls/p;

    if-eqz v2, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->c:Lorg/bouncycastle/crypto/tls/p;

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/crypto/tls/o;->initSigner(Lorg/bouncycastle/crypto/tls/p;Lorg/bouncycastle/crypto/tls/SecurityParameters;)Lorg/bouncycastle/crypto/Signer;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/io/SignerInputStream;

    invoke-direct {v1, p1, v0}, Lorg/bouncycastle/crypto/io/SignerInputStream;-><init>(Ljava/io/InputStream;Lorg/bouncycastle/crypto/Signer;)V

    :goto_0
    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v2

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v3

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque8(Ljava/io/InputStream;)[B

    move-result-object v4

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v5

    invoke-interface {v0, v5}, Lorg/bouncycastle/crypto/Signer;->verifySignature([B)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2a

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, v6, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v2, Ljava/math/BigInteger;

    invoke-direct {v2, v6, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    iput-object v4, p0, Lorg/bouncycastle/crypto/tls/o;->g:[B

    :try_start_0
    new-instance v3, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-static {v0, v3}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Util;->validatePublicValue(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->h:Ljava/math/BigInteger;
    :try_end_0
    .catch Lorg/bouncycastle/crypto/CryptoException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/o;->i:Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;

    new-instance v3, Lorg/bouncycastle/crypto/digests/SHA1Digest;

    invoke-direct {v3}, Lorg/bouncycastle/crypto/digests/SHA1Digest;-><init>()V

    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/o;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-interface {v4}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v4

    invoke-virtual {v1, v0, v2, v3, v4}, Lorg/bouncycastle/crypto/agreement/srp/SRP6Client;->init(Ljava/math/BigInteger;Ljava/math/BigInteger;Lorg/bouncycastle/crypto/Digest;Ljava/security/SecureRandom;)V

    return-void

    :catch_0
    move-exception v0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2f

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_1
    move-object v1, p1

    goto :goto_0
.end method

.method public final skipClientCredentials()V
    .locals 0

    return-void
.end method

.method public final skipServerCertificate()V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/o;->c:Lorg/bouncycastle/crypto/tls/p;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    return-void
.end method

.method public final skipServerKeyExchange()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method

.method public final validateCertificateRequest(Lorg/bouncycastle/crypto/tls/CertificateRequest;)V
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method
