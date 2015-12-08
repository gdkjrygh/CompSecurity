.class public Lorg/bouncycastle/asn1/ocsp/CertStatus;
.super Lorg/bouncycastle/asn1/ASN1Encodable;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1Choice;


# instance fields
.field private a:I

.field private b:Lorg/bouncycastle/asn1/DEREncodable;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/bouncycastle/asn1/ASN1Encodable;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/asn1/ocsp/CertStatus;->a:I

    new-instance v0, Lorg/bouncycastle/asn1/DERNull;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/DERNull;-><init>()V

    iput-object v0, p0, Lorg/bouncycastle/asn1/ocsp/CertStatus;->b:Lorg/bouncycastle/asn1/DEREncodable;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 4

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    iget v2, p0, Lorg/bouncycastle/asn1/ocsp/CertStatus;->a:I

    iget-object v3, p0, Lorg/bouncycastle/asn1/ocsp/CertStatus;->b:Lorg/bouncycastle/asn1/DEREncodable;

    invoke-direct {v0, v1, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    return-object v0
.end method
