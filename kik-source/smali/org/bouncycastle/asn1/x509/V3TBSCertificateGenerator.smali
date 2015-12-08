.class public Lorg/bouncycastle/asn1/x509/V3TBSCertificateGenerator;
.super Ljava/lang/Object;


# instance fields
.field a:Lorg/bouncycastle/asn1/DERTaggedObject;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    new-instance v2, Lorg/bouncycastle/asn1/DERInteger;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ILorg/bouncycastle/asn1/DEREncodable;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/V3TBSCertificateGenerator;->a:Lorg/bouncycastle/asn1/DERTaggedObject;

    return-void
.end method
