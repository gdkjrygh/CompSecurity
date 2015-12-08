.class public Lorg/spongycastle/x509/X509V2AttributeCertificateGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/V2AttributeCertificateInfoGenerator;

.field private b:Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Lorg/spongycastle/asn1/x509/V2AttributeCertificateInfoGenerator;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x509/V2AttributeCertificateInfoGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificateGenerator;->a:Lorg/spongycastle/asn1/x509/V2AttributeCertificateInfoGenerator;

    .line 47
    new-instance v0, Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509V2AttributeCertificateGenerator;->b:Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;

    .line 48
    return-void
.end method
