.class public Lorg/bouncycastle/crypto/tls/LegacyTlsAuthentication;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsAuthentication;


# instance fields
.field protected a:Lorg/bouncycastle/crypto/tls/CertificateVerifyer;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/tls/CertificateVerifyer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/LegacyTlsAuthentication;->a:Lorg/bouncycastle/crypto/tls/CertificateVerifyer;

    return-void
.end method


# virtual methods
.method public getClientCredentials(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public notifyServerCertificate(Lorg/bouncycastle/crypto/tls/Certificate;)V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/LegacyTlsAuthentication;->a:Lorg/bouncycastle/crypto/tls/CertificateVerifyer;

    invoke-virtual {p1}, Lorg/bouncycastle/crypto/tls/Certificate;->getCerts()[Lorg/bouncycastle/asn1/x509/X509CertificateStructure;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/tls/CertificateVerifyer;->isValid([Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v1, 0x5a

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_0
    return-void
.end method
