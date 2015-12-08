.class public Lorg/spongycastle/x509/X509V3CertificateGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/V3TBSCertificateGenerator;

.field private b:Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Lorg/spongycastle/asn1/x509/V3TBSCertificateGenerator;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x509/V3TBSCertificateGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509V3CertificateGenerator;->a:Lorg/spongycastle/asn1/x509/V3TBSCertificateGenerator;

    .line 56
    new-instance v0, Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509V3CertificateGenerator;->b:Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;

    .line 57
    return-void
.end method
