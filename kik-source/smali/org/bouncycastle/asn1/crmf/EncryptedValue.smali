.class public Lorg/bouncycastle/asn1/crmf/EncryptedValue;
.super Lorg/bouncycastle/asn1/ASN1Encodable;


# instance fields
.field private a:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field private b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field private c:Lorg/bouncycastle/asn1/DERBitString;

.field private d:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field private e:Lorg/bouncycastle/asn1/ASN1OctetString;

.field private f:Lorg/bouncycastle/asn1/DERBitString;


# direct methods
.method private static a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V
    .locals 2

    if-eqz p2, :cond_0

    new-instance v0, Lorg/bouncycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, Lorg/bouncycastle/asn1/DERTaggedObject;-><init>(ZILorg/bouncycastle/asn1/DEREncodable;)V

    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d()Lorg/bouncycastle/asn1/DERObject;
    .locals 3

    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    const/4 v1, 0x0

    iget-object v2, p0, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->a:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->b:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->c:Lorg/bouncycastle/asn1/DERBitString;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->d:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->e:Lorg/bouncycastle/asn1/ASN1OctetString;

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->a(Lorg/bouncycastle/asn1/ASN1EncodableVector;ILorg/bouncycastle/asn1/ASN1Encodable;)V

    iget-object v1, p0, Lorg/bouncycastle/asn1/crmf/EncryptedValue;->f:Lorg/bouncycastle/asn1/DERBitString;

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->a(Lorg/bouncycastle/asn1/DEREncodable;)V

    new-instance v1, Lorg/bouncycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DERSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
