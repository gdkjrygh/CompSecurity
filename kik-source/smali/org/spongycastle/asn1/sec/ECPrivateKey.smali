.class public Lorg/spongycastle/asn1/sec/ECPrivateKey;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"


# instance fields
.field private a:Lorg/spongycastle/asn1/ASN1Sequence;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Lorg/spongycastle/asn1/ASN1Object;)V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lorg/spongycastle/asn1/sec/ECPrivateKey;-><init>(Ljava/math/BigInteger;Lorg/spongycastle/asn1/DERBitString;Lorg/spongycastle/asn1/ASN1Object;)V

    .line 68
    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;Lorg/spongycastle/asn1/DERBitString;Lorg/spongycastle/asn1/ASN1Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 74
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 75
    invoke-static {p1}, Lorg/spongycastle/util/BigIntegers;->a(Ljava/math/BigInteger;)[B

    move-result-object v0

    .line 77
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 79
    new-instance v2, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v2, v3}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 80
    new-instance v2, Lorg/spongycastle/asn1/DEROctetString;

    invoke-direct {v2, v0}, Lorg/spongycastle/asn1/DEROctetString;-><init>([B)V

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 82
    if-eqz p3, :cond_0

    .line 84
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    const/4 v2, 0x0

    invoke-direct {v0, v3, v2, p3}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 87
    :cond_0
    if-eqz p2, :cond_1

    .line 89
    new-instance v0, Lorg/spongycastle/asn1/DERTaggedObject;

    invoke-direct {v0, v3, v3, p2}, Lorg/spongycastle/asn1/DERTaggedObject;-><init>(ZILorg/spongycastle/asn1/ASN1Encodable;)V

    invoke-virtual {v1, v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 92
    :cond_1
    new-instance v0, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/sec/ECPrivateKey;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 93
    return-void
.end method

.method private constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 31
    iput-object p1, p0, Lorg/spongycastle/asn1/sec/ECPrivateKey;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    .line 32
    return-void
.end method

.method public static a(Ljava/lang/Object;)Lorg/spongycastle/asn1/sec/ECPrivateKey;
    .locals 2

    .prologue
    .line 37
    instance-of v0, p0, Lorg/spongycastle/asn1/sec/ECPrivateKey;

    if-eqz v0, :cond_0

    .line 39
    check-cast p0, Lorg/spongycastle/asn1/sec/ECPrivateKey;

    .line 47
    :goto_0
    return-object p0

    .line 42
    :cond_0
    if-eqz p0, :cond_1

    .line 44
    new-instance v0, Lorg/spongycastle/asn1/sec/ECPrivateKey;

    invoke-static {p0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(Ljava/lang/Object;)Lorg/spongycastle/asn1/ASN1Sequence;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/spongycastle/asn1/sec/ECPrivateKey;-><init>(Lorg/spongycastle/asn1/ASN1Sequence;)V

    move-object p0, v0

    goto :goto_0

    .line 47
    :cond_1
    const/4 p0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lorg/spongycastle/asn1/sec/ECPrivateKey;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    return-object v0
.end method

.method public final c()Ljava/math/BigInteger;
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 97
    iget-object v0, p0, Lorg/spongycastle/asn1/sec/ECPrivateKey;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1OctetString;

    .line 99
    new-instance v1, Ljava/math/BigInteger;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1OctetString;->d()[B

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    return-object v1
.end method

.method public final d()Lorg/spongycastle/asn1/DERBitString;
    .locals 4

    .prologue
    .line 104
    iget-object v0, p0, Lorg/spongycastle/asn1/sec/ECPrivateKey;->a:Lorg/spongycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Sequence;->d()Ljava/util/Enumeration;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Encodable;

    instance-of v2, v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    if-eqz v2, :cond_0

    check-cast v0, Lorg/spongycastle/asn1/ASN1TaggedObject;

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->c()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1TaggedObject;->k()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {v0}, Lorg/spongycastle/asn1/ASN1Primitive;->a()Lorg/spongycastle/asn1/ASN1Primitive;

    move-result-object v0

    :goto_0
    check-cast v0, Lorg/spongycastle/asn1/DERBitString;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
