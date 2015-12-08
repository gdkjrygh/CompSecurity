.class public Lorg/spongycastle/x509/X509V1CertificateGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/V1TBSCertificateGenerator;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Lorg/spongycastle/asn1/x509/V1TBSCertificateGenerator;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x509/V1TBSCertificateGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509V1CertificateGenerator;->a:Lorg/spongycastle/asn1/x509/V1TBSCertificateGenerator;

    .line 53
    return-void
.end method
