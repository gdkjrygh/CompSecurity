.class public Lorg/spongycastle/asn1/x9/X9FieldID;
.super Lorg/spongycastle/asn1/ASN1Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/asn1/x9/X9ObjectIdentifiers;


# instance fields
.field private al:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

.field private am:Lorg/spongycastle/asn1/ASN1Primitive;


# direct methods
.method public constructor <init>(IIII)V
    .locals 3

    .prologue
    .line 51
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 52
    sget-object v0, Lorg/spongycastle/asn1/x9/X9FieldID;->d:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->al:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 53
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 54
    new-instance v1, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v1, p1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 56
    if-nez p3, :cond_0

    .line 58
    sget-object v1, Lorg/spongycastle/asn1/x9/X9FieldID;->f:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 59
    new-instance v1, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v1, p2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 71
    :goto_0
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    iput-object v1, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->am:Lorg/spongycastle/asn1/ASN1Primitive;

    .line 72
    return-void

    .line 63
    :cond_0
    sget-object v1, Lorg/spongycastle/asn1/x9/X9FieldID;->g:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 64
    new-instance v1, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 65
    new-instance v2, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v2, p2}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 66
    new-instance v2, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v2, p3}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 67
    new-instance v2, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v2, p4}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(I)V

    invoke-virtual {v1, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 68
    new-instance v2, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v2, v1}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    invoke-virtual {v0, v2}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    goto :goto_0
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 31
    sget-object v0, Lorg/spongycastle/asn1/x9/X9FieldID;->c:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->al:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 32
    new-instance v0, Lorg/spongycastle/asn1/ASN1Integer;

    invoke-direct {v0, p1}, Lorg/spongycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->am:Lorg/spongycastle/asn1/ASN1Primitive;

    .line 33
    return-void
.end method

.method public constructor <init>(Lorg/spongycastle/asn1/ASN1Sequence;)V
    .locals 1

    .prologue
    .line 76
    invoke-direct {p0}, Lorg/spongycastle/asn1/ASN1Object;-><init>()V

    .line 77
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->al:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    .line 78
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lorg/spongycastle/asn1/ASN1Sequence;->a(I)Lorg/spongycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/spongycastle/asn1/ASN1Primitive;

    iput-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->am:Lorg/spongycastle/asn1/ASN1Primitive;

    .line 79
    return-void
.end method


# virtual methods
.method public final a()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 2

    .prologue
    .line 102
    new-instance v0, Lorg/spongycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/spongycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 104
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->al:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 105
    iget-object v1, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->am:Lorg/spongycastle/asn1/ASN1Primitive;

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/ASN1EncodableVector;->a(Lorg/spongycastle/asn1/ASN1Encodable;)V

    .line 107
    new-instance v1, Lorg/spongycastle/asn1/DERSequence;

    invoke-direct {v1, v0}, Lorg/spongycastle/asn1/DERSequence;-><init>(Lorg/spongycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public final c()Lorg/spongycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->al:Lorg/spongycastle/asn1/ASN1ObjectIdentifier;

    return-object v0
.end method

.method public final d()Lorg/spongycastle/asn1/ASN1Primitive;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lorg/spongycastle/asn1/x9/X9FieldID;->am:Lorg/spongycastle/asn1/ASN1Primitive;

    return-object v0
.end method
