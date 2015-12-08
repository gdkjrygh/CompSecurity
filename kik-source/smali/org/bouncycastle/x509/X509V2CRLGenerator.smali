.class public Lorg/bouncycastle/x509/X509V2CRLGenerator;
.super Ljava/lang/Object;


# instance fields
.field private a:Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;

.field private b:Lorg/bouncycastle/asn1/x509/X509ExtensionsGenerator;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/X509V2CRLGenerator;->a:Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;

    new-instance v0, Lorg/bouncycastle/asn1/x509/X509ExtensionsGenerator;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/x509/X509ExtensionsGenerator;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/x509/X509V2CRLGenerator;->b:Lorg/bouncycastle/asn1/x509/X509ExtensionsGenerator;

    return-void
.end method
