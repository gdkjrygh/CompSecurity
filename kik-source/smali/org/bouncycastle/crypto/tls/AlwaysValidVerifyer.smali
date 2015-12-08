.class public Lorg/bouncycastle/crypto/tls/AlwaysValidVerifyer;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/CertificateVerifyer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isValid([Lorg/bouncycastle/asn1/x509/X509CertificateStructure;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
