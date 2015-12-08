.class public Lorg/bouncycastle/asn1/x509/V2AttributeCertificateInfoGenerator;
.super Ljava/lang/Object;


# instance fields
.field private a:Lorg/bouncycastle/asn1/DERInteger;

.field private b:Lorg/bouncycastle/asn1/ASN1EncodableVector;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/bouncycastle/asn1/DERInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/V2AttributeCertificateInfoGenerator;->a:Lorg/bouncycastle/asn1/DERInteger;

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/x509/V2AttributeCertificateInfoGenerator;->b:Lorg/bouncycastle/asn1/ASN1EncodableVector;

    return-void
.end method
