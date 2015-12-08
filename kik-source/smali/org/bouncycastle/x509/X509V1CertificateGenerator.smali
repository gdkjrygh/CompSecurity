.class public Lorg/bouncycastle/x509/X509V1CertificateGenerator;
.super Ljava/lang/Object;


# instance fields
.field private a:Lorg/bouncycastle/asn1/x509/V1TBSCertificateGenerator;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/asn1/x509/V1TBSCertificateGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/x509/V1TBSCertificateGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/X509V1CertificateGenerator;->a:Lorg/bouncycastle/asn1/x509/V1TBSCertificateGenerator;

    return-void
.end method
