.class public Lorg/bouncycastle/crypto/tls/LegacyTlsClient;
.super Lorg/bouncycastle/crypto/tls/DefaultTlsClient;


# instance fields
.field protected e:Lorg/bouncycastle/crypto/tls/CertificateVerifyer;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/tls/CertificateVerifyer;)V
    .locals 0

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/DefaultTlsClient;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/LegacyTlsClient;->e:Lorg/bouncycastle/crypto/tls/CertificateVerifyer;

    return-void
.end method


# virtual methods
.method public getAuthentication()Lorg/bouncycastle/crypto/tls/TlsAuthentication;
    .locals 2

    new-instance v0, Lorg/bouncycastle/crypto/tls/LegacyTlsAuthentication;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/LegacyTlsClient;->e:Lorg/bouncycastle/crypto/tls/CertificateVerifyer;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/LegacyTlsAuthentication;-><init>(Lorg/bouncycastle/crypto/tls/CertificateVerifyer;)V

    return-object v0
.end method
