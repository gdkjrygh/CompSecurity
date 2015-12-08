.class public Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;
.super Ljava/lang/Object;


# instance fields
.field a:Lorg/bouncycastle/asn1/DERInteger;

.field b:Lorg/bouncycastle/asn1/x509/Time;

.field c:Lorg/bouncycastle/asn1/x509/X509Extensions;

.field private d:Ljava/util/Vector;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/asn1/DERInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;->a:Lorg/bouncycastle/asn1/DERInteger;

    iput-object v2, p0, Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;->b:Lorg/bouncycastle/asn1/x509/Time;

    iput-object v2, p0, Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;->c:Lorg/bouncycastle/asn1/x509/X509Extensions;

    iput-object v2, p0, Lorg/bouncycastle/asn1/x509/V2TBSCertListGenerator;->d:Ljava/util/Vector;

    return-void
.end method
