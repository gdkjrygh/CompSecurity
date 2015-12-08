.class public Lorg/spongycastle/asn1/crmf/EncryptedValue;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field private b:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field private c:Lorg/spongycastle/asn1/DERBitString;

.field private d:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field private e:Lorg/spongycastle/asn1/ASN1OctetString;

.field private f:Lorg/spongycastle/asn1/DERBitString;


# direct methods
.method private static a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V
    .locals 2

    .prologue
    .line 159
    if-eqz p2, :cond_0

    .line 161
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {p0, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 163
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 3

    .prologue
    .line 144
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 146
    const/4 v1, 0x0

    iget-object v2, p0, Lorg/spongycastle/asn1/crmf/EncryptedValue;->a:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/asn1/crmf/EncryptedValue;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 147
    const/4 v1, 0x1

    iget-object v2, p0, Lorg/spongycastle/asn1/crmf/EncryptedValue;->b:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/asn1/crmf/EncryptedValue;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 148
    const/4 v1, 0x2

    iget-object v2, p0, Lorg/spongycastle/asn1/crmf/EncryptedValue;->c:Lorg/spongycastle/asn1/DERBitString;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/asn1/crmf/EncryptedValue;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 149
    const/4 v1, 0x3

    iget-object v2, p0, Lorg/spongycastle/asn1/crmf/EncryptedValue;->d:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/asn1/crmf/EncryptedValue;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 150
    const/4 v1, 0x4

    iget-object v2, p0, Lorg/spongycastle/asn1/crmf/EncryptedValue;->e:Lorg/spongycastle/asn1/ASN1OctetString;

    invoke-static {v0, v1, v2}, Lorg/spongycastle/asn1/crmf/EncryptedValue;->a(Lorg/spongycastle/asn1/ASN1EncodableVector;ILorg/spongycastle/asn1/ASN1Encodable;)V

    .line 152
    iget-object v1, p0, Lorg/spongycastle/asn1/crmf/EncryptedValue;->f:Lorg/spongycastle/asn1/DERBitString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 154
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method
