.class final Lorg/bouncycastle/crypto/tls/h;
.super Lorg/bouncycastle/crypto/tls/i;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/tls/i;-><init>(Lorg/bouncycastle/crypto/tls/TlsClientContext;I)V

    return-void
.end method


# virtual methods
.method protected final initSigner(Lorg/bouncycastle/crypto/tls/p;Lorg/bouncycastle/crypto/tls/SecurityParameters;)Lorg/bouncycastle/crypto/Signer;
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/h;->d:Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;

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

    instance-of v0, p1, Lorg/bouncycastle/crypto/tls/TlsSignerCredentials;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    return-void
.end method

.method public final processServerKeyExchange(Ljava/io/InputStream;)V
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/h;->a:Lorg/bouncycastle/crypto/tls/TlsClientContext;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/TlsClientContext;->getSecurityParameters()Lorg/bouncycastle/crypto/tls/SecurityParameters;

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/h;->c:Lorg/bouncycastle/crypto/tls/p;

    invoke-virtual {p0, v1, v0}, Lorg/bouncycastle/crypto/tls/h;->initSigner(Lorg/bouncycastle/crypto/tls/p;Lorg/bouncycastle/crypto/tls/SecurityParameters;)Lorg/bouncycastle/crypto/Signer;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/io/SignerInputStream;

    invoke-direct {v1, p1, v0}, Lorg/bouncycastle/crypto/io/SignerInputStream;-><init>(Ljava/io/InputStream;Lorg/bouncycastle/crypto/Signer;)V

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8(Ljava/io/InputStream;)S

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint16(Ljava/io/InputStream;)I

    move-result v2

    invoke-static {v2}, Lorg/bouncycastle/crypto/tls/NamedCurve;->getECParameters(I)Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v2

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque8(Ljava/io/InputStream;)[B

    move-result-object v1

    invoke-static {p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readOpaque16(Ljava/io/InputStream;)[B

    move-result-object v3

    invoke-interface {v0, v3}, Lorg/bouncycastle/crypto/Signer;->verifySignature([B)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x2a

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x28

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_1
    invoke-virtual {v2}, Lorg/bouncycastle/crypto/params/ECDomainParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    invoke-virtual {v0, v1}, Lorg/bouncycastle/math/ec/ECCurve;->a([B)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v0

    new-instance v1, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-direct {v1, v0, v2}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    invoke-virtual {p0, v1}, Lorg/bouncycastle/crypto/tls/h;->validateECPublicKey(Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;)Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/h;->e:Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

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
