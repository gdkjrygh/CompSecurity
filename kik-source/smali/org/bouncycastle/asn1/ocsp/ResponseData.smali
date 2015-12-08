.class public Lorg/bouncycastle/asn1/ocsp/ResponseData;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# static fields
.field private static final a:Lorg/bouncycastle/asn1/DERInteger;


# instance fields
.field private b:Z

.field private c:Lorg/bouncycastle/asn1/DERInteger;

.field private d:Lorg/bouncycastle/asn1/ocsp/ResponderID;

.field private e:Lorg/bouncycastle/asn1/DERGeneralizedTime;

.field private f:Lorg/bouncycastle/asn1/ASN1Sequence;

.field private g:Lorg/bouncycastle/asn1/x509/X509Extensions;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/asn1/DERInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DERInteger;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->a:Lorg/bouncycastle/asn1/DERInteger;

    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 5

    const/4 v4, 0x1

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    iget-boolean v1, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->b:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->c:Lorg/bouncycastle/asn1/DERInteger;

    sget-object v2, Lorg/bouncycastle/asn1/ocsp/ResponseData;->a:Lorg/bouncycastle/asn1/DERInteger;

    invoke-virtual {v1, v2}, Lorg/bouncycastle/asn1/DERInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->c:Lorg/bouncycastle/asn1/DERInteger;

    invoke-direct {v1, v4, v2, v3}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_1
    iget-object v1, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->d:Lorg/bouncycastle/asn1/ocsp/ResponderID;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->e:Lorg/bouncycastle/asn1/DERGeneralizedTime;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->f:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->g:Lorg/bouncycastle/asn1/x509/X509Extensions;

    if-eqz v1, :cond_2

    new-instance v1, Lorg/bouncycastle/asn1/DERTaggedObject;

    iget-object v2, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->g:Lorg/bouncycastle/asn1/x509/X509Extensions;

    invoke-direct {v1, v4, v4, v2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_2
    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final e()Lorg/bouncycastle/asn1/x509/X509Extensions;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/asn1/ocsp/ResponseData;->g:Lorg/bouncycastle/asn1/x509/X509Extensions;

    return-object v0
.end method
