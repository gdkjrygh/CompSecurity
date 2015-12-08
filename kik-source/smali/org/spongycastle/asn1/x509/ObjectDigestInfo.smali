.class public Lorg/spongycastle/asn1/x509/ObjectDigestInfo;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field a:Lorg/spongycastle/asn1/ASN1Enumerated;

.field b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

.field d:Lorg/spongycastle/asn1/DERBitString;


# direct methods
.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 5

    .prologue
    const/4 v4, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 114
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 115
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-gt v2, v4, :cond_0

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    const/4 v3, 0x3

    if-ge v2, v3, :cond_1

    .line 117
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad sequence size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_1
    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v2

    invoke-static {v2}, Lorg/spongycastle/asn1/DEREnumerated;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Enumerated;

    move-result-object v2

    iput-object v2, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->a:Lorg/spongycastle/asn1/ASN1Enumerated;

    .line 125
    invoke-virtual {p1}, Lorg/spongycastle/asn1/ASN1Sequence;->e()I

    move-result v2

    if-ne v2, v4, :cond_2

    .line 127
    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 131
    :goto_0
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p1, v1}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-static {v1}, Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    .line 133
    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    invoke-static {v0}, Lorg/spongycastle/asn1/DERBitString;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/DERBitString;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->d:Lorg/spongycastle/asn1/DERBitString;

    .line 134
    return-void

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public static a(Lorg/spongycastle/asn1/ASN1TaggedObject;)Lorg/spongycastle/asn1/x509/ObjectDigestInfo;
    .locals 2

    .prologue
    .line 80
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Lorg/spongycastle/asn1/ASN1TaggedObject;Z)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    instance-of v1, v0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    if-eqz v1, :cond_0

    check-cast v0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    :goto_0
    return-object v0

    :cond_0
    if-eqz v0, :cond_1

    new-instance v1, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;

    invoke-static {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 177
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 179
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->a:Lorg/spongycastle/asn1/ASN1Enumerated;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 181
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v1, :cond_0

    .line 183
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->b:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 186
    :cond_0
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 187
    iget-object v1, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->d:Lorg/spongycastle/asn1/DERBitString;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 189
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/DEREnumerated;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->a:Lorg/spongycastle/asn1/ASN1Enumerated;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->c:Lorg/spongycastle/asn1/x509/AlgorithmIdentifier;

    return-object v0
.end method

.method public final e()Lorg/spongycastle/asn1/DERBitString;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lorg/spongycastle/asn1/x509/ObjectDigestInfo;->d:Lorg/spongycastle/asn1/DERBitString;

    return-object v0
.end method
