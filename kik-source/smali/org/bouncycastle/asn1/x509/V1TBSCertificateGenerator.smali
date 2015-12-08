.class public Lorg/bouncycastle/asn1/x509/V1TBSCertificateGenerator;
.super Ljava/lang/Object;


# instance fields
.field a:Lorg/bouncycastle/asn1/DERTaggedObject;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    new-instance v1, Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    invoke-direct {v0, v2, v1}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ILorg/bouncycastle/asn1/DEREncodable;)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/V1TBSCertificateGenerator;->a:Lorg/bouncycastle/asn1/DERTaggedObject;

    return-void
.end method
