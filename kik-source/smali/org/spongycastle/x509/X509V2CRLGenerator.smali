.class public Lorg/spongycastle/x509/X509V2CRLGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/V2TBSCertListGenerator;

.field private b:Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Lorg/spongycastle/asn1/x509/V2TBSCertListGenerator;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x509/V2TBSCertListGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509V2CRLGenerator;->a:Lorg/spongycastle/asn1/x509/V2TBSCertListGenerator;

    .line 58
    new-instance v0, Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;

    invoke-direct {v0}, Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/x509/X509V2CRLGenerator;->b:Lorg/spongycastle/asn1/x509/X509ExtensionsGenerator;

    .line 59
    return-void
.end method
